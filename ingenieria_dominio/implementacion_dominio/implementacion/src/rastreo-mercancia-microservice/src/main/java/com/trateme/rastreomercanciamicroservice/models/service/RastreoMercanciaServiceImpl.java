package com.trateme.rastreomercanciamicroservice.models.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trateme.rastreomercanciamicroservice.models.dao.IRastreoMercanciaDao;
import com.trateme.rastreomercanciamicroservice.models.entities.Rastreo;

@Service
public class RastreoMercanciaServiceImpl implements IRastreoMercanciaService{
	@Autowired
	private IRastreoMercanciaDao rastreoMercanciaDao;
	
	private final static int[] CODIGOS_SUBPROCESO = {1,2,3,4,5};
	private final static int[] TIPOS= {1,2,3};
	
	@Override
	public Optional<Rastreo> findById(Long id){
		return rastreoMercanciaDao.findById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Rastreo> findAll() {
		return (List<Rastreo>) rastreoMercanciaDao.findAll();
	}
	
	@Override
	public List<Rastreo> findByCodigoRemision(String codigoRemision) {
		return rastreoMercanciaDao.findByCodigoRemision(codigoRemision);
	}

	@Override
	public List<Rastreo> findByCodigoRemisionAndTipo(String codigoRemision, int tipo) {
		return rastreoMercanciaDao.findByCodigoRemisionAndTipo(codigoRemision,tipo);
	}

	@Override
	public Rastreo save(Rastreo r) throws Exception {
		boolean isSubProcesoValido = IntStream.of(RastreoMercanciaServiceImpl.CODIGOS_SUBPROCESO).anyMatch(x -> x == r.getCodigoSubProceso());
		
		if(!isSubProcesoValido) {
			throw new Exception("El subproceso asociado al rastreo que desea guardar no es valido");
		}
		
		boolean istipoValido = IntStream.of(RastreoMercanciaServiceImpl.TIPOS).anyMatch(x -> x == r.getTipo());
		
		if(!istipoValido) {
			throw new Exception("El tipo asociado al rastreo que desea guardar no es valido");
		}
		
		return rastreoMercanciaDao.save(r);
	}

	@Override
	public void delete(Long id) {
		rastreoMercanciaDao.deleteById(id);
	}
}

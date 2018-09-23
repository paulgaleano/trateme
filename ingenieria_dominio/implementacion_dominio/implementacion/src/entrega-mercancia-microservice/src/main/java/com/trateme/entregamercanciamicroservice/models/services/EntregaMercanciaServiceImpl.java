package com.trateme.entregamercanciamicroservice.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trateme.entregamercanciamicroservice.models.dao.IEntregaDao;
import com.trateme.entregamercanciamicroservice.models.entities.Entrega;

@Service
public class EntregaMercanciaServiceImpl implements IEntregaMercanciaService {
	@Autowired
	private IEntregaDao entregaDao;
	
	@Override
	public Optional<Entrega> findById(Long id) {
		return entregaDao.findById(id);
	}

	@Override
	public List<Entrega> findAll() {
		return (List<Entrega>) entregaDao.findAll();
	}

	@Override
	public Entrega save(Entrega e) throws Exception {
		return entregaDao.save(e);
	}

	@Override
	public void deleteById(Long id) {
		entregaDao.deleteById(id);
	}

	@Override
	public List<Entrega> findByCodigoOperador(Integer codigoOperador) {
		return entregaDao.findByCodigoOperador(codigoOperador);
	}
}
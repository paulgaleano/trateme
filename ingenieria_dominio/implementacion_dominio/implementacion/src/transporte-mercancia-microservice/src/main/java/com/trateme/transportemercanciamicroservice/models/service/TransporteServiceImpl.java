package com.trateme.transportemercanciamicroservice.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trateme.transportemercanciamicroservice.models.dao.ITransporteDao;
import com.trateme.transportemercanciamicroservice.models.entity.Transporte;


@Service
public class TransporteServiceImpl implements ITransporteService {
	
	@Autowired
	private ITransporteDao transporteDao;

	@Override
	@Transactional(readOnly=true)
	public List<Transporte> findAll() {
		return (List<Transporte>) transporteDao.findAll();
	}
	

	@Override
	public Transporte save(Transporte t) {
		return transporteDao.save(t);
	}


	@Override
	@Transactional(readOnly=true)
	public Transporte findById(Long id) {
		return transporteDao.findById(id).orElse(null);
	}

}

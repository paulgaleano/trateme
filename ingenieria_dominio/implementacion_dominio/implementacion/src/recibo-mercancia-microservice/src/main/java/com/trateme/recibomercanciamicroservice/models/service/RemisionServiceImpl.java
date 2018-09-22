package com.trateme.recibomercanciamicroservice.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trateme.recibomercanciamicroservice.models.dao.IRemisionDao;
import com.trateme.recibomercanciamicroservice.models.entity.Remision;



@Service
public class RemisionServiceImpl implements IRemisionService {

	@Autowired
	private IRemisionDao remisionDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Remision> findAll() {
		return (List<Remision>) remisionDao.findAll();
	}
	
	@Override
	public Remision save(Remision r) {
		return remisionDao.save(r);
	}

	@Override
	@Transactional(readOnly=true)
	public Remision findById(String id) {
		return remisionDao.findById(id).orElse(null);
	}

}

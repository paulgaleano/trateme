package com.trateme.programacionrecogidamicroservice.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trateme.programacionrecogidamicroservice.models.dao.IRecogidaDao;
import com.trateme.programacionrecogidamicroservice.models.entity.Recogida;


@Service
public class RecogidaServiceImpl implements IRecogidaService {

	@Autowired
	private IRecogidaDao recogidaDao;
	
	@Override
	public Recogida save(Recogida r) {
		return recogidaDao.save(r);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Recogida> findAll() {
		return (List<Recogida>) recogidaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Recogida findById(Long id) {
		return recogidaDao.findById(id).orElse(null);
	}

}

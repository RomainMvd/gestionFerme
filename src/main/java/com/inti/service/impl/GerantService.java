package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Gerant;
import com.inti.repositories.GerantRepository;
import com.inti.service.interfaces.IGerantService;

@Service
public class GerantService  implements IGerantService{
	
	@Autowired
	GerantRepository gerantRepository;
	
	
	@Override
	public List<Gerant> findAll() {
		// TODO Auto-generated method stub
		return gerantRepository.findAll();
	}

	@Override
	public Gerant findOne(Long idGerant) {
		// TODO Auto-generated method stub
		return gerantRepository.findById(idGerant).get();
	}

	@Override
	public Gerant save(Gerant Gerant) {
		// TODO Auto-generated method stub
		return gerantRepository.save(Gerant);
	}

	@Override
	public void delete(Long idGerant) {
		// TODO Auto-generated method stub
		gerantRepository.deleteById(idGerant);
	}
}

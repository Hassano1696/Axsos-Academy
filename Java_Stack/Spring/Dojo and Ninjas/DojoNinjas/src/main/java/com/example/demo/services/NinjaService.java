package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.repositories.DojoRepository;
import com.example.demo.repositories.NinjaRepository;


@Service
public class NinjaService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;

	public NinjaService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}

	public List<Dojo> allNinjas() {
		return dojoRepository.findAll();
	}

	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

}

package com.heimdall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heimdall.domain.Heimdall;
import com.heimdall.repositories.HeimdallRepository;

@Service
public class HeimdallService {

	@Autowired
	private HeimdallRepository repo;
	
	public Heimdall insert(Heimdall heimdall) {
		return repo.save(heimdall);
	}
}

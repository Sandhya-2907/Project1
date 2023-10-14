package com.cg.mm1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallService {
	
	@Autowired
	private MallRepository repository;
	
	public List<Mall> listAll(){
		return repository.findAll();
	}
	
	public Mall get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(Mall mall) {
		repository.save(mall);
		
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}










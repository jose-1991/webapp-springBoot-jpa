package com.jflores.springboot.app.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jflores.springboot.app.models.dao.IClienteDao;
import com.jflores.springboot.app.models.entity.Cliente;

import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteDao clienteDao;
	
	@Override
	@Transactional
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

	@Override
	@Transactional
	public Cliente findOne(Long id) {
	
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

}

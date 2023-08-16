package com.jflores.springboot.app.models.dao;

import java.util.List;

import com.jflores.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
}

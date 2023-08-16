package com.jflores.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jflores.springboot.app.models.entity.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository("clienteDaoJPA")
public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public List<Cliente> findAll() {
	
		return em.createQuery("from Cliente", Cliente.class).getResultList();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		em.persist(cliente);
		
	}

}

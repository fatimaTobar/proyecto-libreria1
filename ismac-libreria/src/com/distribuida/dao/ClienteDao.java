package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Cliente;

public interface ClienteDao {
	
	
	//CRUD basico
	public List<Cliente> findAll();
	
	public Cliente finOne(int id);
	
	public void add(Cliente cliente);
	
	public void up(Cliente cliente );
	
	public void del(int id);
	
	//CRUD avanzado
	
}

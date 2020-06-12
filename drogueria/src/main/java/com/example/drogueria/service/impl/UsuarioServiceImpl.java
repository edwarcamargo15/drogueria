package com.example.drogueria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drogueria.commons.GenericServiceImpl;
import com.example.drogueria.dao.UsuarioDao;
import com.example.drogueria.model.Usuario;
import com.example.drogueria.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Integer>
implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;


	@Override
	public CrudRepository<Usuario, Integer> getDao() {
		// TODO Auto-generated method stub
		return usuarioDao;
	}

}

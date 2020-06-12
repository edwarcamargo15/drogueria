package com.example.drogueria.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.drogueria.model.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario,Integer> {

}

package com.example.drogueria.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.drogueria.model.Medicamento;

public interface MedicamentoDao extends CrudRepository<Medicamento, Integer> {

}

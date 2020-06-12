package com.example.drogueria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drogueria.commons.GenericServiceImpl;
import com.example.drogueria.dao.MedicamentoDao;
import com.example.drogueria.model.Medicamento;
import com.example.drogueria.service.MedicamentoService;


@Service
public class MedicamentoServiceImpl
extends GenericServiceImpl<Medicamento, Integer>
implements MedicamentoService {

	public MedicamentoServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private MedicamentoDao medicamentoDao;


	@Override
	public CrudRepository<Medicamento, Integer> getDao() {
		// TODO Auto-generated method stub
		return medicamentoDao;
	}


}

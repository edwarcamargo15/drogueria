package com.example.drogueria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.drogueria.model.Medicamento;
import com.example.drogueria.service.MedicamentoService;


@Controller
public class MedicamentoController {

	
	@Autowired
	private MedicamentoService medicamentoService;
	
	
	public MedicamentoController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("list", medicamentoService.getAll());
		System.out.println(medicamentoService.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id")Integer id,Model model) {
		if(id!=null && id !=0) {
			model.addAttribute("usuario",medicamentoService.get(id));
		}else {
			model.addAttribute("usuario", new Medicamento());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Medicamento medicamento, Model model) {
		medicamentoService.save(medicamento);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		medicamentoService.delete(id);
		return "redirect:/";
	}
	

}

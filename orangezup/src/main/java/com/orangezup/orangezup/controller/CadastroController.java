package com.orangezup.orangezup.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orangezup.orangezup.model.Cadastro;
import com.orangezup.orangezup.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cadastro>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
}

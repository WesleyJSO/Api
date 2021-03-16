package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.CadastroAplicacaoVacina;
import com.example.demo.repository.CadastroAplicacaoVacinaRepository;

@RestController
@RequestMapping("/cadastrovacinacao")
public class CadastroAplicacaoVacinaController {	
	
	@Autowired
	private CadastroAplicacaoVacinaRepository vacinarepository;
	
	//Trazer todas as vacinas
	@GetMapping
	public ResponseEntity<List<CadastroAplicacaoVacina>> GetAll(){
		return ResponseEntity.ok(vacinarepository.findAll());
	}
	
	//buscar vacina por ID
	@GetMapping("/{id}")
	public ResponseEntity<CadastroAplicacaoVacina> buscarVacina(@PathVariable @RequestBody CadastroAplicacaoVacina id) {
		if(id == null) { return ResponseEntity.badRequest().build();} return ResponseEntity.ok(id);
	}
	
	//Salvando as vacidas dadas
	@PostMapping	
	public ResponseEntity<CadastroAplicacaoVacina> salva(@Valid @RequestBody CadastroAplicacaoVacina vacina) {
		if(vacina == null) {return ResponseEntity.badRequest().build();			
		} vacinarepository.save(vacina);
		return ResponseEntity.status(HttpStatus.CREATED).body(vacina);
	}
	
	//alterando o cadastro das vacinas
	@PutMapping	
	public ResponseEntity<CadastroAplicacaoVacina> atualizaVacinacao(@Valid @RequestBody CadastroAplicacaoVacina vacina) {
		if(vacina == null) {return ResponseEntity.badRequest().build();			
		} vacinarepository.save(vacina);
		return ResponseEntity.status(HttpStatus.OK).body(vacina);
	}
}
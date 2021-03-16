package com.example.demo.controller;

import java.util.List;
import javax.validation.Valid;
import static org.springframework.http.HttpStatus.NOT_FOUND;
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
import org.springframework.web.server.ResponseStatusException;
import com.example.demo.model.CadastroUsuario;
import com.example.demo.repository.CadastroUsuarioRepository;

@RestController
@RequestMapping("/cadastros")
public class CadastroUsuarioController {
	
	@Autowired
	private CadastroUsuarioRepository usuariorepository;
	
	 //trazer todos os usuarios vacinado
	@GetMapping
	public ResponseEntity<List<CadastroUsuario>> GetAll(){
		return ResponseEntity.ok(usuariorepository.findAll());
	}
	
	//trazer o usuario por CPF
	@GetMapping("/{cpf}")
	public CadastroUsuario buscarCpf(@PathVariable @Valid @RequestBody String cpf) {
		return usuariorepository.findById(cpf).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Usuário não encontrado"));			
	}
	
	//Salvar os usuarios vacinados
	@PostMapping	
	public ResponseEntity<CadastroUsuario> salvaCadastro(@Valid @RequestBody CadastroUsuario usuario) {
		if(usuario == null) {return ResponseEntity.badRequest().build();
		} usuariorepository.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
	}
	
	//alterar o cadastro de usuario 
	@PutMapping	
	public ResponseEntity<CadastroUsuario> atualizaCadastro(@Valid @RequestBody CadastroUsuario atualizar) {
		if(atualizar == null) {return ResponseEntity.badRequest().build();
		} usuariorepository.save(atualizar);
		return ResponseEntity.status(HttpStatus.OK).body(atualizar);
	}
	
	

}

package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity 
@Table(name="usuario")
public class CadastroUsuario {	

	@Id	
	@NotBlank(message = "Campo obrigatório!")	
	private String cpf;
	
	@NotBlank(message = "Campo obrigatório!")
	private String nome;
	
	@Email
	@NotBlank(message = "Campo obrigatório!")
	private String email;	
	
	@JsonFormat(pattern =  "dd/mm/yyyy")
	private Date nascimento;
	
	

	@ManyToOne	
	private CadastroAplicacaoVacina vacina;
	


	
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}	
	public Date getNascimento() {return nascimento;}
	public void setNascimento(Date nascimento) {this.nascimento = nascimento;}
	
}
package com.orangezup.orangezup.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity //uma entidade do jpa hibernete
@Table(name = "cadastro") //nome da tabela no banco de dados
public class Cadastro {
	
	@Id
	@CPF
	@NotBlank(message = "Campo obrigatório!")	
	private String cpf;
	
	@NotBlank(message = "Campo obrigatório!")
	private String nome;
	
	@Email
	@NotBlank(message = "Campo obrigatório!")
	private String email;	
	
	@JsonFormat(pattern = "dd/mm/yyyy")
	private Date data_nasci;	
	
	@ManyToOne	
	private Vacina nomeVacina;
	
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}	
	public Date getData_nasci() {return data_nasci;}
	public void setData_nasci(Date data_nasci) {this.data_nasci = data_nasci;}
	public Vacina getNomeVacina() {return nomeVacina;}
	public void setNomeVacina(Vacina nomeVacina) {this.nomeVacina = nomeVacina;}	
}
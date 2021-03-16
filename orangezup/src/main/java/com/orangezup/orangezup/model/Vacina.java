package com.orangezup.orangezup.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity //uma entidade do jpa hibernete
@Table(name = "vacina") //nome da tabela no banco de dados
public class Vacina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Campo obrigatório!")
	private String nomeVacina;
	
	@JsonFormat(pattern = "dd/mm/yyyy")
	private Date vacinacao;
	
	@Email
	@NotBlank(message = "Campo obrigatório!")
	private String email;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Cadastro> cadastro;
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	public String getNomeVacina() {return nomeVacina;}
	public void setNomeVacina(String nomeVacina) {this.nomeVacina = nomeVacina;}
	public Date getVacinacao() {return vacinacao;}
	public void setVacinacao(Date vacinacao) {this.vacinacao = vacinacao;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public List<Cadastro> getCadastro() {return cadastro;}
	public void setCadastro(List<Cadastro> cadastro) {this.cadastro = cadastro;}
	
}
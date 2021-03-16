package com.example.demo.model;

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
import javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "vacina")
public class CadastroAplicacaoVacina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Campo obrigatório!")
	private String nomeVacina;
	
	@JsonFormat(pattern = "dd/mm/yyyy")
	private Date vacinacao;
	
	@Email
	@NotBlank(message = "Campo obrigatório!")
	private String email;
	
	
	@OneToMany(mappedBy = "vacina", cascade = CascadeType.ALL)
	@JoinColumn(name="usuario_cpf")
	private List<CadastroUsuario> usuario;
	
	
	
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getNomeVacina() {return nomeVacina;}
	public void setNomeVacina(String nomeVacina) {this.nomeVacina = nomeVacina;}
	public Date getVacinacao() {return vacinacao;}
	public void setVacinacao(Date vacinacao) {this.vacinacao = vacinacao;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public List<CadastroUsuario> getUsuario() {return usuario;}
	public void setUsuario(List<CadastroUsuario> usuario) {this.usuario = usuario;}
}

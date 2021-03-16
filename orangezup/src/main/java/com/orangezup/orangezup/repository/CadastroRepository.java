package com.orangezup.orangezup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orangezup.orangezup.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, String>{
	//public Cadastro findAllByNomeContainingIgnoreCase (String nome);
}
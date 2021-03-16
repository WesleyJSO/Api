package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.CadastroUsuario;

public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, String>{

}

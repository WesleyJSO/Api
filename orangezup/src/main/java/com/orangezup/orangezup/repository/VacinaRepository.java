package com.orangezup.orangezup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orangezup.orangezup.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, String>{
	//public Vacina findAllBynomeVacinaContainingIgnoreCase (String nomeVacina);
}
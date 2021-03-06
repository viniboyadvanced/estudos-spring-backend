package com.vinicius.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinicius.demo.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	//Ver a documentção spring data jpa
	//Nome do atributo email igual na model, então o JPA implementa automaticamente 
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	
}

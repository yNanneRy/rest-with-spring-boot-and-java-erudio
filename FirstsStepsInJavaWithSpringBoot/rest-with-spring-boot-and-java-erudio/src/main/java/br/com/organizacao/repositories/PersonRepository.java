package br.com.organizacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.organizacao.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}

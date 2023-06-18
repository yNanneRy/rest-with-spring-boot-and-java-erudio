package br.com.organizacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.organizacao.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}

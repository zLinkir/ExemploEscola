package com.casa.CadastroAluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.casa.CadastroAluno.model.turma.Turma;

public interface TurmaRepository extends CrudRepository<Turma, String> {

}

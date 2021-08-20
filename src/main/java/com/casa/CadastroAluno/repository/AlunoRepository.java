package com.casa.CadastroAluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.casa.CadastroAluno.model.aluno.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String>{

}

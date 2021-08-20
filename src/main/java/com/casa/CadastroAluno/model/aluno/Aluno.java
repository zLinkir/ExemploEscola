package com.casa.CadastroAluno.model.aluno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.casa.CadastroAluno.model.turma.Turma;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAluno;
	private String nomeAluno;
	@ManyToOne
	private Turma turmaMatriculado;
	
	public Aluno(Long idAluno, String nomeAluno) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	

}

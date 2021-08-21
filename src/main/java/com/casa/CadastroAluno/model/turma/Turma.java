package com.casa.CadastroAluno.model.turma;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.casa.CadastroAluno.model.aluno.Aluno;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTurma;
	private String nomeTurma;
	@Column(name = "descricao_turma")
	private String descricao;
	private int cargaHorariaTurma;
	@OneToMany
	private List<Aluno> alunos;
	
	
	
	
	
	
	public Turma(Long idTurma, String nomeTurma, String descricao, int cargaHorariaTurma, List<Aluno> alunos) {
		super();
		this.idTurma = idTurma;
		this.nomeTurma = nomeTurma;
		this.descricao = descricao;
		this.cargaHorariaTurma = cargaHorariaTurma;
		alunos = new ArrayList<Aluno>();
	}
	
	public Turma() {
		
	}
	
	public Long getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(Long idTurma) {
		this.idTurma = idTurma;
	}
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHorariaTurma() {
		return cargaHorariaTurma;
	}

	public void setCargaHorariaTurma(int cargaHorariaTurma) {
		this.cargaHorariaTurma = cargaHorariaTurma;
	}
	
	

}

package com.casa.CadastroAluno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.casa.CadastroAluno.model.turma.Turma;
import com.casa.CadastroAluno.repository.TurmaRepository;

@RestController
public class TurmaController {
	@Autowired
	private TurmaRepository tr;
	
	@GetMapping("/cadastrarTurma")
	public ModelAndView criarTurma() {
		ModelAndView mv = new ModelAndView("cadastrarTurma");
		return mv;
	}
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@PostMapping("/cadastrarTurma")
	public RedirectView criarTurmaPost(Turma turma) {
		tr.save(turma);
		RedirectView rv = new RedirectView();
		rv.setUrl("/cadastrarTurma");
		return rv;	}
}

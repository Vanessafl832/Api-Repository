package br.com.residencia.biblioteca.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.residencia.biblioteca.entity.Aluno;
import br.com.residencia.biblioteca.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> getAllAlunos(){
		return alunoService.getAllAlunos();
	}
	
	@GetMapping("/hello")
	public String helloWWorld() {
		return "A Api está funcionado";
		
	}

}

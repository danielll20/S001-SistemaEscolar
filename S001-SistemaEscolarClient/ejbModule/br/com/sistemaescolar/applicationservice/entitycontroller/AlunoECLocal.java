package br.com.sistemaescolar.applicationservice.entitycontroller;

import java.util.List;

import br.com.sistemaescolar.entidade.Aluno;

public interface AlunoECLocal {

	public void cadastrar(Aluno aluno);
	
	public List<Aluno> consultarTodosAluno();
}

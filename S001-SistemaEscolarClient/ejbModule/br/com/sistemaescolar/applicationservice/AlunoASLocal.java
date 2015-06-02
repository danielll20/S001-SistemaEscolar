package br.com.sistemaescolar.applicationservice;

import java.util.List;

import br.com.sistemaescolar.entidade.Aluno;

public interface AlunoASLocal {
	
	public void cadastrar(Aluno aluno);
	
	public List<Aluno> consultarTodosAluno();
}

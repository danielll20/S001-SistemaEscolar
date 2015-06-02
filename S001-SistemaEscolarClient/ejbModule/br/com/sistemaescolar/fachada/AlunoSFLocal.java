package br.com.sistemaescolar.fachada;

import java.util.List;

import br.com.sistemaescolar.entidade.Aluno;

/**
 * @author Daniel Correia
 *
 */
public interface AlunoSFLocal {

	public void cadastrar(Aluno aluno);
	
	public List<Aluno> consultarTodosAluno();
}

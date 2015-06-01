package br.com.sistemaescolar.fachada;

import java.util.List;

import javax.ejb.Local;

import br.com.sistemaescolar.to.AlunoTO;

/**
 * @author Daniel Correia
 *
 */
@Local
public interface AlunoSFLocal {

	public void cadastrar(AlunoTO alunoTO);
	
	public List<AlunoTO> consultarTodosAluno();
}

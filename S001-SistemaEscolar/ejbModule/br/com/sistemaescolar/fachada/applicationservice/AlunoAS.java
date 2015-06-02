/**
 * 
 */
package br.com.sistemaescolar.fachada.applicationservice;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sistemaescolar.applicationservice.AlunoASLocal;
import br.com.sistemaescolar.applicationservice.entitycontroller.AlunoECLocal;
import br.com.sistemaescolar.entidade.Aluno;

/**
 * @author Daniel Correia
 *
 */
@Stateless
public class AlunoAS implements AlunoASLocal {
	
	@EJB
	private AlunoECLocal alunoEC;	

	/* (non-Javadoc)
	 * @see br.com.sistemaescolar.applicationservice.AlunoASLocal#cadastrar(br.com.sistemaescolar.to.AlunoTO)
	 */
	@Override
	public void cadastrar(Aluno aluno) {		
		alunoEC.cadastrar(aluno);
	}

	@Override
	public List<Aluno> consultarTodosAluno() {
		return alunoEC.consultarTodosAluno();	
	}	

}

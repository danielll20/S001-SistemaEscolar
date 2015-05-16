/**
 * 
 */
package br.com.sistemaescolar.fachada.applicationservice;

//import javax.ejb.EJB;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sistemaescolar.applicationservice.AlunoASLocal;
import br.com.sistemaescolar.applicationservice.entitycontroller.AlunoECLocal;
import br.com.sistemaescolar.to.AlunoTO;

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
	public void cadastrar(AlunoTO alunoTO) {		
		alunoEC.cadastrar(alunoTO);
	}

	@Override
	public List<AlunoTO> consultarTodosAluno() {
		return alunoEC.consultarTodosAluno();	
	}

}

/**
 * 
 */
package br.com.sistemaescolar.fachada;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;

import br.com.sistemaescolar.applicationservice.AlunoASLocal;
import br.com.sistemaescolar.to.AlunoTO;

/**
 * @author Daniel Correia
 *
 */
@Stateless
public class AlunoSF implements AlunoSFLocal {
	
	@Resource
	private EJBContext ejbContext;
	
	@EJB
	private AlunoASLocal alunoAS;			

	/* (non-Javadoc)
	 * @see br.com.sistemaescolar.fachada.AlunoSFLocal#cadastrar(br.com.sistemaescolar.to.AlunoTO)
	 */
	@Override
	public void cadastrar(AlunoTO alunoTO) {		
		alunoAS.cadastrar(alunoTO);
	}

	@Override
	public List<AlunoTO> consultarTodosAluno() {		
		return alunoAS.consultarTodosAluno();
	}		

}

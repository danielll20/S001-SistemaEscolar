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
import br.com.sistemaescolar.entidade.Aluno;

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
	public void cadastrar(Aluno aluno) {		
		alunoAS.cadastrar(aluno);
	}

	@Override
	public List<Aluno> consultarTodosAluno() {		
		return alunoAS.consultarTodosAluno();
	}		

}

/**
 * 
 */
package br.com.sistemaescolar.fachada.applicationservice.entitycontroller;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.sistemaescolar.applicationservice.entitycontroller.AlunoECLocal;
import br.com.sistemaescolar.converter.ConverteFactory;
import br.com.sistemaescolar.entidade.Aluno;
import br.com.sistemaescolar.to.AlunoTO;

/**
 * @author Daniel Correia
 *
 */
@Stateless
public class AlunoEC implements AlunoECLocal {
	
	@PersistenceContext(unitName="S001-SistemaEscolarWeb")
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see br.com.sistemaescolar.applicationservice.entitycontroller.AlunoECLocal#cadastrar(br.com.sistemaescolar.to.AlunoTO)
	 */
	@Override
	public void cadastrar(AlunoTO alunoTO) {
		Aluno aluno = ConverteFactory.converteAlunoTO(alunoTO);
		entityManager.persist(aluno);
	}

	@Override
	public List<AlunoTO> consultarTodosAluno() {
		List<AlunoTO> lista = null;
		StringBuilder jpql = new StringBuilder();
		jpql.append("select a from Aluno a ");		
		
		Query query = entityManager.createQuery(jpql.toString());
		lista = query.getResultList();
		
		return lista;
	}

}

package br.com.sistemaescolar.fachada.applicationservice.entitycontroller;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.sistemaescolar.applicationservice.entitycontroller.UserECLocal;
import br.com.sistemaescolar.to.UserTO;

@Stateless
public class UserEC implements UserECLocal {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<UserTO> findUserByEmail(String email) {
		List<UserTO> lista = null;
		StringBuilder jpql = new StringBuilder();
		jpql.append("select u from Users u where u.email = :email ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("email", email);
		lista = query.getResultList();
		
		return lista;
	}

}

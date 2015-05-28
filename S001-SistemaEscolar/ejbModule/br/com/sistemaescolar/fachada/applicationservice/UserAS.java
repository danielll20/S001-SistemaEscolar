package br.com.sistemaescolar.fachada.applicationservice;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sistemaescolar.applicationservice.UserASLocal;
import br.com.sistemaescolar.applicationservice.entitycontroller.UserECLocal;
import br.com.sistemaescolar.to.UserTO;

@Stateless
public class UserAS implements UserASLocal {

	@EJB
	private UserECLocal userEC;
	
	@Override
	public List<UserTO> findUserByEmail(String email) {		
		return userEC.findUserByEmail(email);
	}

}

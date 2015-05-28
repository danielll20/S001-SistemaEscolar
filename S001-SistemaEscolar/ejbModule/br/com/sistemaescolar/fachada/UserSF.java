package br.com.sistemaescolar.fachada;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;

import br.com.sistemaescolar.applicationservice.UserASLocal;
import br.com.sistemaescolar.to.UserTO;

@Stateless
public class UserSF implements UserSFLocal {

	@Resource
	private EJBContext ejbContext;
	
	@EJB
	private UserASLocal userAS;
	
	@Override
	public List<UserTO> findUserByEmail(String email) {		
		return userAS.findUserByEmail(email);
	}

}

package br.com.sistemaescolar.applicationservice;

import java.util.List;

import javax.ejb.Local;

import br.com.sistemaescolar.to.UserTO;

@Local
public interface UserASLocal {

	public List<UserTO> findUserByEmail(String email);
}

package br.com.sistemaescolar.applicationservice.entitycontroller;

import java.util.List;

import br.com.sistemaescolar.to.UserTO;

public interface UserECLocal {

	public List<UserTO> findUserByEmail(String email);
}

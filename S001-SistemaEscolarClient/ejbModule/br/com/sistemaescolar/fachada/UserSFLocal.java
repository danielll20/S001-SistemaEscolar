package br.com.sistemaescolar.fachada;

import java.util.List;

import javax.ejb.Local;

import br.com.sistemaescolar.to.UserTO;

@Local
public interface UserSFLocal {
	public List<UserTO> findUserByEmail(String email);
}

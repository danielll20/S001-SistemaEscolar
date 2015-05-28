package br.com.sistemaescolar.mb;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginMB {

	private String login;
	
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String logar() {
		if(login.equals("admin") && senha.equals("admin")){
			return "aluno/cadastrar-aluno.xhtml";
		}else{		
			return "login.xhtml";
		}
	}
}

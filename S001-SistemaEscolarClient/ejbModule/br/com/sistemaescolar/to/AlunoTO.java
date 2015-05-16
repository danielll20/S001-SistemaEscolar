package br.com.sistemaescolar.to;

import java.io.Serializable;
import java.util.Date;

public class AlunoTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8489402778850182568L;
	
	private Integer matricula;
	
	private String nomeAluno;

	private Date data;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
	
	
}

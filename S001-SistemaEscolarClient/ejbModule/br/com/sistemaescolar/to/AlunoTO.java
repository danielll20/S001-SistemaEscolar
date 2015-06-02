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

	private Date dataCadastro;
	
	private EnderecoTO enderecoTO;
	
	private String telefone;
	
	private String celular;

	private String teste1;
	
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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnderecoTO getEnderecoTO() {
		if(enderecoTO == null){
			enderecoTO = new EnderecoTO();
		}
		return enderecoTO;
	}

	public void setEnderecoTO(EnderecoTO enderecoTO) {
		this.enderecoTO = enderecoTO;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}

package br.com.sistemaescolar.to;

import java.io.Serializable;

public class EnderecoTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3919946384602474185L;

	private Integer id;
	
	private String logradouro;
	
	private Integer numero;
	
	private String complemento;
	
	private String bairro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

}

/**
 * 
 */
package br.com.sistemaescolar.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Daniel Correia
 *
 */
public class Documentacao {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "NR_IDENTIDADE")
	private String identidade;

	@Column(name = "ORGAO_EMISSOR")
	private String orgaoEmissor;

	@Column(name = "NR_CPF")
	private String cpf;

	@Column(name = "NR_CTPS")
	private String ctps;

	@Column(name = "NR_SERIE")
	private String serie;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}

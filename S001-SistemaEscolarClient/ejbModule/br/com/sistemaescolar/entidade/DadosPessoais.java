/**
 * 
 */
package br.com.sistemaescolar.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Daniel Correia
 *
 */
@Entity
public class DadosPessoais {

	@Id
	@GeneratedValue
	private Integer id;	

	@Column(name="NOME")
	private String nome;

	@Column(name="NR_TELEFONE")
	private String telefone;

	@Column(name="NR_CELULAR")
	private String celular;

	@Column(name="NM_CONTATO")
	private String contato;

	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DATA_CADASTRO")
	private Date dataCadastro;
	
	@Column(name="DATA_NASCIMENTO")
	private Date dataNascimento;	
	
	@Column(name="NOME_PAI")
	private String nomePai;
	
	@Column(name="NOME_MAE")
	private String nomeMae;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}	

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}

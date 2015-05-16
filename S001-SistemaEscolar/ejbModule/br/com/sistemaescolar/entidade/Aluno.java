/**
 * 
 */
package br.com.sistemaescolar.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Daniel Correia de Freitas
 *
 */

@Entity
@Table(name="T001_ALUNO")
public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9137436245717703917L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SQ_MATR")
	private Integer matricula;
	
	@Column(name="NM_ALUNO")
	private String nomeAluno;
	
	@Temporal(value=TemporalType.DATE)
	private Date dataCadastro;
		
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
	
	
}



/**
 * 
 */
package br.com.sistemaescolar.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Daniel Correia
 *
 */
@Entity
@Table(name="TB_MATRICULA")
public class Matricula {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="DT_MAT")
	private Date dataMatricula;
	
	
	
}

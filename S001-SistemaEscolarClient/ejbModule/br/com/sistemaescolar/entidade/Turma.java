/**
 * 
 */
package br.com.sistemaescolar.entidade;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Daniel Correia
 *
 */
@Entity
@Table(name = "TB_TURMA")
public class Turma {

	@Id
	@GeneratedValue
	private Integer id;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DT_INI")
	private Date dataInicio;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DT_FIM")
	private Date dataFim;

	@Column(name = "NR_CAR_HOR")
	private String cargaHoraria;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TURMA_PROFESSOR", joinColumns = @JoinColumn(name = "TURMA_ID"), inverseJoinColumns = @JoinColumn(name = "PROFESSOR_ID"))
	private Collection<Professor> professor;

	@OneToMany(mappedBy = "TURMA")
	Collection<Matricula> matriculas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Collection<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(Collection<Professor> professor) {
		this.professor = professor;
	}

	public Collection<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Collection<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

}

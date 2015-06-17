package br.com.sistemaescolar.entidade;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "SQ_MAT_PRO")
	private Integer matricula;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SQ_ID_DAD_PES")
	private DadosPessoais dadosPessoais;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SQ_ID_END")
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SQ_ID_DOC")
	private Documentacao documentacao;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TURMA_PROFESSOR", joinColumns = @JoinColumn(name = "PROFESSOR_ID"), inverseJoinColumns = @JoinColumn(name = "TURMA_ID"))
	private Collection<Turma> turmas;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Documentacao getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}

}

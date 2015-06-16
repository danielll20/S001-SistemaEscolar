/**
 * 
 */
package br.com.sistemaescolar.mb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.sistemaescolar.entidade.Aluno;
import br.com.sistemaescolar.fachada.AlunoSFLocal;
import br.com.sistemaescolar.util.FacesUtil;


/**
 * @author Daniel Correia
 *
 */
@ManagedBean
public class AlunoMB {
				
	private Aluno aluno;	
		
	@EJB
	private AlunoSFLocal alunoSF;
	
	private List<Aluno> listaAlunos;
	
	public void cadastrar() {			
		alunoSF.cadastrar(aluno);
		aluno = new Aluno();
		FacesUtil.addMsgInfo("Aluno cadastrado com sucesso!");
	}	
	
	public List<Aluno> consultarTodosAlunos() {		
		return alunoSF.consultarTodosAluno();					
	}	
	
	public Aluno getAluno() {
		if(aluno == null){
			aluno = new Aluno();
		}
		return aluno;
	}	

	public void setAlunoTO(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getListaAlunos() {
		if(this.listaAlunos == null) {
			listaAlunos = consultarTodosAlunos();
		}
				
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
}

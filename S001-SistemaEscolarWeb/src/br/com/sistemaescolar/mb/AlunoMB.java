/**
 * 
 */
package br.com.sistemaescolar.mb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.sistemaescolar.fachada.AlunoSFLocal;
import br.com.sistemaescolar.to.AlunoTO;


/**
 * @author Daniel Correia
 *
 */
@ManagedBean
public class AlunoMB {
				
	private AlunoTO alunoTO;	
		
	@EJB
	private AlunoSFLocal alunoSF;
	
	private List<AlunoTO> listaAlunos = new ArrayList<AlunoTO>();
	
	public void cadastrar() {
		alunoSF.cadastrar(alunoTO);
	}	
	
	public List<AlunoTO> consultarTodosAlunos() {		
		return alunoSF.consultarTodosAluno();					
	}	
	
	public AlunoTO getAlunoTO() {
		if(alunoTO == null){
			alunoTO = new AlunoTO();
		}
		return alunoTO;
	}

	public void setAlunoTO(AlunoTO alunoTO) {
		this.alunoTO = alunoTO;
	}

	public List<AlunoTO> getListaAlunos() {
		listaAlunos = consultarTodosAlunos();
		
		return listaAlunos;
	}

	public void setListaAlunos(List<AlunoTO> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
}

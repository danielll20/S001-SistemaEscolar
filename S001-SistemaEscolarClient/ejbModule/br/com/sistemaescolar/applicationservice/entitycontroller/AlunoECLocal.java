package br.com.sistemaescolar.applicationservice.entitycontroller;

import java.util.List;
import javax.ejb.Local;
import br.com.sistemaescolar.to.AlunoTO;

@Local
public interface AlunoECLocal {

	public void cadastrar(AlunoTO alunoTO);
	
	public List<AlunoTO> consultarTodosAluno();
}

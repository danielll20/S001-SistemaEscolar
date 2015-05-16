package br.com.sistemaescolar.applicationservice;

import java.util.List;
import javax.ejb.Local;
import br.com.sistemaescolar.to.AlunoTO;

@Local
public interface AlunoASLocal {
	
	public void cadastrar(AlunoTO alunoTO);
	
	public List<AlunoTO> consultarTodosAluno();
}

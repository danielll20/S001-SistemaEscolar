package br.com.sistemaescolar.converter;

import br.com.sistemaescolar.entidade.Aluno;
import br.com.sistemaescolar.to.AlunoTO;

public class ConverteFactory {

	public static Aluno converteAlunoTO(AlunoTO alunoTO){
		Aluno aluno = new Aluno();
		aluno.setMatricula(alunoTO.getMatricula());
		aluno.setNomeAluno(alunoTO.getNomeAluno());
		aluno.setDataCadastro(alunoTO.getData());
		
		return aluno;
		
	}
}

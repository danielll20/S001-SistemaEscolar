package br.com.sistemaescolar.converter;

import br.com.sistemaescolar.entidade.Aluno;
import br.com.sistemaescolar.entidade.Endereco;
import br.com.sistemaescolar.to.AlunoTO;
/**
 * 
 * @author Leonardo Ribeiro
 *
 */
public class ConverteFactory {

	public static Aluno converteAlunoTO(AlunoTO alunoTO){
		Aluno aluno = new Aluno();
		aluno.setMatricula(alunoTO.getMatricula());
		aluno.setNomeAluno(alunoTO.getNomeAluno());
		aluno.setDataCadastro(alunoTO.getDataCadastro());
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(alunoTO.getEnderecoTO().getLogradouro());
		endereco.setNumero(alunoTO.getEnderecoTO().getNumero());
		endereco.setComplemento(alunoTO.getEnderecoTO().getComplemento());
		endereco.setBairro(alunoTO.getEnderecoTO().getBairro());
		
		aluno.setTelefone(alunoTO.getCelular());
		aluno.setCelular(alunoTO.getCelular());
				
		aluno.setEndereco(endereco);
		
		return aluno;
		
	}
}

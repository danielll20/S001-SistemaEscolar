package br.com.sistemaescolar.enums;

public enum Cidades {

	FORTALEZA(1, "Fortaleza"); 
	
	private int codigo; 
	private String descricao; 

	private Cidades(int codigo, String descricao) { 
		this.codigo = codigo; 
		this.descricao = descricao; 
	} 

	public String getDescricao() { 
		return descricao; 
	} 

	public int getCodigo() { 
		return codigo; 
	} 

	public void setCodigo(int codigo) { 
		this.codigo = codigo; 
	} 
	
	@Override 
	public String toString() { 
		return String.valueOf(codigo); 
	} 
	

}

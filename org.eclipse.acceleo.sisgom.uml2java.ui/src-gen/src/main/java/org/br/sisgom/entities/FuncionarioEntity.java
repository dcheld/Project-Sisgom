package org.br.sisgom.entities;

// Start of user code for imports
// End of user code

public  class FuncionarioEntity extends PessoaBase
 {
	private int codigoFuncionario;
	
	public FuncionarioEntity() {
		super();
	}
	
	
	public int getCodigoFuncionario() {
		return this.codigoFuncionario;
	}
	
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	
}

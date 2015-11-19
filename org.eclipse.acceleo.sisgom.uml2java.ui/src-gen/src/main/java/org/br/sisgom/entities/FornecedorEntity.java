package org.br.sisgom.entities;

// Start of user code for imports
// End of user code

public  class FornecedorEntity extends PessoaBase
 {
	private String inscricaoEstadual;
	
	public FornecedorEntity() {
		super();
	}
	
	
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
}

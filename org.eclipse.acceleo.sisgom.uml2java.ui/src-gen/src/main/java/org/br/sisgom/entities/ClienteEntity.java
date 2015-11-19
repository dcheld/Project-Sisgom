package org.br.sisgom.entities;

import java.util.List;
	
	
// Start of user code for imports
// End of user code

public  class ClienteEntity extends PessoaBase
 {
	private List<VeiculoEntity> veiculo;
	
	private int codigoCliente;
	
	public ClienteEntity() {
		super();
	}
	
	
	public List<VeiculoEntity> getVeiculo() {
		return this.veiculo;
	}
	
	public void setVeiculo(List<VeiculoEntity> veiculo) {
		this.veiculo = veiculo;
	}
	
	
	public int getCodigoCliente() {
		return this.codigoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
}

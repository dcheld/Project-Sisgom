/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.br.sisgom.bean;

    import java.util.*;
		import org.br.sisgom.bean.Peca;
		import org.br.sisgom.bean.ItensDePeca;
		import org.br.sisgom.bean.Servico;
		import org.br.sisgom.bean.Date;
		import org.br.sisgom.bean.ItensDeServico;
		import org.br.sisgom.bean.Veiculo;

// Start of user code for imports

// End of user code

public  class OrdemDeServico {
	/**
	 * The documentation of the attribute servico.
	 * 
	 * @generated
	 */
	private List<Servico> servico;
	
	/**
	 * The documentation of the attribute dataEntradaVeiculo.
	 * 
	 * @generated
	 */
	private Date dataEntradaVeiculo;
	
	/**
	 * The documentation of the attribute itensDeServico.
	 * 
	 * @generated
	 */
	private List<ItensDeServico> itensDeServico;
	
	/**
	 * The documentation of the attribute codigo.
	 * 
	 * @generated
	 */
	private Integer codigo;
	
	/**
	 * The documentation of the attribute itensDePeca.
	 * 
	 * @generated
	 */
	private List<ItensDePeca> itensDePeca;
	
	/**
	 * The documentation of the attribute peca.
	 * 
	 * @generated
	 */
	private List<Peca> peca;
	
	/**
	 * The documentation of the attribute veiculos.
	 * 
	 * @generated
	 */
	private Veiculo veiculos;
	
	
	/**
	 * The documentation of the constructor.
	 * 
	 * @generated
	 */
	public OrdemDeServico() {
		super();
	}
	
	
	/**
	 * The documentation of the getter getServico.
	 * 
	 * @generated
	 */
	public List<Servico> getServico() {
		return this.servico;
	}
	
	/**
	 * The documentation of the setter setServico.
	 * 
	 * @generated
	 */
	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}
	/**
	 * The documentation of the getter getDataEntradaVeiculo.
	 * 
	 * @generated
	 */
	public Date getDataEntradaVeiculo() {
		return this.dataEntradaVeiculo;
	}
	
	/**
	 * The documentation of the setter setDataEntradaVeiculo.
	 * 
	 * @generated
	 */
	public void setDataEntradaVeiculo(Date dataEntradaVeiculo) {
		this.dataEntradaVeiculo = dataEntradaVeiculo;
	}
	/**
	 * The documentation of the getter getItensDeServico.
	 * 
	 * @generated
	 */
	public List<ItensDeServico> getItensDeServico() {
		return this.itensDeServico;
	}
	
	/**
	 * The documentation of the setter setItensDeServico.
	 * 
	 * @generated
	 */
	public void setItensDeServico(List<ItensDeServico> itensDeServico) {
		this.itensDeServico = itensDeServico;
	}
	/**
	 * The documentation of the getter getCodigo.
	 * 
	 * @generated
	 */
	public Integer getCodigo() {
		return this.codigo;
	}
	
	/**
	 * The documentation of the setter setCodigo.
	 * 
	 * @generated
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * The documentation of the getter getItensDePeca.
	 * 
	 * @generated
	 */
	public List<ItensDePeca> getItensDePeca() {
		return this.itensDePeca;
	}
	
	/**
	 * The documentation of the setter setItensDePeca.
	 * 
	 * @generated
	 */
	public void setItensDePeca(List<ItensDePeca> itensDePeca) {
		this.itensDePeca = itensDePeca;
	}
	/**
	 * The documentation of the getter getPeca.
	 * 
	 * @generated
	 */
	public List<Peca> getPeca() {
		return this.peca;
	}
	
	/**
	 * The documentation of the setter setPeca.
	 * 
	 * @generated
	 */
	public void setPeca(List<Peca> peca) {
		this.peca = peca;
	}
	/**
	 * The documentation of the getter getVeiculos.
	 * 
	 * @generated
	 */
	public Veiculo getVeiculos() {
		return this.veiculos;
	}
	
	/**
	 * The documentation of the setter setVeiculos.
	 * 
	 * @generated
	 */
	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
	}
	
}
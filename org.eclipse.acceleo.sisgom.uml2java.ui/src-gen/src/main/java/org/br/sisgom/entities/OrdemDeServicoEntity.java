package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

import java.util.List;
	import java.util.Date;
	
// Start of user code for imports
// End of user code

public  class OrdemDeServicoEntity extends BaseBean
 {
	private Date dataEntradaVeiculo;
	
	private List<ServicoEntity> servicos;
	
	private VeiculoEntity veiculo;
	
	private List<MercadoriaEntity> mercadorias;
	
	private int codigo;
	
	private Date dataFimServico;
	
	public OrdemDeServicoEntity() {
		super();
	}
	
	
	public Date getDataEntradaVeiculo() {
		return this.dataEntradaVeiculo;
	}
	
	public void setDataEntradaVeiculo(Date dataEntradaVeiculo) {
		this.dataEntradaVeiculo = dataEntradaVeiculo;
	}
	
	
	public List<ServicoEntity> getServicos() {
		return this.servicos;
	}
	
	public void setServicos(List<ServicoEntity> servicos) {
		this.servicos = servicos;
	}
	
	
	public VeiculoEntity getVeiculo() {
		return this.veiculo;
	}
	
	public void setVeiculo(VeiculoEntity veiculo) {
		this.veiculo = veiculo;
	}
	
	
	public List<MercadoriaEntity> getMercadorias() {
		return this.mercadorias;
	}
	
	public void setMercadorias(List<MercadoriaEntity> mercadorias) {
		this.mercadorias = mercadorias;
	}
	
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public Date getDataFimServico() {
		return this.dataFimServico;
	}
	
	public void setDataFimServico(Date dataFimServico) {
		this.dataFimServico = dataFimServico;
	}
	
}

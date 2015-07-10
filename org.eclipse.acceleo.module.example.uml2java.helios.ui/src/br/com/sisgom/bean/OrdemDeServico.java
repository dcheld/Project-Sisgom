/**
 * Generated with MTL UML 2 Java example
 */
package br.com.sisgom.bean;

// Start of user code for imports
import java.util.*;
// End of user code

/**
 * @author MTL
 */
public class OrdemDeServico {
    /**
     * the pecas attribute.
     */
    private List<Peca> pecas;
    /**
     * the servicos attribute.
     */
    private List<Servico> servicos;
    /**
     * the dataEntradaVeiculo attribute.
     */
    private DateTime dataEntradaVeiculo;
    /**
     * the codigo attribute.
     */
    private int codigo;
    /**
     * the veiculo attribute.
     */
    private Veiculo veiculo;
    /**
     * the funcionario attribute.
     */
    private List<Funcionario> funcionario;
    /**
     * the Pecas getter.
     * @return the Pecas.
     */
    public List<Peca> getPecas() {
        return this.pecas;
    }

    /**
     * the Pecas setter.
     * @param p_Pecas the Pecas to set.
     */
    public void setPecas(List<Peca> p_pecas) {
        this.pecas = p_pecas;
    }
    /**
     * the Servicos getter.
     * @return the Servicos.
     */
    public List<Servico> getServicos() {
        return this.servicos;
    }

    /**
     * the Servicos setter.
     * @param p_Servicos the Servicos to set.
     */
    public void setServicos(List<Servico> p_servicos) {
        this.servicos = p_servicos;
    }
    /**
     * the DataEntradaVeiculo getter.
     * @return the DataEntradaVeiculo.
     */
    public DateTime getDataEntradaVeiculo() {
        return this.dataEntradaVeiculo;
    }

    /**
     * the DataEntradaVeiculo setter.
     * @param p_DataEntradaVeiculo the DataEntradaVeiculo to set.
     */
    public void setDataEntradaVeiculo(DateTime p_dataEntradaVeiculo) {
        this.dataEntradaVeiculo = p_dataEntradaVeiculo;
    }
    /**
     * the Codigo getter.
     * @return the Codigo.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }
    /**
     * the Veiculo getter.
     * @return the Veiculo.
     */
    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    /**
     * the Veiculo setter.
     * @param p_Veiculo the Veiculo to set.
     */
    public void setVeiculo(Veiculo p_veiculo) {
        this.veiculo = p_veiculo;
    }
    /**
     * the Funcionario getter.
     * @return the Funcionario.
     */
    public List<Funcionario> getFuncionario() {
        return this.funcionario;
    }

    /**
     * the Funcionario setter.
     * @param p_Funcionario the Funcionario to set.
     */
    public void setFuncionario(List<Funcionario> p_funcionario) {
        this.funcionario = p_funcionario;
    }
}

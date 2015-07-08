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
     * the Funcionario attribute.
     */
    private List<Funcionario> Funcionario;
    /**
     * the Servicos attribute.
     */
    private List<Servico> Servicos;
    /**
     * the DataEntradaVeiculo attribute.
     */
    private DateTime DataEntradaVeiculo;
    /**
     * the Pecas attribute.
     */
    private List<Peca> Pecas;
    /**
     * the Codigo attribute.
     */
    private int Codigo;
    /**
     * the Veiculo attribute.
     */
    private Veiculo Veiculo;
    /**
     * the Funcionario getter.
     * @return the Funcionario.
     */
    public List<Funcionario> getFuncionario() {
        return this.Funcionario;
    }

    /**
     * the Funcionario setter.
     * @param p_Funcionario the Funcionario to set.
     */
    public void setFuncionario(List<Funcionario> p_Funcionario) {
        this.Funcionario = p_Funcionario;
    }
    /**
     * the Servicos getter.
     * @return the Servicos.
     */
    public List<Servico> getServicos() {
        return this.Servicos;
    }

    /**
     * the Servicos setter.
     * @param p_Servicos the Servicos to set.
     */
    public void setServicos(List<Servico> p_Servicos) {
        this.Servicos = p_Servicos;
    }
    /**
     * the DataEntradaVeiculo getter.
     * @return the DataEntradaVeiculo.
     */
    public DateTime getDataEntradaVeiculo() {
        return this.DataEntradaVeiculo;
    }

    /**
     * the DataEntradaVeiculo setter.
     * @param p_DataEntradaVeiculo the DataEntradaVeiculo to set.
     */
    public void setDataEntradaVeiculo(DateTime p_DataEntradaVeiculo) {
        this.DataEntradaVeiculo = p_DataEntradaVeiculo;
    }
    /**
     * the Pecas getter.
     * @return the Pecas.
     */
    public List<Peca> getPecas() {
        return this.Pecas;
    }

    /**
     * the Pecas setter.
     * @param p_Pecas the Pecas to set.
     */
    public void setPecas(List<Peca> p_Pecas) {
        this.Pecas = p_Pecas;
    }
    /**
     * the Codigo getter.
     * @return the Codigo.
     */
    public int getCodigo() {
        return this.Codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(int p_Codigo) {
        this.Codigo = p_Codigo;
    }
    /**
     * the Veiculo getter.
     * @return the Veiculo.
     */
    public Veiculo getVeiculo() {
        return this.Veiculo;
    }

    /**
     * the Veiculo setter.
     * @param p_Veiculo the Veiculo to set.
     */
    public void setVeiculo(Veiculo p_Veiculo) {
        this.Veiculo = p_Veiculo;
    }
}

/**
 * Generated with MTL UML 2 Java example
 */
package br.com.sisgom.bean;

// Start of user code for imports
import java.util.*;
// End of user code

import org.eclipse.swt.widgets.DateTime;

/**
 * @author MTL
 */
public class OrdemDeServico {
    /**
     * the DataEntradaVeiculo attribute.
     */
    private DateTime DataEntradaVeiculo;
    /**
     * the Codigo attribute.
     */
    private Integer Codigo;
    /**
     * the Funcionario attribute.
     */
    private List<Funcionario> Funcionario;
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
     * the Codigo getter.
     * @return the Codigo.
     */
    public Integer getCodigo() {
        return this.Codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(Integer p_Codigo) {
        this.Codigo = p_Codigo;
    }
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
}

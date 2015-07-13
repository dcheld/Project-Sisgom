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

public class Peca {
    /**
     * the nome attribute.
     */
    private String nome;
    /**
     * the valorVenda attribute.
     */
    private double valorVenda;
    /**
     * the valorCompra attribute.
     */
    private double valorCompra;
    /**
     * the codigo attribute.
     */
    private String codigo;
    /**
     * the Nome getter.
     * @return the Nome.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * the Nome setter.
     * @param p_Nome the Nome to set.
     */
    public void setNome(String p_nome) {
        this.nome = p_nome;
    }
    /**
     * the ValorVenda getter.
     * @return the ValorVenda.
     */
    public double getValorVenda() {
        return this.valorVenda;
    }

    /**
     * the ValorVenda setter.
     * @param p_ValorVenda the ValorVenda to set.
     */
    public void setValorVenda(double p_valorVenda) {
        this.valorVenda = p_valorVenda;
    }
    /**
     * the ValorCompra getter.
     * @return the ValorCompra.
     */
    public double getValorCompra() {
        return this.valorCompra;
    }

    /**
     * the ValorCompra setter.
     * @param p_ValorCompra the ValorCompra to set.
     */
    public void setValorCompra(double p_valorCompra) {
        this.valorCompra = p_valorCompra;
    }
    /**
     * the Codigo getter.
     * @return the Codigo.
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(String p_codigo) {
        this.codigo = p_codigo;
    }
    /**
     * the Pecas attribute.
     */
    private List<Peca> Pecas;
    /**
     * the OrdemDeServico attribute.
     */
    private List<OrdemDeServico> OrdemDeServico;
}


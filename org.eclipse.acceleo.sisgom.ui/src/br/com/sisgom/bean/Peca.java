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
     * the Nome attribute.
     */
    private String Nome;
    /**
     * the ValorCompra attribute.
     */
    private double ValorCompra;
    /**
     * the ValorVenda attribute.
     */
    private double ValorVenda;
    /**
     * the Codigo attribute.
     */
    private String Codigo;
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
    public void setNome(String nome) {
        this.nome = p_nome;
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
    public void setValorCompra(double valorCompra) {
        this.valorCompra = p_valorCompra;
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
    public void setValorVenda(double valorVenda) {
        this.valorVenda = p_valorVenda;
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
    public void setCodigo(String codigo) {
        this.codigo = p_codigo;
    }
    /**
     * the Pecas attribute.
     */
    private List<Peca> Pecas;
}

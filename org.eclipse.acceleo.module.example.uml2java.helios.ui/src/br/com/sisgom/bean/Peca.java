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
     * the Codigo attribute.
     */
    private String Codigo;
    /**
     * the ValorCompra attribute.
     */
    private Double ValorCompra;
    /**
     * the Nome attribute.
     */
    private String Nome;
    /**
     * the ValorVenda attribute.
     */
    private Double ValorVenda;
    /**
     * the Codigo getter.
     * @return the Codigo.
     */
    public String getCodigo() {
        return this.Codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(String p_Codigo) {
        this.Codigo = p_Codigo;
    }
    /**
     * the ValorCompra getter.
     * @return the ValorCompra.
     */
    public Double getValorCompra() {
        return this.ValorCompra;
    }

    /**
     * the ValorCompra setter.
     * @param p_ValorCompra the ValorCompra to set.
     */
    public void setValorCompra(Double p_ValorCompra) {
        this.ValorCompra = p_ValorCompra;
    }
    /**
     * the Nome getter.
     * @return the Nome.
     */
    public String getNome() {
        return this.Nome;
    }

    /**
     * the Nome setter.
     * @param p_Nome the Nome to set.
     */
    public void setNome(String p_Nome) {
        this.Nome = p_Nome;
    }
    /**
     * the ValorVenda getter.
     * @return the ValorVenda.
     */
    public Double getValorVenda() {
        return this.ValorVenda;
    }

    /**
     * the ValorVenda setter.
     * @param p_ValorVenda the ValorVenda to set.
     */
    public void setValorVenda(Double p_ValorVenda) {
        this.ValorVenda = p_ValorVenda;
    }
    /**
     * the Pecas attribute.
     */
    private List<Peca> Pecas;
}

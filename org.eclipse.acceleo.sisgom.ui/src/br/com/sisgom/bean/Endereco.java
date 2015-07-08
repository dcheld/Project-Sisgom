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
public class Endereco {
    /**
     * the Rua attribute.
     */
    private String Rua;
    /**
     * the Estado attribute.
     */
    private String Estado;
    /**
     * the Id attribute.
     */
    private int Id;
    /**
     * the Cidade attribute.
     */
    private String Cidade;
    /**
     * the Rua getter.
     * @return the Rua.
     */
    public String getRua() {
        return this.rua;
    }

    /**
     * the Rua setter.
     * @param p_Rua the Rua to set.
     */
    public void setRua(String rua) {
        this.rua = p_rua;
    }
    /**
     * the Estado getter.
     * @return the Estado.
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * the Estado setter.
     * @param p_Estado the Estado to set.
     */
    public void setEstado(String estado) {
        this.estado = p_estado;
    }
    /**
     * the Id getter.
     * @return the Id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * the Id setter.
     * @param p_Id the Id to set.
     */
    public void setId(int id) {
        this.id = p_id;
    }
    /**
     * the Cidade getter.
     * @return the Cidade.
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * the Cidade setter.
     * @param p_Cidade the Cidade to set.
     */
    public void setCidade(String cidade) {
        this.cidade = p_cidade;
    }
    /**
     * the Endereco attribute.
     */
    private List<Endereco> Endereco;
}

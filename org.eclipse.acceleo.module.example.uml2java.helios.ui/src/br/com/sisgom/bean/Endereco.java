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
        return this.Rua;
    }

    /**
     * the Rua setter.
     * @param p_Rua the Rua to set.
     */
    public void setRua(String p_Rua) {
        this.Rua = p_Rua;
    }
    /**
     * the Estado getter.
     * @return the Estado.
     */
    public String getEstado() {
        return this.Estado;
    }

    /**
     * the Estado setter.
     * @param p_Estado the Estado to set.
     */
    public void setEstado(String p_Estado) {
        this.Estado = p_Estado;
    }
    /**
     * the Id getter.
     * @return the Id.
     */
    public int getId() {
        return this.Id;
    }

    /**
     * the Id setter.
     * @param p_Id the Id to set.
     */
    public void setId(int p_Id) {
        this.Id = p_Id;
    }
    /**
     * the Cidade getter.
     * @return the Cidade.
     */
    public String getCidade() {
        return this.Cidade;
    }

    /**
     * the Cidade setter.
     * @param p_Cidade the Cidade to set.
     */
    public void setCidade(String p_Cidade) {
        this.Cidade = p_Cidade;
    }
    /**
     * the Endereco attribute.
     */
    private List<Endereco> Endereco;
}

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
     * the estado attribute.
     */
    private String estado;
    /**
     * the rua attribute.
     */
    private String rua;
    /**
     * the cidade attribute.
     */
    private String cidade;
    /**
     * the id attribute.
     */
    private int id;
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
    public void setEstado(String p_estado) {
        this.estado = p_estado;
    }
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
    public void setRua(String p_rua) {
        this.rua = p_rua;
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
    public void setCidade(String p_cidade) {
        this.cidade = p_cidade;
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
    public void setId(int p_id) {
        this.id = p_id;
    }
    /**
     * the Enderecos attribute.
     */
    private List<Endereco> enderecos;
    /**
     * the PessoaBase attribute.
     */
    private PessoaBase pessoabase;
}

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
public class Contato {
    /**
     * the id attribute.
     */
    private int id;
    /**
     * the telefone attribute.
     */
    private String telefone;
    /**
     * the eMail attribute.
     */
    private String eMail;
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
     * the Telefone getter.
     * @return the Telefone.
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * the Telefone setter.
     * @param p_Telefone the Telefone to set.
     */
    public void setTelefone(String p_telefone) {
        this.telefone = p_telefone;
    }
    /**
     * the EMail getter.
     * @return the EMail.
     */
    public String getEMail() {
        return this.eMail;
    }

    /**
     * the EMail setter.
     * @param p_EMail the EMail to set.
     */
    public void setEMail(String p_eMail) {
        this.eMail = p_eMail;
    }
    /**
     * the PessoaBase attribute.
     */
    private PessoaBase PessoaBase;
    /**
     * the Contatos attribute.
     */
    private List<Contato> Contatos;
}

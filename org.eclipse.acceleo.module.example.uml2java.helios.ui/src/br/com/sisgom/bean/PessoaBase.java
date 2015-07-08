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
public abstract class PessoaBase {
    /**
     * the Endereco attribute.
     */
    private List<Endereco> Endereco;
    /**
     * the Id attribute.
     */
    private Integer Id;
    /**
     * the CPFouCNPJ attribute.
     */
    private String CPFouCNPJ;
    /**
     * the TipoPessoa attribute.
     */
    private TipoPessao TipoPessoa;
    /**
     * the Contato attribute.
     */
    private List<Contato> Contato;
    /**
     * the Nome attribute.
     */
    private String Nome;
    /**
     * the Endereco getter.
     * @return the Endereco.
     */
    public List<Endereco> getEndereco() {
        return this.Endereco;
    }

    /**
     * the Endereco setter.
     * @param p_Endereco the Endereco to set.
     */
    public void setEndereco(List<Endereco> p_Endereco) {
        this.Endereco = p_Endereco;
    }
    /**
     * the Id getter.
     * @return the Id.
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * the Id setter.
     * @param p_Id the Id to set.
     */
    public void setId(Integer p_Id) {
        this.Id = p_Id;
    }
    /**
     * the CPFouCNPJ getter.
     * @return the CPFouCNPJ.
     */
    public String getCPFouCNPJ() {
        return this.CPFouCNPJ;
    }

    /**
     * the CPFouCNPJ setter.
     * @param p_CPFouCNPJ the CPFouCNPJ to set.
     */
    public void setCPFouCNPJ(String p_CPFouCNPJ) {
        this.CPFouCNPJ = p_CPFouCNPJ;
    }
    /**
     * the TipoPessoa getter.
     * @return the TipoPessoa.
     */
    public TipoPessao getTipoPessoa() {
        return this.TipoPessoa;
    }

    /**
     * the TipoPessoa setter.
     * @param p_TipoPessoa the TipoPessoa to set.
     */
    public void setTipoPessoa(TipoPessao p_TipoPessoa) {
        this.TipoPessoa = p_TipoPessoa;
    }
    /**
     * the Contato getter.
     * @return the Contato.
     */
    public List<Contato> getContato() {
        return this.Contato;
    }

    /**
     * the Contato setter.
     * @param p_Contato the Contato to set.
     */
    public void setContato(List<Contato> p_Contato) {
        this.Contato = p_Contato;
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
}

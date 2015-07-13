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
     * the id attribute.
     */
    private int id;
    /**
     * the nome attribute.
     */
    private String nome;
    /**
     * the enderecos attribute.
     */
    private List<Endereco> enderecos;
    /**
     * the contato attribute.
     */
    private List<Contato> contato;
    /**
     * the tipoPessoa attribute.
     */
    private TipoPessao tipoPessoa;
    /**
     * the cPFouCNPJ attribute.
     */
    private String cPFouCNPJ;
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
     * the Enderecos getter.
     * @return the Enderecos.
     */
    public List<Endereco> getEnderecos() {
        return this.enderecos;
    }

    /**
     * the Enderecos setter.
     * @param p_Enderecos the Enderecos to set.
     */
    public void setEnderecos(List<Endereco> p_enderecos) {
        this.enderecos = p_enderecos;
    }
    /**
     * the Contato getter.
     * @return the Contato.
     */
    public List<Contato> getContato() {
        return this.contato;
    }

    /**
     * the Contato setter.
     * @param p_Contato the Contato to set.
     */
    public void setContato(List<Contato> p_contato) {
        this.contato = p_contato;
    }
    /**
     * the TipoPessoa getter.
     * @return the TipoPessoa.
     */
    public TipoPessao getTipoPessoa() {
        return this.tipoPessoa;
    }

    /**
     * the TipoPessoa setter.
     * @param p_TipoPessoa the TipoPessoa to set.
     */
    public void setTipoPessoa(TipoPessao p_tipoPessoa) {
        this.tipoPessoa = p_tipoPessoa;
    }
    /**
     * the CPFouCNPJ getter.
     * @return the CPFouCNPJ.
     */
    public String getCPFouCNPJ() {
        return this.cPFouCNPJ;
    }

    /**
     * the CPFouCNPJ setter.
     * @param p_CPFouCNPJ the CPFouCNPJ to set.
     */
    public void setCPFouCNPJ(String p_cPFouCNPJ) {
        this.cPFouCNPJ = p_cPFouCNPJ;
    }
    /**
     * the PessoaBase attribute.
     */
    private PessoaBase pessoabase;
    /**
     * the Enderecos attribute.
     */
    private List<Endereco> enderecos;
    /**
     * the Contato attribute.
     */
    private List<Contato> contato;
    /**
     * the PessoaBase attribute.
     */
    private PessoaBase pessoabase;
}

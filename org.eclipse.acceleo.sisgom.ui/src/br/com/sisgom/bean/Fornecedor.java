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

public class Fornecedor extends  PessoaBase {
    /**
     * the id attribute.
     */
    private int id;
    /**
     * the nome attribute.
     */
    private String nome;
    /**
     * the tipoPessoa attribute.
     */
    private TipoPessao tipoPessoa;
    /**
     * the cPFouCNPJ attribute.
     */
    private String cPFouCNPJ;
    /**
     * the inscricaoEstadual attribute.
     */
    private String inscricaoEstadual;
    /**
     * the enderecos attribute.
     */
    private List<Endereco> enderecos;
    /**
     * the contatos attribute.
     */
    private List<Contato> contatos;
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
     * the InscricaoEstadual getter.
     * @return the InscricaoEstadual.
     */
    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    /**
     * the InscricaoEstadual setter.
     * @param p_InscricaoEstadual the InscricaoEstadual to set.
     */
    public void setInscricaoEstadual(String p_inscricaoEstadual) {
        this.inscricaoEstadual = p_inscricaoEstadual;
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
     * the Contatos getter.
     * @return the Contatos.
     */
    public List<Contato> getContatos() {
        return this.contatos;
    }

    /**
     * the Contatos setter.
     * @param p_Contatos the Contatos to set.
     */
    public void setContatos(List<Contato> p_contatos) {
        this.contatos = p_contatos;
    }
}


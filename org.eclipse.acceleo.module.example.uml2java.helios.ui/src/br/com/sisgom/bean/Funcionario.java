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
public class Funcionario extends  PessoaBase {
    /**
     * the contato attribute.
     */
    private List<Contato> contato;
    /**
     * the id attribute.
     */
    private int id;
    /**
     * the matricula attribute.
     */
    private int matricula;
    /**
     * the cPFouCNPJ attribute.
     */
    private String cPFouCNPJ;
    /**
     * the endereco attribute.
     */
    private List<Endereco> endereco;
    /**
     * the nome attribute.
     */
    private String nome;
    /**
     * the servico attribute.
     */
    private Servico servico;
    /**
     * the tipoPessoa attribute.
     */
    private TipoPessao tipoPessoa;
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
     * the Matricula getter.
     * @return the Matricula.
     */
    public int getMatricula() {
        return this.matricula;
    }

    /**
     * the Matricula setter.
     * @param p_Matricula the Matricula to set.
     */
    public void setMatricula(int p_matricula) {
        this.matricula = p_matricula;
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
     * the Endereco getter.
     * @return the Endereco.
     */
    public List<Endereco> getEndereco() {
        return this.endereco;
    }

    /**
     * the Endereco setter.
     * @param p_Endereco the Endereco to set.
     */
    public void setEndereco(List<Endereco> p_endereco) {
        this.endereco = p_endereco;
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
     * the servico getter.
     * @return the servico.
     */
    public Servico getServico() {
        return this.servico;
    }

    /**
     * the servico setter.
     * @param p_servico the servico to set.
     */
    public void setServico(Servico p_servico) {
        this.servico = p_servico;
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
     * the Funcionario attribute.
     */
    private List<Funcionario> funcionario;
}

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
public class Servico {
    /**
     * the nome attribute.
     */
    private String nome;
    /**
     * the codigo attribute.
     */
    private int codigo;
    /**
     * the tipoCobranca attribute.
     */
    private TipoCobrancao tipoCobranca;
    /**
     * the funcionario attribute.
     */
    private Funcionario funcionario;
    /**
     * the valor attribute.
     */
    private double valor;
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
     * the Codigo getter.
     * @return the Codigo.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }
    /**
     * the TipoCobranca getter.
     * @return the TipoCobranca.
     */
    public TipoCobrancao getTipoCobranca() {
        return this.tipoCobranca;
    }

    /**
     * the TipoCobranca setter.
     * @param p_TipoCobranca the TipoCobranca to set.
     */
    public void setTipoCobranca(TipoCobrancao p_tipoCobranca) {
        this.tipoCobranca = p_tipoCobranca;
    }
    /**
     * the Funcionario getter.
     * @return the Funcionario.
     */
    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    /**
     * the Funcionario setter.
     * @param p_Funcionario the Funcionario to set.
     */
    public void setFuncionario(Funcionario p_funcionario) {
        this.funcionario = p_funcionario;
    }
    /**
     * the Valor getter.
     * @return the Valor.
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * the Valor setter.
     * @param p_Valor the Valor to set.
     */
    public void setValor(double p_valor) {
        this.valor = p_valor;
    }
    /**
     * the Servicos attribute.
     */
    private List<Servico> Servicos;
}

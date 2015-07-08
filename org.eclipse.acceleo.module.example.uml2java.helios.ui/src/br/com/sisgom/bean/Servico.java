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
     * the TipoCobranca attribute.
     */
    private TipoCobrancao TipoCobranca;
    /**
     * the Nome attribute.
     */
    private String Nome;
    /**
     * the Valor attribute.
     */
    private double Valor;
    /**
     * the Funcionario attribute.
     */
    private Funcionario Funcionario;
    /**
     * the Codigo attribute.
     */
    private int Codigo;
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
    public void setTipoCobranca(TipoCobrancao tipoCobranca) {
        this.tipoCobranca = p_tipoCobranca;
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
    public void setNome(String nome) {
        this.nome = p_nome;
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
    public void setValor(double valor) {
        this.valor = p_valor;
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
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = p_funcionario;
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
    public void setCodigo(int codigo) {
        this.codigo = p_codigo;
    }
    /**
     * the Servicos attribute.
     */
    private List<Servico> Servicos;
}

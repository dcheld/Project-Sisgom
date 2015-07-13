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

public class Veiculo {
    /**
     * the cor attribute.
     */
    private String cor;
    /**
     * the ano attribute.
     */
    private int ano;
    /**
     * the chassis attribute.
     */
    private String chassis;
    /**
     * the modelo attribute.
     */
    private String modelo;
    /**
     * the Cor getter.
     * @return the Cor.
     */
    public String getCor() {
        return this.cor;
    }

    /**
     * the Cor setter.
     * @param p_Cor the Cor to set.
     */
    public void setCor(String p_cor) {
        this.cor = p_cor;
    }
    /**
     * the Ano getter.
     * @return the Ano.
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * the Ano setter.
     * @param p_Ano the Ano to set.
     */
    public void setAno(int p_ano) {
        this.ano = p_ano;
    }
    /**
     * the Chassis getter.
     * @return the Chassis.
     */
    public String getChassis() {
        return this.chassis;
    }

    /**
     * the Chassis setter.
     * @param p_Chassis the Chassis to set.
     */
    public void setChassis(String p_chassis) {
        this.chassis = p_chassis;
    }
    /**
     * the Modelo getter.
     * @return the Modelo.
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * the Modelo setter.
     * @param p_Modelo the Modelo to set.
     */
    public void setModelo(String p_modelo) {
        this.modelo = p_modelo;
    }
    /**
     * the Veiculos attribute.
     */
    private List<Veiculo> Veiculos;
    /**
     * the OrdemDeServico attribute.
     */
    private OrdemDeServico OrdemDeServico;
    /**
     * the Cliente attribute.
     */
    private Cliente Cliente;
    /**
     * the Veiculo attribute.
     */
    private Veiculo Veiculo;
}


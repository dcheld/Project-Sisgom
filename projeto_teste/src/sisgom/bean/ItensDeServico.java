/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itens De Servico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.ItensDeServico#getFuncionario <em>Funcionario</em>}</li>
 *   <li>{@link sisgom.bean.ItensDeServico#getServico <em>Servico</em>}</li>
 *   <li>{@link sisgom.bean.ItensDeServico#getPeca <em>Peca</em>}</li>
 *   <li>{@link sisgom.bean.ItensDeServico#getValorServico <em>Valor Servico</em>}</li>
 *   <li>{@link sisgom.bean.ItensDeServico#getValorPeca <em>Valor Peca</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getItensDeServico()
 * @model
 * @generated
 */
public interface ItensDeServico extends EObject {
	/**
	 * Returns the value of the '<em><b>Funcionario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcionario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcionario</em>' reference.
	 * @see #setFuncionario(Funcionario)
	 * @see sisgom.bean.BeanPackage#getItensDeServico_Funcionario()
	 * @model required="true"
	 * @generated
	 */
	Funcionario getFuncionario();

	/**
	 * Sets the value of the '{@link sisgom.bean.ItensDeServico#getFuncionario <em>Funcionario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcionario</em>' reference.
	 * @see #getFuncionario()
	 * @generated
	 */
	void setFuncionario(Funcionario value);

	/**
	 * Returns the value of the '<em><b>Servico</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servico</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servico</em>' reference.
	 * @see #setServico(Servico)
	 * @see sisgom.bean.BeanPackage#getItensDeServico_Servico()
	 * @model required="true"
	 * @generated
	 */
	Servico getServico();

	/**
	 * Sets the value of the '{@link sisgom.bean.ItensDeServico#getServico <em>Servico</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servico</em>' reference.
	 * @see #getServico()
	 * @generated
	 */
	void setServico(Servico value);

	/**
	 * Returns the value of the '<em><b>Peca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peca</em>' reference.
	 * @see #setPeca(Peca)
	 * @see sisgom.bean.BeanPackage#getItensDeServico_Peca()
	 * @model required="true"
	 * @generated
	 */
	Peca getPeca();

	/**
	 * Sets the value of the '{@link sisgom.bean.ItensDeServico#getPeca <em>Peca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peca</em>' reference.
	 * @see #getPeca()
	 * @generated
	 */
	void setPeca(Peca value);

	/**
	 * Returns the value of the '<em><b>Valor Servico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Servico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Servico</em>' attribute.
	 * @see #setValorServico(float)
	 * @see sisgom.bean.BeanPackage#getItensDeServico_ValorServico()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getValorServico();

	/**
	 * Sets the value of the '{@link sisgom.bean.ItensDeServico#getValorServico <em>Valor Servico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Servico</em>' attribute.
	 * @see #getValorServico()
	 * @generated
	 */
	void setValorServico(float value);

	/**
	 * Returns the value of the '<em><b>Valor Peca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Peca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Peca</em>' attribute.
	 * @see #setValorPeca(float)
	 * @see sisgom.bean.BeanPackage#getItensDeServico_ValorPeca()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getValorPeca();

	/**
	 * Sets the value of the '{@link sisgom.bean.ItensDeServico#getValorPeca <em>Valor Peca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Peca</em>' attribute.
	 * @see #getValorPeca()
	 * @generated
	 */
	void setValorPeca(float value);

} // ItensDeServico

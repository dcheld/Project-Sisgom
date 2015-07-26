/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Servico#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sisgom.bean.Servico#getNome <em>Nome</em>}</li>
 *   <li>{@link sisgom.bean.Servico#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getServico()
 * @model
 * @generated
 */
public interface Servico extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(int)
	 * @see sisgom.bean.BeanPackage#getServico_Codigo()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCodigo();

	/**
	 * Sets the value of the '{@link sisgom.bean.Servico#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(int value);

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see sisgom.bean.BeanPackage#getServico_Nome()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link sisgom.bean.Servico#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(float)
	 * @see sisgom.bean.BeanPackage#getServico_Valor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Float" ordered="false"
	 * @generated
	 */
	float getValor();

	/**
	 * Sets the value of the '{@link sisgom.bean.Servico#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(float value);

} // Servico

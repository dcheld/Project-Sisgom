/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contato</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Informações de contato
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Contato#getId <em>Id</em>}</li>
 *   <li>{@link sisgom.bean.Contato#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link sisgom.bean.Contato#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getContato()
 * @model
 * @generated
 */
public interface Contato extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identificador Contato
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see sisgom.bean.BeanPackage#getContato_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link sisgom.bean.Contato#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telefone de contato
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telefone</em>' attribute.
	 * @see #setTelefone(String)
	 * @see sisgom.bean.BeanPackage#getContato_Telefone()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getTelefone();

	/**
	 * Sets the value of the '{@link sisgom.bean.Contato#getTelefone <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefone</em>' attribute.
	 * @see #getTelefone()
	 * @generated
	 */
	void setTelefone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E-mail de contato
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see sisgom.bean.BeanPackage#getContato_Email()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link sisgom.bean.Contato#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Contato

/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endereco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Endereco#getId <em>Id</em>}</li>
 *   <li>{@link sisgom.bean.Endereco#getRua <em>Rua</em>}</li>
 *   <li>{@link sisgom.bean.Endereco#getEstado <em>Estado</em>}</li>
 *   <li>{@link sisgom.bean.Endereco#getCidade <em>Cidade</em>}</li>
 *   <li>{@link sisgom.bean.Endereco#getCEP <em>CEP</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getEndereco()
 * @model
 * @generated
 */
public interface Endereco extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see sisgom.bean.BeanPackage#getEndereco_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link sisgom.bean.Endereco#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Rua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rua</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rua</em>' attribute.
	 * @see #setRua(String)
	 * @see sisgom.bean.BeanPackage#getEndereco_Rua()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getRua();

	/**
	 * Sets the value of the '{@link sisgom.bean.Endereco#getRua <em>Rua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rua</em>' attribute.
	 * @see #getRua()
	 * @generated
	 */
	void setRua(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see sisgom.bean.BeanPackage#getEndereco_Estado()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link sisgom.bean.Endereco#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidade</em>' attribute.
	 * @see #setCidade(String)
	 * @see sisgom.bean.BeanPackage#getEndereco_Cidade()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getCidade();

	/**
	 * Sets the value of the '{@link sisgom.bean.Endereco#getCidade <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidade</em>' attribute.
	 * @see #getCidade()
	 * @generated
	 */
	void setCidade(String value);

	/**
	 * Returns the value of the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CEP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEP</em>' attribute.
	 * @see #setCEP(String)
	 * @see sisgom.bean.BeanPackage#getEndereco_CEP()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCEP();

	/**
	 * Sets the value of the '{@link sisgom.bean.Endereco#getCEP <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEP</em>' attribute.
	 * @see #getCEP()
	 * @generated
	 */
	void setCEP(String value);

} // Endereco

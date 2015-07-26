/**
 */
package sisgom.bean;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fornecedor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Fornecedor#getInscricaoEstadual <em>Inscricao Estadual</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getFornecedor()
 * @model
 * @generated
 */
public interface Fornecedor extends PessoaBase {
	/**
	 * Returns the value of the '<em><b>Inscricao Estadual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inscricao Estadual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscricao Estadual</em>' attribute.
	 * @see #setInscricaoEstadual(String)
	 * @see sisgom.bean.BeanPackage#getFornecedor_InscricaoEstadual()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getInscricaoEstadual();

	/**
	 * Sets the value of the '{@link sisgom.bean.Fornecedor#getInscricaoEstadual <em>Inscricao Estadual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscricao Estadual</em>' attribute.
	 * @see #getInscricaoEstadual()
	 * @generated
	 */
	void setInscricaoEstadual(String value);

} // Fornecedor

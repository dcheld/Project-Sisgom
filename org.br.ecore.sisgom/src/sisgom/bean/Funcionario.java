/**
 */
package sisgom.bean;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Funcionario#getMatricula <em>Matricula</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getFuncionario()
 * @model
 * @generated
 */
public interface Funcionario extends PessoaBase {
	/**
	 * Returns the value of the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricula</em>' attribute.
	 * @see #setMatricula(int)
	 * @see sisgom.bean.BeanPackage#getFuncionario_Matricula()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMatricula();

	/**
	 * Sets the value of the '{@link sisgom.bean.Funcionario#getMatricula <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricula</em>' attribute.
	 * @see #getMatricula()
	 * @generated
	 */
	void setMatricula(int value);

} // Funcionario

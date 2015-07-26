/**
 */
package sisgom.bean;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Cliente#getVeiculo <em>Veiculo</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends PessoaBase {
	/**
	 * Returns the value of the '<em><b>Veiculo</b></em>' containment reference list.
	 * The list contents are of type {@link sisgom.bean.Veiculo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Veiculo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Veiculo</em>' containment reference list.
	 * @see sisgom.bean.BeanPackage#getCliente_Veiculo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Veiculo> getVeiculo();

} // Cliente

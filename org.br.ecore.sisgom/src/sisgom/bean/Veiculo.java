/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Veiculo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Veiculo#getChassis <em>Chassis</em>}</li>
 *   <li>{@link sisgom.bean.Veiculo#getModelo <em>Modelo</em>}</li>
 *   <li>{@link sisgom.bean.Veiculo#getAno <em>Ano</em>}</li>
 *   <li>{@link sisgom.bean.Veiculo#getCor <em>Cor</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getVeiculo()
 * @model
 * @generated
 */
public interface Veiculo extends EObject {
	/**
	 * Returns the value of the '<em><b>Chassis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chassis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chassis</em>' attribute.
	 * @see #setChassis(String)
	 * @see sisgom.bean.BeanPackage#getVeiculo_Chassis()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getChassis();

	/**
	 * Sets the value of the '{@link sisgom.bean.Veiculo#getChassis <em>Chassis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chassis</em>' attribute.
	 * @see #getChassis()
	 * @generated
	 */
	void setChassis(String value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' attribute.
	 * @see #setModelo(String)
	 * @see sisgom.bean.BeanPackage#getVeiculo_Modelo()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getModelo();

	/**
	 * Sets the value of the '{@link sisgom.bean.Veiculo#getModelo <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo</em>' attribute.
	 * @see #getModelo()
	 * @generated
	 */
	void setModelo(String value);

	/**
	 * Returns the value of the '<em><b>Ano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ano</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ano</em>' attribute.
	 * @see #setAno(int)
	 * @see sisgom.bean.BeanPackage#getVeiculo_Ano()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getAno();

	/**
	 * Sets the value of the '{@link sisgom.bean.Veiculo#getAno <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ano</em>' attribute.
	 * @see #getAno()
	 * @generated
	 */
	void setAno(int value);

	/**
	 * Returns the value of the '<em><b>Cor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cor</em>' attribute.
	 * @see #setCor(String)
	 * @see sisgom.bean.BeanPackage#getVeiculo_Cor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCor();

	/**
	 * Sets the value of the '{@link sisgom.bean.Veiculo#getCor <em>Cor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cor</em>' attribute.
	 * @see #getCor()
	 * @generated
	 */
	void setCor(String value);

} // Veiculo

/**
 */
package sisgom.bean;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordem De Servico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.OrdemDeServico#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sisgom.bean.OrdemDeServico#getDataEntradaVeiculo <em>Data Entrada Veiculo</em>}</li>
 *   <li>{@link sisgom.bean.OrdemDeServico#getVeiculo <em>Veiculo</em>}</li>
 *   <li>{@link sisgom.bean.OrdemDeServico#getItensDeServico <em>Itens De Servico</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getOrdemDeServico()
 * @model
 * @generated
 */
public interface OrdemDeServico extends EObject {
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
	 * @see sisgom.bean.BeanPackage#getOrdemDeServico_Codigo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCodigo();

	/**
	 * Sets the value of the '{@link sisgom.bean.OrdemDeServico#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(int value);

	/**
	 * Returns the value of the '<em><b>Data Entrada Veiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Entrada Veiculo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Entrada Veiculo</em>' attribute.
	 * @see #setDataEntradaVeiculo(XMLGregorianCalendar)
	 * @see sisgom.bean.BeanPackage#getOrdemDeServico_DataEntradaVeiculo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getDataEntradaVeiculo();

	/**
	 * Sets the value of the '{@link sisgom.bean.OrdemDeServico#getDataEntradaVeiculo <em>Data Entrada Veiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Entrada Veiculo</em>' attribute.
	 * @see #getDataEntradaVeiculo()
	 * @generated
	 */
	void setDataEntradaVeiculo(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Veiculo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Veiculo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Veiculo</em>' containment reference.
	 * @see #setVeiculo(Veiculo)
	 * @see sisgom.bean.BeanPackage#getOrdemDeServico_Veiculo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Veiculo getVeiculo();

	/**
	 * Sets the value of the '{@link sisgom.bean.OrdemDeServico#getVeiculo <em>Veiculo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Veiculo</em>' containment reference.
	 * @see #getVeiculo()
	 * @generated
	 */
	void setVeiculo(Veiculo value);

	/**
	 * Returns the value of the '<em><b>Itens De Servico</b></em>' reference list.
	 * The list contents are of type {@link sisgom.bean.ItensDeServico}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itens De Servico</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itens De Servico</em>' reference list.
	 * @see sisgom.bean.BeanPackage#getOrdemDeServico_ItensDeServico()
	 * @model required="true"
	 * @generated
	 */
	EList<ItensDeServico> getItensDeServico();

} // OrdemDeServico

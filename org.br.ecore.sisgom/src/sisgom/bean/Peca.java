/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.Peca#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sisgom.bean.Peca#getNome <em>Nome</em>}</li>
 *   <li>{@link sisgom.bean.Peca#getValorCompra <em>Valor Compra</em>}</li>
 *   <li>{@link sisgom.bean.Peca#getValorVenda <em>Valor Venda</em>}</li>
 *   <li>{@link sisgom.bean.Peca#getFornecedor <em>Fornecedor</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getPeca()
 * @model
 * @generated
 */
public interface Peca extends EObject {
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
	 * @see sisgom.bean.BeanPackage#getPeca_Codigo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCodigo();

	/**
	 * Sets the value of the '{@link sisgom.bean.Peca#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see sisgom.bean.BeanPackage#getPeca_Nome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link sisgom.bean.Peca#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Valor Compra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Compra</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Compra</em>' attribute.
	 * @see #setValorCompra(float)
	 * @see sisgom.bean.BeanPackage#getPeca_ValorCompra()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getValorCompra();

	/**
	 * Sets the value of the '{@link sisgom.bean.Peca#getValorCompra <em>Valor Compra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Compra</em>' attribute.
	 * @see #getValorCompra()
	 * @generated
	 */
	void setValorCompra(float value);

	/**
	 * Returns the value of the '<em><b>Valor Venda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Venda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Venda</em>' attribute.
	 * @see #setValorVenda(float)
	 * @see sisgom.bean.BeanPackage#getPeca_ValorVenda()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getValorVenda();

	/**
	 * Sets the value of the '{@link sisgom.bean.Peca#getValorVenda <em>Valor Venda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Venda</em>' attribute.
	 * @see #getValorVenda()
	 * @generated
	 */
	void setValorVenda(float value);

	/**
	 * Returns the value of the '<em><b>Fornecedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fornecedor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fornecedor</em>' reference.
	 * @see #setFornecedor(Fornecedor)
	 * @see sisgom.bean.BeanPackage#getPeca_Fornecedor()
	 * @model required="true"
	 * @generated
	 */
	Fornecedor getFornecedor();

	/**
	 * Sets the value of the '{@link sisgom.bean.Peca#getFornecedor <em>Fornecedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fornecedor</em>' reference.
	 * @see #getFornecedor()
	 * @generated
	 */
	void setFornecedor(Fornecedor value);

} // Peca

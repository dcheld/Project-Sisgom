/**
 */
package sisgom.bean;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pessoa Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.PessoaBase#getId <em>Id</em>}</li>
 *   <li>{@link sisgom.bean.PessoaBase#getNome <em>Nome</em>}</li>
 *   <li>{@link sisgom.bean.PessoaBase#getCPFouCNPJ <em>CP Fou CNPJ</em>}</li>
 *   <li>{@link sisgom.bean.PessoaBase#getContatos <em>Contatos</em>}</li>
 *   <li>{@link sisgom.bean.PessoaBase#getEnderecos <em>Enderecos</em>}</li>
 * </ul>
 *
 * @see sisgom.bean.BeanPackage#getPessoaBase()
 * @model abstract="true"
 * @generated
 */
public interface PessoaBase extends EObject {
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
	 * @see sisgom.bean.BeanPackage#getPessoaBase_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link sisgom.bean.PessoaBase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome da pessoa
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see sisgom.bean.BeanPackage#getPessoaBase_Nome()
	 * @model unique="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link sisgom.bean.PessoaBase#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>CP Fou CNPJ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero do CPF ou do CNPJ
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CP Fou CNPJ</em>' attribute.
	 * @see #setCPFouCNPJ(String)
	 * @see sisgom.bean.BeanPackage#getPessoaBase_CPFouCNPJ()
	 * @model
	 * @generated
	 */
	String getCPFouCNPJ();

	/**
	 * Sets the value of the '{@link sisgom.bean.PessoaBase#getCPFouCNPJ <em>CP Fou CNPJ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CP Fou CNPJ</em>' attribute.
	 * @see #getCPFouCNPJ()
	 * @generated
	 */
	void setCPFouCNPJ(String value);

	/**
	 * Returns the value of the '<em><b>Contatos</b></em>' containment reference list.
	 * The list contents are of type {@link sisgom.bean.Contato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contatos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contatos</em>' containment reference list.
	 * @see sisgom.bean.BeanPackage#getPessoaBase_Contatos()
	 * @model containment="true" keys="Id"
	 * @generated
	 */
	EList<Contato> getContatos();

	/**
	 * Returns the value of the '<em><b>Enderecos</b></em>' containment reference list.
	 * The list contents are of type {@link sisgom.bean.Endereco}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enderecos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enderecos</em>' containment reference list.
	 * @see sisgom.bean.BeanPackage#getPessoaBase_Enderecos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Endereco> getEnderecos();

} // PessoaBase

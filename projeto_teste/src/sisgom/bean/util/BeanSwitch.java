/**
 */
package sisgom.bean.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sisgom.bean.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sisgom.bean.BeanPackage
 * @generated
 */
public class BeanSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BeanPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanSwitch() {
		if (modelPackage == null) {
			modelPackage = BeanPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BeanPackage.PESSOA_BASE: {
				PessoaBase pessoaBase = (PessoaBase)theEObject;
				T result = casePessoaBase(pessoaBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.ENDERECO: {
				Endereco endereco = (Endereco)theEObject;
				T result = caseEndereco(endereco);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.FORNECEDOR: {
				Fornecedor fornecedor = (Fornecedor)theEObject;
				T result = caseFornecedor(fornecedor);
				if (result == null) result = casePessoaBase(fornecedor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.FUNCIONARIO: {
				Funcionario funcionario = (Funcionario)theEObject;
				T result = caseFuncionario(funcionario);
				if (result == null) result = casePessoaBase(funcionario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.CLIENTE: {
				Cliente cliente = (Cliente)theEObject;
				T result = caseCliente(cliente);
				if (result == null) result = casePessoaBase(cliente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.CONTATO: {
				Contato contato = (Contato)theEObject;
				T result = caseContato(contato);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.SERVICO: {
				Servico servico = (Servico)theEObject;
				T result = caseServico(servico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.ORDEM_DE_SERVICO: {
				OrdemDeServico ordemDeServico = (OrdemDeServico)theEObject;
				T result = caseOrdemDeServico(ordemDeServico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.PECA: {
				Peca peca = (Peca)theEObject;
				T result = casePeca(peca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.VEICULO: {
				Veiculo veiculo = (Veiculo)theEObject;
				T result = caseVeiculo(veiculo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeanPackage.ITENS_DE_SERVICO: {
				ItensDeServico itensDeServico = (ItensDeServico)theEObject;
				T result = caseItensDeServico(itensDeServico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pessoa Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pessoa Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePessoaBase(PessoaBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endereco</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endereco</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndereco(Endereco object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fornecedor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fornecedor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFornecedor(Fornecedor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcionario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcionario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncionario(Funcionario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliente(Cliente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contato</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contato</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContato(Contato object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServico(Servico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordem De Servico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordem De Servico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdemDeServico(OrdemDeServico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peca</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peca</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeca(Peca object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Veiculo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Veiculo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVeiculo(Veiculo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Itens De Servico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itens De Servico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItensDeServico(ItensDeServico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BeanSwitch

/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sisgom.bean.BeanPackage;
import sisgom.bean.Fornecedor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fornecedor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.FornecedorImpl#getInscricaoEstadual <em>Inscricao Estadual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FornecedorImpl extends PessoaBaseImpl implements Fornecedor {
	/**
	 * The default value of the '{@link #getInscricaoEstadual() <em>Inscricao Estadual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscricaoEstadual()
	 * @generated
	 * @ordered
	 */
	protected static final String INSCRICAO_ESTADUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInscricaoEstadual() <em>Inscricao Estadual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscricaoEstadual()
	 * @generated
	 * @ordered
	 */
	protected String inscricaoEstadual = INSCRICAO_ESTADUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FornecedorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.FORNECEDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInscricaoEstadual(String newInscricaoEstadual) {
		String oldInscricaoEstadual = inscricaoEstadual;
		inscricaoEstadual = newInscricaoEstadual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.FORNECEDOR__INSCRICAO_ESTADUAL, oldInscricaoEstadual, inscricaoEstadual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.FORNECEDOR__INSCRICAO_ESTADUAL:
				return getInscricaoEstadual();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BeanPackage.FORNECEDOR__INSCRICAO_ESTADUAL:
				setInscricaoEstadual((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BeanPackage.FORNECEDOR__INSCRICAO_ESTADUAL:
				setInscricaoEstadual(INSCRICAO_ESTADUAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BeanPackage.FORNECEDOR__INSCRICAO_ESTADUAL:
				return INSCRICAO_ESTADUAL_EDEFAULT == null ? inscricaoEstadual != null : !INSCRICAO_ESTADUAL_EDEFAULT.equals(inscricaoEstadual);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (InscricaoEstadual: ");
		result.append(inscricaoEstadual);
		result.append(')');
		return result.toString();
	}

} //FornecedorImpl

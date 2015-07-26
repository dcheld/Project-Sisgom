/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sisgom.bean.BeanPackage;
import sisgom.bean.Funcionario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.FuncionarioImpl#getMatricula <em>Matricula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncionarioImpl extends PessoaBaseImpl implements Funcionario {
	/**
	 * The default value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected static final int MATRICULA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected int matricula = MATRICULA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.FUNCIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricula(int newMatricula) {
		int oldMatricula = matricula;
		matricula = newMatricula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.FUNCIONARIO__MATRICULA, oldMatricula, matricula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.FUNCIONARIO__MATRICULA:
				return getMatricula();
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
			case BeanPackage.FUNCIONARIO__MATRICULA:
				setMatricula((Integer)newValue);
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
			case BeanPackage.FUNCIONARIO__MATRICULA:
				setMatricula(MATRICULA_EDEFAULT);
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
			case BeanPackage.FUNCIONARIO__MATRICULA:
				return matricula != MATRICULA_EDEFAULT;
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
		result.append(" (Matricula: ");
		result.append(matricula);
		result.append(')');
		return result.toString();
	}

} //FuncionarioImpl

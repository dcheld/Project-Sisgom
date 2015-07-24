/**
 */
package sisgom.bean.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sisgom.bean.BeanPackage;
import sisgom.bean.Cliente;
import sisgom.bean.Veiculo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.ClienteImpl#getVeiculo <em>Veiculo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteImpl extends PessoaBaseImpl implements Cliente {
	/**
	 * The cached value of the '{@link #getVeiculo() <em>Veiculo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeiculo()
	 * @generated
	 * @ordered
	 */
	protected EList<Veiculo> veiculo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Veiculo> getVeiculo() {
		if (veiculo == null) {
			veiculo = new EObjectContainmentEList<Veiculo>(Veiculo.class, this, BeanPackage.CLIENTE__VEICULO);
		}
		return veiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeanPackage.CLIENTE__VEICULO:
				return ((InternalEList<?>)getVeiculo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.CLIENTE__VEICULO:
				return getVeiculo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BeanPackage.CLIENTE__VEICULO:
				getVeiculo().clear();
				getVeiculo().addAll((Collection<? extends Veiculo>)newValue);
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
			case BeanPackage.CLIENTE__VEICULO:
				getVeiculo().clear();
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
			case BeanPackage.CLIENTE__VEICULO:
				return veiculo != null && !veiculo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClienteImpl

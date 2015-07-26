/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sisgom.bean.BeanPackage;
import sisgom.bean.Veiculo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Veiculo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.VeiculoImpl#getChassis <em>Chassis</em>}</li>
 *   <li>{@link sisgom.bean.impl.VeiculoImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link sisgom.bean.impl.VeiculoImpl#getAno <em>Ano</em>}</li>
 *   <li>{@link sisgom.bean.impl.VeiculoImpl#getCor <em>Cor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VeiculoImpl extends MinimalEObjectImpl.Container implements Veiculo {
	/**
	 * The default value of the '{@link #getChassis() <em>Chassis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassis()
	 * @generated
	 * @ordered
	 */
	protected static final String CHASSIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChassis() <em>Chassis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassis()
	 * @generated
	 * @ordered
	 */
	protected String chassis = CHASSIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected String modelo = MODELO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAno() <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAno()
	 * @generated
	 * @ordered
	 */
	protected static final int ANO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAno() <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAno()
	 * @generated
	 * @ordered
	 */
	protected int ano = ANO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCor() <em>Cor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCor()
	 * @generated
	 * @ordered
	 */
	protected static final String COR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCor() <em>Cor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCor()
	 * @generated
	 * @ordered
	 */
	protected String cor = COR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VeiculoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.VEICULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChassis() {
		return chassis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChassis(String newChassis) {
		String oldChassis = chassis;
		chassis = newChassis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.VEICULO__CHASSIS, oldChassis, chassis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelo(String newModelo) {
		String oldModelo = modelo;
		modelo = newModelo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.VEICULO__MODELO, oldModelo, modelo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAno(int newAno) {
		int oldAno = ano;
		ano = newAno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.VEICULO__ANO, oldAno, ano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCor(String newCor) {
		String oldCor = cor;
		cor = newCor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.VEICULO__COR, oldCor, cor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.VEICULO__CHASSIS:
				return getChassis();
			case BeanPackage.VEICULO__MODELO:
				return getModelo();
			case BeanPackage.VEICULO__ANO:
				return getAno();
			case BeanPackage.VEICULO__COR:
				return getCor();
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
			case BeanPackage.VEICULO__CHASSIS:
				setChassis((String)newValue);
				return;
			case BeanPackage.VEICULO__MODELO:
				setModelo((String)newValue);
				return;
			case BeanPackage.VEICULO__ANO:
				setAno((Integer)newValue);
				return;
			case BeanPackage.VEICULO__COR:
				setCor((String)newValue);
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
			case BeanPackage.VEICULO__CHASSIS:
				setChassis(CHASSIS_EDEFAULT);
				return;
			case BeanPackage.VEICULO__MODELO:
				setModelo(MODELO_EDEFAULT);
				return;
			case BeanPackage.VEICULO__ANO:
				setAno(ANO_EDEFAULT);
				return;
			case BeanPackage.VEICULO__COR:
				setCor(COR_EDEFAULT);
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
			case BeanPackage.VEICULO__CHASSIS:
				return CHASSIS_EDEFAULT == null ? chassis != null : !CHASSIS_EDEFAULT.equals(chassis);
			case BeanPackage.VEICULO__MODELO:
				return MODELO_EDEFAULT == null ? modelo != null : !MODELO_EDEFAULT.equals(modelo);
			case BeanPackage.VEICULO__ANO:
				return ano != ANO_EDEFAULT;
			case BeanPackage.VEICULO__COR:
				return COR_EDEFAULT == null ? cor != null : !COR_EDEFAULT.equals(cor);
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
		result.append(" (Chassis: ");
		result.append(chassis);
		result.append(", Modelo: ");
		result.append(modelo);
		result.append(", Ano: ");
		result.append(ano);
		result.append(", Cor: ");
		result.append(cor);
		result.append(')');
		return result.toString();
	}

} //VeiculoImpl

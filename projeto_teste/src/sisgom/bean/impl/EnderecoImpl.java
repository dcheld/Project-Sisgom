/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sisgom.bean.BeanPackage;
import sisgom.bean.Endereco;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endereco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.EnderecoImpl#getId <em>Id</em>}</li>
 *   <li>{@link sisgom.bean.impl.EnderecoImpl#getRua <em>Rua</em>}</li>
 *   <li>{@link sisgom.bean.impl.EnderecoImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link sisgom.bean.impl.EnderecoImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link sisgom.bean.impl.EnderecoImpl#getCEP <em>CEP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnderecoImpl extends MinimalEObjectImpl.Container implements Endereco {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRua() <em>Rua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRua()
	 * @generated
	 * @ordered
	 */
	protected static final String RUA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRua() <em>Rua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRua()
	 * @generated
	 * @ordered
	 */
	protected String rua = RUA_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected String cidade = CIDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCEP() <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCEP() <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnderecoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.ENDERECO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ENDERECO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRua(String newRua) {
		String oldRua = rua;
		rua = newRua;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ENDERECO__RUA, oldRua, rua));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ENDERECO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidade(String newCidade) {
		String oldCidade = cidade;
		cidade = newCidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ENDERECO__CIDADE, oldCidade, cidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCEP() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEP(String newCEP) {
		String oldCEP = cep;
		cep = newCEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ENDERECO__CEP, oldCEP, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.ENDERECO__ID:
				return getId();
			case BeanPackage.ENDERECO__RUA:
				return getRua();
			case BeanPackage.ENDERECO__ESTADO:
				return getEstado();
			case BeanPackage.ENDERECO__CIDADE:
				return getCidade();
			case BeanPackage.ENDERECO__CEP:
				return getCEP();
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
			case BeanPackage.ENDERECO__ID:
				setId((Integer)newValue);
				return;
			case BeanPackage.ENDERECO__RUA:
				setRua((String)newValue);
				return;
			case BeanPackage.ENDERECO__ESTADO:
				setEstado((String)newValue);
				return;
			case BeanPackage.ENDERECO__CIDADE:
				setCidade((String)newValue);
				return;
			case BeanPackage.ENDERECO__CEP:
				setCEP((String)newValue);
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
			case BeanPackage.ENDERECO__ID:
				setId(ID_EDEFAULT);
				return;
			case BeanPackage.ENDERECO__RUA:
				setRua(RUA_EDEFAULT);
				return;
			case BeanPackage.ENDERECO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case BeanPackage.ENDERECO__CIDADE:
				setCidade(CIDADE_EDEFAULT);
				return;
			case BeanPackage.ENDERECO__CEP:
				setCEP(CEP_EDEFAULT);
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
			case BeanPackage.ENDERECO__ID:
				return id != ID_EDEFAULT;
			case BeanPackage.ENDERECO__RUA:
				return RUA_EDEFAULT == null ? rua != null : !RUA_EDEFAULT.equals(rua);
			case BeanPackage.ENDERECO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case BeanPackage.ENDERECO__CIDADE:
				return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
			case BeanPackage.ENDERECO__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", Rua: ");
		result.append(rua);
		result.append(", Estado: ");
		result.append(estado);
		result.append(", Cidade: ");
		result.append(cidade);
		result.append(", CEP: ");
		result.append(cep);
		result.append(')');
		return result.toString();
	}

} //EnderecoImpl

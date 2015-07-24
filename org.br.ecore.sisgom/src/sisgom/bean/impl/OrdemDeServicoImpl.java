/**
 */
package sisgom.bean.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sisgom.bean.BeanPackage;
import sisgom.bean.ItensDeServico;
import sisgom.bean.OrdemDeServico;
import sisgom.bean.Veiculo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordem De Servico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.OrdemDeServicoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sisgom.bean.impl.OrdemDeServicoImpl#getDataEntradaVeiculo <em>Data Entrada Veiculo</em>}</li>
 *   <li>{@link sisgom.bean.impl.OrdemDeServicoImpl#getVeiculo <em>Veiculo</em>}</li>
 *   <li>{@link sisgom.bean.impl.OrdemDeServicoImpl#getItensDeServico <em>Itens De Servico</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrdemDeServicoImpl extends MinimalEObjectImpl.Container implements OrdemDeServico {
	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected int codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataEntradaVeiculo() <em>Data Entrada Veiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEntradaVeiculo()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_ENTRADA_VEICULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataEntradaVeiculo() <em>Data Entrada Veiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEntradaVeiculo()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataEntradaVeiculo = DATA_ENTRADA_VEICULO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVeiculo() <em>Veiculo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeiculo()
	 * @generated
	 * @ordered
	 */
	protected Veiculo veiculo;

	/**
	 * The cached value of the '{@link #getItensDeServico() <em>Itens De Servico</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItensDeServico()
	 * @generated
	 * @ordered
	 */
	protected EList<ItensDeServico> itensDeServico;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdemDeServicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.ORDEM_DE_SERVICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(int newCodigo) {
		int oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ORDEM_DE_SERVICO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataEntradaVeiculo() {
		return dataEntradaVeiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEntradaVeiculo(XMLGregorianCalendar newDataEntradaVeiculo) {
		XMLGregorianCalendar oldDataEntradaVeiculo = dataEntradaVeiculo;
		dataEntradaVeiculo = newDataEntradaVeiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO, oldDataEntradaVeiculo, dataEntradaVeiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Veiculo getVeiculo() {
		return veiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVeiculo(Veiculo newVeiculo, NotificationChain msgs) {
		Veiculo oldVeiculo = veiculo;
		veiculo = newVeiculo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeanPackage.ORDEM_DE_SERVICO__VEICULO, oldVeiculo, newVeiculo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVeiculo(Veiculo newVeiculo) {
		if (newVeiculo != veiculo) {
			NotificationChain msgs = null;
			if (veiculo != null)
				msgs = ((InternalEObject)veiculo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeanPackage.ORDEM_DE_SERVICO__VEICULO, null, msgs);
			if (newVeiculo != null)
				msgs = ((InternalEObject)newVeiculo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeanPackage.ORDEM_DE_SERVICO__VEICULO, null, msgs);
			msgs = basicSetVeiculo(newVeiculo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ORDEM_DE_SERVICO__VEICULO, newVeiculo, newVeiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItensDeServico> getItensDeServico() {
		if (itensDeServico == null) {
			itensDeServico = new EObjectResolvingEList<ItensDeServico>(ItensDeServico.class, this, BeanPackage.ORDEM_DE_SERVICO__ITENS_DE_SERVICO);
		}
		return itensDeServico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeanPackage.ORDEM_DE_SERVICO__VEICULO:
				return basicSetVeiculo(null, msgs);
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
			case BeanPackage.ORDEM_DE_SERVICO__CODIGO:
				return getCodigo();
			case BeanPackage.ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO:
				return getDataEntradaVeiculo();
			case BeanPackage.ORDEM_DE_SERVICO__VEICULO:
				return getVeiculo();
			case BeanPackage.ORDEM_DE_SERVICO__ITENS_DE_SERVICO:
				return getItensDeServico();
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
			case BeanPackage.ORDEM_DE_SERVICO__CODIGO:
				setCodigo((Integer)newValue);
				return;
			case BeanPackage.ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO:
				setDataEntradaVeiculo((XMLGregorianCalendar)newValue);
				return;
			case BeanPackage.ORDEM_DE_SERVICO__VEICULO:
				setVeiculo((Veiculo)newValue);
				return;
			case BeanPackage.ORDEM_DE_SERVICO__ITENS_DE_SERVICO:
				getItensDeServico().clear();
				getItensDeServico().addAll((Collection<? extends ItensDeServico>)newValue);
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
			case BeanPackage.ORDEM_DE_SERVICO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case BeanPackage.ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO:
				setDataEntradaVeiculo(DATA_ENTRADA_VEICULO_EDEFAULT);
				return;
			case BeanPackage.ORDEM_DE_SERVICO__VEICULO:
				setVeiculo((Veiculo)null);
				return;
			case BeanPackage.ORDEM_DE_SERVICO__ITENS_DE_SERVICO:
				getItensDeServico().clear();
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
			case BeanPackage.ORDEM_DE_SERVICO__CODIGO:
				return codigo != CODIGO_EDEFAULT;
			case BeanPackage.ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO:
				return DATA_ENTRADA_VEICULO_EDEFAULT == null ? dataEntradaVeiculo != null : !DATA_ENTRADA_VEICULO_EDEFAULT.equals(dataEntradaVeiculo);
			case BeanPackage.ORDEM_DE_SERVICO__VEICULO:
				return veiculo != null;
			case BeanPackage.ORDEM_DE_SERVICO__ITENS_DE_SERVICO:
				return itensDeServico != null && !itensDeServico.isEmpty();
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
		result.append(" (Codigo: ");
		result.append(codigo);
		result.append(", DataEntradaVeiculo: ");
		result.append(dataEntradaVeiculo);
		result.append(')');
		return result.toString();
	}

} //OrdemDeServicoImpl

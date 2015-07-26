/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sisgom.bean.BeanPackage;
import sisgom.bean.Funcionario;
import sisgom.bean.ItensDeServico;
import sisgom.bean.Peca;
import sisgom.bean.Servico;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itens De Servico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.ItensDeServicoImpl#getFuncionario <em>Funcionario</em>}</li>
 *   <li>{@link sisgom.bean.impl.ItensDeServicoImpl#getServico <em>Servico</em>}</li>
 *   <li>{@link sisgom.bean.impl.ItensDeServicoImpl#getPeca <em>Peca</em>}</li>
 *   <li>{@link sisgom.bean.impl.ItensDeServicoImpl#getValorServico <em>Valor Servico</em>}</li>
 *   <li>{@link sisgom.bean.impl.ItensDeServicoImpl#getValorPeca <em>Valor Peca</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItensDeServicoImpl extends MinimalEObjectImpl.Container implements ItensDeServico {
	/**
	 * The cached value of the '{@link #getFuncionario() <em>Funcionario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncionario()
	 * @generated
	 * @ordered
	 */
	protected Funcionario funcionario;

	/**
	 * The cached value of the '{@link #getServico() <em>Servico</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServico()
	 * @generated
	 * @ordered
	 */
	protected Servico servico;

	/**
	 * The cached value of the '{@link #getPeca() <em>Peca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeca()
	 * @generated
	 * @ordered
	 */
	protected Peca peca;

	/**
	 * The default value of the '{@link #getValorServico() <em>Valor Servico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorServico()
	 * @generated
	 * @ordered
	 */
	protected static final float VALOR_SERVICO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValorServico() <em>Valor Servico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorServico()
	 * @generated
	 * @ordered
	 */
	protected float valorServico = VALOR_SERVICO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorPeca() <em>Valor Peca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorPeca()
	 * @generated
	 * @ordered
	 */
	protected static final float VALOR_PECA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValorPeca() <em>Valor Peca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorPeca()
	 * @generated
	 * @ordered
	 */
	protected float valorPeca = VALOR_PECA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItensDeServicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.ITENS_DE_SERVICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcionario getFuncionario() {
		if (funcionario != null && funcionario.eIsProxy()) {
			InternalEObject oldFuncionario = (InternalEObject)funcionario;
			funcionario = (Funcionario)eResolveProxy(oldFuncionario);
			if (funcionario != oldFuncionario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeanPackage.ITENS_DE_SERVICO__FUNCIONARIO, oldFuncionario, funcionario));
			}
		}
		return funcionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcionario basicGetFuncionario() {
		return funcionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncionario(Funcionario newFuncionario) {
		Funcionario oldFuncionario = funcionario;
		funcionario = newFuncionario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ITENS_DE_SERVICO__FUNCIONARIO, oldFuncionario, funcionario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servico getServico() {
		if (servico != null && servico.eIsProxy()) {
			InternalEObject oldServico = (InternalEObject)servico;
			servico = (Servico)eResolveProxy(oldServico);
			if (servico != oldServico) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeanPackage.ITENS_DE_SERVICO__SERVICO, oldServico, servico));
			}
		}
		return servico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servico basicGetServico() {
		return servico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServico(Servico newServico) {
		Servico oldServico = servico;
		servico = newServico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ITENS_DE_SERVICO__SERVICO, oldServico, servico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peca getPeca() {
		if (peca != null && peca.eIsProxy()) {
			InternalEObject oldPeca = (InternalEObject)peca;
			peca = (Peca)eResolveProxy(oldPeca);
			if (peca != oldPeca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeanPackage.ITENS_DE_SERVICO__PECA, oldPeca, peca));
			}
		}
		return peca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peca basicGetPeca() {
		return peca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeca(Peca newPeca) {
		Peca oldPeca = peca;
		peca = newPeca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ITENS_DE_SERVICO__PECA, oldPeca, peca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValorServico() {
		return valorServico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorServico(float newValorServico) {
		float oldValorServico = valorServico;
		valorServico = newValorServico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ITENS_DE_SERVICO__VALOR_SERVICO, oldValorServico, valorServico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValorPeca() {
		return valorPeca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorPeca(float newValorPeca) {
		float oldValorPeca = valorPeca;
		valorPeca = newValorPeca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.ITENS_DE_SERVICO__VALOR_PECA, oldValorPeca, valorPeca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.ITENS_DE_SERVICO__FUNCIONARIO:
				if (resolve) return getFuncionario();
				return basicGetFuncionario();
			case BeanPackage.ITENS_DE_SERVICO__SERVICO:
				if (resolve) return getServico();
				return basicGetServico();
			case BeanPackage.ITENS_DE_SERVICO__PECA:
				if (resolve) return getPeca();
				return basicGetPeca();
			case BeanPackage.ITENS_DE_SERVICO__VALOR_SERVICO:
				return getValorServico();
			case BeanPackage.ITENS_DE_SERVICO__VALOR_PECA:
				return getValorPeca();
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
			case BeanPackage.ITENS_DE_SERVICO__FUNCIONARIO:
				setFuncionario((Funcionario)newValue);
				return;
			case BeanPackage.ITENS_DE_SERVICO__SERVICO:
				setServico((Servico)newValue);
				return;
			case BeanPackage.ITENS_DE_SERVICO__PECA:
				setPeca((Peca)newValue);
				return;
			case BeanPackage.ITENS_DE_SERVICO__VALOR_SERVICO:
				setValorServico((Float)newValue);
				return;
			case BeanPackage.ITENS_DE_SERVICO__VALOR_PECA:
				setValorPeca((Float)newValue);
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
			case BeanPackage.ITENS_DE_SERVICO__FUNCIONARIO:
				setFuncionario((Funcionario)null);
				return;
			case BeanPackage.ITENS_DE_SERVICO__SERVICO:
				setServico((Servico)null);
				return;
			case BeanPackage.ITENS_DE_SERVICO__PECA:
				setPeca((Peca)null);
				return;
			case BeanPackage.ITENS_DE_SERVICO__VALOR_SERVICO:
				setValorServico(VALOR_SERVICO_EDEFAULT);
				return;
			case BeanPackage.ITENS_DE_SERVICO__VALOR_PECA:
				setValorPeca(VALOR_PECA_EDEFAULT);
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
			case BeanPackage.ITENS_DE_SERVICO__FUNCIONARIO:
				return funcionario != null;
			case BeanPackage.ITENS_DE_SERVICO__SERVICO:
				return servico != null;
			case BeanPackage.ITENS_DE_SERVICO__PECA:
				return peca != null;
			case BeanPackage.ITENS_DE_SERVICO__VALOR_SERVICO:
				return valorServico != VALOR_SERVICO_EDEFAULT;
			case BeanPackage.ITENS_DE_SERVICO__VALOR_PECA:
				return valorPeca != VALOR_PECA_EDEFAULT;
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
		result.append(" (ValorServico: ");
		result.append(valorServico);
		result.append(", ValorPeca: ");
		result.append(valorPeca);
		result.append(')');
		return result.toString();
	}

} //ItensDeServicoImpl

/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sisgom.bean.BeanPackage;
import sisgom.bean.Fornecedor;
import sisgom.bean.Peca;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.PecaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sisgom.bean.impl.PecaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link sisgom.bean.impl.PecaImpl#getValorCompra <em>Valor Compra</em>}</li>
 *   <li>{@link sisgom.bean.impl.PecaImpl#getValorVenda <em>Valor Venda</em>}</li>
 *   <li>{@link sisgom.bean.impl.PecaImpl#getFornecedor <em>Fornecedor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PecaImpl extends MinimalEObjectImpl.Container implements Peca {
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
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorCompra() <em>Valor Compra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorCompra()
	 * @generated
	 * @ordered
	 */
	protected static final float VALOR_COMPRA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValorCompra() <em>Valor Compra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorCompra()
	 * @generated
	 * @ordered
	 */
	protected float valorCompra = VALOR_COMPRA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorVenda() <em>Valor Venda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorVenda()
	 * @generated
	 * @ordered
	 */
	protected static final float VALOR_VENDA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValorVenda() <em>Valor Venda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorVenda()
	 * @generated
	 * @ordered
	 */
	protected float valorVenda = VALOR_VENDA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFornecedor() <em>Fornecedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFornecedor()
	 * @generated
	 * @ordered
	 */
	protected Fornecedor fornecedor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PecaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.PECA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PECA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PECA__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValorCompra() {
		return valorCompra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorCompra(float newValorCompra) {
		float oldValorCompra = valorCompra;
		valorCompra = newValorCompra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PECA__VALOR_COMPRA, oldValorCompra, valorCompra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValorVenda() {
		return valorVenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorVenda(float newValorVenda) {
		float oldValorVenda = valorVenda;
		valorVenda = newValorVenda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PECA__VALOR_VENDA, oldValorVenda, valorVenda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fornecedor getFornecedor() {
		if (fornecedor != null && fornecedor.eIsProxy()) {
			InternalEObject oldFornecedor = (InternalEObject)fornecedor;
			fornecedor = (Fornecedor)eResolveProxy(oldFornecedor);
			if (fornecedor != oldFornecedor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeanPackage.PECA__FORNECEDOR, oldFornecedor, fornecedor));
			}
		}
		return fornecedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fornecedor basicGetFornecedor() {
		return fornecedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFornecedor(Fornecedor newFornecedor) {
		Fornecedor oldFornecedor = fornecedor;
		fornecedor = newFornecedor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PECA__FORNECEDOR, oldFornecedor, fornecedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeanPackage.PECA__CODIGO:
				return getCodigo();
			case BeanPackage.PECA__NOME:
				return getNome();
			case BeanPackage.PECA__VALOR_COMPRA:
				return getValorCompra();
			case BeanPackage.PECA__VALOR_VENDA:
				return getValorVenda();
			case BeanPackage.PECA__FORNECEDOR:
				if (resolve) return getFornecedor();
				return basicGetFornecedor();
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
			case BeanPackage.PECA__CODIGO:
				setCodigo((Integer)newValue);
				return;
			case BeanPackage.PECA__NOME:
				setNome((String)newValue);
				return;
			case BeanPackage.PECA__VALOR_COMPRA:
				setValorCompra((Float)newValue);
				return;
			case BeanPackage.PECA__VALOR_VENDA:
				setValorVenda((Float)newValue);
				return;
			case BeanPackage.PECA__FORNECEDOR:
				setFornecedor((Fornecedor)newValue);
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
			case BeanPackage.PECA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case BeanPackage.PECA__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case BeanPackage.PECA__VALOR_COMPRA:
				setValorCompra(VALOR_COMPRA_EDEFAULT);
				return;
			case BeanPackage.PECA__VALOR_VENDA:
				setValorVenda(VALOR_VENDA_EDEFAULT);
				return;
			case BeanPackage.PECA__FORNECEDOR:
				setFornecedor((Fornecedor)null);
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
			case BeanPackage.PECA__CODIGO:
				return codigo != CODIGO_EDEFAULT;
			case BeanPackage.PECA__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case BeanPackage.PECA__VALOR_COMPRA:
				return valorCompra != VALOR_COMPRA_EDEFAULT;
			case BeanPackage.PECA__VALOR_VENDA:
				return valorVenda != VALOR_VENDA_EDEFAULT;
			case BeanPackage.PECA__FORNECEDOR:
				return fornecedor != null;
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
		result.append(", Nome: ");
		result.append(nome);
		result.append(", ValorCompra: ");
		result.append(valorCompra);
		result.append(", ValorVenda: ");
		result.append(valorVenda);
		result.append(')');
		return result.toString();
	}

} //PecaImpl

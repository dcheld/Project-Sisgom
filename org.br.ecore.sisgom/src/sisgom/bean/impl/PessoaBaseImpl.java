/**
 */
package sisgom.bean.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sisgom.bean.BeanPackage;
import sisgom.bean.Contato;
import sisgom.bean.Endereco;
import sisgom.bean.PessoaBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pessoa Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sisgom.bean.impl.PessoaBaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link sisgom.bean.impl.PessoaBaseImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link sisgom.bean.impl.PessoaBaseImpl#getCPFouCNPJ <em>CP Fou CNPJ</em>}</li>
 *   <li>{@link sisgom.bean.impl.PessoaBaseImpl#getContatos <em>Contatos</em>}</li>
 *   <li>{@link sisgom.bean.impl.PessoaBaseImpl#getEnderecos <em>Enderecos</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PessoaBaseImpl extends MinimalEObjectImpl.Container implements PessoaBase {
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
	 * The default value of the '{@link #getCPFouCNPJ() <em>CP Fou CNPJ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPFouCNPJ()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_FOU_CNPJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPFouCNPJ() <em>CP Fou CNPJ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPFouCNPJ()
	 * @generated
	 * @ordered
	 */
	protected String cpFouCNPJ = CP_FOU_CNPJ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContatos() <em>Contatos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContatos()
	 * @generated
	 * @ordered
	 */
	protected EList<Contato> contatos;

	/**
	 * The cached value of the '{@link #getEnderecos() <em>Enderecos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnderecos()
	 * @generated
	 * @ordered
	 */
	protected EList<Endereco> enderecos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PessoaBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeanPackage.Literals.PESSOA_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PESSOA_BASE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PESSOA_BASE__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPFouCNPJ() {
		return cpFouCNPJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPFouCNPJ(String newCPFouCNPJ) {
		String oldCPFouCNPJ = cpFouCNPJ;
		cpFouCNPJ = newCPFouCNPJ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeanPackage.PESSOA_BASE__CP_FOU_CNPJ, oldCPFouCNPJ, cpFouCNPJ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contato> getContatos() {
		if (contatos == null) {
			contatos = new EObjectContainmentEList<Contato>(Contato.class, this, BeanPackage.PESSOA_BASE__CONTATOS);
		}
		return contatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new EObjectContainmentEList<Endereco>(Endereco.class, this, BeanPackage.PESSOA_BASE__ENDERECOS);
		}
		return enderecos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeanPackage.PESSOA_BASE__CONTATOS:
				return ((InternalEList<?>)getContatos()).basicRemove(otherEnd, msgs);
			case BeanPackage.PESSOA_BASE__ENDERECOS:
				return ((InternalEList<?>)getEnderecos()).basicRemove(otherEnd, msgs);
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
			case BeanPackage.PESSOA_BASE__ID:
				return getId();
			case BeanPackage.PESSOA_BASE__NOME:
				return getNome();
			case BeanPackage.PESSOA_BASE__CP_FOU_CNPJ:
				return getCPFouCNPJ();
			case BeanPackage.PESSOA_BASE__CONTATOS:
				return getContatos();
			case BeanPackage.PESSOA_BASE__ENDERECOS:
				return getEnderecos();
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
			case BeanPackage.PESSOA_BASE__ID:
				setId((Integer)newValue);
				return;
			case BeanPackage.PESSOA_BASE__NOME:
				setNome((String)newValue);
				return;
			case BeanPackage.PESSOA_BASE__CP_FOU_CNPJ:
				setCPFouCNPJ((String)newValue);
				return;
			case BeanPackage.PESSOA_BASE__CONTATOS:
				getContatos().clear();
				getContatos().addAll((Collection<? extends Contato>)newValue);
				return;
			case BeanPackage.PESSOA_BASE__ENDERECOS:
				getEnderecos().clear();
				getEnderecos().addAll((Collection<? extends Endereco>)newValue);
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
			case BeanPackage.PESSOA_BASE__ID:
				setId(ID_EDEFAULT);
				return;
			case BeanPackage.PESSOA_BASE__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case BeanPackage.PESSOA_BASE__CP_FOU_CNPJ:
				setCPFouCNPJ(CP_FOU_CNPJ_EDEFAULT);
				return;
			case BeanPackage.PESSOA_BASE__CONTATOS:
				getContatos().clear();
				return;
			case BeanPackage.PESSOA_BASE__ENDERECOS:
				getEnderecos().clear();
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
			case BeanPackage.PESSOA_BASE__ID:
				return id != ID_EDEFAULT;
			case BeanPackage.PESSOA_BASE__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case BeanPackage.PESSOA_BASE__CP_FOU_CNPJ:
				return CP_FOU_CNPJ_EDEFAULT == null ? cpFouCNPJ != null : !CP_FOU_CNPJ_EDEFAULT.equals(cpFouCNPJ);
			case BeanPackage.PESSOA_BASE__CONTATOS:
				return contatos != null && !contatos.isEmpty();
			case BeanPackage.PESSOA_BASE__ENDERECOS:
				return enderecos != null && !enderecos.isEmpty();
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
		result.append(", Nome: ");
		result.append(nome);
		result.append(", CPFouCNPJ: ");
		result.append(cpFouCNPJ);
		result.append(')');
		return result.toString();
	}

} //PessoaBaseImpl

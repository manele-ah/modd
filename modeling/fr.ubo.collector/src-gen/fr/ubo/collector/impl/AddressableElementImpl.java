/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.AddressableElement;
import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.Endpoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.AddressableElementImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressableElementImpl extends NamedElementImpl implements AddressableElement
{
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Endpoint id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressableElementImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CollectorPackage.Literals.ADDRESSABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(Endpoint newId, NotificationChain msgs)
	{
		Endpoint oldId = id;
		id = newId;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				CollectorPackage.ADDRESSABLE_ELEMENT__ID, oldId, newId);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Endpoint newId)
	{
		if (newId != id)
		{
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject) id).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.ADDRESSABLE_ELEMENT__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject) newId).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.ADDRESSABLE_ELEMENT__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(
				new ENotificationImpl(this, Notification.SET, CollectorPackage.ADDRESSABLE_ELEMENT__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case CollectorPackage.ADDRESSABLE_ELEMENT__ID:
				return basicSetId(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case CollectorPackage.ADDRESSABLE_ELEMENT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CollectorPackage.ADDRESSABLE_ELEMENT__ID:
				setId((Endpoint) newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case CollectorPackage.ADDRESSABLE_ELEMENT__ID:
				setId((Endpoint) null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case CollectorPackage.ADDRESSABLE_ELEMENT__ID:
				return id != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressableElementImpl

/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.DataCollector;
import fr.ubo.collector.Drone;
import fr.ubo.collector.PubBroker;
import fr.ubo.collector.Publisher;
import fr.ubo.collector.SubBroker;
import fr.ubo.collector.Subscriber;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Collector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.DataCollectorImpl#getDrone <em>Drone</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.DataCollectorImpl#getPubBroker <em>Pub Broker</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.DataCollectorImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.DataCollectorImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.DataCollectorImpl#getSubBroker <em>Sub Broker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCollectorImpl extends MinimalEObjectImpl.Container implements DataCollector
{
	/**
	 * The cached value of the '{@link #getDrone() <em>Drone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrone()
	 * @generated
	 * @ordered
	 */
	protected Drone drone;

	/**
	 * The cached value of the '{@link #getPubBroker() <em>Pub Broker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubBroker()
	 * @generated
	 * @ordered
	 */
	protected PubBroker pubBroker;

	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<Publisher> publishers;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscriber> subscribers;

	/**
	 * The cached value of the '{@link #getSubBroker() <em>Sub Broker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubBroker()
	 * @generated
	 * @ordered
	 */
	protected SubBroker subBroker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectorImpl()
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
		return CollectorPackage.Literals.DATA_COLLECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone getDrone()
	{
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrone(Drone newDrone, NotificationChain msgs)
	{
		Drone oldDrone = drone;
		drone = newDrone;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				CollectorPackage.DATA_COLLECTOR__DRONE, oldDrone, newDrone);
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
	public void setDrone(Drone newDrone)
	{
		if (newDrone != drone)
		{
			NotificationChain msgs = null;
			if (drone != null)
				msgs = ((InternalEObject) drone).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.DATA_COLLECTOR__DRONE, null, msgs);
			if (newDrone != null)
				msgs = ((InternalEObject) newDrone).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.DATA_COLLECTOR__DRONE, null, msgs);
			msgs = basicSetDrone(newDrone, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.DATA_COLLECTOR__DRONE, newDrone,
				newDrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubBroker getPubBroker()
	{
		return pubBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubBroker(PubBroker newPubBroker, NotificationChain msgs)
	{
		PubBroker oldPubBroker = pubBroker;
		pubBroker = newPubBroker;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				CollectorPackage.DATA_COLLECTOR__PUB_BROKER, oldPubBroker, newPubBroker);
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
	public void setPubBroker(PubBroker newPubBroker)
	{
		if (newPubBroker != pubBroker)
		{
			NotificationChain msgs = null;
			if (pubBroker != null)
				msgs = ((InternalEObject) pubBroker).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.DATA_COLLECTOR__PUB_BROKER, null, msgs);
			if (newPubBroker != null)
				msgs = ((InternalEObject) newPubBroker).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.DATA_COLLECTOR__PUB_BROKER, null, msgs);
			msgs = basicSetPubBroker(newPubBroker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.DATA_COLLECTOR__PUB_BROKER,
				newPubBroker, newPubBroker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublishers()
	{
		if (publishers == null)
		{
			publishers = new EObjectContainmentEList<Publisher>(Publisher.class, this,
				CollectorPackage.DATA_COLLECTOR__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscriber> getSubscribers()
	{
		if (subscribers == null)
		{
			subscribers = new EObjectContainmentEList<Subscriber>(Subscriber.class, this,
				CollectorPackage.DATA_COLLECTOR__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubBroker getSubBroker()
	{
		return subBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubBroker(SubBroker newSubBroker, NotificationChain msgs)
	{
		SubBroker oldSubBroker = subBroker;
		subBroker = newSubBroker;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				CollectorPackage.DATA_COLLECTOR__SUB_BROKER, oldSubBroker, newSubBroker);
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
	public void setSubBroker(SubBroker newSubBroker)
	{
		if (newSubBroker != subBroker)
		{
			NotificationChain msgs = null;
			if (subBroker != null)
				msgs = ((InternalEObject) subBroker).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.DATA_COLLECTOR__SUB_BROKER, null, msgs);
			if (newSubBroker != null)
				msgs = ((InternalEObject) newSubBroker).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.DATA_COLLECTOR__SUB_BROKER, null, msgs);
			msgs = basicSetSubBroker(newSubBroker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.DATA_COLLECTOR__SUB_BROKER,
				newSubBroker, newSubBroker));
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
			case CollectorPackage.DATA_COLLECTOR__DRONE:
				return basicSetDrone(null, msgs);
			case CollectorPackage.DATA_COLLECTOR__PUB_BROKER:
				return basicSetPubBroker(null, msgs);
			case CollectorPackage.DATA_COLLECTOR__PUBLISHERS:
				return ((InternalEList<?>) getPublishers()).basicRemove(otherEnd, msgs);
			case CollectorPackage.DATA_COLLECTOR__SUBSCRIBERS:
				return ((InternalEList<?>) getSubscribers()).basicRemove(otherEnd, msgs);
			case CollectorPackage.DATA_COLLECTOR__SUB_BROKER:
				return basicSetSubBroker(null, msgs);
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
			case CollectorPackage.DATA_COLLECTOR__DRONE:
				return getDrone();
			case CollectorPackage.DATA_COLLECTOR__PUB_BROKER:
				return getPubBroker();
			case CollectorPackage.DATA_COLLECTOR__PUBLISHERS:
				return getPublishers();
			case CollectorPackage.DATA_COLLECTOR__SUBSCRIBERS:
				return getSubscribers();
			case CollectorPackage.DATA_COLLECTOR__SUB_BROKER:
				return getSubBroker();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CollectorPackage.DATA_COLLECTOR__DRONE:
				setDrone((Drone) newValue);
				return;
			case CollectorPackage.DATA_COLLECTOR__PUB_BROKER:
				setPubBroker((PubBroker) newValue);
				return;
			case CollectorPackage.DATA_COLLECTOR__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends Publisher>) newValue);
				return;
			case CollectorPackage.DATA_COLLECTOR__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends Subscriber>) newValue);
				return;
			case CollectorPackage.DATA_COLLECTOR__SUB_BROKER:
				setSubBroker((SubBroker) newValue);
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
			case CollectorPackage.DATA_COLLECTOR__DRONE:
				setDrone((Drone) null);
				return;
			case CollectorPackage.DATA_COLLECTOR__PUB_BROKER:
				setPubBroker((PubBroker) null);
				return;
			case CollectorPackage.DATA_COLLECTOR__PUBLISHERS:
				getPublishers().clear();
				return;
			case CollectorPackage.DATA_COLLECTOR__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case CollectorPackage.DATA_COLLECTOR__SUB_BROKER:
				setSubBroker((SubBroker) null);
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
			case CollectorPackage.DATA_COLLECTOR__DRONE:
				return drone != null;
			case CollectorPackage.DATA_COLLECTOR__PUB_BROKER:
				return pubBroker != null;
			case CollectorPackage.DATA_COLLECTOR__PUBLISHERS:
				return publishers != null && ! publishers.isEmpty();
			case CollectorPackage.DATA_COLLECTOR__SUBSCRIBERS:
				return subscribers != null && ! subscribers.isEmpty();
			case CollectorPackage.DATA_COLLECTOR__SUB_BROKER:
				return subBroker != null;
		}
		return super.eIsSet(featureID);
	}

} //DataCollectorImpl

/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.AddressableElement;
import fr.ubo.collector.Aggregation;
import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.Endpoint;
import fr.ubo.collector.MeasuredVariable;
import fr.ubo.collector.Subscriber;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.SubscriberImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.SubscriberImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.SubscriberImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.SubscriberImpl#getMonitoredMeasure <em>Monitored Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriberImpl extends NamedElementImpl implements Subscriber
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
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final Aggregation AGGREGATION_EDEFAULT = Aggregation.MIN;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected Aggregation aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitoredMeasure() <em>Monitored Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredMeasure()
	 * @generated
	 * @ordered
	 */
	protected MeasuredVariable monitoredMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriberImpl()
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
		return CollectorPackage.Literals.SUBSCRIBER;
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
				CollectorPackage.SUBSCRIBER__ID, oldId, newId);
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
					EOPPOSITE_FEATURE_BASE - CollectorPackage.SUBSCRIBER__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject) newId).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.SUBSCRIBER__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.SUBSCRIBER__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod()
	{
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod)
	{
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(
				new ENotificationImpl(this, Notification.SET, CollectorPackage.SUBSCRIBER__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation getAggregation()
	{
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(Aggregation newAggregation)
	{
		Aggregation oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.SUBSCRIBER__AGGREGATION,
				oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredVariable getMonitoredMeasure()
	{
		if (monitoredMeasure != null && monitoredMeasure.eIsProxy())
		{
			InternalEObject oldMonitoredMeasure = (InternalEObject) monitoredMeasure;
			monitoredMeasure = (MeasuredVariable) eResolveProxy(oldMonitoredMeasure);
			if (monitoredMeasure != oldMonitoredMeasure)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						CollectorPackage.SUBSCRIBER__MONITORED_MEASURE, oldMonitoredMeasure, monitoredMeasure));
			}
		}
		return monitoredMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredVariable basicGetMonitoredMeasure()
	{
		return monitoredMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredMeasure(MeasuredVariable newMonitoredMeasure)
	{
		MeasuredVariable oldMonitoredMeasure = monitoredMeasure;
		monitoredMeasure = newMonitoredMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.SUBSCRIBER__MONITORED_MEASURE,
				oldMonitoredMeasure, monitoredMeasure));
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
			case CollectorPackage.SUBSCRIBER__ID:
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
			case CollectorPackage.SUBSCRIBER__ID:
				return getId();
			case CollectorPackage.SUBSCRIBER__PERIOD:
				return getPeriod();
			case CollectorPackage.SUBSCRIBER__AGGREGATION:
				return getAggregation();
			case CollectorPackage.SUBSCRIBER__MONITORED_MEASURE:
				if (resolve)
					return getMonitoredMeasure();
				return basicGetMonitoredMeasure();
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
			case CollectorPackage.SUBSCRIBER__ID:
				setId((Endpoint) newValue);
				return;
			case CollectorPackage.SUBSCRIBER__PERIOD:
				setPeriod((Double) newValue);
				return;
			case CollectorPackage.SUBSCRIBER__AGGREGATION:
				setAggregation((Aggregation) newValue);
				return;
			case CollectorPackage.SUBSCRIBER__MONITORED_MEASURE:
				setMonitoredMeasure((MeasuredVariable) newValue);
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
			case CollectorPackage.SUBSCRIBER__ID:
				setId((Endpoint) null);
				return;
			case CollectorPackage.SUBSCRIBER__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case CollectorPackage.SUBSCRIBER__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case CollectorPackage.SUBSCRIBER__MONITORED_MEASURE:
				setMonitoredMeasure((MeasuredVariable) null);
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
			case CollectorPackage.SUBSCRIBER__ID:
				return id != null;
			case CollectorPackage.SUBSCRIBER__PERIOD:
				return period != PERIOD_EDEFAULT;
			case CollectorPackage.SUBSCRIBER__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case CollectorPackage.SUBSCRIBER__MONITORED_MEASURE:
				return monitoredMeasure != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == AddressableElement.class)
		{
			switch (derivedFeatureID)
			{
				case CollectorPackage.SUBSCRIBER__ID:
					return CollectorPackage.ADDRESSABLE_ELEMENT__ID;
				default:
					return - 1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == AddressableElement.class)
		{
			switch (baseFeatureID)
			{
				case CollectorPackage.ADDRESSABLE_ELEMENT__ID:
					return CollectorPackage.SUBSCRIBER__ID;
				default:
					return - 1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (period: ");
		result.append(period);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(')');
		return result.toString();
	}

} //SubscriberImpl

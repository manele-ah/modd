/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.AddressableElement;
import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.Endpoint;
import fr.ubo.collector.MeasuredVariable;
import fr.ubo.collector.Publisher;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.PublisherImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.PublisherImpl#getPublishedMeasures <em>Published Measures</em>}</li>
 *   <li>{@link fr.ubo.collector.impl.PublisherImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherImpl extends NamedElementImpl implements Publisher
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
	 * The cached value of the '{@link #getPublishedMeasures() <em>Published Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasuredVariable> publishedMeasures;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 0.04;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherImpl()
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
		return CollectorPackage.Literals.PUBLISHER;
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
				CollectorPackage.PUBLISHER__ID, oldId, newId);
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
					EOPPOSITE_FEATURE_BASE - CollectorPackage.PUBLISHER__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject) newId).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - CollectorPackage.PUBLISHER__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.PUBLISHER__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasuredVariable> getPublishedMeasures()
	{
		if (publishedMeasures == null)
		{
			publishedMeasures = new EObjectResolvingEList<MeasuredVariable>(MeasuredVariable.class, this,
				CollectorPackage.PUBLISHER__PUBLISHED_MEASURES);
		}
		return publishedMeasures;
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
				new ENotificationImpl(this, Notification.SET, CollectorPackage.PUBLISHER__PERIOD, oldPeriod, period));
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
			case CollectorPackage.PUBLISHER__ID:
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
			case CollectorPackage.PUBLISHER__ID:
				return getId();
			case CollectorPackage.PUBLISHER__PUBLISHED_MEASURES:
				return getPublishedMeasures();
			case CollectorPackage.PUBLISHER__PERIOD:
				return getPeriod();
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
			case CollectorPackage.PUBLISHER__ID:
				setId((Endpoint) newValue);
				return;
			case CollectorPackage.PUBLISHER__PUBLISHED_MEASURES:
				getPublishedMeasures().clear();
				getPublishedMeasures().addAll((Collection<? extends MeasuredVariable>) newValue);
				return;
			case CollectorPackage.PUBLISHER__PERIOD:
				setPeriod((Double) newValue);
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
			case CollectorPackage.PUBLISHER__ID:
				setId((Endpoint) null);
				return;
			case CollectorPackage.PUBLISHER__PUBLISHED_MEASURES:
				getPublishedMeasures().clear();
				return;
			case CollectorPackage.PUBLISHER__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
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
			case CollectorPackage.PUBLISHER__ID:
				return id != null;
			case CollectorPackage.PUBLISHER__PUBLISHED_MEASURES:
				return publishedMeasures != null && ! publishedMeasures.isEmpty();
			case CollectorPackage.PUBLISHER__PERIOD:
				return period != PERIOD_EDEFAULT;
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
				case CollectorPackage.PUBLISHER__ID:
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
					return CollectorPackage.PUBLISHER__ID;
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
		result.append(')');
		return result.toString();
	}

} //PublisherImpl

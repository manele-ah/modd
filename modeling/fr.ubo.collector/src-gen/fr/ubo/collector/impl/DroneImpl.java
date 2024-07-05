/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.Drone;
import fr.ubo.collector.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.DroneImpl#getSensorsDrone <em>Sensors Drone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneImpl extends NamedElementImpl implements Drone
{
	/**
	 * The cached value of the '{@link #getSensorsDrone() <em>Sensors Drone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorsDrone()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensorsDrone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl()
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
		return CollectorPackage.Literals.DRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensorsDrone()
	{
		if (sensorsDrone == null)
		{
			sensorsDrone = new EObjectContainmentEList<Sensor>(Sensor.class, this,
				CollectorPackage.DRONE__SENSORS_DRONE);
		}
		return sensorsDrone;
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
			case CollectorPackage.DRONE__SENSORS_DRONE:
				return ((InternalEList<?>) getSensorsDrone()).basicRemove(otherEnd, msgs);
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
			case CollectorPackage.DRONE__SENSORS_DRONE:
				return getSensorsDrone();
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
			case CollectorPackage.DRONE__SENSORS_DRONE:
				getSensorsDrone().clear();
				getSensorsDrone().addAll((Collection<? extends Sensor>) newValue);
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
			case CollectorPackage.DRONE__SENSORS_DRONE:
				getSensorsDrone().clear();
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
			case CollectorPackage.DRONE__SENSORS_DRONE:
				return sensorsDrone != null && ! sensorsDrone.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DroneImpl

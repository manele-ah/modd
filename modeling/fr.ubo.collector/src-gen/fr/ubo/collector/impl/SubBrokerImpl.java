/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.SubBroker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.SubBrokerImpl#getConfigurationPath <em>Configuration Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubBrokerImpl extends AddressableElementImpl implements SubBroker
{
	/**
	 * The default value of the '{@link #getConfigurationPath() <em>Configuration Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationPath() <em>Configuration Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationPath()
	 * @generated
	 * @ordered
	 */
	protected String configurationPath = CONFIGURATION_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubBrokerImpl()
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
		return CollectorPackage.Literals.SUB_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationPath()
	{
		return configurationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationPath(String newConfigurationPath)
	{
		String oldConfigurationPath = configurationPath;
		configurationPath = newConfigurationPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.SUB_BROKER__CONFIGURATION_PATH,
				oldConfigurationPath, configurationPath));
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
			case CollectorPackage.SUB_BROKER__CONFIGURATION_PATH:
				return getConfigurationPath();
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
			case CollectorPackage.SUB_BROKER__CONFIGURATION_PATH:
				setConfigurationPath((String) newValue);
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
			case CollectorPackage.SUB_BROKER__CONFIGURATION_PATH:
				setConfigurationPath(CONFIGURATION_PATH_EDEFAULT);
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
			case CollectorPackage.SUB_BROKER__CONFIGURATION_PATH:
				return CONFIGURATION_PATH_EDEFAULT == null ? configurationPath != null
					: ! CONFIGURATION_PATH_EDEFAULT.equals(configurationPath);
		}
		return super.eIsSet(featureID);
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
		result.append(" (configurationPath: ");
		result.append(configurationPath);
		result.append(')');
		return result.toString();
	}

} //SubBrokerImpl

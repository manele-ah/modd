/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.PubBroker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pub Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.impl.PubBrokerImpl#getLogPath <em>Log Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubBrokerImpl extends AddressableElementImpl implements PubBroker
{
	/**
	 * The default value of the '{@link #getLogPath() <em>Log Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogPath() <em>Log Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogPath()
	 * @generated
	 * @ordered
	 */
	protected String logPath = LOG_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubBrokerImpl()
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
		return CollectorPackage.Literals.PUB_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogPath()
	{
		return logPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogPath(String newLogPath)
	{
		String oldLogPath = logPath;
		logPath = newLogPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectorPackage.PUB_BROKER__LOG_PATH, oldLogPath,
				logPath));
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
			case CollectorPackage.PUB_BROKER__LOG_PATH:
				return getLogPath();
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
			case CollectorPackage.PUB_BROKER__LOG_PATH:
				setLogPath((String) newValue);
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
			case CollectorPackage.PUB_BROKER__LOG_PATH:
				setLogPath(LOG_PATH_EDEFAULT);
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
			case CollectorPackage.PUB_BROKER__LOG_PATH:
				return LOG_PATH_EDEFAULT == null ? logPath != null : ! LOG_PATH_EDEFAULT.equals(logPath);
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
		result.append(" (logPath: ");
		result.append(logPath);
		result.append(')');
		return result.toString();
	}

} //PubBrokerImpl

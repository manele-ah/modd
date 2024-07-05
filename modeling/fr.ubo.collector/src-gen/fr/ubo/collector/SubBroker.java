/**
 */
package fr.ubo.collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.SubBroker#getConfigurationPath <em>Configuration Path</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getSubBroker()
 * @model
 * @generated
 */
public interface SubBroker extends AddressableElement
{
	/**
	 * Returns the value of the '<em><b>Configuration Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Path</em>' attribute.
	 * @see #setConfigurationPath(String)
	 * @see fr.ubo.collector.CollectorPackage#getSubBroker_ConfigurationPath()
	 * @model required="true"
	 * @generated
	 */
	String getConfigurationPath();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.SubBroker#getConfigurationPath <em>Configuration Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Path</em>' attribute.
	 * @see #getConfigurationPath()
	 * @generated
	 */
	void setConfigurationPath(String value);

} // SubBroker

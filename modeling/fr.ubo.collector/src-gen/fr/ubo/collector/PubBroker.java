/**
 */
package fr.ubo.collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pub Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.PubBroker#getLogPath <em>Log Path</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getPubBroker()
 * @model
 * @generated
 */
public interface PubBroker extends AddressableElement
{
	/**
	 * Returns the value of the '<em><b>Log Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Path</em>' attribute.
	 * @see #setLogPath(String)
	 * @see fr.ubo.collector.CollectorPackage#getPubBroker_LogPath()
	 * @model required="true"
	 * @generated
	 */
	String getLogPath();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.PubBroker#getLogPath <em>Log Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Path</em>' attribute.
	 * @see #getLogPath()
	 * @generated
	 */
	void setLogPath(String value);

} // PubBroker

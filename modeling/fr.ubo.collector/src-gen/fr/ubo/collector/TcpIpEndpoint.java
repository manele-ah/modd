/**
 */
package fr.ubo.collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tcp Ip Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.TcpIpEndpoint#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link fr.ubo.collector.TcpIpEndpoint#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getTcpIpEndpoint()
 * @model
 * @generated
 */
public interface TcpIpEndpoint extends Endpoint
{
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see fr.ubo.collector.CollectorPackage#getTcpIpEndpoint_IpAddress()
	 * @model required="true"
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.TcpIpEndpoint#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see fr.ubo.collector.CollectorPackage#getTcpIpEndpoint_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.TcpIpEndpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // TcpIpEndpoint

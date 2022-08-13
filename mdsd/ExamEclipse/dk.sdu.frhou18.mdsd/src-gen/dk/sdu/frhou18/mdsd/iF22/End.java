/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.End#getEndMessage <em>End Message</em>}</li>
 * </ul>
 *
 * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getEnd()
 * @model
 * @generated
 */
public interface End extends Statement
{
  /**
   * Returns the value of the '<em><b>End Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Message</em>' containment reference.
   * @see #setEndMessage(Expression)
   * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getEnd_EndMessage()
   * @model containment="true"
   * @generated
   */
  Expression getEndMessage();

  /**
   * Sets the value of the '{@link dk.sdu.frhou18.mdsd.iF22.End#getEndMessage <em>End Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Message</em>' containment reference.
   * @see #getEndMessage()
   * @generated
   */
  void setEndMessage(Expression value);

} // End
/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.Or#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.Or#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getOr()
 * @model
 * @generated
 */
public interface Or extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getOr_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.frhou18.mdsd.iF22.Or#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getOr_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link dk.sdu.frhou18.mdsd.iF22.Or#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Or

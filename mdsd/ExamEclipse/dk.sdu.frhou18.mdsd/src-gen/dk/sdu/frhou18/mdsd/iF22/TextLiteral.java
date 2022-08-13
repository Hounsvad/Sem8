/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.TextLiteral#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getTextLiteral()
 * @model
 * @generated
 */
public interface TextLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getTextLiteral_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link dk.sdu.frhou18.mdsd.iF22.TextLiteral#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // TextLiteral
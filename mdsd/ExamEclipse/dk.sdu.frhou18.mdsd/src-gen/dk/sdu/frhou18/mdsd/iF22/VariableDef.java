/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd.iF22;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.VariableDef#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.VariableDef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getVariableDef()
 * @model
 * @generated
 */
public interface VariableDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getVariableDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.frhou18.mdsd.iF22.VariableDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link dk.sdu.frhou18.mdsd.iF22.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see dk.sdu.frhou18.mdsd.iF22.Type
   * @see #setType(Type)
   * @see dk.sdu.frhou18.mdsd.iF22.IF22Package#getVariableDef_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link dk.sdu.frhou18.mdsd.iF22.VariableDef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see dk.sdu.frhou18.mdsd.iF22.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // VariableDef
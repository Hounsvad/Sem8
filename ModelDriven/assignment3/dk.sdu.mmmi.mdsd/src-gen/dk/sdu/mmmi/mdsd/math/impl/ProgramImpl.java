/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math.impl;

import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.ProgramName;
import dk.sdu.mmmi.mdsd.math.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.impl.ProgramImpl#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.impl.ProgramImpl#getExternals <em>Externals</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.impl.ProgramImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgramName()
   * @generated
   * @ordered
   */
  protected ProgramName programName;

  /**
   * The cached value of the '{@link #getExternals() <em>Externals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternals()
   * @generated
   * @ordered
   */
  protected EList<External> externals;

  /**
   * The cached value of the '{@link #getVariableAssignments() <em>Variable Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableAssignments()
   * @generated
   * @ordered
   */
  protected EList<Variable> variableAssignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return MathPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProgramName getProgramName()
  {
    return programName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProgramName(ProgramName newProgramName, NotificationChain msgs)
  {
    ProgramName oldProgramName = programName;
    programName = newProgramName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathPackage.PROGRAM__PROGRAM_NAME, oldProgramName, newProgramName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProgramName(ProgramName newProgramName)
  {
    if (newProgramName != programName)
    {
      NotificationChain msgs = null;
      if (programName != null)
        msgs = ((InternalEObject)programName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MathPackage.PROGRAM__PROGRAM_NAME, null, msgs);
      if (newProgramName != null)
        msgs = ((InternalEObject)newProgramName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MathPackage.PROGRAM__PROGRAM_NAME, null, msgs);
      msgs = basicSetProgramName(newProgramName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.PROGRAM__PROGRAM_NAME, newProgramName, newProgramName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<External> getExternals()
  {
    if (externals == null)
    {
      externals = new EObjectContainmentEList<External>(External.class, this, MathPackage.PROGRAM__EXTERNALS);
    }
    return externals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getVariableAssignments()
  {
    if (variableAssignments == null)
    {
      variableAssignments = new EObjectContainmentEList<Variable>(Variable.class, this, MathPackage.PROGRAM__VARIABLE_ASSIGNMENTS);
    }
    return variableAssignments;
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
      case MathPackage.PROGRAM__PROGRAM_NAME:
        return basicSetProgramName(null, msgs);
      case MathPackage.PROGRAM__EXTERNALS:
        return ((InternalEList<?>)getExternals()).basicRemove(otherEnd, msgs);
      case MathPackage.PROGRAM__VARIABLE_ASSIGNMENTS:
        return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
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
      case MathPackage.PROGRAM__PROGRAM_NAME:
        return getProgramName();
      case MathPackage.PROGRAM__EXTERNALS:
        return getExternals();
      case MathPackage.PROGRAM__VARIABLE_ASSIGNMENTS:
        return getVariableAssignments();
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
      case MathPackage.PROGRAM__PROGRAM_NAME:
        setProgramName((ProgramName)newValue);
        return;
      case MathPackage.PROGRAM__EXTERNALS:
        getExternals().clear();
        getExternals().addAll((Collection<? extends External>)newValue);
        return;
      case MathPackage.PROGRAM__VARIABLE_ASSIGNMENTS:
        getVariableAssignments().clear();
        getVariableAssignments().addAll((Collection<? extends Variable>)newValue);
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
      case MathPackage.PROGRAM__PROGRAM_NAME:
        setProgramName((ProgramName)null);
        return;
      case MathPackage.PROGRAM__EXTERNALS:
        getExternals().clear();
        return;
      case MathPackage.PROGRAM__VARIABLE_ASSIGNMENTS:
        getVariableAssignments().clear();
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
      case MathPackage.PROGRAM__PROGRAM_NAME:
        return programName != null;
      case MathPackage.PROGRAM__EXTERNALS:
        return externals != null && !externals.isEmpty();
      case MathPackage.PROGRAM__VARIABLE_ASSIGNMENTS:
        return variableAssignments != null && !variableAssignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
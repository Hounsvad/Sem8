/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd.iF22.impl;

import dk.sdu.frhou18.mdsd.iF22.Function;
import dk.sdu.frhou18.mdsd.iF22.IF22Package;
import dk.sdu.frhou18.mdsd.iF22.Model;
import dk.sdu.frhou18.mdsd.iF22.Scenario;
import dk.sdu.frhou18.mdsd.iF22.Story;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.impl.ModelImpl#getStoryName <em>Story Name</em>}</li>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.impl.ModelImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link dk.sdu.frhou18.mdsd.iF22.impl.ModelImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getStoryName() <em>Story Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStoryName()
   * @generated
   * @ordered
   */
  protected Story storyName;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return IF22Package.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Story getStoryName()
  {
    return storyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStoryName(Story newStoryName, NotificationChain msgs)
  {
    Story oldStoryName = storyName;
    storyName = newStoryName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IF22Package.MODEL__STORY_NAME, oldStoryName, newStoryName);
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
  public void setStoryName(Story newStoryName)
  {
    if (newStoryName != storyName)
    {
      NotificationChain msgs = null;
      if (storyName != null)
        msgs = ((InternalEObject)storyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IF22Package.MODEL__STORY_NAME, null, msgs);
      if (newStoryName != null)
        msgs = ((InternalEObject)newStoryName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IF22Package.MODEL__STORY_NAME, null, msgs);
      msgs = basicSetStoryName(newStoryName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IF22Package.MODEL__STORY_NAME, newStoryName, newStoryName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, IF22Package.MODEL__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, IF22Package.MODEL__SCENARIOS);
    }
    return scenarios;
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
      case IF22Package.MODEL__STORY_NAME:
        return basicSetStoryName(null, msgs);
      case IF22Package.MODEL__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case IF22Package.MODEL__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
      case IF22Package.MODEL__STORY_NAME:
        return getStoryName();
      case IF22Package.MODEL__FUNCTIONS:
        return getFunctions();
      case IF22Package.MODEL__SCENARIOS:
        return getScenarios();
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
      case IF22Package.MODEL__STORY_NAME:
        setStoryName((Story)newValue);
        return;
      case IF22Package.MODEL__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
        return;
      case IF22Package.MODEL__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
      case IF22Package.MODEL__STORY_NAME:
        setStoryName((Story)null);
        return;
      case IF22Package.MODEL__FUNCTIONS:
        getFunctions().clear();
        return;
      case IF22Package.MODEL__SCENARIOS:
        getScenarios().clear();
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
      case IF22Package.MODEL__STORY_NAME:
        return storyName != null;
      case IF22Package.MODEL__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case IF22Package.MODEL__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.mypackage.common;
import oracle.jbo.common.JboResourceBundle;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class EmpViewRowImplMsgBundle extends JboResourceBundle  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public EmpViewRowImplMsgBundle() {
  }

  /**
   * 
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }

  static final Object[][] sMessageStrings = {
    {"Sal_FMT_FORMATTER", "oracle.jbo.format.DefaultCurrencyFormatter"},
    {"Sal_FMT_FORMAT", "$0000.00"}};
}

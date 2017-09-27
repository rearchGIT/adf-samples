/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package model.common;
import oracle.jbo.common.JboResourceBundle;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class DeptImplMsgBundle extends JboResourceBundle  {
  public static final String TWO_XX_NAMES_ERROR = "1";
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public DeptImplMsgBundle() {
  }

  /**
   * 
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }

  static final Object[][] sMessageStrings = {
    {"Deptno_LABEL", "Id"},
    {"Dname_LABEL", "Name"},
    {"Loc_LABEL", "Location"},
    {TWO_XX_NAMES_ERROR,"Cannot have two department names with 'XX' in them!"}
  };
}
package com.csc.myworkday.model;

public class Employee {
  private String name;
  private String currentJobPosition;
  private String department;

  public Employee(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCurrentJobPosition() {
    return currentJobPosition;
  }

  public void setCurrentJobPosition(String currentJobPosition) {
    this.currentJobPosition = currentJobPosition;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

}

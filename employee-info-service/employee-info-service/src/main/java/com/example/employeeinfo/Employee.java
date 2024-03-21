package com.example.employeeinfo;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_info")
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long empID;

 private String empFname;
 
 private String empLname;

 private String department;
 
 private String project;

 private String address;

 private String dob;

 // Getters and setters
 public Long getEmpID() {
     return empID;
 }

 public void setEmpID(Long empID) {
     this.empID = empID;
 }

 public String getEmpFname() {
     return empFname;
 }

 public void setEmpFname(String empFname) {
     this.empFname = empFname;
 }

 public String getEmpLname() {
     return empLname;
 }

 public void setEmpLname(String empLname) {
     this.empLname = empLname;
 }

 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 public String getProject() {
     return project;
 }

 public void setProject(String project) {
     this.project = project;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 public String getDob() {
     return dob;
 }

 public void setDob(String dob) {
     this.dob = dob;
 }
}

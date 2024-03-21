package com.example.employeeinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
 @Autowired
 private EmployeeRepository employeeRepository;

 @GetMapping
 public List<Employee> getEmployees() {
     return employeeRepository.findAll();
 }

 @GetMapping("/{id}")
 public Employee getEmployee(@PathVariable Long id) {
     return employeeRepository.findById(id).orElse(null);
 }

 @PostMapping
 public Employee createEmployee(@RequestBody Employee employee) {
     return employeeRepository.save(employee);
 }

 @PutMapping("/{id}")
 public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
     updatedEmployee.setEmpID(id);
     return employeeRepository.save(updatedEmployee);
 }

 @DeleteMapping("/{id}")
 public void deleteEmployee(@PathVariable Long id) {
     employeeRepository.deleteById(id);
 }
}

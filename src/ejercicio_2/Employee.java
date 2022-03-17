/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author HP
 */
public class Employee {
private String name;
private int age;
private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

public String printData(){
return "name: "+name+" Age:"+age+" Salary:"+salary;
}
    
}

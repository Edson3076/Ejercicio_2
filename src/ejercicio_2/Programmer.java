/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author HP
 */
public class Programmer extends Employee{
private String language;

    public Programmer(String language, String name, int age, double salary) {
        super(name, age, salary);
        this.language = language;
    }


public String printData(){
return "Language: "+language;
}    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author HP
 */
public class DatabasePro extends Employee{
private String databaseTool;

    public DatabasePro(String databaseTool, String name, int age, double salary) {
        super(name, age, salary);
        this.databaseTool = databaseTool;
    }

public String printData(){
return "Database: "+databaseTool;
}    
}

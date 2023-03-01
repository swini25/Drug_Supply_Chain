/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

/**
 *
 * @author swinirodrigues
 */
public class ClinicProvider extends Person{
    
     private int id;
    private static int count = 1;
    //private HospitalEnterprise affliatedHospital;

    public ClinicProvider() {
        id = count;
        count++;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return this.getFirstName()+ " " + this.getLastName();
    }
    
}

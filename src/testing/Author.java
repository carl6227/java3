/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author 2ndyrGroupA
 */
public class Author {
    String firstName,lastName;
 
 public Author(String firstName, String lastName){
 this.firstName=firstName;
 this.lastName=lastName;
 }
 
 public void setFirstName (String firstName){
 this.firstName=firstName;
 }
         
  public void setLastName (String lastName){
  this.lastName=lastName;
  }
 
  public String getFirstName(){
  System.out.println(firstName);
  return(firstName);
 
     
  }
public String  getLastName(){
    System.out.println(lastName);
    return(lastName);
   
}
public void display(){
 System.out.println("The authors full name is "+ firstName+" "+lastName);
   
}
}




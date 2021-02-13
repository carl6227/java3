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
public class Pet {
    String name,animal;
    int age;
    public Pet(String name,String animal,  int age){
    this.name=name;
    this.animal=animal;
    this.age=age;
    }
     public void setName(String name){
       this.name=name;
    }
     public void setAnimal(String animal){
       this.animal=animal;
    } public void setAge(int age){
       this.age=age;
    }
    public String getName(){
      System.out.println(name);
    return (name);
    }
    public String getAnimal(){
      System.out.println(animal);
    return (animal);
    }
    public int getAge(){
     System.out.println(age);
    return (age);
    }
    
}


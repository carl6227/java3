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
public class Book {
      String title,AuthorName;
    double price;
   
    public Book (String title,String AuthorName, double price){
    this.AuthorName=AuthorName;
    this.title=title;
    this.price=price;
   
   
    }
    public void setTitle(String title){
    this.title=title;
    }
    public void setAuthor(String Author){
    this.AuthorName=Author;
   
    }
     public void setPrice(double price){
     this.price=price;

             }
     
     public void getTitle(){
         System.out.println(title);
     }

public void getAuthor(){
     System.out.println(AuthorName);
     }

public void getPrice(){
     System.out.println(price);
     
     }

public void  getbookInfo(){
    System.out.println(title+" "+AuthorName+" "+price);
}
}

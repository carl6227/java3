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
public class BookDemo {
    public static void main(String[] args) {
        Book bk1;
       bk1=new Book("Developing Java Software","Russel Winderand",79.75);
   
        System.out.println("Book Title: "+bk1.title+"\n "+"Author Name: "+bk1.AuthorName+"\n "+"Price: "+bk1.price);
    }
}

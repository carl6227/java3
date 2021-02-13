/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;
package testing;

/**
 *
 * @author 2ndyrGroupA
 */
public class Circle {
    double radius=1.0f;
    
    public Circle(){
    
    }
    
    public double getRadius(int radius){
    System.out.println(radius);
    return (radius);
    }
    public double getArea(){
        double area=Math.pow(radius,2)*3.14;
        System.out.println(area);
        return(area);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author ARVINA
 */
public class Triagle extends Shape{
    // private member variables
    private int base;
    private int height;
    // constructor
    public Triagle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return "Triagle[base=" + ",height" + height + " , " + super.toString() + "]";
    }
    // Override the inherited getArea()
    @Override
    public double getArea(){
        return 0.5*base*height;
    }   
}

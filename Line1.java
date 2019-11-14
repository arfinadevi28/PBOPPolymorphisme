/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat2Interface;

/**
 *
 * @author ARVINA
 */
public class Line1 {
  public static void main(String[] args) {
        Line p = new Line(5,10,10,20);
        System.out.println(p.getLength());
        System.out.println(p.isGreater(p, p));
        System.out.println(p.isLess(p, p));
        System.out.println(p.isEqual(p, p));
    }
} 
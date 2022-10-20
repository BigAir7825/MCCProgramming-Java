/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PythagoreanTheorem;
import java.util.Scanner;
/**
 * @author Will Adair
 * Date: 12/12/2020
 * Purpose: To find the length of Side C using the Pythagorean Theorem
 * Note: I couldn't find what we were supposed to put in here
 */
public class NewMain {
    public double SideA;
    public double SideB;
    public double SideC;
    double a = 5, b = 2, c = 10;
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println(
                "Input the length of side A:   ");
        double SideA = ab.nextDouble();
        Scanner bc = new Scanner(System.in);
        System.out.println(
                "Input the length of side B:   ");
        double SideB = bc.nextDouble();
        double SideC = Math.sqrt( ( Math.pow(SideA, 2) + Math.pow(SideB, 2) ) );
        System.out.println(
                "The length of Side C is:     " + SideC);

    }
    
}

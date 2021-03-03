/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your lifeInsurance cost per year is : $"+ lifeInsurance(age));
       //System.out.println("Your lifeInsurance cost per year is:" + lifeinsurance);
    }
    public static int lifeInsurance(int userage){
        int cost = 5;
        int amount = 300;
       int lifeinsurance = cost * userage + amount; 
        return lifeinsurance;
    }
}

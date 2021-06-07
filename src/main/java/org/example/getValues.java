package org.example;
import java.util.Scanner;
public class getValues {
    public double getOrderAmount(){
        System.out.println("What is the order amount? ");
        Scanner a = new Scanner(System.in);
        Double amount = a.nextDouble();
        return amount;
    }
    public String getState(){
        System.out.println("What is the state? ");
        Scanner s = new Scanner(System.in);
        String state = s.next();
        return state;
    }
}

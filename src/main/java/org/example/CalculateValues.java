package org.example;
import java.text.NumberFormat;
import java.util.Locale;
public class CalculateValues extends getValues{
    public String getCurrency(double a){
        NumberFormat n = NumberFormat.getCurrencyInstance();
        String currency = n.format(a);
        return currency;
    }
    public double checkState(String a, double b){
        double tax = 0.055;
        double x = 0;
        if (a.equals("WI")) {
            x = b * tax;
        }
        return Math.round(x*100.0)/100.0;
    }
    public double totalCurr(double a, double b){
        return a + b;
    }
}

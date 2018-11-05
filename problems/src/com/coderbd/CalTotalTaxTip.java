package com.coderbd;
public class CalTotalTaxTip {
    public static void main(String[] args) {
        solve(12.00, 20, 8);
    }
   static void solve(double meal_cost, int tip_percent, int tax_percent) {
    int totalCost=(int) Math.round(meal_cost + (meal_cost * tip_percent/100) +  (meal_cost * tax_percent/100) );
    System.out.println(totalCost);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.practice5;

/**
 *
 * @author MKAY
 */
public class PRACTICE5 {
/*The East Coast sales division of a company generates 62 percent of total sales. Based on 
that percentage, this program that will predict how much the East Coast division will 
generate if the company has $4.6 million in sales this year*/
    public static void main(String[] args) {
        double eastCostSalesPercentage = 0.62;
        int totalPredictedSales = 4600000;
        double eastCoastPredictedSales = eastCostSalesPercentage * totalPredictedSales;
        
        System.out.println("Predicted sales of east coast division: " + eastCoastPredictedSales + " USD");
                
               
    }
}

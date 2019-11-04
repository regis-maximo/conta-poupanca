/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.regismaximo.poupanca;

/**
 *
 * @author Regis_Maximo
 */
public class SavingsAccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(2.000);
        
        SavingsAccount saver2 = new SavingsAccount();
        saver2.setSavingsBalance(3.000);
        
        SavingsAccount.annualInterestRate = 4;
        
        System.out.printf("Juros anual no valor de R$ 2.000,00 e com taxa de 4%%: %2.2f\n", saver1.calculateMonthlyInterest());
        System.out.printf("Juros anual no valor de R$ 3.000,00 e com taxa de 4%%: %2.2f\n", saver2.calculateMonthlyInterest());
        
        SavingsAccount.annualInterestRate = 5;
        
        System.out.printf("Juros anual no valor de R$ 2.000,00 e com taxa de 5%%: %2.2f\n", saver1.calculateMonthlyInterest());
        System.out.printf("Juros anual no valor de R$ 3.000,00 e com taxa de 5%%: %2.2f\n", saver2.calculateMonthlyInterest());
    }
    
}

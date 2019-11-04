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
public class SavingsAccount {
    
    static double annualInterestRate; // taxa de juros anual para todos os correntistas
    private double savingsBalance; // saldo de poupança para cada objeto de SavingsAccount
    
    // método para calcular os juros mensais
    public double calculateMonthlyInterest() {
        double juros;
        juros = (this.savingsBalance * annualInterestRate) / 12;
        return juros;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    // método para configurar saldo da pouponça
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance + calculateMonthlyInterest();
    }
    
    // método static para configurar o annualInterestRate
    static void modifyInterestRate(double novoValor) {
        annualInterestRate = novoValor;
    }
    
    
    
}

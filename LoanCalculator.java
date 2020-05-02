/**********************************************************************
 * @file LoanCalculator.java
 * @brief This program implements the use of math to help calculate interest, monthly and overall.
 * @author Alexa Brown
 * @date January 25, 2019
 **********************************************************************/

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args){
        Scanner lulu = new Scanner(System.in);

        //Defining the variables to be used in this program:
            //principal = loan amount
            //rate 1 = annual interest rate
            //years = term of the loan, years1 = years - 1
            //rate = (rate1 * .01)/12, rate2 = rate1 - 1, rate3 = (rate2 * .01)/12
            //n = years * 12, n1 = years1 * 12, n2 = years *12
            //a = Math.pow (1+rate), n, a1 = Math.pow (1+rate), n1, a2 = Math.pow (1+rate3), n2
            //b = rate * a, b1 = rate * a1, b2 = rate3 * a2
            //c = a-1, c1 = a1-1, c2 = a2-1
            //monthlyPayments = principal * (b/c), monthlyPayments1 = principal * (b1/c1),monthlyPayments2 = principal * (b2/c2)
            //totalInterest = (monthlyPayments * 12 * years) - principal
            //totalInterest1 = (monthlyPayments1 * 12 * years1) - principal
            //totalInterest = (monthlyPayments2 * 12 * years) - principal
            //save = totalInterest - totalInterest1, save1 = totalInterest - totalInterest2

        System.out.println("Please enter the loan amount in dollars [e.g. 1000.00]:");
        double principal = lulu.nextInt();

        System.out.println("Please enter the annual interest rate [e.g. 5]:");
        double rate1 = lulu.nextDouble();

        System.out.println("Please enter the term of the loan in years [e.g. 8]");
        int years = lulu.nextInt();

        double rate = (rate1 * .01) / 12 ;

        double n = years * 12.0;
        double a = Math.pow((1 + rate), n);
        double b = rate * a;
        double c = a - 1;

        double monthlyPayments = principal * (b / c);

        double totalInterest = (monthlyPayments * 12 * years) - principal;


        System.out.printf("Your monthly payment is $%.2f\n" ,  monthlyPayments);
        System.out.printf("Your yearly interest is $%.2f\n" , totalInterest);

        int years1 = years - 1;
        double n1 = years1 * 12.0;
        double a1 = Math.pow((1 + rate), n1);
        double b1 = rate * a1;
        double c1 = a1 - 1;

        double monthlyPayments1 = principal * (b1 / c1);

        double totalInterest1 = (monthlyPayments1 * 12 * years1) - principal;

        double save = totalInterest - totalInterest1;

        System.out.println();
        System.out.println("Just a tip:");
        System.out.print("Paying off the loan in " + years1);
        System.out.printf( " years could save you $%.2f" , save);
        System.out.println(" in interest ");
        System.out.printf("     with a monthly payment of $%.2f\n" , monthlyPayments1);

        double rate2 = rate1 - 1;
        double rate3 = (rate2 * .01) / 12 ;
        double n2 = years * 12.0;
        double a2 = Math.pow((1 + rate3), n2);
        double b2 = rate3 * a2;
        double c2 = a2 - 1;

        double monthlyPayments2 = principal * (b2 / c2);
        double totalInterest2 = (monthlyPayments2 * 12 * years) - principal;

        double save1 = totalInterest - totalInterest2;

        System.out.println();
        System.out.print("Dropping your rate to " + rate2);
        System.out.print("%");
        System.out.printf(" could save you $%.2f" , save1);
        System.out.println(" in interest ");
        System.out.printf("     with a monthly payment of $%.2f\n" , monthlyPayments2);
    }


}
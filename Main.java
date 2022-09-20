/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author shiv0248
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              // Create three different loan objects, one of each type.
              
              // i also switch principle and annual interest arround so 
        Carloan carLoan = new Carloan(4.25, 25000.00, 72, "IRQ3458977");
        
        Adresss propertyAddress = new Adresss("321 Main Street", "State College", "PA", "16801");
        
        PrimaryMortgage propertyLoan = new PrimaryMortgage(3.1, 250000.00, 360, 35.12, propertyAddress);
        
        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(10.75, 5000.00, 48);
        
        //Print out the load information for each loan using the toString() method.
        System.out.format("%n%s%s%s%n", carLoan, propertyLoan, unsecuredLoan); 
    }
    
}
//OUTPUT 

/*
run:

Car loan with: 
Priciple:   		$25000.0
Annual Interest rate:	4.25%
Term of loan in months: 72.0
Monthly payment: 	$393.984
Vehicle VIN: 		IRQ3458977

Primary Mortgage loan with 
Priciple:   		$250000.0
Annual Interest rate:	3.1%
Term of loan in months: 360.0
Monthly payment: 	$1067.541
PMI monthly Amount:	$35.12

Property address: 
  321 Main Street
  State College, PA, 16801

Unsecured Load wiht: 
Priciple:   		$5000.0
Annual Interest rate:	10.75%
Term of loan in months: 48.0
Monthly payment: 	$128.621

BUILD SUCCESSFUL (total time: 0 seconds)
*/
# Loan-Account-Hierarchy-JAVA

**Loan Account Hierarchy**
Create a Loan Account Hierarchy consisting of the following classes: 
LoanAccount, CarLoan, PrimaryMortgage , UnsecuredLoan, and Address. 
Each class should be in it's own .java file.

*The LoanAccount class consists of the following properties:*
* principal - the original amount of the loan.
* annualInterestRate - the annual interest rate for the loan. It is not static as each loan can have it's own interest rate.
* months - the number of months in the term of the loan, i.e. the length of the loan.

and the following methods:
* a constructor that takes the three properties as parameters.
* calculateMonthlyPayment() - takes no parameters and calculates the monthly payment using the same formula as Assignment 1.
* getters for the three property variables.
* toString() - displays the information about the principle, annualInterestRate, and months as shown in the example output below.
 
The CarLoan class which is a subclass of the LoanAccount class and consists of the following property:
* vehicleVIN - the VIN number of the car, as a string.

and the following methods:
* constructor that accepts the three parameters of the LoanAccount class and the vehicleVIN.
* toString() - displays the information about the VIN number as shown in the example output below.
 
The PrimaryMortgage class which is a subclass of LoanAccount and consists of the following properties:
* PMIMonthlyAmount - the amount of the Primary Mortgage Insurance which is required for all mortgages where the down payment is not at least 20% of the home value.
* Address - the address of the real estate and is an object of the Address class.

and the following methods:
* constructor that accepts the three parameters of the LoanAccount class, the PMIMonthlyAmount, and the Address object containing the address.
* toString() - displays the information about the PMIMonthlyAmount and Address as shown in the example output below.
 
The UnsecuredLoan class which is a subclass of LoanAccount and has no additional properties and has the following methods:
* constructor that accepts the three parameters of the LoanAccount class.
* toString() - displays the information that it is an Unsecured Loan as shown in the example output below.
 
The Address class which consists of the following properties:
* street - the house number and street part of the address.
* city - the city where it is located.
* state - the state.
* zipcode - and the zipcode.

and the following methods:
* constructor which accepts the values for the four properties as parameters.
* getters for each property.
* toString() - display the address information as shown in the example below.
 
Your code in the subclasses should call methods in the super classes whenever possible to reduce the amount of code in the subclasses and utilize the code already developed in the super classes. 

Use the following code in your main function to test your classes, just copy and paste it into your main method:

        // Create three different loan objects, one of each type.
        CarLoan carLoan = new CarLoan(25000.00, 4.25, 72, "IRQ3458977");
        
        Address propertyAddress = new Address("321 Main Street", "State College", "PA", "16801");
        PrimaryMortgage propertyLoan = new PrimaryMortgage(250000.00, 3.1, 360, 35.12, propertyAddress);
        
        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(5000.00, 10.75, 48);
        
        //Print out the load information for each loan using the toString() method.
        System.out.format("%n%s%s%s%n", carLoan, propertyLoan, unsecuredLoan);
The output from your program should look like the following:

run:    

       Car Loan with:
       
        Principal:                      $25000.00
        Annual Interest Rate:           4.25%
        Term of Loan in Months:         72
        Monthly Payment:                $393.98
        Vehicle VIN:                    IRQ3458977

        Primary Mortgage Loan with:
        Principal:                      $250000.00
        Annual Interest Rate:           3.10%
        Term of Loan in Months:         360
        Monthly Payment:                $1067.54
        PMI Monthly Amount:             $35.12
        Property Address: 
                                        321 Main Street
                                        State College, PA 16801

        Unsecured Loan with:
        Principal:                      $5000.00
        Annual Interest Rate:           10.75%
        Term of Loan in Months:         48
        Monthly Payment:                $128.62



import java.util.Scanner;

public class PayrollWithDecision {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

            //declare variables
        String firstName, lastName;
        double hoursWorked, baseWage, weeklyPay;

            //define constants
        final double REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;

            //Input
        System.out.println("Enter first name: ");
        firstName = keyboard.next();

        System.out.println("Enter last name: ");
        lastName = keyboard.next();

        System.out.println("Enter hours worked: ");
        hoursWorked = keyboard.nextDouble();

        System.out.println("Enter base wage: ");
        baseWage = keyboard.nextDouble();

        if (hoursWorked <= 0 || baseWage <= 0) {
            System.out.println("Invalid input. Both inputs must be greater than 0.");
        } else { //valid input and calculate weeklyPay

            if (hoursWorked > REGULAR_HOURS) { //overtime
                weeklyPay = REGULAR_HOURS *baseWage +
                                    (hoursWorked - REGULAR_HOURS) * baseWage * OVERTIME_RATE;

            }
            else{
                weeklyPay = hoursWorked * baseWage;
            }

                    //print
            System.out.println("\n" + firstName + " " + lastName + " " +
                               "Weekly Payroll Report: \n" +
                               "Hours Worked: " + hoursWorked + "\n" +
                               "Base Wage: $" +baseWage + "\n" +
                               "Weekly Pay Before Tax: $" +String.format("%.2f", weeklyPay));



        }

    }
}

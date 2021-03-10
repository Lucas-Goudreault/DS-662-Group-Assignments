/*
  Program computes a sales representative's annual compensation (salary + commission)
    based on years of experience to determine salary and a commission percentage that increases with annual sales
  Authors: Lucas Goudreault, Lauren Nadolny, Joseph DeMarco
*/
// create public class
public class SalaryComm {
    // main method definition
    public static void main(String[] args) {
        // initialize variable for years of experience, annual sales, salary, commission, and total annual compensation
        int exp = 2;
        double sales = 750000;
        double salary;
        double comm;
        double annualComp;
        // switch method to match years of experience with the relevant salary
        switch (exp) {
            case 1:
                salary = 40000;
                break;
            case 2:
                salary = 50000;
                break;
            case 5:
                salary = 60000;
                break;
            default:
                salary = 70000;
                break;
        }
        // if statement to compute commission based on annual sales
        if (sales < 500000) {
            comm = .20 * sales;
        } else if (sales > 500000 && sales < 1000000) {
            comm = .03 * sales;
        } else {
            comm = .04 * sales;
        }
        // compute annual compensation as salary + commission
        annualComp = salary + comm;
        // display salary, commission, and total annual compensation formatted to 0 decimals with comma separators 
        System.out.printf("Salary is $%,.0f.%n", salary);
        System.out.printf("Commission is $%,.0f.%n", comm);
        System.out.printf("Total annual compensation is $%,.0f.%n", annualComp);
    }
}
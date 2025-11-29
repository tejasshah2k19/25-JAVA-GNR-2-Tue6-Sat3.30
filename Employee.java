
import java.util.Scanner;

public class Employee {

    int employeeId;
    double basicSalary;
    double salary;
    double hra, pf, da, ta;
    double annualSalary;
    double taxAmount;
    double taxSlab;

    void getData() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter employeeId ");
        employeeId = scr.nextInt();
        System.out.println("Enter Basic Salary");
        basicSalary = scr.nextDouble();
    }

    void printData() {
        System.out.println("employeeId : " + employeeId);
        System.out.println("BasicSalary : " + basicSalary);

        System.out.println("HRA : " + hra);
        System.out.println("TA : " + ta);
        System.out.println("DA : " + da);
        System.out.println("PF : " + pf);

        System.out.println("Salary : " + salary);
        System.out.println("Annual Salary : " + annualSalary);
        if (taxSlab == 0) {
            System.out.println("IsTaxable? : " + "NO");
        } else {
            System.out.println("IsTaxable ? Yes : "+taxSlab+"%");
        }
        System.out.println("TaxAmount : " + taxAmount);

    }

    void calculateSalary() {
        hra = (basicSalary * 12) / 100;
        ta = basicSalary * 0.08;
        da = basicSalary * 0.08;
        pf = basicSalary * 0.10;
        salary = basicSalary + hra + ta + da - pf;
        annualSalary = salary * 12;
    }

    void calculateTax() {
        if (annualSalary >= 1200000 && annualSalary <= 1500000) {
            taxSlab = 10;
        } else if (annualSalary > 1500000 && annualSalary <= 3000000) {
            taxSlab = 20;
        } else if (annualSalary > 3000000) {
            taxSlab = 30;
        } else {
            taxSlab = 0;
        }

        taxAmount = (annualSalary * taxSlab) / 100;
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.getData();
        emp.calculateSalary();
        emp.calculateTax();
        emp.printData();

    }

}

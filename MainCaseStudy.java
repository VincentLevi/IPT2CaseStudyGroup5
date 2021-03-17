package ipt2casestudygroup5;
import java.util.*;
public class MainCaseStudy {
    public static void main(String[] args) {
        EmployeesInformation1 Employ1 = new EmployeesInformation1();
        System.out.println("<------------Employees Background------------>");
        System.out.println("Type 1 for the First Employee");
        System.out.println("Type 2 for the Second Employee");
        System.out.println("Type 3 for the Third Employee");
        System.out.println("Type 4 for the Fourth Employee");
        System.out.println("Type 5 for the Fifth Employee");
        System.out.println("Type 6 for the Sixth Employee");
        Scanner sn = new Scanner(System.in);
        String choice = sn.next();
        System.out.print("Name: ");
        if(choice.equals("1")){
         Employ1.getempinfoname();
        }   
        System.out.print("Age: ");
        if(choice.equals("1")){
         Employ1.getempinfoage();
        }   
                System.out.print("Number: ");
        if(choice.equals("1")){
         Employ1.getempinfoempnum();
        }   
                System.out.print("Position: ");
        if(choice.equals("1")){
         Employ1.getempinfoposi();
        }   
                System.out.print("Strenght: ");
        if(choice.equals("1")){
         Employ1.getempinfostre();
        }   
                System.out.print("Weakness: ");
        if(choice.equals("1")){
         Employ1.getempinfoweak();
        }   
                System.out.print("Criminal Record: ");
        if(choice.equals("1")){
         Employ1.getempinfocriminalrec();
        }   
                System.out.print("Performance in Previous Organization: ");
        if(choice.equals("1")){
         Employ1.getempinfoperprevorga();
        }   
                System.out.print("Credentials: ");
        if(choice.equals("1")){
         Employ1.getempinfocrede();
        }   
                System.out.print("Past Experience: ");
        if(choice.equals("1")){
         Employ1.getempinfopastex();
        }   
                System.out.print("Specialization: ");
        if(choice.equals("1")){
         Employ1.getempinfospec();
        }   
                System.out.print("Frequently changed previous organizations: ");
        if(choice.equals("1")){
         Employ1.getempinfochaprevorga();
        }   
                System.out.print("Address: ");
        if(choice.equals("1")){
         Employ1.getempinfoadd();
        }   
                System.out.print("Contact Number: ");
        if(choice.equals("1")){
         Employ1.getempinfonum();
        }   
        
    }
}


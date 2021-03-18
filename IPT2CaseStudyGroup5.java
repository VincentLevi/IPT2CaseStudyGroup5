package ipt2casestudygroup5;
import java.util.*;
public class IPT2CaseStudyGroup5 {
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
                if(choice.equals("2")){
         Employ1.getempinfoname();
        }  
                System.out.print("Position: ");
        if(choice.equals("1")){
         Employ1.getempinfoposi();
        }   
                if(choice.equals("2")){
         Employ1.getempinfoposi();
        }
                System.out.print("Strenght: ");
        if(choice.equals("1")){
         Employ1.getempinfostre();
        }   
                if(choice.equals("2")){
         Employ1.getempinfostre();
        }
                System.out.print("Weakness: ");
        if(choice.equals("1")){
         Employ1.getempinfoweak();
        }   
                if(choice.equals("2")){
         Employ1.getempinfoweak();
        }
                System.out.print("Criminal Record: ");
        if(choice.equals("1")){
         Employ1.getempinfocriminalrec();
        }   
                if(choice.equals("2")){
         Employ1.getempinfocriminalrec();
        }                  System.out.print("Performance in Previous Organization: ");
        if(choice.equals("1")){
         Employ1.getempinfoperprevorga();
        }     
                if(choice.equals("2")){
         Employ1.getempinfoperprevorga();
        } 
    }
}
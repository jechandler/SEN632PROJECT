/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package quizmachine;
import java.util.Scanner;

/**
 *
 * @author Jonathan Chandler 
 */
public class QuizMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       boolean login_status_ok = true;
       int in_login_status;
       
       
       Scanner input = new Scanner( System.in );
       
        // TODO code application logic here
       System.out.println("Welcome to the Quiz Console"); 
       
       
       login_status_ok = false;
       System.out.println("Enter 1 to Login or 2 to Register an Account");
       in_login_status = input.nextInt();
       while (login_status_ok == false)
       {
           if(in_login_status == 1 || in_login_status == 2)
               login_status_ok = true;
           else
           {
               System.out.println("1 or 2 only, please try again");
               System.out.println("Enter 1 to Login or 2 to Register an Account");
               in_login_status = input.nextInt();
           }
       }//end while
       
       if (in_login_status == 1)
       {
           System.out.println("Please enter user name");
           
           System.out.println("Please enter your password");
       }
       
       if (in_login_status == 2)
       {
           System.out.println("Please enter your first name");
           System.out.println("Please enter your last name");
           System.out.println("Please enter your email address");
           System.out.println("Please enter a user name");
           System.out.println("Please enter a password");
       }
       
       
       
    }
    
}

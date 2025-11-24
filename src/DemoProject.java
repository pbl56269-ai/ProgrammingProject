import java.util.Scanner;

import roles.Administrator;

public class DemoProject {

    static Administrator schoolAdmin = null;
    public static void main(String[] args) throws Exception {
        schoolAdmin = new Administrator();

        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        // I made a change!
        
        // Choose your role:
        // 1. Admin
        // 2. Faculty
        // 3. Student
        // 4. Exit

        // Log in Screen:

        // Option Screen:
        do {
            System.out.println("Choose your role: ");
            System.out.println("Press 1 for administator role: ");
            System.out.println("Press 2 for student role: ");
            System.out.println("Press 3 for faculty role: ");
            option = keyboard.nextInt();
            keyboard.nextLine();
            
            if(option == 1) {

            }
            else if(option == 2) {
                
            }
            else if(option == 3) {

            }
            else if(option == 4) {
                System.out.println("Thank you for using this program. Goodbye!");
            }
            else {
                System.out.println("Error. Invalid ID. Try again");
            }
            
        }
        while(option != 4);
        
        System.out.println("Hello, World!");

        keyboard.close();
    }

    private static void LogInScreen(Scanner keyboard, int roleID)
    {
        String userExitOption = "yes";

        do{
            System.out.println("---- Log in screen ---");

            System.out.println("Enter your username: ");
            String enteredUsername = keyboard.nextLine();

            System.out.println("Enter your Password: ");
            String enteredPassword = keyboard.nextLine();
            
            switch (roleID) {
                case 0: // Admin log in
                    // Check username and password
                    if (schoolAdmin.checkUsername(enteredUsername) && schoolAdmin.checkPassword(enteredPassword))
                    { 
                        // if correct 
                            

                    }
                    else 
                    {
                        // if not correct
                        System.out.println("Error! Do you want try again?");
                        System.out.println("Enter yes or no");

                        userExitOption = keyboard.nextLine();
                    }

                
                    break;
                    
                case 1: // Faculty log in  
                    // Check username and password
                
                    // if correct 

                    // if not correct

                    break;
                
                case 2: // Student log in 
                    // Check username and password
                
                    // if correct 

                    // if not correct
                    break;
                    
                default:

                    break;
            }
        }
        while(!userExitOption.equals("no"));
        

    }
}

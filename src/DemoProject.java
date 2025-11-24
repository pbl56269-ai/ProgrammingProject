import java.util.Scanner;

import roles.Administrator;
import roles.Faculty;
import roles.CSClass;

public class DemoProject {

    static Administrator schoolAdmin = null;
    static String userState = "System-Log-In";

    public static void main(String[] args) throws Exception {
        schoolAdmin = new Administrator();

        Scanner keyboard = new Scanner(System.in);

        while(!userState.equals("Exit"))
        {
            switch (userState) {
            case "System-Log-In":
                userState = SystemLogIn(keyboard);
                break;

            case "Administrator-Screen":
                // David
                AdministratorScreen(keyboard);

                break;

            case "Faculty-Screen":
                // Ayna
                //
                boolean stay = true;

                do
                {
                    System.out.println("\n--- Faculty Menu ---");
                    System.out.println("1. View My Classes");
                    System.out.println("2. View Class Enrollment");
                    System.out.println("3. Logout");
                    System.out.println("Enter your option: ");

                    int option = keyboard.nextInt();
                    keyboard.nextLine();

                    if (option == 1)
                    {
                        Faculty currentFaculty = facultyStackManager.peek();
                        if (currentFaculty.getAssignedClasses() == null){
                            System.out.println("No classes assigned to you yet.");
                        }
                        else
                        {
                            System.out.println("\n--- Your Classes ---");
                            currenFaculty.getAssignedClasses.printAllClasses();
                        }
                        // you can just create a variable in your Faculty.java that store your class and I will assign it in Administrator.Java
                    }
                    else if (option == 2)
                    {
                        Faculty currentFaculty = facultyStackManager.peek();
                        if (currentFaculty.getAssignedClasses() == null)
                        {
                            System.out.println("You have no classes assigned.");
                        }
                        else
                        {
                            try
                            {
                                CSClass topClass = currentFaculty.getAssignedClasses().peekClass();
                            }
                        }
                        
                        
                    }
                }
                
                break;
            
            case "Student-Screen": 
                // Kenna 
                break;

            case "Exit":
                System.out.println("Thank you for using this program. Goodbye!");

                break;
            }
        }
        
        keyboard.close();
    }

    private static String SystemLogIn(Scanner keyboard)
    {
        String userInput = "";
        while(true)
        {
            System.out.println("Choose your role: ");
            System.out.println("Press 1 for administator role");
            System.out.println("Press 2 for student role");
            System.out.println("Press 3 for faculty role");
            System.out.println("Press 4 to exit program");

            
            int option = keyboard.nextInt();
            keyboard.nextLine();
            
            if (option < 1 || option > 4)
            {
                System.out.println("Error! Invalid ID. Try again");
            }
            else 
            {
                userInput = LogInScreen(keyboard, option);
                return userInput;
            }
        }
    }

    private static String LogInScreen(Scanner keyboard, int option)
    {
        String userExitOption = "";

        System.out.println("---- Log In Screen ---");

        System.out.println("Enter your username: ");
        String enteredUsername = keyboard.nextLine();

        System.out.println("Enter your Password: ");
        String enteredPassword = keyboard.nextLine();
        
        while(true)
        {
            switch (option) {
                case 1: // Admin log in
                    // Check username and password
                    if (schoolAdmin.checkUsername(enteredUsername) && schoolAdmin.checkPassword(enteredPassword)) return "Administrator-Screen"; // if correct                        
                    break;
                    
                case 2: // Faculty log in  
                    // Check username and password
                    if (schoolAdmin.checkFacultyUsernames(enteredUsername) && schoolAdmin.checkFacultyPasswords(enteredPassword)) return "Faculty-Screen";  // if correct 
                    break;
                
                case 3: // Student log in 
                    // Check username and password              
                    if (schoolAdmin.checkStudentUsernames(enteredUsername) && schoolAdmin.checkStudentPasswords(enteredPassword)) return "Student-Screen";  // if correct 
                    break;
                    
                case 4:
                    return "Exit";
            }

            // if not correct
            System.out.println("Error! Do you want try again?");
            System.out.println("Enter exit if you want to quit or hit enter to continue");
            userExitOption = keyboard.nextLine();

            if (userExitOption.equals("Exit")) return "Exit";
        }
    }

    private static void AdministratorScreen(Scanner keyboard)
    {
        System.out.println("---- Adminstrator Screen ---");

        System.out.println("Press 1 to check how many students are enrolled");
        System.out.println("Press 2 to look at current classes");
        System.out.println("Press 3 to add a class");
        System.out.println("Press 4 to cancel a class");
        System.out.println("Press 5 to assign faculty member to teach a specific class");
        System.out.println("Press 6 to hire full-time faculty");
        System.out.println("Press 7 to fire full-time faculty");
        System.out.println("Press 8 to hire part-time faculty");
        System.out.println("Press 9 to fire part-time faculty");

        System.out.println("Press 10 to log out");
        System.out.println("Press 11 to exit program");
        
        int option = keyboard.nextInt();
        keyboard.nextLine();

        switch (option) {
            case 1:
                schoolAdmin.checkStudentErollment();
                break;

            case 2:
                schoolAdmin.checkClasses();
                break;

            case 3:
                System.out.println("What is your class three letter abbreviation: ");
                String newClassThreeLetterAbbreviation = keyboard.nextLine();

                System.out.println("What is your class digit numbers: ");
                int newClassDigitNumber = keyboard.nextInt();
                keyboard.nextLine();

                System.out.println("What is your class section number: ");
                String newclassThreeLetterAbbreviation = keyboard.nextLine();

                CSClass newClass = new CSClass();

                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;

            case 8:
                
                break;

            case 9:
                
                break;

            case 10:
                
                break;

            case 11:
                userState = "Exit";
                break;

        
            default:
                System.out.println("Error! Invalid option. Try again");
                break;
        }
    }

}

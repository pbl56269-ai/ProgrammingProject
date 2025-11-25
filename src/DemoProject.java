import java.util.Scanner;

import roles.Administrator;
import roles.Faculty;
import roles.Student;
import roles.CSClass;

public class DemoProject {

    static Administrator schoolAdmin = null;
    static String userState = "System-Log-In";
    FacultyGenerator facultyGenerator = new facultyGenerator();

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
                    else if (option == 3)
                    {
                        userState = "System-Log-In";
                        System.out.println("logging out...");
                    }
                    else
                    {
                        System.out.println("Error! Invalid option. Try again");
                    }
                }
                
                break;
            
            case "Student-Screen": 
                
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

                System.out.println("What is your class size: ");
                int newClassSize = keyboard.nextInt();

                System.out.println("What is your class wait list size: ");
                int newWaitListSize = keyboard.nextInt();

                System.out.println("Class time are limited between 8 to 22, please use 24H system");
                System.out.println("What is your class start time: ");
                int newStartTime = keyboard.nextInt();

                System.out.println("What is your class end time: ");
                int newEndtime = keyboard.nextInt();
                keyboard.nextLine();


                CSClass newClass = new CSClass(newClassThreeLetterAbbreviation, newClassDigitNumber, newclassThreeLetterAbbreviation, newClassSize, newWaitListSize);
                newClass.setStartTime(newStartTime);
                newClass.setEndTime(newEndtime);
                
                schoolAdmin.addClass(newClass);
                break;

            case 4:
                System.out.println("What is the class three letter abbreviation: ");
                String newClassThreeLetterAbbreviation = keyboard.nextLine();

                System.out.println("What is the class digit numbers: ");
                int newClassDigitNumber = keyboard.nextInt();
                keyboard.nextLine();

                System.out.println("What is the class section number: ");
                String newclassThreeLetterAbbreviation = keyboard.nextLine();

                System.out.println("Class time are limited between 8 to 22, please use 24H system");
                System.out.println("What is the class start time: ");
                int newStartTime = keyboard.nextInt();

                System.out.println("What is the class end time: ");
                int newEndtime = keyboard.nextInt();
                keyboard.nextLine();

                CSClass classToRemove = new CSClass(newClassThreeLetterAbbreviation, newClassDigitNumber, newclassThreeLetterAbbreviation, newClassSize, newWaitListSize);
                classToRemove.setStartTime(newStartTime);
                classToRemove.setEndTime(newEndtime);

                schoolAdmin.removeClass(classToRemove);
                break;

            case 5:
                schoolAdmin.printOutFacultyList();

                System.out.println("Enter faculty ID to see more detail about that faculty: ");
                int enteredID = keyboard.nextInt();
                keyboard.nextLine();

                Faculty chosenFaculty = schoolAdmin.findFaculty(enteredID);

                if(chosenFaculty != null)
                {

                    
                }
                else
                {
                    System.out.println("Couldn't find that faculty!");
                }
                


                break;

            case 6:
                hiringFalculty(keyboard, true);
              
                break;

            case 7:

                break;

            case 8:
                hiringFalculty(keyboard, false);

                break;

            case 9:
                
                break;

            case 10:
                userState = "System-Log-In";
                System.out.println("logging out...");
                break;

            case 11:
                userState = "Exit";
                break;

        
            default:
                System.out.println("Error! Invalid option. Try again");
                break;
        }
    }

    private void hiringFalculty(Scanner keyboard, boolean isFullTime)
    {
        String[] facultyNames = facultyGenerator.getRandomNames();
        System.out.println("Type the name of the faculty you want: ");
        String enteredFaculty = keyboard.nextLine();

        for (int i = 0; i < facultyNames.length; i++)
        {
            if (facultyNames[i].equals(enteredFaculty))
            {
                int enteredFacultyID = 0;
                do 
                {
                    System.out.println("Give them an ID");
                    enteredFacultyID = keyboard.nextInt();

                    boolean checkFacultyID = schoolAdmin.checkFacultyID();
                }
                while(!checkFacultyID)


                System.out.println("What is the username for faculty: ");
                String newUsername = keyboard.nextLine();

                System.out.println("What is the password for faculty: ");
                String newPassword = keyboard.nextLine();


                Faculty newFaculty = new Faculty(enteredFaculty, enteredFacultyID, newUsername, newPassword, isFullTime);
                System.out.println(facultyNames[i] + "has been added to faculty list!");
            }

            

            if(!facultyNames[facultyNames.length - 1].equals(enteredFaculty))
            {
                System.out.println("Couldn't find that faculty!");
            }
        }
    }

    private class facultyGenerator
    {
        String[] listOfNames = {
            "John",
            "David",
            "Sarah",
            "Michael",
            "Emily",
            "Daniel",
            "Jessica",
            "Andrew",
            "Sophia",
            "Benjamin",
            "Emma",
            "Christopher",
            "Olivia",
            "Matthew",
            "Ava"
        };

        public facultyGenerator()
        {

        }
        
        // Ai :(
        public String[] getRandomNames()
        {
            String[] randomNames = new String[3];
            int randomID = (int)(Math.random() * listOfNames.length);
            int randomID1 = (int)(Math.random() * listOfNames.length);
            int randomID2 = (int)(Math.random() * listOfNames.length);
            
            randomNames[0] = listOfNames[randomID];
            randomNames[1] = listOfNames[randomID1];
            randomNames[2] = listOfNames[randomID2];
            return randomNames;
        }
    }
}

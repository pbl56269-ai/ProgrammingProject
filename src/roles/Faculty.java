package roles;

public class Faculty implements RoleInterface {

    private String adminUsername = null;
    private String adminPassword = null;
    private ArrayBasedCSClasses assignedClasses;
    
    private String facultyName;
    private int id; 
    private int facultyCreditHours;
    private boolean isFullTime;

    
    private int[][] classSchedule; 

    // 0 = Monday, 1 = Tuesday ..., 5 = Saturday
    // 8    *                             *
    // 9    *                             *
    // 10   *                             *
    
   

    public Faculty() {
        facultyName = "";
        id = 0;
        facultyCreditHours = 0
        adminUsername = "";
        adminPassword = "";
        isFullTime = false;

        assignedClasses = new ArrayBasedCSClasses(5);

        // Creating a matrix to represent a calendar
        classSchedule = new int[7][15];

    }

    public Faculty(String facultyName, int id, String username, String password, boolean workStatus){
        facultyName = facultyName;
        id = id;
        adminUsername = username;
        adminPassword = password;

        isFullTime = workStatus;
    }

    public String getFacultyName(){
        return facultyName;
    }

    public int getID(){
        return id;
    }

    public void addCreditHours(int newCreditHours)
    {
        if(newCreditHours > 0 && newCreditHours < 6 )
        {
            if (facultyCreditHours + newCreditHours <= 15)
            {
                facultyCreditHours += newCreditHours;
            }
        }

    }

    public void removeCreditHours(int removeAmount)
    {
        if(newCreditHours > 0 && newCreditHours < 6 )
        {
            if (facultyCreditHours - newCreditHours >= 0)
            {
                facultyCreditHours -= newCreditHours;
            }
        }
    }

    public int getCreditHours()
    {
        return facultyCreditHours;
    }

    public boolean checkUsername(String enteredUsername) {
        return adminUsername.equals(enteredUsername);
    }

    public boolean checkPassword(String enteredPassword) {
        return adminPassword.equals(enteredPassword);
    }

    public void assignClass(CSClass classes){
        // need to check if can assign new class
        
        assignedClasses = classes;
    }

    private void addingCreditHoursCheck(int newCreditHours)
    {

    }

    public ArrayBasedCSClasses getAssignedClasses(){
        return assignedClasses;
    }
}
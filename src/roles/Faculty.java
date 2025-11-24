package roles;

public class Faculty implements RoleInterface {

    private String adminUsername = null;
    private String adminPassword = null;
    private ArrayBasedCSClasses assignedClasses;
    
    private String facultyName;
    private int id; 

   

    public Faculty() {
        facultyName = "";
        id = 0;
        adminUsername = "";
        adminPassword = "";
    }

    public Faculty(String facultyName, int id, String username, String password){
        this.facultyName = facultyName;
        this.id = id;
        this.adminUsername = username;
        this.adminPassword = password;
    }

    public String getFacultyName(){
        return facultyName;
    }

    public int getID(){
        return id;
    }

    public boolean checkUsername(String enteredUsername) {
        return adminUsername.equals(enteredUsername);
    }

    public boolean checkPassword(String enteredPassword) {
        return adminPassword.equals(enteredPassword);
    }

    public void setAssignedClasses(ArrayBasedCSClasses classes){
        this.assignedClasses = classes;
    }

    public ArrayBasedCSClasses getAssignedClasses(){
        return assignedClasses;
    }
}
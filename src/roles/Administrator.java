package roles;

public class Administrator implements RoleInterface {
    private String adminUsername;
    private String adminPassword;
    CSClass[] currentClasses;

    public Administrator() {
        adminUsername = "Admin";
        adminPassword = "BigAdmin";
        currentClasses = new CSClass[0];
    }

    public boolean checkUsername(String username) {
        return adminUsername.equals(username);
    }

    public boolean checkPassword(String password) {
        return adminPassword.equals(password);
    }

    public int checkErollmentNumber() {
        return 0;
    }

    // print out the current classes
    public void LookAtClasses()
    {

    }

    public void addClass()
    {

    }

    public void removeClass()
    {

    }

    public void AssignFaculty()
    {

    }

    public void HireFaculty()
    {

    }

    public void RemoveFaculty()
    {

    }

    public void HirePartTimeStaff()
    {

    }

    public void RemovePartTimeStaff()
    {

    }

    public void Logout()
    {

    }
}

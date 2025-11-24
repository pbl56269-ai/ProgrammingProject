package roles;

public class Faculty implements RoleInterface {

    private String adminUsername = null;
    private String adminPassword = null;
    
    private String facultyName;
    private int id; 

   

    public Faculty()
    {

    }

    public boolean checkUsername(String username) {
        return adminUsername.equals(username);
    }

    public boolean checkPassword(String password) {
        return adminPassword.equals(password);
    }
}
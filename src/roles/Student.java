package roles;

public class Student implements RoleInterface {
    private String username;
    private String password;
    private String[] studentArray;

    public Student() {
        super();
        username = "";
        password = "";
    }

    public Student(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    
    public boolean enterUsername(String username) {
        boolean isinSystem = false;
        return isinSystem;
    }

    public boolean checkUsername(String username) {
        return username.equals(username);
    }

    public boolean checkPassword(String password) {
        return password.equals(password);
    }

}
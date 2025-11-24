package roles;

public class Student implements RoleInterface {
    private String username;
    private String password;
    private String[] studentArray;

    private int[][] classSchedule; 

    // 0 = Monday, 1 = Tuesday ..., 5 = Saturday
    // 8    *                             *
    // 9    *                             *
    // 10   *                             *
    

    public Student() {
        super();
        username = "";
        password = "";
        classSchedule = new int[0][0];

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
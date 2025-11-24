package roles;

public class Administrator implements RoleInterface {
    private String adminUsername;
    private String adminPassword;
    StackArrayBasedFaculty facultyStackManager; 
    NodeBinaryTreeBasedStudent studentBinaryTreeManager;
    ArrayBasedCSClasses classesManager;

    public Administrator() {
        adminUsername = "Admin";
        adminPassword = "BigAdmin";
        facultyStackManager = new StackArrayBasedFaculty();
        studentBinaryTreeManager = new NodeBinaryTreeBasedStudent();
        classesManager = new ArrayBasedCSClasses(50);
    }

    public boolean checkUsername(String username) {
        return adminUsername.equals(username);
    }

    public boolean checkPassword(String password) {
        return adminPassword.equals(password);
    }

    public boolean checkFacultyUsernames(String enteredUsername)
    {
        return facultyStackManager.checkFacultyUsernames(enteredUsername);
    }

    public boolean checkFacultyPasswords(String enteredPassword)
    {
        return facultyStackManager.checkFacultyPasswords(enteredPassword);
    }

    public boolean checkStudentUsernames(String enteredUsername)
    {
        return facultyStackManager.checkFacultyUsernames(enteredUsername);
    }

    public boolean checkStudentPasswords(String enteredPassword)
    {
        return facultyStackManager.checkFacultyPasswords(enteredPassword);
    }

    public void checkStudentErollment() {
        System.out.println("Current enrolled students: " + studentBinaryTreeManager.currentEnrolledstudent());
        studentBinaryTreeManager.printOutEnrolledStudents(); // TODO: in binary tree

    }

    public void checkClasses()
    {
        classesManager.printAllClasses();
    }

    public void addClass(CSClass newClass)
    {

    }

    public void removeClass()
    {

    }

    public void assignFaculty()
    {

    }

    public void hireFaculty()
    {

    }

    public void removeFaculty()
    {

    }

    public void hirePartTimeStaff()
    {

    }

    public void removePartTimeStaff()
    {

    }

    public void logout()
    {

    }
}

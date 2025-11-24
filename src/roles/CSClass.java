package roles;

public class CSClass {
    private String className;
    private String classCode;
    private Faculty assignedFaculty;
    private Student[] enrolledStudents;
    
    private int startTime;
    private int endTime;

    private int[][] classSchedule; 

    // 0 = Monday, 1 = Tuesday ..., 5 = Saturday
    // 8    *                             *
    // 9    *                             *
    // 10   *                             *
    

    public CSClass() {
        className = "";
        classCode = "";
        assignedFaculty = null;
        enrolledStudents = new Student[0];
        startTime = 0;
        endTime = 0;
        classSchedule = new int[0][0];
    }

    public void setClassName(String newClassName)
    {
        className = newClassName;
    }

    public String getClassName()
    {
        return className;
    }

    public void setClassCode(String newClassCode)
    {
        classCode = newClassCode;
    }

    public String getClassCode()
    {
        return classCode;
    }

    public void setFaculty(Faculty newFaculty)
    {
        assignedFaculty = newFaculty;
    }

    public Faculty getFaculty()
    {
        return assignedFaculty;
    }
}

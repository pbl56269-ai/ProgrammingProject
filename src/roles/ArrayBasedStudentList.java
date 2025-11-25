public class ArrayBasedStudentList {
    private Student[] studentArray;
    private int numStudents;
    private final int length = 10;

    public ArrayBasedStudentList() {
        studentArray = new Student[length];
        numStudents = 0;
    }
    
    public void add(Student Student) {
        
        if (locate(student)) {
            System.out.println("Student already exists!");
            return false;
        }

        else if (numStudents == students.length) {
            Student[] newArray = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newArray[i] = students[i];
            }
            students = newArray;
        }

        students[numStudents++] = student;
    }

    public boolean remove(String studentID) {
        if (isEmpty()) {
            return false;
        }

        for (int i = 0; i < numStudents; i++) {
            if (studentArray[i].getStudentID().equals(studentID)) {
                for (int j = i; j < numStudents - 1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }
                studentArray[--numStudents] = null;
                return true;
            }
        }
        return false;
    }

    public Student find(String studentID) {
        if (isEmpty()) {
            return null;
        }

        for (int i = 0; i < numStudents; i++) {
            if (studentArray[i].getStudentID().equals(studentID)) {
                return studentArray[i];
            }
        }
        return null;
    }

    private boolean locate(Student student) {
        for (int i = 0; i < numStudents; i++) {
            if (studentArray[i].equals(student)) {
                return true;
            }
        }
        return false;
    }

    public Student[] getAllStudents() {
        if (isEmpty()) {
            return new Student[0];

        Student[] result = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            result[i] = studentArray[i];
        }
        return result;
    }

    public int getNumStudents() {
        return numStudents;
    }    

}
package roles;

public class Student {
   private String studentID;
   private String name;
   private String birthdate;
   private String username;
   private String password;

   public Student(Sring studentID, String name, String birthdate, String username, String password) {
        this.studentID = studentID;
        this.name = name;
        this.birthdate = birthdate;
        this.username = username;
        this.password = password;
   }

   public String getStudentID() {
        return studentID;
   }

   public String getName() {
        return name;
   }

   public String getBirthdate() {
        return birthdate;
   }

   public String getUsernmame() {
        return username;
   }

   public String getPassword() {
        return password;
   } 

   @Override
   public boolean equals(Object otherObject) {
        boolean areTheyEqual = false;
        if (otherObject != null && otherObject instanceof Student) {
            Student otherStudent = (Student) otherObject;
            if (this.name.equals(otherStudent.name) && this.birthDate.equals(otherStudent.birthDate)) {
                areTheyEqual = true;
            }
        }
        return areTheyEqual;
    }

}
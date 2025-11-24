package roles;

public class CSClass {
    private String classThreeLetterAbbreviation;
    private int classDigitNumber;
    private String classSectionNumber;

    private Faculty assignedFaculty;
    private Student[] enrolledStudents;

    private Student[] waitlistedStudents;
    private int numberOfWaitlistedStudents;
    
    private int startTime; 
    private int endTime; 

 

    public CSClass() {
        classThreeLetterAbbreviation = "";
        classDigitNumber = 0;
        classSectionNumber = "";
        assignedFaculty = null;

        // Maximum 10 students
        enrolledStudents = new Student[10];
        // Maximum 3 wait list
        waitlistedStudents = new Student[3];
        
        numberOfWaitlistedStudents = 0;

        startTime = 0;
        endTime = 0;
    }

    public void setClassThreeLetterAbbreviation(String newClassThreeLetterAbbreviation)
    {
        classThreeLetterAbbreviation = newClassThreeLetterAbbreviation;
    }

    public String getClassThreeLetterAbbreviation()
    {
        return classThreeLetterAbbreviation;
    }

    public void setClassCode(int newClassDigitNumber)
    {
        classDigitNumber = newClassDigitNumber;
    }

    public int getClassCode()
    {
        return classDigitNumber;
    }

    public void setClassSectionNumber(String newClassSectionNumber)
    {
        classSectionNumber = newClassSectionNumber;
    }

    public String getClassSectionNumber()
    {
        return classSectionNumber;
    }

    public void setFaculty(Faculty newFaculty)
    {
        assignedFaculty = newFaculty;
    }

    public Faculty getFaculty()
    {
        return assignedFaculty;
    }

    public void setStartTime(int newStartTime){
        startTime = newStartTime;
    }

    public int getStartTime(){
        return startTime;
    }

    public void setEndTime(int newEndTime){
        endTime = newEndTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public void setWaitlistedStudents(Student[] newWaitlistedStudents){
        waitlistedStudents = newWaitlistedStudents;
    }

    public Student[] getWaitlistedStudents(){
        return waitlistedStudents;
    }

    public void setNumberOfWaitlistedStudents(int newNumber){
        numberOfWaitlistedStudents = newNumber;
    }

    public int getNumberOfWaitlistedStudents(){
        return numberOfWaitlistedStudents;
    }

    public void addStudentToClass(Student s){
        Student[] temp = new Student[enrolledStudents.length + 1];
        for (int i = 0; i < enrolledStudents.length; i++){
            temp[i] = enrolledStudents[i];
        }
        temp[enrolledStudents.length] = s;
        enrolledStudents = temp;
    }

    public Student[] getEnrolledStudents(){
        return enrolledStudents;
    }
    

    public void addToWaitlist(Student s){
        if(numberOfWaitlistedStudents < waitlistedStudents.length){
            waitlistedStudents[numberOfWaitlistedStudents] = s;
            numberOfWaitlistedStudents++;
        }
    }

    // TODO: Not finshed 
    public void printEnrollment(){
        System.out.println("\nClass: " + classThreeLetterAbbreviation + " (" + classDigitNumber + ")");
        System.out.println("Assigned Faculty: " +
        (assignedFaculty != null ? assignedFaculty.getFacultyName() : "None"));

        if (enrolledStudents.length == 0){
            System.out.println("No enrolled students.");
            return;
        }
        
        System.out.println("Enrolled Students:");
        for (int i = 0; i < enrolledStudents.length; i++){
            System.out.println(" - " + enrolledStudents[i].checkUsername("dummy")); // dummy ? XD
        }
    }

}

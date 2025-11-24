import roles.Faculty;

public class ArrayBasedFaculty {
    private Faculty[] facultyList; 
    private int lastestJoinedFacultyIndex;

    public ArrayBasedFaculty()
    {
        facultyList = new Faculty[5];
        lastestJoinedFacultyIndex = 0;
    }

    public ArrayBasedFaculty(int facultyListSize)
    {
        facultyList = new Faculty[facultyListSize];
        lastestJoinedFacultyIndex = 0;
    }

    public void addFaculty(Faculty newFaculty)
    {

    }
    
    public Faculty peekLastestJoinedFaculty()
    {

    }

    public Faculty removeLastestJoinedFaculty()
    {
        
    }
}

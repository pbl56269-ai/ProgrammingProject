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

    public void push(Faculty newFaculty) throws StackFullException   
    {

    }
    
    public Faculty peek() throws StackEmptyException
    {
        return facultyList[lastestJoinedFacultyIndex];
    }

    public Faculty pop() throws StackEmptyException
    {
        // Remove and return the latest joined faculty
        return facultyList[lastestJoinedFacultyIndex];
    }


}

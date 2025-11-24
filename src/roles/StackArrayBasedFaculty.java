package roles;
import roles.Faculty;
import exception.*;

public class StackArrayBasedFaculty {
    private Faculty[] facultyList; 
    private int lastestJoinedFacultyIndex;

    public StackArrayBasedFaculty()
    {
        facultyList = new Faculty[5];
        lastestJoinedFacultyIndex = 0;
    }

    public StackArrayBasedFaculty(int facultyListSize)
    {
        facultyList = new Faculty[facultyListSize];
        lastestJoinedFacultyIndex = 0;
    }

    public void push(Faculty newFaculty) throws DataStructureFullException   
    {
        if (lastestJoinedFacultyIndex == facultyList.length){
            throw new DataStructureFullException();
        }
        facultyList[lastestJoinedFacultyIndex] = newFaculty;
        lastestJoinedFacultyIndex++;
    }
    
    public Faculty peek() throws DataStructureEmptyException
    {
        if(lastestJoinedFacultyIndex == 0){
            throw new DataStructureEmptyException();
        }
        return facultyList[lastestJoinedFacultyIndex - 1];
    }

    public Faculty pop() throws DataStructureEmptyException
    {
        if(lastestJoinedFacultyIndex == 0){
            throw new DataStructureEmptyException();
        }
        lastestJoinedFacultyIndex--;
        // Remove and return the latest joined faculty
        return facultyList[lastestJoinedFacultyIndex];
    }

    public boolean checkFacultyUsernames(String enteredUsername)
    {
        // loop through the array 
        // Chek if correct 
        // return true if correct
        // return false if array is empty or you went through the whole thing and didn't find it
        for(int i = 0; i < lastestJoinedFacultyIndex; i++){
            if(facultyList[i].checkUsername(enteredUsername)){
                return true;
            }

        }
        return false;
    }

    public boolean checkFacultyPasswords(String enteredPassword)
    {
        // loop through the array 
        // Chek if correct 
        // return true if correct
        // return false if array is empty or you went through the whole thing and didn't find it
        for(int i = 0; i < lastestJoinedFacultyIndex; i++){
            if(facultyList[i].checkPassword(enteredPassword)){
                return true;
            }
        }
        return false;
    }
}

package roles;

import exception.*;

public class ArrayBasedCSClasses {
    private CSClass[] currentClasses;
    private int numberOfClasses;

    public ArrayBasedCSClasses()
    {
        currentClasses = new CSClass[0];
    }

    public ArrayBasedCSClasses(int size)
    {
        currentClasses = new CSClass[size];
    }

    public void addClass(CSClass newClass) throws DataStructureFullException
    {
        if (numberOfClasses >= currentClasses.length) {
            throw new DataStructureFullException("Cannot add more classes, array is full.");
        }
        currentClasses[numberOfClasses] = newClass;
        numberOfClasses++;
    }

    public void removeClass() throws DataStructureEmptyException
    {
        if (numberOfClasses == 0) {
            throw new DataStructureEmptyException("Cannot remove class, array is empty.");
        }
        numberOfClasses--;
        currentClasses[numberOfClasses] = null; // Optional: clear the reference
    }

    public CSClass peekClass() throws DataStructureEmptyException
    {
        if (numberOfClasses == 0) {
            throw new DataStructureEmptyException("Cannot peek class, array is empty.");
        }
        return currentClasses[numberOfClasses - 1];
    }

    public void printAllClasses(){
        if (numberOfClasses == 0){
            System.out.println("No classes available.");
            return;
        }
        System.out.println("---- Current Classes ----");

        for (int i = 0; i < numberOfClasses; i++){
            System.out.println((i+1) + ". " + currentClasses[i].getClassName()
            + " (" + currentClasses[i].getClassCode() + ")");
        }
    }
}

import roles.CSClass;

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

    public void addClass(CSClass newClass) throws ArrayFullException
    {
        if (numberOfClasses >= currentClasses.length) {
            throw new ArrayFullException("Cannot add more classes, array is full.");
        }
        currentClasses[numberOfClasses] = newClass;
        numberOfClasses++;
    }

    public void removeClass() throws ArrayEmptyException
    {
        if (numberOfClasses == 0) {
            throw new ArrayEmptyException("Cannot remove class, array is empty.");
        }
        numberOfClasses--;
        currentClasses[numberOfClasses] = null; // Optional: clear the reference
    }

    public CSClass peekClass() throws ArrayEmptyException
    {
        if (numberOfClasses == 0) {
            throw new ArrayEmptyException("Cannot peek class, array is empty.");
        }
        return currentClasses[numberOfClasses - 1];
    }
}

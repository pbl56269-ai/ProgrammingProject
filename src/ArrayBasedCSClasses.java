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

    
}

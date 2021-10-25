import java.util.Arrays;
import java.util.EmptyStackException;

public class DoubleStack implements IDoubleStack
{
    /**
     * Integer array, where the data are saved
     */
    private Integer[] myStack;

    /**
     * max value, to know where is the last index in the right
     */
    private int max;

    /**
     * min value, to know where is the first index in the left (always 0)
     */
    private int min;

    /**
     * the object's contructor
     * @param length the length of the created DoubleStack
     */
    public DoubleStack(int length) {
        max = -1;
        min = 0;

        if(length>0)
        {
            myStack = new Integer[length];
        }else{
            System.out.println("errore nella creazione del Double Stack");
            throw new EmptyStackException();
        }
    }

    @Override
    public void addRight(int value) {
        if(!isFull())
        {
            max++;
            //min = max == 0 ? 0 : min;
            myStack[max] = value;
        }
    }

    @Override
    public void delRight() {
        if(max >= 0 && !isEmpty())
        {
            myStack[max] = null;
            max--;
        }
    }

    @Override
    public int frontRight() {
        if(max>=0 && !isEmpty())
            return myStack[max];
        else
        {
            System.out.println("il DoubleStack è vuoto");
            throw new EmptyStackException();
        }
    }

    @Override
    public void addLeft(int value) {
        if(min >= 0 && !isFull())
        {
            max++;
            for(int i = max; i > 0; i--){
                myStack[i] = myStack[i-1];
            }
            myStack[min] = value;
        }
    }

    @Override
    public void delLeft() {
        if(max >= 0 && !isEmpty()){
            max--;
            for(int i = 0; i <= max; i++)
                myStack[i] = myStack[i+1];

            myStack[(max+1)] = null;
        }
    }

    @Override
    public int fronLeft() {
        if(min >=0 && !isEmpty())
            return myStack[min];
        else
        {
            System.out.println("il DoubleStack è vuoto");
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {
        if(max == -1){
            return true;
        }
        else
        return false;
    }

    @Override
    public boolean isFull(){
        if(min == 0 && max == myStack.length-1)
            return true;
            else
            return false;

    }

    @Override
    public int cardinality() {
        if(!isEmpty())
            return max-min;
        else
            return 0;
    }

    @Override
    public String toString() {
        String array = "";
        if(!isEmpty()){
            array = Arrays.toString(myStack);
            return array;
        }
        return "il tuo stack è vuoto";
    }

    @Override
    public void clear() {
        for(int i = 0; i<myStack.length;i++){
            myStack[i] = null;
        }
        max = -1;
        min = 0;
    }
}
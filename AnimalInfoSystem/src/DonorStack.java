public class DonorStack {

    private Object[] elements;

    private static final int DEFAULT_CAPACITY = 16;

    // size
    private int top;



    // constructor
    public DonorStack(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    //  constructor
    public DonorStack(int initialCapacity){
        this.elements = new Object[initialCapacity];
    }


    // return size
    public int getSize() {
        return top;
    }

    // if stack is empty
    public boolean isEmpty() {
        return top <=0;
    }



    // add element
    public void push(Object e) {

        // if stack is full
        if(top >= elements.length){
            // make a bigger stack
            Object[] newStack = new Object[elements.length * 2];

            // loop old one, add into the new one
            for(int i = 0; i < elements.length; i++){
                newStack[i] = elements[i];
            }

            // name point to the new one
            newStack = elements;

        }

        elements[top] = e;

        // move up the pointer
        top++;

    }




    // remove
    public Object pop() {

        // if stack is empty
        if(top <= 0){
            throw new StackOverflowError("No Donor Is On The List");
        }

        // move down the pointer
        top--;

        return elements[top];
    }



    // return the top element
    public Object peek() {
        if(top <= 0){
            throw new StackOverflowError();
        }


        return elements[top - 1];
    }



    // to String
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for(int i = top -1; i >= 0; i--){
            stringBuilder.append(elements[i]);


            if( i > 0){
                stringBuilder.append(",");
            }

        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

}

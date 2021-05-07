public class ApplicantQueue {


    private Node front;
    private Node rear;
    private int size;



    // return element size
    public int getSize(){
        return size;
    }



    // if Queue is empty
    public boolean isEmpty(){
        return size == 0;
    }




    // add an item at the end
    public void enQueue(Object e){

        // create a new node
        Node newNode = new Node(e,null);

        // add node into queue
        if(rear == null){
            // when new node is the first node
            rear = newNode;
            front = newNode;
        }else{
            // add node into the end
            rear.next = newNode;
            // rear point to the new node
            rear = newNode;

        }

        size++;

    }



    // delete element
    public Object deQueue(){

        // if queue is empty
        if( size <= 0){
            throw new QueueEmptyException("No Applicant exist.");
        }


        Object oldEle = front.element;

        front = front.next;

        if( front == null){
            rear = null;
        }

        size--;

        return oldEle;

    }


    // return the top element
    public Object peek(){

        // 提问：这里可以写 front == null
        if( size <= 0){
            throw new QueueEmptyException("No Applicant exist.");
        }

        return front.element;
    }



    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        for(Node node = front; front != null; front = front.next ){
            stringBuilder.append(front.element);

            if(  front.next != null ){
                stringBuilder.append(",");
            }

        }

        stringBuilder.append("]");


        return stringBuilder.toString();

    }





    private class Node{
        Object element;
        Node next;

        public Node(Object element, Node next){
            super();
            this.element = element;
            this.next = next;
        }

    }


}

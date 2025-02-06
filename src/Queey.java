public class Queey {

    Node front, rear;

    private static class Node{
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }
    }

    public void enQueue(String value){
        Node n = new Node(value);
        if(front == null){
            front = n;
        }else{
            rear.next = n;
        }
        rear = n;
    }

    public String toString(){
        String ret = "Queey: ";
        Node current = front;
        while(current != null){
            ret += " " + current.value;
            current = current.next;
        }

        return ret;
    }
    public String dequeue(){
        String ret;
        ret= front.value;;
        front = front.next;
        return ret;
    }

    public String Peek(){
        return front.value;
    }

}

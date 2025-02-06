public class Stacky {

    int topOfStack = -1;
    int stackSize;
    String[] data;

    public Stacky(int stackSize){
        this.stackSize = stackSize;
        data = new String[stackSize];
    }
    public void push(String value) {
        if(topOfStack + 1 == stackSize){
            throw new StackOverflowError();
        }
        topOfStack++;
        data[topOfStack] = value;
    }

    public String pop(){
        String ret = data[topOfStack];
        topOfStack--;
        return ret;
    }

    @Override
    public String toString(){
        String ret = "stacky: ";
        for (int i = 0; i <= topOfStack ; i++) {
            ret += data[i] + " ";
        }
        return ret;
    }
}

public class Hashy {

    private Person[] hashTable;
    private int size;
    public int totalCols;

    public Hashy(int dataSize){
        size = dataSize*10;
        hashTable = new Person[size];
    }

    public int hash(String str){
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret += ((int) str.charAt(i) * 9.8);
        }
        return ret % size;
    }

    public Person search(String name){
        int idx = hash(name);
        int ops = 0;
        while(!hashTable[idx].getName().equals(name)){
            idx++;
            idx %= size;
            ops++;
            if (ops > size) return null;
        }
        System.out.println("hashtable search O(1) operations: " + ops);
        return hashTable[idx];
    }

    public void add(Person person){

        int idx = hash(person.getName());
        while(hashTable[idx] != null){

            //System.out.println(person.getName() + " collision at " + idx + hashTable[idx].getName());
            idx++;
            idx %= size;
            totalCols++;
        }
        hashTable[idx] = person;
        //System.out.println(person.getName() + " saved with index " + idx);
    }

}

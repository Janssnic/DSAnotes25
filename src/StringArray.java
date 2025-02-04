import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        System.out.println("New String array");
        this.values = values;
    }

    public void add(String name) {
        System.out.println("add value " + name);
        String[] newValues = new String[values.length + 1];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        newValues[values.length] = name;
        values = newValues;
    }

    public void reverse(){
        String[] newValues = new String[values.length];
        int pos = 0;
        for (int i = values.length-1; i >= 0; i--) {
            newValues[pos++] = values[i];
        }
        values = newValues;
    }

    public String toString(){
        return Arrays.toString(values);
    }
}

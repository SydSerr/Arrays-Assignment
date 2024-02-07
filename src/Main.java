import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //array with all days of the week
        String [] weekdays = new String [7];
        String [] list = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // printing out array
        System.out.println("Weekdays: ");
        for (String value : list){
            System.out.println(value);
        }

        //resized array with just weekdays
        String [] temp = new String [5];
        String [] tempList = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        //printing out resized array
        System.out.println("\nResized: ");
        for (String value : tempList){
            System.out.println(value);
        }
    }
}
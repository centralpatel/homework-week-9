package homeworkweek9rashila;

import java.util.HashMap;
import java.util.Map;

//9. Create a HashMap object called people that will store String keys and Integer values:
// And use for each loop to iterate the value from Map.
public class Prog_9_HashMapPeople {

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Nurse ", 1);
        people.put("Teacher ", 2);
        people.put("Policeman ", 3);
        people.put("Guard ", 4);
        people.put("Accountant ", 5);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}

package homeworkweek9rashila;

import java.util.ArrayList;

// 7. Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class Prog_7_ArrayListEmptyUndergroundTube {

    public static void main(String[] args) {
        ArrayList<String> underground = new ArrayList();
        underground.add("Bakerloo");
        underground.add("Waterloo");
        underground.add("Victoria");
        underground.add("");
        underground.add("Vauxhall");
        underground.add("Westminster");
        underground.add("Aldgate");

        for (String undergroundName : underground) {
            System.out.println(undergroundName.isEmpty());
        }
    }
}

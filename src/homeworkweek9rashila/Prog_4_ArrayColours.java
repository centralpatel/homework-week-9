package homeworkweek9rashila;

import java.util.ArrayList;

/*
4. Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
* */
public class Prog_4_ArrayColours {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Orange");
        colours.add("Pink");
        colours.add("Red");
        colours.add("Green");
        colours.add("Black");
        colours.add("Purple");

        for (String coloursName : colours) {
            System.out.println(coloursName);
        }
    }
}

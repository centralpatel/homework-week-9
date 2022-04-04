package homeworkweek9rashila;

import java.util.ArrayList;

//6. Write a Java program to retrieve an element (at a specified index) from a given array list
public class Prog_6_ArrayListElement {

    //Array list
    public static void main(String[] args) {
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("Carrot");
        veggies.add("Cucumber");
        veggies.add("Cabbage");
        veggies.add("Cauliflower");
        veggies.add("Aubergine");
        veggies.add("Capsicum");

        System.out.println(veggies.get(4));
    }
}

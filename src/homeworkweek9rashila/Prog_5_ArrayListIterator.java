package homeworkweek9rashila;
/*5. Write a Java program to iterate through all elements in an array list using Iterator.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prog_5_ArrayListIterator {

    public static void main(String[] args) {
        Set<String> flowers = new HashSet<>();
        flowers.add("Rose");
        flowers.add("Daffodil");
        flowers.add("Pansy");
        flowers.add("Poppy");
        flowers.add("Poppy");
        flowers.add("Lily");
        flowers.add("Hyacinth");
        flowers.add("Hyacinth");


        Iterator itr = flowers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
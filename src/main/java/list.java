import java.util.ArrayList;
import java.util.Collections; //for it's min and max methods

class list {
    static void printGreatestValue() {

        ArrayList <Integer>list = new ArrayList<>(5);
        list.add(5);
        list.add(9);
        list.add(1);

        int max;
        int min;
        System.out.println(list); //print as a list

        for (Integer a : list) {
            System.out.println(a); //print as individuals
        }
        max=Collections.max(list);
        min=Collections.min(list);
        System.out.println("max: " + max+ " min: "+min); //print min and max from the list


        }

    }



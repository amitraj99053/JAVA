import java.util.ArrayList;
import java.util.List;

public class Array_pj9 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("Hazaribagh");
        list.add("Ranchi");
        list.add("Bokaro");
        list.add("Barkagaon");
        list.add("Kolkata");
        list.add("Delhi");
        list.add("Banglor");
        list.add("Kerala");

        System.out.println(list);

        list.remove(7);
        list.add("Dumka");

        System.out.println(list);


    }
}

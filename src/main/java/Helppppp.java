import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Helppppp {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("braam");
        list.add("araam");
        list.add("Craam");
        list.add("Draam");
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
    }

}

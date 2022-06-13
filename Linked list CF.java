import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class subarr {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 51; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 26; i <51 ; i++) {
                list.removeLast();
        }
            System.out.println(list);
    }
    
    // reversing linked list using Collection framework method
    LinkedList<Integer> list2 = new LinkedList<>();
       list2.add(1);
       list2.add(2);
       Collections.reverse(list2); // reverse function in collection framework

}

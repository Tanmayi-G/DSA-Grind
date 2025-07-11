package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Swap_two_numbers {
    static List<Integer> get(int a,int b)
    {
        List<Integer> list=new ArrayList<>();
        a=a^b;
        b=a^b;
        a=a^b;
        list.add(a);
        list.add(b);
        return list;
    }
}

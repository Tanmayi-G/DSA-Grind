package BitManipulation;

public class Set_rightmost_unset_bit {
    static int setBit(int N){
        if ((~N) == 0) {
            return N;
        }
        int temp=1;
        while((N&temp)!=0){
            temp=temp<<1;
        }
        return N|temp;
    }
}

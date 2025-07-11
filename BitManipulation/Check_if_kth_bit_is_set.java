package BitManipulation;

public class Check_if_kth_bit_is_set {
    static boolean checkKthBit(int n, int k)
    {
        if(((n>>k)&1)==1) return true;
        return false;
    }
}

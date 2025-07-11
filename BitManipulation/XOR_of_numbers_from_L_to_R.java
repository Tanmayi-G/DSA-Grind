package BitManipulation;

public class XOR_of_numbers_from_L_to_R {
    public static int findXOR(int l, int r) {
        return f(l-1)^f(r);
    }
    static int f(int n){
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
}

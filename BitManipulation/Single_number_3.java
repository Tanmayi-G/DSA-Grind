package BitManipulation;

public class Single_number_3 {
    public int[] singleNumber(int[] nums) {
        int n=0;
        for(int ele:nums) n=n^ele;
        n=(n&(n-1))^n;

        int b1=0; //setbit 0 bucket
        int b2=0; //setbit 1 bucket
        for(int ele:nums){
            if((ele&n)==0) b1=b1^ele;
            else b2=b2^ele;
        }
        return new int[]{b1,b2};
    }
}

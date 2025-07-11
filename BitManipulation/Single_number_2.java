package BitManipulation;

public class Single_number_2 {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;
        for(int ele:nums){
            ones=(ele^ones)&~twos;
            twos=(ele^twos)&~ones;
        }
        return ones;
    }
}

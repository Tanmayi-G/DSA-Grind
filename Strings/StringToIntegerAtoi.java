class StringToIntegerAtoi {
    public int myAtoi(String s) {
        if(s==null) return 0;

        //remove whitespaces
        s=s.trim();
        if(s.length()==0) return 0;

        //check sign
        int ans=0;
        int sign=1;
        if(s.charAt(0)=='-') sign=-1;

        int MAX=Integer.MAX_VALUE;
        int MIN=Integer.MIN_VALUE;
        int i=(s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 : 0;
        while(i<s.length()){
            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))) break;  //check for non-digit

            int digit=s.charAt(i)-'0';

            //check for edge conditions
            if(ans>(MAX-digit)/10){
                return (sign==1) ? MAX : MIN;
            }

            ans=ans*10 + digit;
            i++;
        }

        return ans*sign;
    }
}
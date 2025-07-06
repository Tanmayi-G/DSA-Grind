package Arrays;

public class MajorityElement {
    public int majorityElement(int[] arr) {
        int majEle=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                majEle=arr[i];
                cnt++;
            }
            else if(arr[i]==majEle) cnt++;
            else cnt--;
            
        }
        return majEle;
    }
}

public class ShortestSubArrayWithSumK {
    public static void main(String[] args) {
        System.out.println(shortestSubarray(new int[] {3,8,2,-1,6,7},10));
    }   
    static int shortestSubarray(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k)
                return 1;
        }
        int gap=2;
        while(gap<=nums.length){
            for(int i=0;i<=nums.length-gap;i++){
                int sum=0;
                for(int j=i;j<gap+i;j++){
                    sum=sum+nums[j];
                }
                if(sum==k)
                return gap;
            }
            gap++;
        }
    return -1;
        }
}

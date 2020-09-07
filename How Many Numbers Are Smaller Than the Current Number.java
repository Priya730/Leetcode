class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int buck[] = new int[101];
        for(int i=0;i<nums.length;i++){
            buck[nums[i]]++;
        }
        for(int j=1;j<100;j++){
            buck[j]+=buck[j-1];
        }
        for(int k=0;k<nums.length;k++){
            int pos = nums[k];
            if(pos==0){
                nums[k]=0;
            }else{
                nums[k]=buck[pos-1];
            }
        }
        return nums;
    }
}

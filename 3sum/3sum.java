class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            // checking duplicates 
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                //2 sum
                int low = i+1; 
                int high = nums.length-1;
                int sum = 0 - nums[i];
                
                
                while(low<high){
                    if(nums[low] + nums[high] == sum){
                        //return list of list of the triplets
                        ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    
                    else if(nums[low]+nums[high]>sum) high--;
                    else low++;
                }
                
            }
            
        }
        
        return ans;
    }
}

// [-1,0,1,2,-1,-4]
// --> [-4, -1, -1, 0, 1, 2]
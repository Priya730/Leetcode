class Solution {
    public int xorOperation(int n, int start) {
        int nums[]= new int[n];
        int xor_nums=0;
        for(int i=0;i<n;i++){
            nums[i] = start + 2*i;
            xor_nums = xor_nums ^ nums[i];
        }
        return xor_nums;
    }
}

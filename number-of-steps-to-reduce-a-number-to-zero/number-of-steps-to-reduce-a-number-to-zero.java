class Solution {
    public int numberOfSteps (int num) {
//         if(num==0){
//             return 0;
//         }
//         else if(num%2 ==0){
//             return numberOfSteps(num/2)+1;
//         }
//         else if(num%2 ==1){
//             return numberOfSteps(num-1) + 1;
//         }
//         return 0;
       
        int count = 0;
        while(num>0){
        if((num&1) != 1) num = num/2;
        else num = num-1;
            count++;
        }
        return count;
    
    }
}
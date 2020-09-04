class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> b = new ArrayList<>();
        int maxcandy = candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxcandy){
                maxcandy = candies[i];
            }
        }
        
        for(int j=0;j<candies.length;j++){
            int greatest = candies[j]+extraCandies;
            if(greatest >= maxcandy){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        
        return b;
    }
}

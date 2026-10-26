class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int new_sum=0;
            for(int j=0;j<accounts[i].length;j++){
                
                new_sum+=accounts[i][j];
                if(sum<new_sum){
                    sum=new_sum;
                }
            }
        }
        return sum;
    }
}
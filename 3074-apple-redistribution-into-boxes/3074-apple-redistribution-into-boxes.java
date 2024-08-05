class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum =0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int cnt=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(sum<=0){
                return cnt;
            }
            sum-=capacity[i];
            cnt++;
        }
        return cnt;
    }
}
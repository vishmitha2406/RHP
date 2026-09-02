class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<=n-3;i++){
            if(nums[i]>0) break;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[r]+nums[l];
                if(sum==0){
                    a.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l+1<n && nums[l+1]==nums[l]) {l++;}
                    l++;

                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
                }
                
    }
    return a;
}
}

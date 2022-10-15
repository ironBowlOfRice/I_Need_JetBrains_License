class Sum {
    public int[] twoSum(int[] nums, int target) {
        int I=0;
        int J=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<=nums.length-1;j++){
                if(i!=j&&nums[i]+nums[j]==target){
                    if(i>j){
                        I=j;
                        J=i;
                    }
                    else{
                        I=i;
                        J=j;
                    }

                }

            }
        }
        int[] num={I,J};
        return num;
    }
}
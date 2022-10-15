import java.util.ArrayList;

class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        if(list.contains(target)){
            return list.indexOf(target);
        }else {
            for(int i=0;i<list.size();i++){
                if(target<list.get(i)){
                    return i;
                }
            }
            return list.size();
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class TwoSum{

    public int[] twosum(int[] nums,int target){
       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0;i<nums.length;i++){
        int complement =target-nums[i];

        if(map.containsKey(complement)){
            return new int[] {map.get(complement),i};
        }

        map.put(nums[i], i);

       }
       throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.twosum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
    }
}
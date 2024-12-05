package Array;
import java.util.ArrayList;
public class removeDuplicate_fromSortedArray {

//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.


    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0; // Return 0 if the array is empty

            ArrayList<Integer> uniqueList = new ArrayList<>(); // List to store unique integers
            uniqueList.add(nums[0]); // Add the first element as it's always unique

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) { // Compare current element with the previous one
                    uniqueList.add(nums[i]); // Add unique element to the list
                }
            }

            return uniqueList.size(); // Return the size of the unique list
        }
    }
}
//============================================================================================================

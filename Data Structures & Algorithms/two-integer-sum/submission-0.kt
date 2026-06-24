class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var arr = IntArray(2)

       for(i in 0..nums.lastIndex) {
         for(j in i+1..nums.lastIndex) {
            if(nums[i]+nums[j] == target) {
                arr[0] = i;
                arr[1] = j
            }
         }
       }
       return arr
    }
}

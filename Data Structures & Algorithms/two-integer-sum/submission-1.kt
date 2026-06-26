class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

       var map = mutableMapOf<Int, Int>()

       for(i in 0..nums.lastIndex) {
         map[nums[i]] = i
       }

       for(j in 0..nums.lastIndex) {
         var diff = target - nums[j]

         if(map.containsKey(diff) && j != map[diff]) {
          return intArrayOf(j, map[diff]!!)
         }
       }
       return intArrayOf()
    }
}

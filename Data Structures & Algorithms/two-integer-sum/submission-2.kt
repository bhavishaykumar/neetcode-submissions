class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

       var map = mutableMapOf<Int, Int>()

       for(i in nums.indices) {
        var diff = target - nums[i]

        if(map.containsKey(diff)) {
          return intArrayOf(map[diff]!!, i)
        }
        map[nums[i]] = i
       }

       return intArrayOf()
    }
}

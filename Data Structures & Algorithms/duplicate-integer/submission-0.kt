class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

       for(i in nums.indices){
        for(j in nums.indices) {
            if (i!=j && nums[i] == nums[j]){
                return true
            }
        }
      }
      return false
    }
}

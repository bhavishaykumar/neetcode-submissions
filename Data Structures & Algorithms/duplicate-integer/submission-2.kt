class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
      
      var sets = mutableSetOf<Int>()
      for(i in nums) {
        if(i in sets) {
            return true
        }
        sets.add(i)
      }
      return false
    }
}

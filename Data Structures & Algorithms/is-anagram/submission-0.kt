class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        var arr = IntArray(26)

        for(i in s) {
            arr[i - 'a']++
        }

        for(j in t) {
            arr[j - 'a']--
        }
        
        for(k in arr) {
          if(k != 0) {
            return false
          }
        }
        
        return true

    }
}

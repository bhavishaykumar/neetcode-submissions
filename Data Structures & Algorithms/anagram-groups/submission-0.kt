class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        var data = mutableMapOf<List<Int>, MutableList<String>>()

        for(i in strs) {
            var temp = IntArray(26)

            for(j in i) {
                temp[j - 'a']++
            }
            val key = temp.toList()

            data.getOrPut(key) {
                mutableListOf()
            }.add(i)

        }

        return data.values.toList()

    }
}

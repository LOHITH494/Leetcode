import java.math.BigInteger;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return null;
        int number[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        Map<BigInteger, List<String>> map = new HashMap<>();
        for (String word : strs) {
            BigInteger mul = BigInteger.ONE;
            for (int i = 0; i < word.length(); i++) {
                mul = mul.multiply(BigInteger.valueOf(number[word.charAt(i) - 'a']));
            }
            if (map.containsKey(mul)) {
                map.get(mul).add(word);
            } else {
                map.put(mul, new ArrayList<String>());
                map.get(mul).add(word);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> val : map.values()) {
            result.add(val);
        }
        return result;
    }
}

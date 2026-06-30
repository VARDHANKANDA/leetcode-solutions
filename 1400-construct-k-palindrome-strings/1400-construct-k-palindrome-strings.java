class Solution {
    public boolean canConstruct(String s, int k) {

        if (k > s.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0) +1);
        }
        int oddCount =0;
        for (int count : map.values()) {
            if (count%2 !=0)
                oddCount++;
        }
        return oddCount <=k;
    }
}
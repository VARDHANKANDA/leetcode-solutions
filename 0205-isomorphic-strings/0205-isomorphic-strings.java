class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sourceMap = new int[256];
        int[] targetMap = new int[256];
        for (int idx = 0; idx < s.length(); idx++) {
            char sourceChar = s.charAt(idx);
            char targetChar = t.charAt(idx);
            if (sourceMap[sourceChar] != targetMap[targetChar]) {
                return false;
            }
            sourceMap[sourceChar] = idx + 1;
            targetMap[targetChar] = idx + 1;
        }
        return true;
    }
}
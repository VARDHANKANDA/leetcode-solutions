class Solution {
    public long sumAndMultiply(int n) {
        long value = 0;
        int sum = 0;
        int[] digits = new int[10];
        int len = 0;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                digits[len++] = d;
                sum += d;
            }
            n /= 10;
        }
        for (int i = len - 1; i >= 0; i--) {
            value = value * 10 + digits[i];
        }
        return value * sum;
    }
}
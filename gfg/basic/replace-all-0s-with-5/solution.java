class Solution {
    public int convertFive(int n) {
        // code here
        String s = String.valueOf(n);
        String num = s.replace('0', '5');
        return Integer.parseInt(num);
    }
}
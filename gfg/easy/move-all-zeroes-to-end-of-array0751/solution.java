class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
                int j = 0; // Position for non-zero element

                // Move all non-zero elements to the front
                for (int i = 0; i < n; i++) {
                    if (arr[i] != 0) {
                        arr[j++] = arr[i];
                    }
                }
                //hello working

                // Fill remaining positions with zeros
                while (j < n) {
                    arr[j++] = 0;
                }
        
    }
}
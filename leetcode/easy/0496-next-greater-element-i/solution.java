class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int idx = 0;
        int[] arr = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length-1; j++){
                if(nums1[i] == nums2[j]){
                    if(j == nums2.length){
                        arr[i] = -1;
                        break;
                    } else if(nums2[j+1] > nums1[i]){
                        arr[i] = nums2[j+1];
                        break;
                    }else{
                        arr[i] = -1;
                        break;
                    }
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) arr[i] = -1;
        }
        return arr;
    }
}
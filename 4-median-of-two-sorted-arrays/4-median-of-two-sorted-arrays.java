class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int k = 0;
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        double res = 0.0;
        if(result.length %2 !=0) {
             res = result[result.length /2];
        }
        else {
            res = ( result[(result.length)/2] +result[(result.length/2)-1]) / 2.0;
        }
        return res;
    }
}
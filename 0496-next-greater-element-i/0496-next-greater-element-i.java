class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        // Traverse nums2 and fill the map with the next greater element
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[i] > st.peek()) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        // Elements left in the stack have no next greater element, so map them to -1
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        // Build the result for nums1 by looking up the map
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }

    
}
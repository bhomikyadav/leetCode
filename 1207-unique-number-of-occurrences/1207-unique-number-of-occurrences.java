class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();

        //Adding number of Occurrence in map
        for (int i = 0; i < arr.length; i++) {
            int occurrence = m.getOrDefault(arr[i], 0);
            if (occurrence != 0) {
                m.put(arr[i], occurrence + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        Map<Integer, Boolean> isPresent = new HashMap<>();

        // check if occurrence of any value 
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (isPresent.getOrDefault(entry.getValue(), false)) {
                return false;
            } else {
                isPresent.put(entry.getValue(), true);
            }
        }
        return true;
    }
}
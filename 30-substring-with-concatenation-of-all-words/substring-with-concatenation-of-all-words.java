class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int n = words.length;
        int len = words[0].length();
        int k = n * len;
        Arrays.sort(words);
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            String[] arr = new String[n];
            int index = 0;
            for (int j = 0; j < k; j += len) {
                arr[index] = sub.substring(j, j + len);
                index++;
            }
            Arrays.sort(arr);
            if (Arrays.equals(arr, words)) {
                result.add(i);
            }
        }
        return result;
    }
}

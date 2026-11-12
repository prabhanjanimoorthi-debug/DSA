import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int k=p.length();
        if (k>s.length()) {
            return ans;
        }
        char[] pattern=p.toCharArray();
        Arrays.sort(pattern);
        String sortedP = new String(pattern);
        for (int i=0;i<=s.length()-k;i++) {
            
            String window=s.substring(i,i+k);
            char[] arr =window.toCharArray();
            Arrays.sort(arr);

            String sortedWindow =new String(arr);
            if (sortedP.equals(sortedWindow)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
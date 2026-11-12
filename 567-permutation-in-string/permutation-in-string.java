class Solution {
    static boolean anagram(String a, String p) {
        char[]x=a.toCharArray();
        char[]y=p.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x,y);
    }
    public boolean checkInclusion(String s1, String s2) {
        int k =s1.length();
        for(int i=0; i<=s2.length()-k;i++) {
            String window = s2.substring(i, i+k);
            if(anagram(window, s1)) {
                return true;
            }
        }
        return false;
    }
}
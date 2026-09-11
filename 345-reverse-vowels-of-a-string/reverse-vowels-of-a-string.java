class Solution {
    static boolean isvowel(char ch) {
        char c = Character.toLowerCase(ch);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!isvowel(arr[left])) {
                left++;
            }
            else if (!isvowel(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}

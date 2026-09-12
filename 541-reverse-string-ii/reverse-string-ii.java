class Solution {

    static void rev(int left, int right, char[] arr) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        int i = 0;

        while (i < arr.length) {

            if (i + k <= arr.length) {

                rev(i, i + k - 1, arr);

            } 
            else {

                rev(i, arr.length - 1, arr);
            }

            i = i + 2 * k;
        }

        return new String(arr);
    }
}
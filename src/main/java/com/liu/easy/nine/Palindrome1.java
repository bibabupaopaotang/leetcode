package com.liu.easy.nine;

//回文数  字符串解法
public class Palindrome1 {
    public static boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int left = 0;
        int right = a.length() - 1;
        while(left < right){
            if(a.charAt(left) == a.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome1.isPalindrome(3233));
    }
}

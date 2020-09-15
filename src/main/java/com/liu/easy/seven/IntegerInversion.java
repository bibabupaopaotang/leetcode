package com.liu.easy.seven;

import java.util.Stack;

//假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0
public class IntegerInversion {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            //通过取余获取最后一位数
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(IntegerInversion.reverse(-213));
    }
}

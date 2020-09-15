package com.liu.easy.one;

//暴力查找 n*2
public class TwoNumToAdd {
    public static void main(String[] args) {
        int[] nums = { 2,7,11,15};
        int target = 9;
        TwoNumToAdd add = new TwoNumToAdd();
        int[] b = add.twoSum(nums, target);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+ "\t");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+ 1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}

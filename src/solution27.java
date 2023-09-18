/*
27 移除元素
给你一个数组 nums 和一个值 val，
你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 */

public class solution27 {




   public static void main(String[] args) {
System.out.print("答案是");
System.out.print(removeElement(new int[]{2,3,3,4,2,2},3));

    }

    private static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int x : nums) {
            //for(int num:nums){}
            //含义：遍历数组nums中的所有元素，循环体中nums[i]用num替代，num == nums[i]
            if (x != val) {
                nums[idx++] = x;
            }

        }
return idx;


    }




}



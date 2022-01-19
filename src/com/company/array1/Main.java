package com.company.array1;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
//        makeMiddle mM = new makeMiddle(nums);
        //System.out.println(makeMiddle(nums1));
        System.out.println(nums1.length / 2 - 1);
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public int[] reverse3(int[] nums) {
        /*int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;
        return nums;*/
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] middleWay(int[] a, int[] b) {
        // int[] middleArr = new int[]{a[1], b[1]};
        //return middleArr;
        return new int[]{a[1], b[1]};
    }

    public boolean no23(int[] nums) {
        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
            return true;
        } else {
            return false;
            // return (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3)
        }
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public static int[] makeMiddle(int[] nums) {
        //int[] middleNums = {nums[nums.length / 2 - 1], nums[nums.length / 2]};
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    public boolean unlucky1(int[] nums) {
        return (nums.length > 1 && (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3
                || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[2]) {
            return new int[]{nums[0], nums[0], nums[0]};
        } else {
            return new int[]{nums[2], nums[2], nums[2]};
        }
    }

    public int[] makeEnds(int[] nums) {
        int[] firstLast = new int[]{nums[0], nums[nums.length - 1]};
        return firstLast;
    }

    public int[] makeLast(int[] nums) {
        int nums2[] = new int[nums.length * 2];
        nums2[nums2.length - 1] = nums[nums.length - 1];
        return nums2;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int maxTriple(int[] nums) {
        if (nums[0] >= nums[nums.length - 1] && nums[0] >= nums[nums.length / 2]) return nums[0];
        else if (nums[nums.length - 1] >= nums[0] && nums[nums.length - 1] >= nums[nums.length / 2])
            return nums[nums.length - 1];
        else return nums[nums.length / 2];
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length > 1) return new int[]{a[0], a[1]};
        else if (a.length == 1) return new int[]{a[0], b[0]};
        else return new int[]{b[0], b[1]};
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        else return nums[0] + nums[1];
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }

    public boolean double23(int[] nums) {
        if (nums.length == 2 && (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3)) return true;
        else return false;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0]+a[1] >= b[0] + b[1]) return a;
        else return b;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        else return new int[]{nums[0], nums[1]};
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) return new int[]{a[0],b[0]};
        else if(a.length > 0 && b.length == 0) return new int[]{a[0]};
        else if(a.length == 0 && b.length > 0) return new int[]{b[0]};
        else return new int[0];
    }
}

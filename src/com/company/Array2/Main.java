package com.company.Array2;

public class Main {

    public static void main(String[] args) {
        System.out.println();
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) continue;
            if (i > 0 && nums[i - 1] == 13) continue;
            sum += nums[i];
        }
        return sum;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

    public int[] fizzArray(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        return nums;
    }

    public boolean no14(int[] nums) {
        boolean is1 = false;
        boolean is4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) is1 = true;
            if (nums[i] == 4) is4 = true;
            if (is1 && is4) return false;
        }
        return true;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) > 0)
                count++;
        }
        return count;
    }

    public boolean modThree(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEven++;
                countOdd = 0;
            } else {
                countOdd++;
                countEven = 0;
            }
            if (countEven == 3) return true;
            else if (countOdd == 3) return true;
        }
        return false;
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) return false;
        }
        return true;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 1) return nums;
        else if (nums.length > 1) {
            int temp = nums[0];

            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = temp;
        }

        return nums;
    }

    public int[] post4(int[] nums) {
        int count = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                count = i;
                break;
            }
        }
        if (count == -1 || count == nums.length - 1) return new int[]{};
        else {
            int[] nums2 = new int[nums.length - count - 1];
            for (int i = 0; i < nums2.length; i++) {
                nums2[i] = nums[count + i + 1];
            }
            return nums2;
        }
    }

    public int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) nums[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count++;
            else if (nums[i] != 0) {
                nums[i - count] = nums[i];
                if (count > 0) {
                    //count = 0;
                    /*for (int j = 0; j < count; j++) {
                        nums[i-j] = 0;
                        count++;
                    }*/
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] nums = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) nums[i - start] = "FizzBuzz";
            else if (i % 3 == 0) nums[i - start] = "Fizz";
            else if (i % 5 == 0) nums[i - start] = "Buzz";
            else nums[i - start] = String.valueOf(i);
        }
        return nums;
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            else if (nums[i] < min) min = nums[i];
        }
        return max - min;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                while (nums[i] != 7 && i < nums.length - 1) i++;
            } else sum += nums[i];
        }
        return sum;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) sum += 2;
        }
        if (sum == 8) return true;
        else return false;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) return false;
        }
        return true;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums.length >= 2 && (nums[i] == val || nums[i + 1] == val)) continue;
            return false;
        }
        return true;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) return true;
            else if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) return true;
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int numbersThree = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 3 && nums[i + 1] == 3) return false;
                else if (nums[i] == 3) numbersThree++;
            }
            if (nums[nums.length - 1] == 3) numbersThree++;
        }
        if (numbersThree == 3) return true;
        else return false;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) return true;
        }
        return false;
    }

    public int[] tenRun(int[] nums) {
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) temp = nums[i];
            else if (temp != -1) nums[i] = temp;
        }
        return nums;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (i > 0 && i < nums.length - 1 && nums[i - 1] != nums[i] && nums[i + 1] != nums[i])
                    nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
            }
        }
        return nums;
    }

    public int[] zeroMax(int[] nums) {
        int largestOddValue = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0 && nums[i] > largestOddValue) {
                largestOddValue = nums[i];
            }
            if (nums[i] == 0 && largestOddValue > 0) {
                nums[i] = largestOddValue;
            }
        }
        return nums;
    }

    public int centeredAverage(int[] nums) {
        int maxValue = nums[0];
        int minValue = nums[0];
        int sum = nums[0];
        int numbersQuantity = 1;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            numbersQuantity++;
            if (nums[i] > maxValue) maxValue = nums[i];
            else if (nums[i] < minValue) minValue = nums[i];
        }
        sum = sum - maxValue - minValue;
        numbersQuantity -= 2;
        return sum / numbersQuantity;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

    public boolean more14(int[] nums) {
        int count1s = 0;
        int count4s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count1s++;
            else if (nums[i] == 4) count4s++;
        }
        if (count1s > count4s) return true;
        else return false;
    }

    public String[] fizzArray2(int n) {
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + "";
        }
        return nums;
    }

    public boolean either24(int[] nums) {
        boolean numbers2 = false;
        boolean numbers4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) numbers2 = true;
            else if (nums[i] == 4 && nums[i + 1] == 4) numbers4 = true;
        }
        if (numbers2 && numbers4) return false;
        else if (!numbers2 && !numbers4) return false;
        else return true;
    }

    public boolean has12(int[] nums) {
        boolean has1 = false;
        boolean has2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) has1 = true;
            else if (has1 && nums[i] == 2) has2 = true;
            if (has1 && has2) return true;
        }
        if (has1 && has2) return true;
        else return false;
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length > 1 && nums[0] == 2 && nums[1] != 2) return false;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] != 2 && nums[i - 1] != 2) return false;
        }
        if (nums.length > 1 && nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) return false;
        else if (nums.length == 1 && nums[0] == 2) return false;
        return true;
    }
}

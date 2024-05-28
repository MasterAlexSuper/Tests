public class Task2 {

    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int pointer1 = 0;
        int pointer2 = 1;
        while (pointer1 < nums.length - 1) {
            if (nums[pointer1] == nums[pointer2]) {
                count++;
            }
            pointer2++;
            if (pointer2 == nums.length) {
                pointer1++;
                pointer2 = pointer1 + 1;
            }
        }
        return count;
    }
}

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void test() {
        int[] nums = {1, 1, 1, 1};
        Task2 task2 = new Task2();

        int real = task2.numIdenticalPairs(nums);
        int expected = 6;

        Assert.assertEquals(expected, real);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 4};
        Task2 task2 = new Task2();

        int real = task2.numIdenticalPairs(nums);
        int expected = 0;

        Assert.assertEquals(expected, real);
    }

    @Test
    public void test3() {
        int[] nums = {1, 2, 3, 1};
        Task2 task2 = new Task2();

        int real = task2.numIdenticalPairs(nums);
        int expected = 1;

        Assert.assertEquals(expected, real);

    }
}

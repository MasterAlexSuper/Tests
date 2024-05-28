import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public void test1() {
        String jewels = "aA";
        String stones = "aaaAABBBB";

        Task1 task1 = new Task1();
        int real = task1.numJewelsInStones(jewels, stones);
        int expected = 5;

        Assert.assertEquals(expected, real);
    }

    @Test
    public void test2() {
        String jewels = "a";
        String stones = "AABBBB";

        Task1 task1 = new Task1();
        int real = task1.numJewelsInStones(jewels, stones);
        int expected = 0;
        Assert.assertEquals(expected, real);
    }

    @Test
    public void test3() {
        String jewels = "A";
        String stones = "AA";

        Task1 task1 = new Task1();
        int real = task1.numJewelsInStones(jewels, stones);
        int expected = 2;
        Assert.assertEquals(expected, real);
    }
}

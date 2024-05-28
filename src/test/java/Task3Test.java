import org.junit.Assert;
import org.junit.Test;

public class Task3Test {
    @Test
    public void test() {
        String text = "nlaebolko";
        Task3 task3 = new Task3();

        int real = task3.maxNumberOfBalloons(text);
        int expected = 1;
        Assert.assertEquals(expected, real);
    }

    @Test
    public void test2() {
        String text = "loonbalxballpoon";
        Task3 task3 = new Task3();

        int real = task3.maxNumberOfBalloons(text);
        int expected = 2;

        Assert.assertEquals(expected, real);
    }

    @Test
    public void test3() {
        String text = "hello";
        Task3 task3 = new Task3();

        int real = task3.maxNumberOfBalloons(text);
        int expected = 0;

        Assert.assertEquals(expected, real);
    }
}

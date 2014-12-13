import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Florian on 13.12.14.
 */
public class mainTest {
    @Test
    public void testSayHello() throws Exception {
        Assert.assertEquals("Hello World", new main().sayHello());
    }
}

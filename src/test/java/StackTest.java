import oop.Stack;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StackTest {
    Stack stack;

    @BeforeTest
    public void setup(){
        stack = new Stack();
    }

    @Test
    public void testLastElemInStack(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        Assert.assertEquals(stack.pop(),30);
    }
}

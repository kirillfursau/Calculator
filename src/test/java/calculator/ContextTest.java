package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void run() throws Exception {
        Context context = new Context();
        assertEquals(0, context.run("C="));
        assertEquals(5, context.run("C2+3="));
        assertEquals(2, context.run("C2"));
        assertEquals(25, context.run("C25"));
        assertEquals(257452, context.run("C257452"));
        assertEquals(777, context.run("C123+654="));
        assertEquals(8, context.run("C2+2*2="));
        assertEquals(100, context.run("C125-25="));
        assertEquals(20, context.run("C100/5="));
        assertEquals(1, context.run("C9/5="));
    }
}
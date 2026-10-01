import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class ArrayStackTest {

    @Test
    public void testPushOneItem() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        assertEquals(1, stack.size());
    }

    @Test
    public void testPushTwoItem() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        assertEquals(2, stack.size());
    }

    @Test
    public void testPushThreeItem() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        assertEquals(3, stack.size());
    }

    @Test
    public void testPopOneItem() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        Object value = stack.pop();
        assertEquals("A", value);
    }

    @Test
    public void testPopOneMultiStack() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        Object value = stack.pop();

        assertEquals("C", value);
        assertEquals(2, stack.size());
    }

    @Test
    public void testPopTwoItem() {

        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        Object value = stack.pop();

        assertEquals("C", value);
        assertEquals(2, stack.size());

        Object value2 = stack.pop();
        assertEquals("B", value2);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmptyStack() {
        ArrayStack stack = new ArrayStack();

        assertThrows(NoSuchElementException.class, () -> stack.pop());
    }

    @Test
    public void testPeekOneItem() {

        ArrayStack stack = new ArrayStack();

        stack.push("A");

        Object value = stack.peek();

        assertEquals("A", value);
    }

    @Test
    public void testPeekTwoItem() {

        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");

        Object value = stack.peek();

        assertEquals("B", value);
    }

    @Test
    public void testPeekThreeItem() {

        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        Object value = stack.peek();

        assertEquals("C", value);
    }

    @Test
    public void testPeekEmptyStack() {
        ArrayStack stack = new ArrayStack();

        assertThrows(NoSuchElementException.class, () -> stack.peek());
    }

    @Test
    public void testIsEmptyNewStack() {
        ArrayStack stack = new ArrayStack();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyAfterPush() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");

        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsEmptyAfterPop() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSizeEmpty() {
        ArrayStack stack = new ArrayStack();

        assertEquals(0, stack.size());
    }

    @Test
    public void testSizeAfterPush() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals(3, stack.size());
    }

    @Test
    public void testSizeAfterPop() {
        ArrayStack stack = new ArrayStack();

        stack.push("A");
        stack.push("B");
        stack.pop();

        assertEquals(1, stack.size());
    }
}

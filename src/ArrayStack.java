import java.util.NoSuchElementException;

public class ArrayStack {
    // using Object allows the stack to hold different kinds of objects
    private Object[] items;
    private int size;

    public ArrayStack() {
        items = new Object[10];
        size = 0;
    }
    // push method
    // Purpose: this method will take a value and place the value to the top of a stack
    // this will not return anything
    // Example: pushing 2 -> stack: 2

    public void push(Object value) {
        // check whether the array is full, if so, double the array size
        if (size == items.length) {
            // create new array with the size double
            Object[] newItems = new Object[items.length * 2];

            // copy old array into new
            for (int i = 0; i < size; i++) {
                newItems[i] = items[i];
            }
            // replace the old array with the new array
            items = newItems;
        }
        // new value at the next position
        items[size] = value;
        // increase the size
        size++;

    }

    // pop method
    // Purpose: this method takes no arguments and removes the item at the top of the stack,
    // if the stack is empty, this method should throw an NoSuchElementException
    // Example: pop 2 (Stack: 2) -> stack: empty

    public Object pop() {

        // check for empty array first
        if (size == 0) {
            throw new NoSuchElementException();
        }

        Object value = items[size - 1];
        size--;

        return value;
    }
    // peek method
    // Purpose: this method takes no arguments and return the item at the top of the stack
    // if the stack is empty this method should throw an NoSuchElementException
    // Example: peek 2 (stack: 2) -> 2

    public Object peek() {

        // check for empty array first
        if (size == 0) {
            throw new NoSuchElementException();
        }

        return items[size - 1];
    }

    // isEmpty method
    // Purpose: this method takes no arguments and return a boolean if the stack is empty or not
    // Example: stack: 2 -> true

    public boolean isEmpty() {
        return size == 0;
    }
    // size method
    // Purpose: this method takes no argument and return the number of item in the stack
    // Example: stack (2, 3, 4) -> 3

    public int size() {
        return size;
    }
}

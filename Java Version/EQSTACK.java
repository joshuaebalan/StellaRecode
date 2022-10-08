public class EQSTACK {
    private Object[] STACK;
    private int front;
    public EQSTACK() {
        STACK = new Object[8];
        front = 0;
    }
    public void PUSH(Object o) {
        STACK[front] = o;
        front++;
        size++;
        if (size == STACK.length - 1) {
            Object[] STACK2 = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                STACK2[i] = STACK[i];
            }
            STACK = STACK2;
        }
    }

    public Object peek() {
        return STACK[front];
    }

    public Object pop() {
        Object returner = STACK[front];
        STACK[front] = null;
        front--;
        size--;
        if (size < STACK.length / 4) {
            Object[] STACK2 = new Object[size / 2];
            for (int i = 0; i < size; i++) {
               STACK2[i] = STACK[i];
            }
            STACK = STACK2;
        }
        return returner;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
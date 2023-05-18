public class Queue implements DataStructure {
    // Fields
    Object[] objects;

    int nextPut;
    int nextGet;
    int count;

    public Queue() {
        objects = new Object[100];
        nextPut = 0;
        nextGet = 0;
        count = 0;
    }

    // Methods
    synchronized public boolean put(Object obj) {
        if (count < 100) {
            objects[nextPut] = obj;
            count = count + 1;
            if (nextPut < 99) {
                nextPut = nextPut + 1;
            } else {
                nextPut = 0;
            }
            return true;
        } else {
            return false;
        }
    }
    synchronized public Object get() {
        if (count > 0) {
            Object gottenObject = objects[nextGet];
            count = count - 1;
            if (nextGet < 99) {
                nextGet = nextGet + 1;
            } else {
                nextGet = 0;
            }
            return gottenObject;
        }
        return null;
    }

    public String toString() {
        String description = "Count:" + count + " nextPut:" + nextPut + " nextGet:" + nextGet + "[";
        for (int i = 0; i < 100; i = i + 1) {
            description = description + objects[i] + ", ";
        }
        return description;
    }
}

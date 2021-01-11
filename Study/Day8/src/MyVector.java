import java.util.Arrays;

public class MyVector {
    Object[] objArr;
    int size;
    int capacity;

    public MyVector() {
        this(10);
    }

    public MyVector(int capacity) {
        this.capacity = capacity;
        objArr = new Object[capacity];
    }

    int size() {
        return size;
    }

    int capacity() {
        return capacity();
    }

    boolean isEmpty() {
        return size == 0;
    }

    void clear() {
        for(int i=0; i<size - 1; i++) {
            objArr[i] = null;
        }
    }

    Object get(int index) {
        return objArr[index];
    }

    int indexOf(Object obj) {
        for(int i=0; i<size -1; i++) {
            if(objArr[i] == obj){
                return i;
            }
        }
        return -1;
    }

    void setCapacity(int capacity) {
        if(this.capacity < capacity) {
            this.capacity = capacity;
            Object[] tmpArr = new Object[capacity];
            tmpArr = Arrays.copyOf(objArr, size);
        }
    }

    void ensureCapacity(int minCapacity) {
        if(size < minCapacity) {
            setCapacity(minCapacity);
        }
    }

    boolean add(Object obj) {
        ensureCapacity(size + 1);
        objArr[size++] = obj;
        return true;
    }

    Object remove(int index) {
        if(index < 0 || index >=size) {
            return null;
        }
        Object removedData = objArr[index];
        System.arraycopy(objArr, index + 1 , objArr, index, size - index - 1);
        objArr[size - 1] = null;
        size--;
        return removedData;
    }
}
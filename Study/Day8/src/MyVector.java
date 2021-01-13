import java.util.Arrays;

public class MyVector {
    Object[] objArr = new Object[0]; // 초기화를 안해주면 null이 들어가는데 이러면 예외가 날 확률이 생기므로 0개짜리 배열로 선언해준다.
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
        final int SIZE = size();
        int index = -1;
        for (int i = 0; i < SIZE; i++) {
            if(objArr[i]==obj || objArr[i].equals(obj)) {
                index = i;
            }
        }
        return index;
    }


    void setCapacity(int capacity) {
        if(this.capacity < capacity) {
            this.capacity = capacity;
            Object[] tmpArr = new Object[capacity * 2];
            tmpArr = Arrays.copyOf(objArr, size);
            objArr = tmpArr;
        }
    }

    void ensureCapacity(int minCapacity) {
        if(capacity < minCapacity) {
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
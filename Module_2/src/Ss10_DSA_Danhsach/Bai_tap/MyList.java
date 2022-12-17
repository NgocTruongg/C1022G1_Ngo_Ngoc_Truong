package Ss10_DSA_Danhsach.Bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    //     Sức chứa mặc định khi khởi tạo bằng contructor k có tham số:
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //      Phương thức contructor với sức chứa được truyền vào:
    public MyList(int capacity) throws IllegalAccessException {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalAccessException("Capacity: " + capacity);
        }
    }

    //    Phương thức trả về số lượng phần tử
    public int size() {
        return this.size;
    }

    //    phương thức xóa mảng
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //    phương thức add 1 phần tử vào MyList:
    public void add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = e;
        size++;
    }

    //      Phương thức thêm 1 phần tử vào vị trí index:
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //    Phương thức tăng kích thước MyList:
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IndexOutOfBoundsException("minCapacity " + minCapacity);
        }
    }

    //    Phương thức lấy 1 phần tử tại vị trí index:
    public E get(int index) {
        return (E) elements[index];
    }

    //    Phương thức lấy phần tử index của 1 phần tử
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //    Phương thức kiểm tra phần tử có trong mảng hay không
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //    Phương thức tạo ra 1 bản sao MyList hiện tại:
    public MyList<E> clone() {
        MyList<E> arr = new MyList<>();
        arr.elements = Arrays.copyOf(this.elements, this.size);
        arr.size = this.size;
        return arr;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}

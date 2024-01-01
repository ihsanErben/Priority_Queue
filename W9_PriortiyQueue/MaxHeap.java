package W9_PriortiyQueue;

public class MaxHeap {

    int[] heap;
    int size = 0;
    int capacity;

    public MaxHeap(int x) {
        capacity = x;
        heap = new int[capacity];
    }

    public void insert(int data) {
        heap[++size] = data;
        swim(size);
    }

    public int delMax() {
        int max = heap[1];
        swap(1, size);
        size--;
        sink(1);
        return max;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("-- empty --");
            return;
        }
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + ", ");
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public void swim(int k) {                               // çocuk annesinden büyükse yer değiştirir
        while (k > 1 && heap[k] > heap[k / 2]) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    public void sink(int k) {         // anne herhangi bir çocuğundan küçükse yer değiştirir.
        while (2 * k <= size) {

            if (heap[k] > heap[2 * k] && heap[k] > heap[2 * k + 1]) {
                break;
            }

            if (heap[2 * k] > heap[2 * k + 1]) {
                swap(k, 2 * k);
                k = 2 * k;
            } else {
                swap(k, 2 * k + 1);
                k = 2 * k + 1;
            }

        }
    }

    public void swap(int a, int b) {
        int tmp = heap[a];
        heap[a] = heap[b];
        heap[b] = tmp;
    }

    public int smallest(int[] x) {
        int small = Integer.MAX_VALUE;
        for (int i = 1; i < x.length; i++) {
            if (small > x[i]) {
                if (x[i] != 0) {
                    small = x[i];
                }
            }
        }
        return small;
    }

    public void printLargerThanX(int[] x, int y) {
        for (int i = 1; i < x.length; i++) {
            if (x[i] > y) {
                System.out.println("bu --> " + x[i]);
            }
        }
        System.out.println("");
    }

}

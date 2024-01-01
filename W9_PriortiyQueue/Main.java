package W9_PriortiyQueue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("array capacity: ");
        int capacity = input.nextInt();
        MaxHeap x = new MaxHeap(capacity);
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("1 - add");
            System.out.println("2 - delete max");
            System.out.println("4 - print");
            System.out.println("99 - smallest");
            System.out.println("999 - larger than x");
            System.out.println("0 - exit");
            System.out.print("secim :");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    int data = input.nextInt();
                    x.insert(data);
                    System.out.println("smalllllllllllllest: " + x.smallest(x.heap));
                    x.print();
                    break;
                case 2:
                    x.delMax();
                    x.print();
                    break;
                case 4:
                    x.print();
                    break;
                case 99:
                    System.out.println("smalllllllllllllest: " + x.smallest(x.heap));
                    break;
                case 999:
                    x.printLargerThanX(x.heap, 7);
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("-------------------");
        }
    }
}

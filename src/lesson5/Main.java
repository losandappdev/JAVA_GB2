package lesson5;

import com.sun.rowset.FilteredRowSetImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        firstArray();
        secondArray();
    }


    /**
     * Выполненние вычисление в один поток
     */
    public static void firstArray() {
        final int size = 10000000;
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();
        System.out.println(" Время выполнения в один поток " + (System.currentTimeMillis() - a));
    }

    /**
     * Выполненние вычисление в два потока
     */
    public static void secondArray() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        long b = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        long x = System.currentTimeMillis();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        long y = System.currentTimeMillis();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long z = System.currentTimeMillis();

        long c = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long d = System.currentTimeMillis();


        System.currentTimeMillis();
//        long t = (b - a) + (y - x) + (z - y) + (d - c);
//        System.out.println(" Время выполнения в два потока \n(время разбивки массива на 2, просчета каждого из двух массивов и склейки.) " + t);
        System.out.println(" Время выполнения в два потока 2 без " +  (z - x));


        System.out.println(" Время выполнения в два потока " + (d - a));
    }

//    public static void nArray(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество потоков до 6 : ");
//        int n = scanner.nextInt();
//
//        final int size = 10000000;
//        final int h = size / n;
//        float[] arr = new float[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = 1;
//        }
//
//        for (int i = 0; i < n; i++) {
//            float[] ai = new float[h];
//        }
//
//
//
//        long a = System.currentTimeMillis();
//
//        System.arraycopy(arr, 0, a1, 0, h);
//        System.arraycopy(arr, h, a2, 0, h);
//
//        long b = System.currentTimeMillis();
//
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < h; i++) {
//                a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//            }
//        });
//
//        Thread t2 = new Thread(()->{
//            for (int i = 0; i < h; i++) {
//                a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//            }
//        });
//        long x = System.currentTimeMillis();
//        t1.start();
//        long y = System.currentTimeMillis();
//        t2.start();
//        long z = System.currentTimeMillis();
//
//        long c = System.currentTimeMillis();
//        System.arraycopy(a1, 0, arr, 0, h);
//        System.arraycopy(a2, 0, arr, h, h);
//        long d = System.currentTimeMillis();
//
////        for (int i = 0; i < h; i++) {
////            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
////        }
//
//        System.currentTimeMillis();
//        System.out.println(" Время выполнения в два потока \n(время разбивки массива на 2, просчета каждого из двух массивов и склейки.) " + (b - a) + (y-x) + (z-y) + (d-c));
//        System.out.println(" Время выполнения в два потока " + (System.currentTimeMillis() - a));
//    }

}
//class NewArray{
//    /**
//     * Создание и заполнение массива
//     */
//    public float[] arr(int size) {
//        float[] arr = new float[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = 1;
//        }
//
//        return arr;
//    }
//}

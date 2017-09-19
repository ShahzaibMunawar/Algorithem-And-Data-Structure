/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author mshah
 */
public class Insertion {

    public static void main(String args[]) {
        sort insertion = new sort();
        int a[] = {5, 4, 3, 2, 1};
        long t1, t2; // to measure time
        System.out.println("Before");
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c] + ",");
        }
//        for insertion
//        t1 = System.nanoTime();
//        insertion.InsertionSort(a);
//        t2 = System.nanoTime();
//        ============
//        for bubble
//        ===========
//        t1 = System.nanoTime();
//        insertion.BubbleSort(a);
//        t2 = System.nanoTime();
//        ============

//for sELECTION
//        ===========
        t1 = System.nanoTime();
        insertion.SelectionSort(a);
        t2 = System.nanoTime();
//        ============
        long d = t2 - t1;
        System.out.print("\n duration in nano seconds " + d);

    }
}

class sort {

    public void InsertionSort(int a[]) {
        int n = a.length;
        int i, j;
        int key;
        for (i = 1; i < n; i++) {
            key = a[i];
            j = i - 1;
            while (key < a[j]) {

                a[j + 1] = a[j];
                j--;
                if (j < 0) {
                    break;
                }

            }
            a[j + 1] = key;

        }
        System.out.println("\nAfter");
        for (int c = 0; c < n; c++) {
            System.out.print(a[c] + ",");
        }
    }

    public void BubbleSort(int a[]) {
        int n = a.length;
        int i, j;
        int temp;
        for (i = 0; i < n - 1; i++) {

            for (j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        System.out.println("\nAfter");
        for (int c = 0; c < n; c++) {
            System.out.print(a[c] + ",");
        }
    }

    public void SelectionSort(int a[]) {
        int n = a.length;
        int i, j;
        int k;
        for (i = 0; i < n - 1; i++) {
            k = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;

        }
        System.out.println("\nAfter");
        for (int c = 0; c < n; c++) {
            System.out.print(a[c] + ",");
        }
    }

}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int []array=new int[10];
        getArray(array);
        getArray2(array);
        getArrayJupSan(array);
        System.out.println();

        System.out.println();

        }



    static int[] getArray(int a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        return a;



    }

    static int [] getArrayTakSan(int b[]) {
        System.out.print("\nТак сандар: ");
        for (int i = 0; i < b.length; i++) {
            if (b[i]%2==1) {
                System.out.print(b[i]+",");
            }
        }
        return b;
    }

    static int[] getArray2(int c[]) {
        getArrayTakSan(c);
        return c;
    }
    static int [] getArrayJupSan(int d[]) {
        System.out.print("\nЖуп сан: ");
        for (int i = 0; i < d.length; i++) {
            if (d[i]%2==0) {
                System.out.print(d[i]+",");
            }
        }
        return d;
    }
    }

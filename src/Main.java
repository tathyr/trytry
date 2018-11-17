package com.pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Phone myppp = new Phone();
        System.out.println(myppp.brand);
        System.out.println(myppp.price);
        myppp.brand="apple";
        System.out.println(myppp.brand);
        System.out.println(myppp.brand);
        myppp.call("jobs");*/
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字a");
        int a = sc.nextInt();
        System.out.println("输入数字b");
        int b = sc.nextInt();
        System.out.println("输入数字c");
        int c = sc.nextInt();
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("max is: " + max);
    }
}

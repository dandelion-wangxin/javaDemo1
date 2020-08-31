package com.dandelion.unitone;

import org.junit.Test;

import java.util.Scanner;

/**
 * this is my first programming problem:
 *
 * print out "programming in java is fun!" at console
 */
public class Println001 {

    /**
     * program main entry
     * @param args accept parameters
     */
    public static void main(String[] args) {
        //print out "programming in java is fun!" at console
        System.out.println("programming in java is fun!");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("i=" + i);

    }

    /**
     * 在控制台打印指定的网格
     */
    @Test
    public void printGridding() {
        //将需要打印的的图形先设置好
        String a = "+---+---+";
        String b = "|||";
        String c = "*/";

        /**
         * 循环遍历五次，在指定的行数上面打印出指定的图形
         */
        for (int i = 0; i < 5; i++) {
            //在第一行和第四行打印a的图形
            if (i == 0 || i == 3) {
                System.out.println(a);
            } else if (i == 2 || i == 1) {
                //在第3行和第2行打印b的图形
                System.out.println(b);
            } else {
                //否则就打印c的图形
                System.out.println(c);
            }
        }

        System.out.println("-------------------使用第二种情况打印---------------");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(a);
                    break;
                case 1:
                case 2:
                    System.out.println(b);
                    break;
                case 3:
                    System.out.println(a);
                    break;
                case 4:
                    System.out.println(c);
                    break;
            }
        }

    }

    /**
     * 求两个数的和
     */
    @Test
    public void sum() {
        //需要执行几次操作
        int count = 0;
        //接收两个求和参数
        int a, b;
        //和值
        int sum = 0;
        //创建扫描器，用于接收控制台输入的参数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要操作几次:");
        count = scanner.nextInt();
        for (int i = 0; i < count; i ++) {
            System.out.println("请输入第一个和值：");
            a = scanner.nextInt();
            System.out.println("请输入第二个和值");
            b = scanner.nextInt();
            sum = a + b;
            System.out.println(a + "+" + b + "=" + sum);
        }


    }
}

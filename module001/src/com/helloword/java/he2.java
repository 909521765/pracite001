package com.helloword.java;

/**
 * @author admin
 * @date 2020-04-22-16:02
 */
public class he2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = " + args);
        int[]a = new int[]{1,2,3,};
        for (int i = 0; i <a.length ; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}

package com.hspedu.pkg;

import java.util.Arrays;
import  java.util.Scanner;//只导入scanner包
//import  java.util.*; // 导入java.util包下全部


public class import01 {
    public static void main(String[] args) {
        int[] arr = {1,34,5,7,3,22};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

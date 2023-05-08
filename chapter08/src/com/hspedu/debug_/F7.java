package com.hspedu.debug_;

import java.util.Arrays;

public class F7 {
    public static void main(String[] args) {
//        设置 file/setting/build/debugger/stepping/取消勾选java.* javax.*
        int[] arr = {1,4,2,55,2,8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

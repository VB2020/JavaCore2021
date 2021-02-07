package com.VB2020.chapter20;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt")){
            byte[] arr =  new byte[fileInputStream.available()];
            fileInputStream.read(arr);
            System.out.println(new String(arr, 0 , 4));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
            int arr2 = byteArrayInputStream.read();
            byteArrayInputStream.reset();
            int arr3 = byteArrayInputStream.read();
            /*
            for (byte k: arr3
                 ) {
                System.out.print(((char) k));
            }

             */
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}

package com.green.day09.ch13;

public class MyArrays {

    public static String toString(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        int lastIdx = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if(i == lastIdx){
                break;
            }
            sb.append(", ");
        }

        return sb.append("]").toString();
    }

    public static String toString2(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i != 0){
                sb.append(", ");
            }
            sb.append(arr[i]);
        }

        return "[" + sb + "]";
    }

    public static String toString3(int[] arr){
        if(arr.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for(int i = 1; i < arr.length; i++){
            sb.append(", ");
            sb.append(arr[i]);
        }
        return sb.append("]").toString();
    }

//
//    public static int[] copyOf(int[] arr){
//        int[] arr2 = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            arr2[i] = arr[i];
//        }
//
//        return arr2;
//    }

    public static int[] copyOf(int[] arr , int length){
        int[] arr2 = new int[length];
        for(int i = 0; i < length; i++){
            arr2[i] = arr[i];
        }

        return arr2;
    }

    public static int[] copyOf(int[] arr){
        return copyOf(arr, arr.length);
    }
}

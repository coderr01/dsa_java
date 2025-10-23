package org.example.recursion.level_0;

public class PrintName {

    public static void recursionExample(){
        String name = "ABC";
        recursion(name, 0, 5);
    }

    public static void recursion(String name, int index, int count){
        // Print name 5 times
        if (index == count) return ;
        System.out.println(name);
        recursion(name, index + 1, count);
    }

    public static void backTrackExample(){
        String name = "ABC";
        backTrack(name, 5);
    }

    public static void backTrack(String name, int count){
        if (count == 0) return ;
        backTrack(name, --count);
        System.out.println(name);
    }

    public static void run(){
        //recursionExample();
        backTrackExample();
    }

}

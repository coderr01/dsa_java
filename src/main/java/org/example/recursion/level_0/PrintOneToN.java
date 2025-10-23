package org.example.recursion.level_0;

public class PrintOneToN implements BaseRecursion{

    public static void recursionExample(){
        int N = 4;
        recursion(1, N);
    }

    public static void recursion(int start, int end){
        if (start > end) return ;
        System.out.println(start);
        recursion(++start, end);
    }

    public static void backTrackExample(){
        int N = 4;
        backTrack(N);
    }

    public static void backTrack(int end){
        if (end == 0) return ;
        backTrack(end - 1);
        System.out.println(end);
    }

    public static void run(){
        //recursionExample();
        backTrackExample();
    }
}

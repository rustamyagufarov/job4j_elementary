package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int temp = max(a, b);
        return c > temp ? c : temp;
    }

    public static int max(int a, int b, int c, int d) {
        int temp = max(a, b, c);
        return d > temp ? d : temp;
    }
}

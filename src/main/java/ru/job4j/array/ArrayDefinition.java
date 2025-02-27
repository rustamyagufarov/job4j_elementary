package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Alexey Esipov";
        names[2] = "Andrei Hincu";
        names[3] = "Stas Korobeinikov";

        for (byte i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}

package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение и программа выдаст самое длинное слово: ");
        String str =in.nextLine();
    Word word = new Word(str);
    word.MaxxWard();
    }
}
class Word {
String str;
    public Word(String str){
this.str = str;
    }
    public void MaxxWard() {
        int simfol = 0;
        String maxWard = "";
        String[] words = str.split(" ");
        for (String word : words) {
            int chislo = word.length();
            if (chislo > simfol) {
                simfol = chislo;
                maxWard = word;
            }
        }
        System.out.println("Самое длинное слово: " + maxWard);
    }
}

package com.wipro.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exercise_2 {
	public static void main(String[] args) {
        List<String> names = new CopyOnWriteArrayList<>(
            Arrays.asList("Amit","Jayanta","chaitanya","Rahul","Ishita","VANU"));
        Runnable capitalVowels = () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if (startsWithVowel(name)) {
                    names.set(i, name.toUpperCase());
                }
            }
        };


        Runnable lowercaseConsonants = () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if (!startsWithVowel(name)) {
                    names.set(i, name.toLowerCase());
                }
            }
        };

        Thread t1 = new Thread(capitalVowels);
        Thread t2 = new Thread(lowercaseConsonants);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        System.out.println("Final List is:");
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static boolean startsWithVowel(String name) {
        char ch = Character.toLowerCase(name.charAt(0));
        return "aeiou".indexOf(ch) != -1;
    }
}

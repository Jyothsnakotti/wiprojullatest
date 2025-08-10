package com.wipro.basic;

public class Exercise_22 {

	public static void main(String[] args) {
		String str = "name vanukuri chaitanya from kallam";
        String[] s = str.split(" ");
        String shortWord = s[0];

        for (String word : s) {
            if (word.length() < shortWord.length()) {
                shortWord = word;
            }
        }

        System.out.println("Shortest word: " + shortWord);
	}

}

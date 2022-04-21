package com.qa.stringmanipulation;

public class StringTask2 {

	public static void main(String[] args) {
		System.out.println(countWord("hi this is a sentence"));
		splitSentence("this is a task gave me a headache");

	}

	public static int countWord(String string) {

		int spaces = 1;

		for (int i = 0; i < string.length(); i++)

			if (string.substring(i, i + 1).equals(" ")) {
				spaces++;
			}

		return spaces;
	}

	public static void splitSentence(String string) {

		int beginning = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.substring(i, i + 1).equals(" ") || i == string.length() - 1) {
				System.out.println(string.substring(beginning, i + 1));
				beginning = i;
			}
		}

	}
}

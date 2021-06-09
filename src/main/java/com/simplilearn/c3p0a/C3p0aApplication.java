package com.simplilearn.c3p0a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C3p0aApplication {

	public static void main(String[] args) {
		SpringApplication.run(C3p0aApplication.class, args);
	}

	/**
	 * Return the number of words in the given string.
	 * @param string
	 * @return The number of words in the string, where words are delineated by a space, comma, or period.
	 */
	public int getWordCount(String string) {
		String words[] = string.toLowerCase().split("([,.\\s]+)");
		return words.length;
	}
}

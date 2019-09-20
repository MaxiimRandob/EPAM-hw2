package com.hw2;

import static org.apache.commons.lang3.ArrayUtils.add;

public class Main
{
	public static void main(String[] argv)
	{
		String[] phrase = {"Hello"};
		phrase = add(phrase, ", ");
		phrase = add(phrase, "world!");
		for (String word : phrase)
		{
			System.out.print(word);
		}
		System.out.println();
	}
}

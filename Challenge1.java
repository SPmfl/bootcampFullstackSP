package minireto1;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {
	/**
	 * Enum "Types" has two values "Type A" or "Type B".
	 * @param type
	 * 			String value
	 * */
	public enum Types{
		TYPEA("Type A"),
		TYPEB("Type B");
		final String type;
		Types(String type) {this.type = type;}
	}
	
	/**
     * Returns a generated random number of length 10. Starting with 54 if its Type A
     * or 08 if its Type B otherwise will just be random numbers.
     *
     * @param  types
     *         The String to compare against enum Types
     *
     * @return  String of length 10 containing random numbers
     */
	public String getRandomNumber(String types) {
		String number = "";
		if(Types.TYPEA.type.equals(types)) {
			number = "54";
			number += this.generate(8);
			return number;
		}
		if(Types.TYPEB.type.equals(types)) {
			number = "08";
			number += this.generate(8);
			return number;
		}
		return number += this.generate(10);
	}
	/**
	 * Generate a random number of length "len".
	 * @param len
	 * 			integer number that determines the length of whole number
	 * @return String
	 * 			number of length "len" with random numbers each
	 * */
	private String generate(int len) {
		String num = "";
		for(int i=1; i<=len; i++) {
			num += (int) ((Math.random() * (9 - 0))+0);
		}
		return num;
	}
	
	/** 
	 * Checks if a {@code String} is in a list.
	 * @param value {@code String}
	 * @param data List{@code<String>}
	 * @return boolean
	 * 			{@code false} if {@code String} is in list, 
	 * 	 		{@code true} if {@code String} is not in list
	 * 
	 * */
	public boolean isIn(String value, List<String> data){
		for(String str: data)
			if(str.equalsIgnoreCase(str.toLowerCase())) return false;
		return true;
	}
	
	
	public static void main(String[] args) {
		Challenge1 ch1 = new Challenge1();
		System.out.println("Random Numbers: ");
		System.out.println(ch1.getRandomNumber("Type A"));
		System.out.println(ch1.getRandomNumber("Type B"));
		System.out.println(ch1.getRandomNumber("Type C"));
		
		List<String> l1 = new ArrayList<String>();
		l1.add("val1");
		l1.add("val2");
		l1.add("val3");
		l1.add("val4");
		
		String value = "val3";
		System.out.println("\nvalue: "+value);
		System.out.println("list: "+l1);
		System.out.println("result: "+ch1.isIn(value, l1));
	}
	
}

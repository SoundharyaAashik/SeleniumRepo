package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String str = "Soundharya";
		String str1 = "Soundharya";
		String str2 = "soundharya";
		
		//Using Instantiation
		String name = new String("Soundharya");
		String name1 = new String("Soundharya");
		String name2 = new String("soundharya");
		
		//2 methods to check the string values
		//.equals compare the values of 2 strings
		//== - compare the references address of 2 strings
		
		//.equals
		System.out.println(str.equals(str1));
		//==
		System.out.println(str==str1);
		//.equals
		System.out.println(str.equals(str2));
		//== (Compares the reference address, as the string stores in new memory, it return false)
		System.out.println(str==str2);
		//.equals
		System.out.println(name.equals(name1));
		//==
		System.out.println(name==name1);
		//.equals
		System.out.println(name.equals(name2));
		//==
		System.out.println(name==name2);
		//Compare Literal and Instantiation
		System.out.println("Literal:"+(str==name));
		//Compare Literal and Instantiation
		System.out.println("Literal:"+(str.equals(name)));
		
		String batchName = "SelFebandMarch";
		int lengthofString = batchName.length();
		System.out.println("Length is: "+lengthofString);
		
		//contains->compares the partial value
		System.out.println(batchName.contains("Sel"));
		//To uppercase
		System.out.println(batchName.toUpperCase());
		
		String batch = "SeleniumJava";
		//charAt - index
		System.out.println(batch.charAt(1));
		//toCharArray
		System.out.println(batch.toCharArray());  //SeleniumJava = {'S','e','l','e','n','i','u','m','J','a','v','a'}
		char[] characters = batch.toCharArray();
		System.out.println(characters[0]);
		
		//substring - to crop a string into its lower format
		String names = "Selenium";
		System.out.println(names.substring(3)); //takes the value from 3 --> prints enium
		System.out.println(names.substring(3, 5));//takes the value from 3 but will not include 5
		
		//split --> convert 1 string to multiple string
		String batches = "Sel Jan Feb"; //{"Sel","Jan","and","Feb"}
		String[] splittheString = batches.split(" ");
		System.out.println(splittheString[1]);
		String[] splittheStrings = batches.split("a");
		System.out.println(splittheStrings[1]); //need to check this
		
		//replaceAll
		String price = "42,210$";
		System.out.println(price.replaceAll(",", ""));
		String originalPrice = price.replaceAll("[^0-9]", "");
		System.out.println("Replaced string is: "+originalPrice);
		String originalPrice1 = price.replaceAll("[0-9]", "");
		System.out.println("Replaced string is: "+originalPrice1);
		String price1 = "42,210Rupees";
		String originalPrice2 = price1.replaceAll("[A-Za-z]", "");
		System.out.println("Replaced string is: "+originalPrice2);
		
		//Add 2000 to orginalprice
		System.out.println(originalPrice2+2000);
		
		//convert String to Integer
		String prices = "4000";
		int priceinNumber = Integer.parseInt(prices);
		System.out.println(priceinNumber+200);
		
	}

}

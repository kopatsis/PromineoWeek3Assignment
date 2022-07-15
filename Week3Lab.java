
public class Week3Lab {
	
    public static int[] addAnotherSpace(int[] arr) {
    //This method takes an array and returns an array with the same contents and one more space
    	int[] newarr = new int[arr.length + 1];
    	//Creates another array one space larger
    	for(int i = 0; i < arr.length; i++) {
    		newarr[i] = arr[i];
    	}
    	//Loop copies each value from initial array to new array
    	return newarr; 
    	//Returns new array with one extra empty space, can replace initial array
    }
    
    public static String wordMultiplier(String word, int n) {
    	String newWord = "";
    	for(int i = 0; i < n; i++) {
    		newWord += word;
    	}
    	return newWord;
    }
    //Concatenates word n times without a space
    
    public static String fullName(String firstName, String lastName) {
    	return firstName + " " + lastName;
    }
    //Concatenates firstName and lastName with a space
    
    public static boolean moreThanHundred(int[] intArray) {
    	int sumOfArray = 0;
    	for(int numbers : intArray) {
    		sumOfArray += numbers;
    	}
    	return (sumOfArray > 100);
    }
    //Returns true if the sum of elements in a given int array is more than 100
    
    public static double doubleAverage(double[] doubleArray) {
    	double arraySum = 0;
    	for(double numbers : doubleArray) {
    		arraySum += numbers;
    	}
    	return arraySum / doubleArray.length;
    }
    //Finds average of elements in a double array
    
    public static boolean arrayComparison(double[] array1, double[] array2) {
    	double average1 = doubleAverage(array1);
    	double average2 = doubleAverage(array2);
    	return (average1 > average2);
    }
    //Utilizing previous method, returns true if the average of first array is more than that of second array
    
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	return (isHotOutside && moneyInPocket > 10.5);
    }
    //returns true if isHotOutside is true and moneyInPocket is more than 10.5
    
    public static String[] stringAdd(String[] initArray, String extraWord) {
    //This method takes an already initialized string array full of values and adds another word to a newly created space
    	String[] newArray = new String[initArray.length + 1];
    	for (int i = 0; i < initArray.length; i++) {
    		newArray[i] = initArray[i];
    	}
    	newArray[newArray.length - 1] = extraWord;
    	return newArray;
    	//By setting the string used as initArray equal to this, it adds a word onto a string, which would not be 
    	//possible previously if all spaces were taken up already
    }

		
	public static void main (String[] args) {
		
		//Code block below follows requirements of Step #1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println("Last minus first: " + (ages[ages.length - 1] - ages[1]));
		ages = addAnotherSpace(ages);
		ages[8] = 42;
		//Accomplishing instructions by using new method
		System.out.println("Last minus first: " + (ages[ages.length - 1] - ages[1]));
		double ageTotal = 0;
		for(int age : ages) {
			ageTotal += age;
		}
		System.out.println("Average age: " + ageTotal / ages.length);
	    //Enhanced for loop practice above
		//ageTotal is a double bc if it was an int, it would create a rounding error line 86
		
		//Code block below follows requirements of Step #2
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bill";
		//Using the same initialization as the int array doesn't seem to work for strings
		double letterCount = 0;
		for(String name : names) {
			letterCount += name.length();
		}
		System.out.println("Average name length: " + letterCount / names.length);
		//Although not necessary in this case, letterCount is a double to avoid rounding
		String nameConc = "";
		for(String name : names) {
			nameConc += name;
			nameConc += " ";
		}
		System.out.println("Concatenation of all names: " + nameConc);
		//Could be done in the first loop, but kept separate for clarity
		
		//Answer to 3, for array named "arrayName" it is arrayName[arrayName.length - 1];
		//Answer to 4, for array named "arrayName" it is arrayName[0];
		
		//Code block below follows requirements of Step #5
		int[] nameLengths = new int[6];
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Code block below follows requirements of Step #6
		int sumOfLengths = 0;
		int j = 0;
		while (j < nameLengths.length) {
			sumOfLengths += nameLengths[j];
			j++;
		}
		System.out.println("Sum of name lengths: " + sumOfLengths);
		//Using a variety of loops to practice each kind
		
		//Code block below follows requirements of Step #7
		System.out.println("Test of wordMultiplier Method: " + wordMultiplier("math", 4));
		
		//Code block below follows requirements of Step #8
		System.out.println("Test of fullName Method: "+ fullName("Larry", "Page"));
		
		//Code block below follows requirements of Step #9
		int[] intTest = {6, 23, 4, 56, 11, 0 , 1};
		System.out.println("Test of moreThanHundred Method: " + moreThanHundred(intTest));
		
		//Code block below follows requirements of Step #10
		double[] doubleTest = {6.2, 400.23, 64.64, 100.0, 2.0001, 11.0};
		System.out.println("Test of doubleAverage Method: " + doubleAverage(doubleTest));
		
		//Code block below follows requirements of Step #11
		double[] compareArray = {11.2, 2000.1, 2.2, 3.3, 1.1, 4.4, 5.5, 6.6, 7.7, 8.8};
		System.out.println("Test of arrayComparison Method: " + arrayComparison(doubleTest, compareArray));
		
		//Code block below follows requirements of Step #12
		System.out.println("Test of willBuyDrink Method: " + willBuyDrink(true, 12.1));
		
		//Code block below follows requirements of Step #13
		String[] wordString = new String[3];
		wordString[0] = "one";
		wordString[1] = "two";
		wordString[2] = "three";
		wordString = stringAdd(wordString, "four");
		System.out.println("Returns true if stringAdd function works: " + (wordString[wordString.length - 1] == "four"));
		//stringAdd here takes an already full string array, adds another space, and assigns the new word to that space
		//The output confirms this by comparing the final item in this array to the word that was supposed to be added

		
	}

}

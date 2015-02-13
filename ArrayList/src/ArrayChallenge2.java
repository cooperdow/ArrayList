import java.util.ArrayList;
import java.util.Collections;
public class ArrayChallenge2 {
static String shortWord;
	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("Rabbits");
		myArray.add("Red Fox");
		myArray.add("Red Sox");
		myArray.add("Cardinals");
		myArray.add("Colin Brogan");
		myArray.add("Thomas Schwappach");
		myArray.add("Walrus");
		myArray.add("Condor");
		myArray.add("Lion");
		myArray.add("Kanye");
		for (String list: myArray)
			{
			System.out.println(list);
			}
		Collections.sort(myArray);
			{
			System.out.println(myArray);
			}
//		Collections.reverse(myArray);
//			{
//			System.out.println(myArray);
//			}
		System.out.println(myArray.get(0) + " + " + myArray.get(9));
		for (int i=myArray.size()-1; i>=0; i--)
			{
			if (myArray.get(i).substring(0,1).equals("R"))
				{
				myArray.remove(i);
				}	
			}
		System.out.println(myArray);
	String longWord=myArray.get(0);
	shortWord=myArray.get(0);
	for (int i=1; i<myArray.size(); i++)
		{
		if (myArray.get(i).length()<longWord.length())
			{
			longWord=myArray.get(i);
			}
				
		if (myArray.get(i).length()>shortWord.length())
			{
			shortWord=myArray.get(i);
			}
		}
	System.out.println(longWord);
	System.out.println(shortWord);
	}
}


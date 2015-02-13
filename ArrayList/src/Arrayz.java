import java.util.ArrayList;
public class Arrayz {
	static int counter=0;
	static double highTemp,lowTemp;
	public static void main(String[] args) {
		ArrayList<Double> myArray = new ArrayList<Double>();
		myArray.add(101.3);
		myArray.add(102.1);
		myArray.add(104.2);
		myArray.add(100.0);
		myArray.add(98.6);
		myArray.add(98.5);
		myArray.add(97.3);
		myArray.add(98.7);
		myArray.add(98.4);
		myArray.add(96.1);
		for (Double degrees: myArray)
			{
			//System.out.println(degrees + " degrees in Fahrenheit");
			}
		for (int i=0; i<myArray.size(); i++)
			{
			if (myArray.get(i)>98.6)
				{
				counter++;
				System.out.println(myArray.get(i) + " is a fever temperature");
				}
			}
		System.out.println("There are " + counter + " temperatures with a fever");
		for (int i=0; i<myArray.size(); i++)
			{
			System.out.println("Temperatures in Celsius: " + (myArray.get(i)-32)/1.8);
			}
		for (int i=0; i<myArray.size(); i++)
			{
			if (myArray.get(i)<=98.6)
			{
			System.out.println(myArray.get(i) + " is a normal temperature");
			}
		}
		highTemp=myArray.get(0);
		lowTemp=myArray.get(0);
		for (int i=1; i<myArray.size(); i++)
			{
			if (highTemp<myArray.get(i))
				{
				highTemp=myArray.get(i);
				}
					
			if (lowTemp>myArray.get(i))
				{
				lowTemp=myArray.get(i);
				}
			}
		System.out.println(highTemp + " is the highest temperature");
		System.out.println(lowTemp + " is the lowest temperature");
		}		
	}

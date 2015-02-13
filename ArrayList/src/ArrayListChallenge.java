import java.util.ArrayList;
public class ArrayListChallenge {
static int counter=0;
public static void main(String[] args) {
	ArrayList myArray=new ArrayList();
	myArray.add(101.1);
	myArray.add(98.7);
	myArray.add(97.3);
	myArray.add(98.4);
	myArray.add(99.3);
	myArray.add(98.6);
	myArray.add(98.1);
	myArray.add(100.2);
	myArray.add(102.0);
	myArray.add(99.6);
	
	for (Object degrees: myArray)
		{
		//System.out.println(degrees + " degrees Fahrenheit");
		}
	
	for(int i=0; i<myArray.size(); i++)			
	{
		if ((double)myArray.get(i)>98.6)
			{
			counter++;
			System.out.println(myArray.get(i) + " is a fever temperature");
			}
		System.out.println("There are " + counter + " values with fever temperatures.");
		}
	for (int i=0; i<myArray.size(); i++)
	{
	System.out.println(myArray.get(i)-32/1.8);
	}
	}
}	
	
	
	
//	
//	double sum=0.0;


//	{

//	sum=sum+(double)myArray.get(i);
//	}
//	System.out.println("There are " + counter + " numbers in the array");
//	System.out.println("The sum of the numbers is " + sum);	
//	}
//
//
//}

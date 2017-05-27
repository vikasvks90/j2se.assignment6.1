/**
* <h1>ArrayDemo</h1>
* This program demonstrates some Array functionalities
* 4 different methods have been written to show different behavior of an Array
* @author  Vikas
* @version 1.0
* @since   2017-05-27 
*/
package assignment6.session1;

public class ArrayDemo {

	public static void main(String[] args) {
		problem1();
		problem2();
		problem3();
		problem4(5,"FEB");
	}
	
	//problem1 will declare initialize an array and will print all the even numbers in the array
	public static void problem1(){
		int[] array1 = new int[10];//declared an integer array of size 10
		System.out.println("All the even numbers in array are as follows: ");
		//this for loop will initialize the array and will print all the even elements
		for(int i=0;i<10;i++){
			array1[i]=i;
			if(array1[i]%2 == 0){
				System.out.print(array1[i]+"\t");
			}
		}
	}
	
	//problem2 will declare and initialize an array filled with only prime numbers
	//will copy this array in another array in reverse order
	public static void problem2(){
		int[] array2 = new int[10];//declared an integer array of size 10
		int[] array3 = new int[10];//declared an integer array of size 10 will hold array2 in reverse order
		boolean a = false;
		int j = 0;
		System.out.println("\n");
		System.out.println("All the prime numbers in array are as follows: ");
		//this for loop will initialize the array with prime numbers and if the array gets full will get
		//out from the for loop
		for(int i=0;i<100;i++){
			a = isPrimeNumber(i);//to check if the number is prime
			if(a){
				array2[j++] = i;
				if(j == array2.length)
				{
					break;
				}
			}
		}
		
		for(int s:array2){
			System.out.print(s+"\t");
		}
		
		System.out.println();
		int i,k;
		//this for loop will reverse the array
		for(i=0,k=array2.length-1; i<array3.length&&k>=0; i++,k--){
				array3[i] = array2[k];
		}
		
		System.out.println("All the prime numbers in reverse order are as follows: ");
		for(int s:array3){
			System.out.print(s+"\t");
		}
		
	}
	
	//problem2 will print days in a corresponding month
	public static void problem3(){
		String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
		System.out.println("\n");
		for(int i=0,j=0; i<months.length&&j<days.length; i++,j++){
			System.out.print(months[i]+" has "+days[j]+" days:\t");
		}
		
	}
	
	//this method will take day and month ,will print total number of days till that day
	public static void problem4(int day,String month){
		String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
		int noOfDays = 0;
		for(int i=0;i<months.length;i++){
			noOfDays += days[i];
			if(month == months[i+1]){
				noOfDays += day;
				break;
			}
		}
		System.out.println("\n");
		System.out.println("Total no. of days since 1 Jan: "+noOfDays);
	}
	
	//this method will check if the number is prime or not
	public static boolean isPrimeNumber(int number){
		if(number == 0 || number == 1){
			return false;
		}
        
		else {
        for(int i=2; i<=number/2; i++){
            if(number % i == 0 ){
                return false;
            }
        }
        return true;
		}
    }
}

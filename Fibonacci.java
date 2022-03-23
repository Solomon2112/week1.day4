package week1.day4;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8;
		int num1=0;
		int num2=1;
		int i;
		System.out.println(num1);
		System.out.println(num2);
		for(i=1; i<=range; i++) {
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
		

	}

}

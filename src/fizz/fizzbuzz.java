package fizz;

public class fizzbuzz {
	public static void main(String[] args) {
		int num = 0;
		System.out.print(num + ", "); // this is here so it prints 0
		while (num <= 100) { // stops at 100
			if (num % 5 == 0 && num % 15 != 0 && num != 0) { // checks divisible
																// by 5
				System.out.print("Buzz, "); // added num != 0 in order to
											// prevent buzz, fizz, or fizzbuzz
											// from printing on 0
			}
			if (num % 3 == 0 && num % 15 != 0 && num != 0) { // checks divisible
																// by 3
				System.out.print("Fizz, ");
			}
			if (num % 15 == 0 && num != 0) { // checks divisible by 3, or 5 aka
												// 15
				System.out.print("Fizz Buzz, ");
			}
			if (num % 5 != 0 && num % 3 != 0) { // prints the number
				System.out.print(num + ", ");
			}
			num++;
		}
	}
}

/*
 * ALTERNATIVE USING IF ELSE if(num % 15 == 0 && num != 0){
 * System.out.println("Fizz Buzz"); } else if(num % 3 == 0 && num != 0){
 * System.out.println("Fizz"); } else if(num % 5 == 0){
 * System.out.println("Buzz"); } else{ System.out.println(num); }
 */
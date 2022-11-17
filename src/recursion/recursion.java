package recursion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class recursion {
	static int n1 = 0, n2 = 1, n3 = 0;
	enum level{
		LOW, MEDIUM, HIGH;
		
	}
	static void fib(int count) {
		if(count>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			fib(count-1);		
		}
	}
	public static void main(String[]args){
		int count = 10;
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		System.out.println(n1+ " " +n2 );
		fib(count-2);
		level l = level.MEDIUM;
		System.out.println(l);
	}

}

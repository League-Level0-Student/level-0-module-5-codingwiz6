package _02_nested_loops._3_for_loop_gauntlet;

public class Forloops {
	public static void main(String[] args) {

		for (int a = 0; a < 101; a++) {
			System.out.println(a);
		}
		for (int b = 100; b > 0; b--) {
			System.out.println(b);
		}
		for (int c = 2; c < 101; c++) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
		}
		for (int d = 1; d < 101; d++) {
			if (d % 2 == 1) {
				System.out.println(d);
			}
		}
		for (int e = 0; e < 500; e++) {
			if (e % 2 == 0) {
				System.out.println(e + " Even");
			}
			if (e % 2 == 1) {
				System.out.println(e + " Odd");
			}
		}
		for(int f=0;f<784;f++) {
			if(f % 7 == 0) {
				System.out.println(f);
			}
		}
		int year=2011;
		for(int g=0;g<10;g++) {
			System.out.println( "In "+(year+g)+", I was "+g+" years old");
		}
		

	}

}

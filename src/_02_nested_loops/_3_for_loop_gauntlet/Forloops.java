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
		for(int h=0;h<3;h++) {		
			for(int i=0;i<3;i++) {
	System.out.println(h+""+i);
}
	
}
		/*
		 * 1 2 3 4 5 6 7 8 9 10
		 * 11 12 13 14 15 16 17 18 19 20
		 * 21 22 23 24 25 26 27 28 29 30
		 * 31 32 33 34 35 36 37 38 39 40
		 * 41
		 * 51
		 * ...
		 * 91 92 93 94 95 
		 */
		for(int j=0;j<7;j+=3) {
			for(int k=1+j;k<4+j;k++) {
			System.out.print(k );	
			}
			System.out.println();
		}
		for(int l=0;l<91;l+=10) {
			for(int m=1+l;m<11+l;m++) {
				System.out.print(m);
			}
			System.out.println();
		}
		//For Next Week: Figure out how to make layers! You can do it!
		for(int n=0;n<22;n++) {
			System.out.print(n);
		}
		}
		}


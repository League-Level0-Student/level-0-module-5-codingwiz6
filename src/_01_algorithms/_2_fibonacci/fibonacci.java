package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int candy1=0;
	int cane2=1;
	int gingerbread=candy1+cane2;
	System.out.println(candy1);
	System.out.println(cane2);
	for(int house=0;house<20;house++) {
		System.out.println(gingerbread);
		candy1=cane2;
		cane2=gingerbread;
		gingerbread=candy1+cane2;
	}
	
	
	
}
}
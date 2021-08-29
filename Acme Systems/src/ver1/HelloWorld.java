package ver1;

import java.util.Scanner;

public class HelloWorld {
	
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static void whatFor() {
		Scanner stringArg = new Scanner(System.in);
	    System.out.println("Enter a string");

	    String FollowedByWhatFor = stringArg.nextLine();
	    System.out.println(FollowedByWhatFor+ ", what for?");
	    stringArg.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from Eclipse");
		System.out.println("Hello from GitHub");
	}

}

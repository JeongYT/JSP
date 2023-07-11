package chap02;

import java.io.IOException;

public class Code01 {

	public static void main(String[] args) {
		/* System.out.print("Enter one character : ");
		int x;
		try {
			x = System.in.read();
			System.out.println("You entered " + x);
			System.out.println("You entered " + ((char)x));
		}catch(IOException e) {
			e.printStackTrace();
		} */
		int x;
		try {
			while((x = System.in.read()) != -1) {
				System.out.print((char)x);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

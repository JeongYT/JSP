package chap01;

class Printer {

	public static void println(int a) {
		System.out.println(a);
	}

	public static void println(boolean b) {
		System.out.println(b);
	}

	public static void println(double d) {
		System.out.println(d);
	}

	public static void println(String string) {
		System.out.println(string);
	}
	
}

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		

	}

}

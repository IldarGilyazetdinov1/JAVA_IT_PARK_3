import java.util.Scanner;
class Bankomat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int x0 = number / 5000;
		number = number - 5000 * x0;
		int x1 = number / 1000;
		number = number - 1000 * x1;
		int x2 = number / 500;
		number = number - 500 * x2;
		int x3 = number / 100;
		number = number - 100 * x3;
		int x4 = number / 50;
		number = number - 50 * x4;
		int x5 = number / 10;
		number = number -10 * x5;
		int x6 = number /5;
		number = number - 5 * x6;
		int x7 = number / 2;
		number = number - 2 * x7;
		int x8 = number;

		System.out.println(x8 + " 1 рубль " 
+ x7 + " 2 рубля " + "\n" 
+ x6 + " 5 рублей " + "\n" 
+ x5 + " 10 рублей " + "\n" 
+ x4 + " 50 рублей " + "\n" 
+ x3 + " 100 рублей " + "\n" 
+ x2 + " 500 рублей " + "\n" 
+ x1 + " 1000 рублей " + "\n" 
+ x0 + " 5000 рублей");
	}
}
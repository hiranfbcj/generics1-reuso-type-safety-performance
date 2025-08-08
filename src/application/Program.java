package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService();

		System.out.print("How many values? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
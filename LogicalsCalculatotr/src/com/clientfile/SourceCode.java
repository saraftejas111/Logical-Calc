package com.clientfile;

import java.util.Scanner;

public class SourceCode implements ClientRequirement {

	Scanner sc = new Scanner(System.in);

	public void calnum() {
		System.out.println("Enter the Values __ to __ ");
		int c = sc.nextInt();
		System.out.println("to");
		int d = sc.nextInt();
		for (int i = c; i <= d; i++)
			System.out.println(i);
	}

	public void calnumin() {
		System.out.println("Enter the Values __ to __ ");
		int c = sc.nextInt();
		System.out.println("to");
		int d = sc.nextInt();
		for (int i = c; i >= d; i--)
			System.out.println(i);

	}

	public void oddnum() {
		System.out.println("Enter the ODD Values __ to __\nyou want to print..");
		int n = sc.nextInt();
		System.out.println("to");
		int m = sc.nextInt();
		for (int i = n; i <= m; i++)
			if (i % 2 != 0)
				System.out.println(i);
	}

	public void evennum() {
		System.out.println("Enter the EVEN Values __ to __\nyou want to print..");
		int n = sc.nextInt();
		System.out.println("to");
		int m = sc.nextInt();
		for (int i = n; i <= m; i++)
			if (i % 2 == 0)
				System.out.println(i);
	}

	public void sumodd() {
		System.out.println("Enter the ODD Values __ to __\nyou want to Sum..");
		int n = sc.nextInt();
		System.out.println("to");
		int m = sc.nextInt();
		int sum = 0;
		for (int i = n; i <= m; i++) {
			if (i % 2 == 0)
				sum = sum + i;
		}
		System.out.println(sum);
	}

	public void sumeven() {
		System.out.println("Enter the Even Values __ to __\nyou want to print..");
		int n = sc.nextInt();
		System.out.println("to");
		int m = sc.nextInt();
		int sum = 0;
		for (int i = n; i <= m; i++) {
			if (i % 2 == 0)
				sum = sum + i;
		}
		System.out.println(sum);
	}

	public void table() {
		System.out.println("Enter the table\nyou want to print..");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++)

			System.out.println(n + " X " + i + " = " + n * i);
	}

	public void factorial() {
		System.out.println("Enter the  Value..");
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
			System.out.println(sum);
		}
		System.out.println("\nFinal Value :" + sum);
	}

	public void prime() {
		System.out.println("Enter the  Value and\ncheck weather it is Prime or Not..");
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				cnt++;
		}
		if (cnt == 2)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is NOT a Prime Number");
	}

	public void remainder() {
		System.out.println("Enter the Value and\ncheck it's Remainder");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)

				System.out.println(i);
		}

	}

	public void fibonacci() {
		System.out.println("Enter the Value and\ncheck it's Fibonacci Series");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 0; i <= n; i++) {

			System.out.println(n1 + " ");
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}
	}

	public void pallindrome() {

		System.out.println("Enter the Value and\ncheck num is Pallindrome or not");

		int a = sc.nextInt(), n = a, rev = 0;

		while (a > 0) {
			int r = a % 10;
			a = a / 10;
			rev = rev * 10 + r;
		}
		if (n == rev) {
			System.out.println(n + " is pallindrome");
		} else {
			System.out.println(n + " is not pallindrome");
		}

	}

	public void armstrong() {

		System.out.println("Enter the Value and\ncheck num is ArmStrong or not");
		int n = sc.nextInt();
		int num = n, sum = 0;

		int cnt = 0, temp = n;
		while (temp > 0) {
			temp = temp / 10;
			cnt++;
		}

		while (n > 0) {
			int r = n % 10; // 4 >> 7 >> 4 >> 9
			n = n / 10; // 974 >> 94 >> 9 >> 0
			sum = (int) (sum + Math.pow(r, cnt));

		}
		if (num == sum)
			System.out.println(num + " is Armstrong Number");
		else
			System.out.println(num + " is Not Armstrong Number");

	}

}

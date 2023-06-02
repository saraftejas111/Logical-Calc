
package com.clientfile;

import java.util.Scanner;

public interface LogicalCal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"==Enter the Number\nto Perform the Action==\n\n1. Print Sequential Numbers\n2. Print Inverse Numbers\n3. Odd Numbers\n4. Even Numbers\n5. Sum of Odd Numbers\n6. Sum of Even Numbers\n7. Table\n8. Factorial\n9. Prime Number Check\n10. Remainder of any Number\n11. Fibonacci\n12. Pallindrome Check\n13. ArmStrong Check");
		int a = sc.nextInt();

		SourceCode p = new SourceCode();

		switch (a) {
		case 1:
			p.calnum();
			break;
		case 2:
			p.calnumin();
			break;
		case 3:
			p.oddnum();
			break;
		case 4:
			p.evennum();
			break;
		case 5:
			p.sumodd();
			break;
		case 6:
			p.sumeven();
			break;

		case 7:
			p.table();
			break;
		case 8:
			p.factorial();
			break;
		case 9:
			p.prime();
			break;
		case 10:
			p.remainder();
			break;
		case 11:
			p.fibonacci();
			break;
		case 12:
			p.pallindrome();
			break;
		case 13:
			p.armstrong();
			break;
		default:
			System.out.println("Out of Range\nPlease enter correct Value ");
			break;
		}
	}
}

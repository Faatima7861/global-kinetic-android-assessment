package TestData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Idnumber {

	public static int addSum;

	static long reverse(long n) {
		long rev = 0;
		while (n != 0) {
			rev = (rev * 10) + (n % 10);
			n /= 10;
		}
		return rev;
	}

	public static int getSum(long n) {
		n = reverse(n);
		int sumOdd = 0, sumEven = 0, c = 1;

		while (n != 0) {
// System.out.println("Sum even = " + sumEven);
			if (c % 2 == 0)

				sumEven += n % 10;
			else
				sumOdd += n % 10;
			n /= 10;
			c++;
		}

		System.out.println("Sumodd = " + sumOdd);
		addSum = +sumOdd;
// System.out.println("Sum even = " + sumEven);
		return sumOdd;
	}

	public static long productEqual(long n) {
		long sum = 0;
		String s = null;
		if (n < 10)
			return sum;
		int prodOdd = 1;

		while (n > 0) {
			long digit = n % 10;
			prodOdd *= digit;
			n /= 10;
			if (s == null) {
				s = Long.toString(digit);
			} else {
				s = s + Long.toString(digit);
			}
// System.out.println("s:"+s);
			long Pd = digit;

			if (n == 0)
				break;

// Second digit
			digit = n % 10;
			n /= 10;
		}
		StringBuilder input1 = new StringBuilder(s);
		StringBuilder r = input1.reverse();
		long rev = Long.valueOf(r.toString());
		long revProd = rev * 2;
		System.out.println("EvenConcat:" + revProd);

		while (revProd > 0) {
			sum = sum + revProd % 10;
			revProd = revProd / 10;
		}
		System.out.println("ProdEven:" + sum);

		return sum;
	}

	public static byte RDigit() {

		Random random = new Random();
		boolean res = random.nextBoolean();

		if (res)
			return 1;
		else
			return 0;
	}

	static int evenNumSubstring(String str) {
		int len = str.length();
		int count = 0;

		for (int i = 0; i < len; i++) {
			int temp = str.charAt(i) - '0';
			if (temp % 2 == 0)
				count += (i + 1);
		}
		return count;
	}

	//public static void main(String[] args)
	public String idNumGen(int length) {  

		Random random = new Random();

		String Gender = String.format("%04d", random.nextInt(10000));
		String racial = String.format("%01d", random.nextInt(10));

		int minDay = (int) LocalDate.of(1979, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMdd");

// System.out.println(formatter.format(randomBirthDate) + " " + Gender + " " +
// RDigit() +" "+ racial);

		String S = formatter.format(randomBirthDate) + "" + Gender + "" + RDigit() + "" + racial;

		System.out.println(S);
		long n = Long.parseLong(S);
		long m = productEqual(n);
		int i = getSum(n);// ---working
		int j = evenNumSubstring(S);

		int k = (int) (m + i);
		System.out.println(k);
		int b = (1000 - k) % 10;
		System.out.println(b);
		String idNum = S + b;
		System.out.println(idNum);
		return idNum;

	}
}

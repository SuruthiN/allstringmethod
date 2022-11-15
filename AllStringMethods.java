package myproj;

import java.util.Scanner;

public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b, str, string1;
		int v;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name1:");
		a = s.nextLine();
		System.out.println("Enter the name2:");
		b = s.nextLine();
		int sLength = a.length();

		System.out.println("length of the string:" + a.length());
		System.out.println("character at index is:" + a.charAt(1));
		System.out.println("using equals:" + a.equals(b));
		System.out.println("Using equalsIgnoreCase:" + a.equalsIgnoreCase(b));

		int result1 = a.codePointAt(0);
		System.out.println("Using codePointAt:" + result1);

		int result2 = a.codePointBefore(1);
		System.out.println("Using codePointBefore:" + result2);

		int result3 = a.codePointCount(0, 2);
		System.out.println("Using codePointCount:" + result3);

		System.out.println("Using compareTo:" + a.compareTo(b));

		System.out.println("Using compareToIgnoreCase:" + a.compareToIgnoreCase(b));

		System.out.println("Using concat:" + a.concat(b));

		System.out.println("Using contains:" + a.contains(b));

		System.out.println("Using contentEquals:" + a.contentEquals(b));

		System.out.println("Using endsWith:" + a.endsWith(b));

		System.out.println("Using Hashcode:" + a.hashCode());

		System.out.println("Using indexOf:" + a.indexOf(result3));

		System.out.println("Using isEmpty:" + a.isEmpty());

		System.out.println("Using lastIndexOf:" + a.lastIndexOf(result3));

		System.out.println("Using replace:" + a.replace('1', '2'));

		String str1 = String.format("Using format:%s", a);
		System.out.println(str1);

		System.out.println("Using matches:" + str1.matches(str1));

		byte[] barr = a.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println("Using getBytes:" + barr[i]);
		}

		System.out.println("Using intern:" + a.intern());

		System.out.println("Using regionMatches:" + str1.regionMatches(11, a, 0, 9));

		String string = new String("Ebrain technologies,thanjavur");
		System.out.println("Using replaceFirst:" + string.replaceFirst("thanjavur", "orathanad"));

		System.out.println("Using subSequence:" + string.subSequence(0, 7));
		System.out.println("Using substring:" + string.substring(5));

		String replaceString = ("Using replaceAll" + string.replaceAll("a", "e"));

		System.out.println("Using startsWith:" + a.startsWith(b));

		System.out.println("Using toUpperCase:" + a.toUpperCase());

		System.out.println("Using toLowerCase:" + a.toLowerCase());
		System.out.println("Using trim:" + b.trim());

		System.out.println("Using valueOf:" + a.valueOf(b));

	}

}

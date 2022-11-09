package sarkar.patterns.twopointer;

public class ReverseWords {

	public static String reverseWords(String s) {
		String[] str = s.trim().split(" ");
		int length = str.length;
		StringBuilder builder = new StringBuilder();

		for (int i = length - 1; i >= 0; i--) {
			if (!str[i].isEmpty()) {
				builder.append(str[i]);
				if (i > 0 && length > 1) {
					builder.append(" ");
				}
			}
		}
		return builder.toString();
	}

	public static String reverseWordsOptimal(String s) {
		char[] s1 = s.toCharArray();
		String s2 = cleanSpaces(s1, s1.length);
		StringBuilder builder = new StringBuilder(s2);

		// reverse the whole string using the strRev() function
		strRev(builder, 0, builder.length() - 1);

		// reverse every word
		int n = builder.length();
		int start = 0, end = 0;
		// Find the start index of each word by detecting spaces.
		while (start < n) {
			// Find the end index of the word.
			while (end < n && builder.charAt(end) != ' ')
				++end;
			// Let's call our helper function to reverse the word in-place.
			strRev(builder, start, end - 1);
			// moving to the next word
			start = end + 1;
			++end;
		}

		return builder.toString();
	}

	// Function to reverse the whole string
	public static void strRev(StringBuilder sb, int startRev, int endRev) {
		// Starting from the two ends of the list, and moving
		// in towards the centre of the string, swap the characters
		while (startRev < endRev) {
			char temp = sb.charAt(startRev); // temp store for swapping
			sb.setCharAt(startRev++, sb.charAt(endRev));
			sb.setCharAt(endRev--, temp);
		}
	}

	// trim leading, trailing and multiple spaces
	static String cleanSpaces(char[] a, int n) {
		int i = 0, j = 0;

		while (j < n) {
			while (j < n && a[j] == ' ')
				j++; // skip spaces
			while (j < n && a[j] != ' ')
				a[i++] = a[j++]; // keep non spaces
			while (j < n && a[j] == ' ')
				j++; // skip spaces
			if (j < n)
				a[i++] = ' '; // keep only one space
		}
		return new String(a).substring(0, i);
	}

	public static void main(String[] args) {
		String[] inputs = { "Hello World!", "We love Python.", "The quick brown fox jumped over the lazy dog.", "Hey!",
				"To be, or not to be", "AAAAA", "Hello     World" };
		for (int i = 0; i < inputs.length; i++) {
			System.out.print(i + 1);
			System.out.println(".\tActual string:\t\t" + inputs[i]);
			System.out.println("\tReversed String:\t" + reverseWordsOptimal(inputs[i]));
			// System.out.println(PrintHyphens.repeat("-", 100));
		}

	}

}

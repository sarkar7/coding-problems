package sarkar.algo.recursion;

public class SkipAChar {

	
	static String skipChar(String str, char skp) {
		return skipItRecursively(str, 0, skp, new StringBuilder());
	}
	
	

	private static String skipItRecursively(String str, int i, char skp, StringBuilder sb) {
		//Base Condition
		if (str.length() - 1 == i) {
			if (str.charAt(i) == skp) return sb.toString();
			else return sb.append(str.charAt(i)).toString();
		}
		
		if (str.charAt(i) == skp) {
			return skipItRecursively(str, i+1, skp, sb);
		} else {
			return skipItRecursively(str, i+1, skp, sb.append(str.charAt(i)));
		}
		
	}



	public static void main(String[] args) {
		String str = "baacfgahy";
		System.out.println(skipChar(str, 'a'));
	}

}

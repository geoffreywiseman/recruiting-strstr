package recruiting;

public class Sixteen extends StrStrTest {

	/**
	 * 2015-08-06; KW
	 */
	@Override	
	public int strstr( char[] pattern, char[] string ) {
		for (int i = 0; i < string.length; i++) {
			if (pattern[0] == string[i]) {
				int j = 0; // index of string
				int k = i; // index of pattern
				for (; j < pattern.length && k < string.length;) {
					if (string[k] == pattern[j]) {
						k++;
						j++;
					} else {
						break;
					}
				} // end of for loop

				if (j == pattern.length) { // test for the end
					return i;
				}
			} // end of if
		}
		return -1;
	}

}

package recruiting;

public class TwentyFour extends StrStrTest {

	/**
	 * TL; 2017-Jun-01
	 * <p>
	 * Minor edits for Java syntax; e.g. "length()" instead of "length"
	 */
	public int strstr( char[] needle, char[] haystack ) {
		// int i=0, j=0, jj=-1
		int i = 0;
		int j = 0;
		int jj = -1;

		while ( ( j < haystack.length ) && ( i < needle.length ) ) {
			if ( needle[i] == haystack[j] ) {
				if ( ( i > 0 ) && ( needle[i] == needle[0] ) && ( jj == -1 ) ) {
					jj = j;
				}
				i++;
				j++;
			} else {
				i = 0;
				j++;
				if ( jj > 0 ) {
					j = jj;
					jj = -1;
				}
			}
			if ( i == needle.length ) {
				return j - i;
			}
		}
		return -1;
	}
}

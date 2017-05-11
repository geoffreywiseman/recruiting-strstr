package recruiting;

import java.util.LinkedList;
import java.util.Queue;

public class TwentyThree extends StrStrTest {

	/**
	 * TL; 2017-May-11
	 */
	public int strstr( char[] needle, char[] haystack ) {
		int n = needle.length;
		int m = haystack.length;

		if ( n == 0 || m == 0 )
			return 0;
		int firstOcc = -1;
		int j = 0;

		for ( int i = 0; i < (m-n); i++ ) {
			for ( int k = i; k < m; k++ ) {
				if ( haystack[k] != needle[j] ) {
					j = 0;
					firstOcc = -1;
				}
				if ( haystack[k] == needle[j] ) {
					if ( firstOcc == -1 )
						firstOcc = i;
					j++;
					if ( j == n ) {
						return firstOcc;
					}
				}
			}
		}
		return -1;
	}
}

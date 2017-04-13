package recruiting;

public class Seventeen extends StrStrTest {

	/**
	 * YL; Recursive implementation for fun.
	 */
	public int strstr( char[] haystack, char[] needle ) {
		// EDITED: Yang's original solution has needle and haystack reversed
        return strstr( needle, haystack, 0, 0 );
    }
    
    private int strstr( char[] haystack, char[] needle, int h, int n ) {
        if ( n == needle.length ) {
            return h - n;
        }
        else if ( h == haystack.length ) {
            return -1;
        }
        else {
            if ( haystack[h] == needle[n] ) {
                return strstr( haystack, needle, h + 1, n + 1 );
            } else {
            	// EDITED: Yang originally had h+1 instead of h-n+1
                return strstr( haystack, needle, h - n + 1, 0 );
            }
        }
    }
}

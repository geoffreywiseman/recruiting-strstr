package recruiting;

public class Eighteen extends StrStrTest {

	/**
	 * JW; 2016-Feb-25
	 */
	public int strstr( char[] pattern, char[] string ) {
		if( pattern.length > string.length ) return -1;
		
		for( int i = 0; i < (string.length - pattern.length + 1); i++ ) {
			// ERROR: if( pattern[i] != string[i] ) continue;
			if( pattern[0] != string[i] ) continue;
			for( int j = 1; j < pattern.length; j++ ) {
				if( pattern[j] != string[ i + j ] )
					break;
				if( j == pattern.length - 1 )
					return i;
			}
		}
		return -1;
    }
}

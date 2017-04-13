package recruiting;

public class Twenty extends StrStrTest {

	/**
	 * VS; 2017-Apr-11
	 */
	public int strstr( char[] pattern, char[] string ) {
		char start = pattern[0];
		for ( int i = 0; i < string.length - pattern.length + 1; i++ ) {
			// EDIT: he had "=" instead of "=="
			if ( string[i] == start && helper( pattern, string, i ) )
				return i;
		}
		return -1;
	}

	boolean helper( char[] pattern, char[] string, int i ) {
		int j = 0;
		for( j = 1; j < pattern.length; j++ ) {
			if( pattern[j] == string[i+j] )
				continue;
			else
				return false;
		}
		return true;
	}
}

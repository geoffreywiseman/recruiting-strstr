package recruiting;

public class Eleven extends StrStrTest {

	/* Light translation from pseudocode */
		
	/**
	 * 2015-Jun-9; SR
	 */
	@Override
	public int strstr( char[] pattern, char[] string ) {
		for( int i=0; i<= string.length - pattern.length; i++ ) {
			int j = 0;
			while( j < pattern.length && string[ i + j ] == pattern[j] ) {
				j++;
			}
			if( j == pattern.length ) {
				return i;
			}
		}
		return -1;
	}

}

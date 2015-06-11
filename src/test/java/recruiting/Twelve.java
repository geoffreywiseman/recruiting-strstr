package recruiting;

public class Twelve extends StrStrTest {

	/* Light translation from pseudocode */
		
	/**
	 * 2015-Jun-11; MG
	 */
	@Override
	public int strstr( char[] pattern, char[] string ) {
		int j = 0;
		int index = 0;
		
		for( int i =0; i < string.length; i++ ) {
			if( j == pattern.length )
				return index;
			if( string[i] == pattern[j] )
				j++;
			else {
				j = 0;
				index = i+1;
			}
		}
		if( j == pattern.length )
			return index;
		return -1;
	}

}

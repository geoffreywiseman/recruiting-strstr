package recruiting;

public class Nineteen extends StrStrTest {

	/**
	 * NH; 2016-Mar-03
	 * 
	 * Doesn't work.
	 */
	public int strstr( char[] pattern, char[] string ) {
		// EDITED: he had 'size' instead of 'length'
		if( pattern.length == 0 || string.length == 0 ) {
			System.out.println( "no input" );
			// ADDED: He didn't have a return value for this branch
			return -1;
		} else {
			int index = 0;
			boolean search = true;
			int counter = 0;
			
			// EDITED: 'size' to 'length'
			for( int i = 0; i < string.length; i++ ) {
				// EDITED: 'size' to 'length'
				for( int j = 0; j < pattern.length; j++ ) {
					if( pattern[j]  == string[i+j] ) {
						counter++;
						if( search ) {
							index = j;
							search = false;
						}
					}
				}
			}
			
			// EDITED: 'size' to 'length'
			if( index != 0 && counter == pattern.length )
				return index;
			else
				return -1;
		}
		
    }
}

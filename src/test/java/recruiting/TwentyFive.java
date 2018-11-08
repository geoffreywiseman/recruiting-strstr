package recruiting;

/**
 * JC; 2018-10-31
 */
public class TwentyFive extends StrStrTest {
	@Override
	public int strstr( char[] pattern, char[] string ) {
		int containedString = -1;
		for ( int i = 0; i < ( string.length - pattern.length ); i++ ) { // EDIT: original had `length()` instead of `length`
			Boolean totalMatch = true;
			for ( int j = 0; j < pattern.length; j++ ) { // EDIT: length() again
				if ( !( pattern[i] == string[j + i] ) ) { // edit used `.equals() on the char, instead of `==`
					totalMatch = false;
				}
			}
			if ( totalMatch )
				return i;
		}
		return containedString;
	}
}

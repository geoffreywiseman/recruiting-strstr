package recruiting;

/**
 * JY(T); 2018-10-30
 */
public class TwentySeven extends StrStrTest {

	// EDIT: Apparently candidate transposed pattern/str, so I've transposed the parameters so that I can leave the code intact)
	@Override
	public int strstr( char[] str, char[] pattern ) {
		for ( int i = 0; i <= pattern.length - str.length; i++ ) { // EDIT: `length()` to `length`
			if ( pattern[i] == str[0] ) {
				boolean found = true; // EDIT: `bool` to `boolean`
				for ( int j = 1; j < str.length; j++ ) { // EDIT: `length()` to `length`
					if ( pattern[i + j] != str[j] ) {
						found = false;
						break;
					}
				}
				if ( found )
					return i;
			}
		}
		return -1;
	}
}

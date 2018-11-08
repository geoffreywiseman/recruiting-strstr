package recruiting;

/**
 * YL: 2018-10-30
 */
public class TwentySix extends StrStrTest {

	@Override
	public int strstr( char[] pattern, char[] string ) {
		int slen = string.length; // EDIT: `Length`, maybe just an unintentional uppercase letter
		int plen = pattern.length; // EDIT: `Length`, maybe just an unintentional uppercase letter
		for ( int i = 0; i < slen; i++ ) {
			// EDIT: was `if((slen-i)-j) return -1;`
			for ( int j = 0; j < plen; j++ ) {
				System.out.println(
						"pattern[" + j + "] equals string[" + i + "+" + j + "]? '" + pattern[j] + "' equals '" + string[i + j] + "'? " + ( pattern[j]
								== string[i + j] ) );
				if ( pattern[j] != string[i + j] ) {
					break;
				}
				return i;
			}
			return -1;
		}
		return -2; // EDIT: No return statement here, does not compile
	}
}

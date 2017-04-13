package recruiting;

public class TwentyOne extends StrStrTest {

	/**
	 * MRM; 2017-Apr-13
	 */
	public int strstr( char[] pattern, char[] string ) {
		// EDIT: was length()
		if( string.length == 0 ) {
			// EDIT: was length()
			if( pattern.length == 0 )
				return 0;
			return -1;
		}

		int strPos = 0;
		int patternPos = 0;

		while( strPos < string.length ) {
			if( pattern[patternPos] == string[strPos] ) {
				patternPos ++;
			} else {
				strPos = strPos - patternPos; patternPos = 0;
			}
			strPos++;
			// EDIT: was length()
			if(patternPos >= pattern.length )
				return strPos - patternPos;
		}
		return -1;
	}
}

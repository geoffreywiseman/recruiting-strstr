package recruiting;

/**
 * 2012-May-1
 */
public class Two extends StrStrTest {

	@Override
	public int strstr(char[] pattern, char[] string) {
		if( pattern.length > string.length )
			return -1;
		for( int i = 0; i<string.length; i++ ) {
			int j;
			for( j = 0; j<pattern.length; j++ ) {
				if( i+j >= string.length || string[i+j] != pattern[j] ) {
					break;
				}
			}
			if(j == pattern.length) {
				return i;
			}
		}
		return -1;
	}
	
}

package recruiting;

/**
 * 2012-Oct-11
 */
public class Seven extends StrStrTest {

	@Override
	public int strstr(char[] pattern, char[] string) {
		if( pattern.length > string.length )
			return -1;
		int auxIdx = -1;
		for( int i = 0; i < string.length; i++ ) {
			for( int j = 0; j < pattern.length; j++ ) {
				if( i + j >= string.length )
					return -1;
				if( string[ i + j ] == pattern[ j ] && j == 0 )
					auxIdx = i;
				if( string[ i + j ] != pattern[ j ] ) {
					auxIdx = -1;
					break;
				}
			}
			if( auxIdx != -1 )
				return auxIdx;
		}
		return auxIdx;
	}
	
}

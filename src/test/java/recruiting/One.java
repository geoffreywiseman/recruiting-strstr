package recruiting;

/**
 * 2012-May-1
 */
public class One extends StrStrTest {

	@Override
	public int strstr(char[] pattern, char[] string) {
		if( pattern.length > string.length )
			return -1;
		int y=0;
		do {
			int i;
			for( i=y; i<string.length; i++ ) {
				if( string[i] == pattern[0] ) {
					y=i;
					break;
				}
			}
			if( i == string.length )
				return -1;
			boolean found = true;
			for( int x = 0; x< pattern.length; x++ ) {
				if( string[i+x] != pattern[x] ){
					found = false;
					break;
				}
			}
			if( found )
				return y;
			y++;
		} while( y< string.length - pattern.length );
		return -1;
	}
	
}

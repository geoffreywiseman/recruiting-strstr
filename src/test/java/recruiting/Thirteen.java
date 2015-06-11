package recruiting;

public class Thirteen extends StrStrTest {

	/**
	 * 2014-Nov-04; YL
	 */
	@Override
	public int strstr( char[] pattern, char[] string ) {
		int l1 = pattern.length;
		int l2 = string.length;
		if( l1>l2 ) return -1;
		for( int i = 0; i < l2; i++ ) {
			int index = 0;
			int j = i;
			for( index = 0; index < l1; index++, j++ ) {
				if( pattern[index] != string[j] )
					break;
			}
			if( index == l1 )
				return i;
		}
		return -1;
	}

}

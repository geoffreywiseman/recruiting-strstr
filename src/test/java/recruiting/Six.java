package recruiting;

/**
 * 2011-May-29
 */
public class Six extends StrStrTest {

    @Override
    public int strstr(char[] pattern, char[] string) {
	int size1 = string.length;
	int size2 = pattern.length;

	if( size2 > size1 ) return -1;
	int j = 0;
	char curr = pattern[j];
	int index = -1;
	for( int x = 0; x<size1; x++ ) {
		if( string[x] == pattern[0] ) {
			index = x;
			break;
		}
	}
	if( index<0 ) return -1;
	for( int i = 0; i<size1; i++ ) {
		if( string[i] == curr ) {
			index = i;
		}
	}
	if( j<size2 )
		return -1;
	else
		return index;
    }
    
}

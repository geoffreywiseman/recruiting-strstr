package recruiting;

public class Fourteen extends StrStrTest {

	/**
	 * 2015-07-02; WFG
	 */
	@Override
	public int strstr( char[] pattern, char[] string ) {
		if( pattern.length > string.length )
			return -1;
		
		int ret = -1;
		
		int hashP = 0;
		for( int i = 0; i < pattern.length; i++ ) {
			hashP += Character.valueOf( pattern[i] ).hashCode();
		}
		
		int[] hashS = new int[ string.length - pattern.length + 1 ];
		for( int i=0; i<string.length-pattern.length+1; i++ ) {
			for( int j=0; j<pattern.length; j++ ) {
				hashS[i] += Character.valueOf( string[i+j] ).hashCode();
			}
		}
		
		for( int i=0; i<hashS.length; i++ ) {
			if( hashS[i] == hashP ) {
				for( int j=0; j<pattern.length; j++ ) {
					if( string[ i + j ] != pattern[j] )
						break;
					if( j == pattern.length -1 ) {
						ret = i;
						return ret;
					}
				}
			}
		}
		return ret;
	}

}

package recruiting;

public class Fifteen extends StrStrTest {

	/**
	 * 2015-08-06; H
	 */
	@Override	
	public int strstr( char[] pattern, char[] string ) {
		int success = -1;
		int strlen = string.length;
		int i = 0;
		int j = 0;
		
		for( i = 0; i < strlen; i++ ) {
			boolean matchFound = true;
			int tempi = 0;
			for( tempi=0; tempi<pattern.length; tempi++ ) {
				if( pattern[tempi] != string [ i + tempi ] ) {
					matchFound = false;
					break;
				}
			}
			if( matchFound )
				return i;
		}
		
		// GW: I had to put this in so Eclipse wouldn't complain.
		return -1;
	}

}

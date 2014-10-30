package recruiting;

public class Ten extends StrStrTest {

	/* Another C-like solution, so I'll have to translate. */
	
	// int j;
	// int i=0;
	// 
	// while( string[i] != '/0' )
	// {
	//   j = 0;
	//   while( string[i+j] == pattern[j] )
	//   {
	//     j++;
	//     if( pattern[j] == '/0' ) {
	//       return i;
	//     } else if( string[i+j] == '/0' ) {
	//       break;
	//     }
	//   }
	//   i++;
	// }
	// return -1;
	// 
	
	/**
	 * 2014-Oct-23; JL
	 */
	@Override
	public int strstr(char[] pattern, char[] string) {
		int j;
		int i = 0;
		
		while( i < string.length ) {
			j = 0;
			while( string[i+j] == pattern[j] ) {
				j++;
				if( j >= pattern.length ) {
					return i;
				} else if ( i+j >= string.length ) {
					break;
				}
			}
			i++;
		}
		return -1;
	}

}

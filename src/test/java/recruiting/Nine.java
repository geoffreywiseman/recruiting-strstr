package recruiting;


/**
 * 2014-Oct-23; WZ
 */
public class Nine extends StrStrTest {

	/**
	 * This is the C-like pseudo-code we got:
	 */

	// if( pattern == null || string == null )
	// return -1;
	//
	// char *pat = pattern
	// bool isMatching = false;
	// char *start = string;
	//
	// int index = -1;
	// int cnt = 0;
	//
	// while( *start != '\0' ) {
	//   if( *pat == *start ) {
	//     if( !isMatching ) {
	//       index = cnt;
	//       isMatching = true;
	//     }
	//     pat++;
	//   } else if ( isMatching && *pat != *start ) {
	//     pat = pattern;
	//     start = string + index;
	//     index = -1;
	//   }
	//
	//   if( *pat == '\0' )
	//   return index;
	//
	//   start++;
	//   cnt++;
	// }
	// return index;

	/**
	 * this is my rough translation to Java
	 */
	@Override
	public int strstr(char[] pattern, char[] string) {
		if (pattern == null || string == null) {
			return -1;
		}

		int pat = 0;
		int start = 0;
		boolean isMatching = false;

		int index = -1;
		int cnt = 0;

		while (start < string.length) {
			if (pattern[pat] == string[start]) {
				if (!isMatching) {
					index = cnt;
					isMatching = true;
				}
				pat++;
			} else if (isMatching && pattern[pat] != string[start]) {
				pat = 0;
				start = index;
				index = -1;
			}

			if (pat == pattern.length)
				return index;

			start++;
			cnt++;
		}

		return index;
	}

	/*
	 * This code still has serious problems: 
	 * 
	 * - When match fails, start is reset to index, but should be reset to index + 1
	 * - isMatching is never set back to false
	 * - if string ends before pattern ends, nothing checks, and index is returned
	 * 
	 * Perhaps the candidate would have solved these problems, but they all stem from code that is too complex for the simple problem.
	 */

}

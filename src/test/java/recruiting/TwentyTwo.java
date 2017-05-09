package recruiting;

import java.util.LinkedList;
import java.util.Queue;

public class TwentyTwo extends StrStrTest {

	/**
	 * JL; 2017-May-09
	 */
	public int strstr( char[] needle, char[] haystack ) {
		if(needle == null || needle.length == 0 ) return 0;
		if( haystack == null || haystack.length == 0 ) return -1;

		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < haystack.length; i++ )
		{
			if ( haystack[i] == needle[0] )
				q.add( i );
		}

		while(!q.isEmpty())
		{
			int index = q.poll();
			for(int i=0; i<needle.length; i++)
			{
				// EDIT: This wasn't in the code, but we discussed the need for this condition. I added it here, for simplicity's sake.
				if(i+index >= haystack.length) break;
				// EDIT: was haystack(index+i) -- paren rather than square brace
				if(needle[i]!=haystack[index+i]) break;
				else if( i == needle.length - 1 ) return index;
			}
		}

		return -1;
	}
}

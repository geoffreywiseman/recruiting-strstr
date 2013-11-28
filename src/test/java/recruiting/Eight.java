package recruiting;

/**
 * 2013-Nov-26; TZ
 */
public class Eight extends StrStrTest {

	@Override
	public int strstr(char[] pattern, char[] string) {
		if(pattern == null || string == null || pattern.length > string.length ) 
			return -1;
		
		// 1) traverse the searchIn string TODO: Tony - we don't need to traverse to the end
		for (int i=0; i<string.length; i++) {
			System.out.println("index i=" + i );
			
			int temp = i;
			
			// 2) traverse starting from i to the length of the pattern to make sure it matches, otherwise break
			for(int j=0; j<pattern.length; j++) {
				System.out.println("index j=" + j );
				System.out.println("temp temp=" + temp);
				
				// 3) compare character to character
				if(string[temp] != pattern[j]) {
					break;
				} 
				temp++;
				
				// 4) if j has reached the end of the pattern, return i
				if(j == pattern.length - 1) {
					return i;
				}	
			}
		}
		
		return -1;
	}
	
}

package recruiting;

/**
 * 2011-Sep-2
 */
public class Three extends StrStrTest {

	@Override
	public int strstr(char[] pattern, char[] string) {
		if(string == null || pattern == null || string.length < pattern.length) {
			return -1;
		}
		
		int counter = 0;
		int index = 0;
		boolean exists = false;
		
		 for(int i=0; i < pattern.length; i++) {
			for(int j=counter; j < string.length; j++) {
				if(pattern[i] == string[j]) {
					counter = j + 1;
					if (!exists) {
						index = j;
					}
					exists = true;
					break;
				}
			}
		}
		return index;
	}
	
}

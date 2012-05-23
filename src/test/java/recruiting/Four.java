package recruiting;

/**
 * 2011-May-22
 */
public class Four extends StrStrTest {

    @Override
    public int strstr(char[] pattern, char[] string) {
        boolean flag = false;
        int i=0;
        int j=0;
        while( j<string.length ) {
            if( pattern[i] == string[j] ) {
                if( i == pattern.length - 1 )
                    break;
                i += 1;
                j += 1;
                flag = true;
            } else {
                j += 1;
                i = 0;
                flag = false;
            }
        }
        if( flag == true && i == pattern.length - 1 )
            return j - pattern.length; // GW: Shoulda had a +1 here
        else
            return -1;

    }
    
}

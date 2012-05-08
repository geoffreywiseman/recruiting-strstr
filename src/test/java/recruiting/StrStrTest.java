package recruiting;

import org.junit.Assert;
import org.junit.Test;

public abstract class StrStrTest {

	public abstract int strstr( char[] pattern, char[] string );
	
	public int strstr( String pattern, String string ) {
		return strstr( pattern.toCharArray(), string.toCharArray() );
	}
	
	@Test
	public void testSimpleFind() {
		Assert.assertEquals( 0, strstr( "pat", "pathology" ) );
	}
	
	@Test
	public void testNotFound() {
		Assert.assertEquals( -1, strstr( "pat", "dementia" ) );
	}
	
	@Test
	public void testNotFirstFirstCharacterMatch() {
		Assert.assertEquals( 4, strstr( "pat", "pitapat" ) );
	}
	
	@Test
	public void testPatternLongerThanString() {
		Assert.assertEquals( -1, strstr( "pattern", "str" ) );
	}
	
	@Test
	public void testStringEndsBeforePattern() {
		Assert.assertEquals( -1, strstr( "pat", "oompa" ) );
	}
	
	@Test
	public void testMultipleMatches() {
		Assert.assertEquals( 4, strstr( "pat", "papapatpat" ) );
	}
	
}

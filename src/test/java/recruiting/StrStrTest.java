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

	@Test
	public void testDontSkipOverMismatchedPattern() {
		Assert.assertEquals( 2, strstr( "lola", "lololala" ) );
	}

	@Test
	public void testFindExact() {
		Assert.assertEquals( 0, strstr( "bird", "bird" ) );
	}

	@Test
	public void testFindAtEnd() {
		Assert.assertEquals( 4, strstr( "bird", "bluebird" ) );
	}

	@Test
	public void testFindLastCharacterWrong() {
		Assert.assertEquals( -1, strstr( "mistake", "mistaki" ) );
	}

}

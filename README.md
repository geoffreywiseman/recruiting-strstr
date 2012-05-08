# Solutions to `strstr` #

These are solutions proposed by recruiting candidates in whiteboard exercises as the implementation to strstr.

## The Problem ##

Essentially, we ask candidates to implement a solution to a typical library function wherein you find the first index of a smaller string within a larger one. This is called different things in different languages: strstr, indexOf, etc.  We give them a template a little like this:

	int strstr( char[] pattern, char[] ) {
		// your code here
	}

Of course, you're not allowed to use the library functions like strstr or indexof to implement this.

## The Test Cases ##

I would typically propose several test cases and then include others if I see a flaw in the code that can be well addressed by a test case. Some common examples:

	strstr( "pat", "pathology" ) == 0
	strstr( "pat", "dementia" ) == -1
	strstr( "pat", "pitapat" ) == 4
	strstr( "pattern", "str" ) == -1
	strstr( "pat", "papapatpat" ) == 4

## Solutions ##

Each of the solutions in this repository have been proposed by a candidate. Some of them, I like, others 
I'm less fond of. I'm going to try and stay away from including any identifying information or value judgements.
Use your own judgement if you wish to decide if these are good solutions.
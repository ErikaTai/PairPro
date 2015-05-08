package IntToEng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void int0‚ð‘ã“ü‚µ‚½‚çzero‚ð•Ô‚·() {
		String expected = "zero";
		String actual = IntToEng.translateEng(0);
		assertThat(actual, is(expected));
	}

	@Test
	public void int19‚ð‘ã“ü‚µ‚½‚çnineteen‚ð•Ô‚·() {
		String expected = "nineteen";
		String actual = IntToEng.translateEng(19);
		assertThat(actual, is(expected));
	}

	@Test
	public void int20‚ð‘ã“ü‚µ‚½‚çtwenty‚ð•Ô‚·() {
		String expected = "twenty";
		String actual = IntToEng.translateEng(20);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int21‚ð‘ã“ü‚µ‚½‚çtwentyone‚ð•Ô‚·() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int100‚ð‘ã“ü‚µ‚½‚çhundred‚ð•Ô‚·() {
		String expected = "hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual, is(expected));
	}
}

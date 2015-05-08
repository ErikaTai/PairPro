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
	
	public void int6‚ð‘ã“ü‚µ‚½‚çnull‚ð•Ô‚·() {
		String expected = "";
		String actual = IntToEng.translateEng(6);
		assertThat(actual, is(expected));
	}

}

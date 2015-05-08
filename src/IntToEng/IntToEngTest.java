package IntToEng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void int0を代入したらzeroを返す() {
		String expected = "zero";
		String actual = IntToEng.translateEng(0);
		assertThat(actual, is(expected));
	}
	
	public void int6を代入したらnullを返す() {
		String expected = "";
		String actual = IntToEng.translateEng(6);
		assertThat(actual, is(expected));
	}

}

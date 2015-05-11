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

	@Test
	public void int19を代入したらnineteenを返す() {
		String expected = "nineteen";
		String actual = IntToEng.translateEng(19);
		assertThat(actual, is(expected));
	}

	@Test
	public void int20を代入したらtwentyを返す() {
		String expected = "twenty";
		String actual = IntToEng.translateEng(20);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int21を代入したらtwentyoneを返す() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int100を代入したらhundredを返す() {
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int120を代入したらonehundredtwentyを返す() {
		String expected = "one hundred twenty";
		String actual = IntToEng.translateEng(120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int151を代入したらonehundredfiftyoneを返す() {
		String expected = "one hundred fifty one";
		String actual = IntToEng.translateEng(151);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1000を代入したらthousandを返す() {
		String expected = "thousand";
		String actual = IntToEng.translateEng(1000);
		assertThat(actual, is(expected));
	}
}

package IntToEng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void int0����������zero��Ԃ�() {
		String expected = "zero";
		String actual = IntToEng.translateEng(0);
		assertThat(actual, is(expected));
	}

	@Test
	public void int19����������nineteen��Ԃ�() {
		String expected = "nineteen";
		String actual = IntToEng.translateEng(19);
		assertThat(actual, is(expected));
	}

	@Test
	public void int20����������twenty��Ԃ�() {
		String expected = "twenty";
		String actual = IntToEng.translateEng(20);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int21����������twentyone��Ԃ�() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int100����������hundred��Ԃ�() {
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int120����������onehundredtwenty��Ԃ�() {
		String expected = "one hundred twenty";
		String actual = IntToEng.translateEng(120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int151����������onehundredfiftyone��Ԃ�() {
		String expected = "one hundred fifty one";
		String actual = IntToEng.translateEng(151);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1000����������thousand��Ԃ�() {
		String expected = "thousand";
		String actual = IntToEng.translateEng(1000);
		assertThat(actual, is(expected));
	}
}

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
	public void int119����������onehundrednineteen��Ԃ�() {
		String expected = "one hundred nineteen";
		String actual = IntToEng.translateEng(119);
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
	public void int1000����������onethousand��Ԃ�() {
		String expected = "one thousand";
		String actual = IntToEng.translateEng(1000);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1019����������onethousandnineteen��Ԃ�() {
		String expected = "one thousand nineteen";
		String actual = IntToEng.translateEng(1019);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1020����������onethousandtwenty��Ԃ�() {
		String expected = "one thousand twenty";
		String actual = IntToEng.translateEng(1020);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1100����������onethousandonehundred��Ԃ�() {
		String expected = "one thousand one hundred";
		String actual = IntToEng.translateEng(1100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1119����������onethousandonehundrednineteen��Ԃ�() {
		String expected = "one thousand one hundred nineteen";
		String actual = IntToEng.translateEng(1119);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1120����������onethousandonehundredtwenty��Ԃ�() {
		String expected = "one thousand one hundred twenty";
		String actual = IntToEng.translateEng(1120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1121����������onethousandonehundredtwentyone��Ԃ�() {
		String expected = "one thousand one hundred twenty one";
		String actual = IntToEng.translateEng(1121);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int10000����������tenthousand��Ԃ�() {
		String expected = "ten thousand";
		String actual = IntToEng.translateEng(10000);
		assertThat(actual, is(expected));
	}
}

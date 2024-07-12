package dvd.GitFirst01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void sumPositiveNumber() {
		App app = new App();
		int expected = 30;
		int actual = app.sumOfInteger(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void sumNegativeNumber() {
		App app = new App();
		int expected = -30;
		int actual = app.sumOfInteger(-10, -20);
		assertEquals(expected, actual);
	}

	@Test
	public void sumMixedNumber() {
		App app = new App();
		int expected = 30;
		int actual = app.sumOfInteger(-10, 40);
		assertEquals(expected, actual);
	}

	@Test
	public void sumWithZero() {
		App app = new App();
		int expected = 0;
		int actual = app.sumOfInteger(0, 0);
		assertEquals(expected, actual);
	}

}

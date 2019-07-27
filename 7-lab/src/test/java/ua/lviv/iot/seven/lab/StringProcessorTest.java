package ua.lviv.iot.seven.lab;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringProcessorTest {
	StringProcessor sp = new StringProcessor();
	String st = new String();
	int bank;

	@Test
	void readInputBankTest() throws IOException {
		bank = sp.readInputBank();
		assertEquals(1111, bank);
	}

	@Test
	void stringTest() throws IOException {
		st = sp.readInputText();
		assertEquals("1111", st);
	}

}

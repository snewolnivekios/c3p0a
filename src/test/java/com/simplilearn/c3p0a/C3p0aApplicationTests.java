package com.simplilearn.c3p0a;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class C3p0aApplicationTests {
	
	private C3p0aApplication app = new C3p0aApplication();

	@Test
	void testWordCount() {
		assertEquals(7, app.getWordCount("Train to win in the digital economy"));
	}

}

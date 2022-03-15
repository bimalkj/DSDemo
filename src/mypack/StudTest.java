package mypack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudTest {

	@Test
	void testToString() {
		Stud s=new Stud(10,"Aman");
		assertTrue(("Aman(10)").equals(s.toString()));
		return;
	}

}

package mypack;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class LauncherTest {
		//LinkNode n;
	
	@TestFactory
	Stream<DynamicTest> testComputeMulti() {
		int[][] x=new int[][] {{2,3,8},{9,7,25},{7,4,18},{8,5,68}};
		return Arrays.stream(x).map(el -> {
			int a=el[0];
			int b=el[1];
			int result=el[2];
			return dynamicTest("Testing compute for "+a+","+b+" expected "+result,()->{
				assertEquals(result,Launcher.compute(a,b));
			}) ;
		});	
	}
	
	@BeforeEach
	void setupData() {
		Launcher.addEnd(new Stud(10,"Anita"));
		Launcher.addEnd(new Stud(14,"Anil"));
		Launcher.addEnd(new Stud(18,"Sima"));
		//n=Launcher.head;
	}
	
	@Test
	void testAddafterroll() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test for adding student before given roll number")
	void testAddbeforeroll() {

		Launcher.addbeforeroll(14,new Stud(13,"Ajim"));
		LinkNode n=Launcher.head;
		while (n!=null) {
			if (n.data.rollno==13) 
				assertTrue(n.next.data.rollno==14);
			n=n.next;
		}
		return;
	}

	@Test
	void testAddEnd() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test for adding student at beginning")
	void testAddBeg() {
		Launcher.addBeg(new Stud(11,"Anil"));
		Launcher.addBeg(new Stud(10,"Ansh"));
		assertTrue(Launcher.head.data.rollno==10);
		return;
	}

	@Test
	void testDeleteroll() {
		fail("Not yet implemented");
	}
	
	@RepeatedTest(4)
	@Test
	@DisplayName("Test for compute method")
	void testCompute() { 
		assertEquals(19, Launcher.compute(5,7),"Result should be twice of larger number plus lower number");
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("do Something");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("idiot");
	}
	
	@Test
	void calculateSum_threeNumberArray() {
		assertEquals(6, myMath.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void calculateSum_zeroArray() {
		assertEquals(0, myMath.calculateSum(new int[] {}));
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("duffer");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("complete set things");
	}

}

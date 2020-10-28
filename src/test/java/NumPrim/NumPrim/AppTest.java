package NumPrim.NumPrim;

import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	private static MyMath math;
	@BeforeClass
	public static void prepare() throws Exception {
		math=new MyMath();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void prepare() throws Exception {
		math=new MyMath();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void primeGeneratorWorks() {
		assertEquals(new LinkedList<Integer>(), math.primeGenerator(1));
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19),math.primeGenerator(20));
	}
	
	@Test
	public void primeWorks() {
		assertFalse(math.prime(9));
		assertFalse(math.prime(1));
		assertTrue(math.prime(2));
		List<Integer>primes=new Arrays.asList(11,13,17,23,31,41,53,67,83,101);
		for(int prime:primes) {
			assertTrue(math.prime(prime));
		}
	}

}

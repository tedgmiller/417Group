import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

import java.util.*;


@RunWith(Parameterized.class)
public class MinTest {

	public List<? extends Comparable> List;
	public Object min;
	
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] { {1,2,3,4,5,1}, {53,77,88,90,100,53},
			{"one", "this", "as", "taco", "well", "as"}});
	}
	
	public MinTest(Object a, Object b, Object c, Object d, Object e, Object min) {
		ArrayList<Object> n = new ArrayList<Object>();
		n.add(a);
		n.add(b);
		n.add(c);
		n.add(d);
		n.add(e);
		this.List = (java.util.List<? extends Comparable>) n;
		this.min = min;
	}
	
	
	@Test
	public void TestMin(){
		assertEquals(true, min.equals(Min.min(this.List)));
	}
	
	
}
 
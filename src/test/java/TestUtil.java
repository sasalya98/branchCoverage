import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void whenArgsLengthIsOne() {
    c = new Util();
    int[] arr = new int[1];
    boolean result = c.compute(arr);
    assertTrue(result == false);
  }

  @Test
    public void whenArgsLengthIsEven() {
      c = new Util();
      int[] arr = new int[2];
      boolean result = c.compute(arr);
      assertTrue(result == false);
    }
}
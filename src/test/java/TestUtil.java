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

    @Test(expected = RuntimeException.class)
        public void whenThrowRunTimeExceptionWhenEncounteredZeroElement() {
          c = new Util();
          int[] arr = new int[3];
          arr[0] = 0;
          c.compute(arr);


        }
  @Test
      public void whenArgsLengthIsNotEven_isNotOne_DoesNotInclude0_AtLeastOneRemainderisZero() {
        c = new Util();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        boolean result = c.compute(arr);
        assertTrue(result == true);
      }

  @Test
        public void whenArgsLengthIsNotEven_isNotOne_DoesNotInclude0_NoneOfTheRemaindersIsZero() {
          c = new Util();
          int[] arr = new int[3];
          arr[0] = 3;
          arr[1] = 3;
          arr[2] = 5;
          boolean result = c.compute(arr);
          assertTrue(result == false);
        }
}
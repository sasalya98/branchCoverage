import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void testCountNumberOfOccurrences_WhenQueueIsEmpty_ReturnsMinusOne() {
    // Arrange
    MessageQueue mockQueue = mock(MessageQueue.class);
    when(mockQueue.size()).thenReturn(0);

    Compute compute = new Compute(mockQueue);

    // Act
    int result = compute.countNumberOfOccurrences("test");

    // Assert
    assertEquals(result, -1);
  }

  @Test
    public void testCountNumberOfOccurrences_WhenQueueIsNotEmpty_ReturnsMinusOne() {
      // Arrange
      MessageQueue mockQueue = mock(MessageQueue.class);
      when(mockQueue.size()).thenReturn(2);

      Compute compute = new Compute(mockQueue);

      // Act
      int result = compute.countNumberOfOccurrences("test");

      // Assert
      assertFalse(result == -1);
    }
  @Test
  public void testCountNumberOfOccurrences_WhenMQContains_e() {
    // Arrange
    MessageQueue mockQueue = mock(MessageQueue.class);
    when(mockQueue.contains("test")).thenReturn(true);
    when(mockQueue.size()).thenReturn(2);
    Compute compute = new Compute(mockQueue);

    // Act
    int result = compute.countNumberOfOccurrences("test");

    // Assert
    assertEquals(result, 0);
  }

  @Test
    public void testCountNumberOfOccurrences_WhenMQDoesNotContain_e() {
      // Arrange
      MessageQueue mockQueue = mock(MessageQueue.class);
      when(mockQueue.contains("test")).thenReturn(false);
      when(mockQueue.size()).thenReturn(2);
      Compute compute = new Compute(mockQueue);

      // Act
      int result = compute.countNumberOfOccurrences("test");

      // Assert
      assertEquals(result, 0);
    }

    @Test
    public void testCountNumberOfOccurrences_WhenMQDoesContain_e_AndEisMQsSecondElement() {
      // Arrange
      MessageQueue mockQueue = mock(MessageQueue.class);
      when(mockQueue.contains("test")).thenReturn(true);
      when(mockQueue.size()).thenReturn(2);
      Compute compute = new Compute(mockQueue);
      when(mockQueue.getAt(0)).thenReturn("test");
      // Act
      int result = compute.countNumberOfOccurrences("test");

      // Assert
      assertEquals(result, 1);
    }

}
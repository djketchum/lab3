import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedd() {
    int[] input = {2,3,4,70};
    assertArrayEquals(new int[] {70,4,3,2}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReverseInPlacee() {
    int[] input2 = {2,3,4,7};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {7,4,3,2}, input2);
  }

  @Test
  public void testAvgWithoutLowest() {
    double[] inputt = {6.0,8.0,2.0,2.0,4.0};
    assertEquals(6.0,ArrayExamples.averageWithoutLowest(inputt),1.0);
  }

  @Test
  public void testAvgWithoutLowestt() {
    double[] input = {6.0,2.0,7.0};
    assertEquals(6.5,ArrayExamples.averageWithoutLowest(input),1.0);
  }

}
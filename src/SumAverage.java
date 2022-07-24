/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    //  fill in code here using for loop and replace the return statement
    int sum = 0;
    if (lowerBound <= upperBound) {
      for (int i = lowerBound; i <= upperBound; i++) {
        sum += i;
      }
      return sum;
    } else {
      return 0;
    }

  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    //  fill in code here using for each loop and replace the return statement
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    //  fill in code here using while loop and replace the return statement
    double sum = 0;
    int count = 0;
    if (lowerBound <= upperBound) {
      while (lowerBound <= upperBound) {
        sum += lowerBound;
        count++;
        lowerBound++;
      }
      return sum / count;

    } else {
      return 0;
    }
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    //  fill in code here using do-while loop and replace the return statement
    return -1;
  }
}
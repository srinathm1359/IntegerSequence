import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }
  public boolean hasNext() {
    return false;
  }
  public int length() {
    return data.length;
  }
  public int next() {
    return 0;
  }
  public void reset() {

  }
}

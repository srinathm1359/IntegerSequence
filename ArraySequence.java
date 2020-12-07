import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
    data = new int[other.size];
    for (int i = 0; i < other.size; i++) {
      data[i] = other[i];
    }
  }
}

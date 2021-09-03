import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    public boolean isFizz(int i) {
        return i % 3 == 0;
    }

    public boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    public boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    public List<String> generateStrings(List<Integer> ints) {
        List<String> result = new ArrayList<>();
        for (Integer i : ints) {
            if (isFizzBuzz(i)) {
                result.add("FizzBuzz");
            } else if (isFizz(i)) {
                result.add("Fizz");
            } else if (isBuzz(i)) {
                result.add("Buzz");
            } else {
                result.add(i.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new FizzBuzz().generateStrings(IntStream.range(1,101).boxed().toList()).forEach(System.out::println);
    }
}

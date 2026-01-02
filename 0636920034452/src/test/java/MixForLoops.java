import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MixForLoops {

    @Test
    void shouldSkipTheFirstEntry() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        String output = "";
        for (int i = 1; i < nums.size(); i++) {
            output += nums.get(i) + " ";
        }
        System.out.println(output);

        assertEquals("2 3 4 5 ", output);
    }

    @Test
    void shouldThrowOutOfBoundsWhenLessThanOrEqual() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    List<Integer> nums = List.of(1, 2, 3, 4, 5);
                    String output = "";
                    for (int i = 0; i <= nums.size(); i++) {
                        output += nums.get(i) + " ";
                    }
                    System.out.println(output);
                }
        );
    }

    // Doesn't compile
    @Test
    void badFor3() {
//        List<Integer> nums = List.of(1, 2, 3, 4, 5);
//        String output = "";
//        for (int i = 0; i <= nums.length; i++) {
//            output += nums.get(i) + " ";
//        }
//        System.out.println(output);
    }

    // [1, 2, 3, 4, 5]
    //[1, 2, 3, 4, 5]
    //[1, 2, 3, 4, 5]
    //[1, 2, 3, 4, 5]
    //[1, 2, 3, 4, 5]
    @Test
    void shouldPrintTheListInsteadOfTheListElement() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        String output = "";
        for (Integer num : nums) {
            output += nums + " ";
        }
        System.out.println(output);

        assertEquals("[1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] ", output);
    }

    // doesn't compile
    @Test
    void shouldNotCompileBecauseOfUsingReservedWord() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        String output = "";
//        for (Integer int : nums) {
//            output += int + " ";
//        }
        System.out.println(output);
    }

    @Test
    void shouldPrintWithForEach() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.forEach(num -> System.out.println(num));
    }

}
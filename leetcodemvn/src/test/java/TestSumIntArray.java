import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumIntArray {
    @Test
    void test() {
        SumIntArray.Solution solution = new SumIntArray.Solution();

        assertEquals(10, solution.sumFrom1To(4));
        assertEquals(15, solution.sumFrom1To(5));

        assertEquals(21, solution.sumFrom1To(6));
    }
}

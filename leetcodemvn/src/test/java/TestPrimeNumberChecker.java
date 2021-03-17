import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrimeNumberChecker {

    @Test
    void test() {
        PrimeNumberChecker.Solution solution = new PrimeNumberChecker.Solution();
//        Các số nguyên tố nhỏ hơn 100 là:
        String expectedResult = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";
        String result = "";
        for (int i = 0; i < 100; i++) {
            if (solution.isPrimeNumber(i)) {
                result += i + " ";
            }
        }
        assertEquals(expectedResult, result);
    }
}

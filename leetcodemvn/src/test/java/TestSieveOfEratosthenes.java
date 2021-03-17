import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSieveOfEratosthenes {

    @Test
    void test() {
        SieveOfEratosthenes.Solution solution = new SieveOfEratosthenes.Solution();
        String expectedResult = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";

        List<Integer> primes = solution.sieveOfEratosthenes(100);
        String result = "";
        for (int i = 0; i < primes.size(); i++) {
            result += primes.get(i) + " ";
        }

        assertEquals(expectedResult, result);
    }
}

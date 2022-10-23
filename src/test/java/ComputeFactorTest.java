import Factors.ComputeFactors;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.ArrayList;

public class ComputeFactorTest {

    @Test
    public void computeTestWithA12() {
        Long number = (long) 12;

        ComputeFactors factors = new ComputeFactors(number);
        factors.compute();

        ArrayList<Long> expected = new ArrayList<>();
        expected.add((long) 1);
        expected.add((long) 2);
        expected.add((long) 3);
        expected.add((long) 4);
        expected.add((long) 6);
        expected.add((long) 12);

        assertThat(factors.getFactors()).isEqualTo(expected);
    }

}

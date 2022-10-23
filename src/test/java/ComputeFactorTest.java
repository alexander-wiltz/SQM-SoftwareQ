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

    @Test
    public void computeTestWithA13() {
        Long number = (long) 13;

        ComputeFactors factors = new ComputeFactors(number);
        factors.compute();

        ArrayList<Long> expected = new ArrayList<>();
        expected.add((long) 1);
        expected.add((long) 13);

        assertThat(factors.getFactors()).isEqualTo(expected);
    }

    @Test
    public void computeTestWithANegative5() {
        Long number = (long) -5;

        ComputeFactors factors = new ComputeFactors(number);
        factors.compute();

        ArrayList<Long> expected = new ArrayList<>();

        assertThat(factors.getFactors()).isEqualTo(expected);
    }

    @Test
    public void computeTestWithAZero() {
        Long number = (long) 0;

        ComputeFactors factors = new ComputeFactors(number);
        factors.compute();

        ArrayList<Long> expected = new ArrayList<>();

        assertThat(factors.getFactors()).isEqualTo(expected);
    }

    @Test
    public void computeTestWithADecimal() {
        Long number = (long) 12.1;

        ComputeFactors factors = new ComputeFactors((long)number);
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

    @Test
    public void computeTestWithAString() {
        Long number = Long.parseLong("abc");

        ComputeFactors factors = new ComputeFactors(number);
        factors.compute();

        ArrayList<Long> expected = new ArrayList<>();

        assertThat(factors.getFactors()).isEqualTo(expected);
    }

}

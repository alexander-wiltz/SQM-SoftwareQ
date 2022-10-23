//import Factors.ComputeFactors;
//import static org.assertj.core.api.Assertions.*;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//public class ComputeFactorTest {
//
//    @Test
//    public void computeTestWithA12() throws Exception {
//        Long number = (long) 12;
//
//        ComputeFactors factors = new ComputeFactors();
//        factors.compute(number);
//
//        ArrayList<Long> expected = new ArrayList<Long>();
//        expected.add((long) 2);
//        expected.add((long) 3);
//        expected.add((long) 4);
//        expected.add((long) 6);
//
//        assertThat(factors.getFactors()).isEqualTo(expected);
//    }
//
//    @Test
//    public void computeTestWithA6() throws Exception {
//        Long number = (long) 6;
//
//        ComputeFactors factors = new ComputeFactors();
//        factors.compute(number);
//        ArrayList<Long> expected = new ArrayList<Long>();
//        expected.add((long) 2);
//        expected.add((long) 3);
//
//        assertThat(factors.getFactors()).isEqualTo(expected);
//    }
//
//    @Test
//    public void computeTestWithA2() throws Exception {
//        Long number = (long) 2;
//
//        ComputeFactors factors = new ComputeFactors();
//        factors.compute(number);
//        ArrayList<Long> expected = new ArrayList<Long>();
//        expected.add((long) 2);
//
//        assertThat(factors.getFactors()).isEqualTo(expected);
//    }
//
//    @Test
//    public void computeTestWithA1() throws Exception {
//        Long number = (long) 1;
//
//        ComputeFactors factors = new ComputeFactors();
//        factors.compute(number);
//
//
//    }
//
//    @Test
//    public void computeTestWithZero() throws Exception {
//        Long number = (long) 0;
//
//        ComputeFactors factors = new ComputeFactors();
//        factors.compute(number);
//
//    }
//}

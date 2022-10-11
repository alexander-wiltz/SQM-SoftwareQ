import DreamCarApp.DreamCar;
import static org.assertj.core.api.Assertions.*;

import org.assertj.core.data.Percentage;
import org.junit.Test;

public class DreamCarTest {

    double basePrice;
    double specialPrice;
    double extraPrice;
    int extras;
    double discount;

    @Test
    public void calculatePriceTestWithExtra1() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isEqualTo(27450.0);
    }

    @Test
    public void calculatePriceTestWithExtra3() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 3;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isEqualTo(26850.0);
    }

    @Test
    public void calculatePriceTestWithExtra10() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 10;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isEqualTo(26550.0);
    }

    @Test
    public void calculatePriceTestWithNegativeBasePrice() {
        basePrice = -1.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithStringAsBasePrice() {
        // Impossible to call the method, cause of the compiler
        // There will be a NumberFormatException, while parsing the String as Double
        
        basePrice = Double.parseDouble("abc");
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithNegativeSpecialPrice() {
        basePrice = 20000.0;
        specialPrice = -1.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithStringAsSpecialPrice() {
        // Impossible to call the method, cause of the compiler
        // There will be a NumberFormatException, while parsing the String as Double

        basePrice = 20000.0;
        specialPrice = Double.parseDouble("abc");
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithNegativeExtraPrice() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = -1.0;
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithStringAsExtraPrice() {
        // Impossible to call the method, cause of the compiler
        // There will be a NumberFormatException, while parsing the String as Double

        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = Double.parseDouble("abc");
        extras = 1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithNegativeExtras() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = -1;
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithStringAsExtras() {
        // Impossible to call the method, cause of the compiler
        // There will be a NumberFormatException, while parsing the String as Double

        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = Integer.parseInt("abc");
        discount = 10.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithNegativeDiscount() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = -1.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithInsaneDiscount() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 101.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestWithStringAsDiscount() {
        // Impossible to call the method, cause of the compiler
        // There will be a NumberFormatException, while parsing the String as Double

        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = Double.parseDouble("abc");

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isNaN();
    }

    @Test
    public void calculatePriceTestOnlyWithZeros() {
        basePrice = 0.0;
        specialPrice = 0.0;
        extraPrice = 0.0;
        extras = 0;
        discount = 0.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isEqualTo(0.0);
    }

    @Test
    public void calculatePriceTestOnlyWithLowValues() {
        basePrice = 0.01;
        specialPrice = 0.01;
        extraPrice = 0.01;
        extras = 2;
        discount = 0.01;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isCloseTo(0.03, Percentage.withPercentage(0.01));
    }

    @Test
    public void calculatePriceTestWithMAXIMUMPrices() {
        basePrice = Double.MAX_VALUE - 0.01;
        specialPrice = Double.MAX_VALUE - 0.01;
        extraPrice = Double.MAX_VALUE - 0.01;
        extras = 4;
        discount = 99.99;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        // TODO: proof this statement!
        assertThat(calculatedPrice).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void calculatePriceTestWithMAXIMUMBasePrice() {
        basePrice = Double.MAX_VALUE - 0.01;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.00;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void calculatePriceTestWithMAXIMUMSpecialPrice() {
        basePrice = 20000.0;
        specialPrice = Double.MAX_VALUE - 0.01;
        extraPrice = 6000.0;
        extras = 1;
        discount = 10.00;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void calculatePriceTestWithMAXIMUMExtraPrice() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = Double.MAX_VALUE - 0.01;
        extras = 1;
        discount = 10.00;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    // No tests from Book
    @Test
    public void calculatePriceTestWithMAXIMUMExtras() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = Integer.MAX_VALUE - 1;
        discount = 10.00;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void calculatePriceTestWithMAXIMUMDiscount() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = Double.MAX_VALUE - 0.01;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        assertThat(calculatedPrice).isGreaterThan(Double.MAX_VALUE);
    }

    @Test
    public void calculatePriceTestWithMaxValidDiscount() {
        basePrice = 20000.0;
        specialPrice = 3450.0;
        extraPrice = 6000.0;
        extras = 1;
        discount = 100.0;

        DreamCar dreamCar = new DreamCar(basePrice, specialPrice, extraPrice, extras, discount);
        double calculatedPrice = dreamCar.calculatePrice();

        // TODO: is it possible to get a maximum discount (baseprice for free)? Should be clarified!
        assertThat(calculatedPrice).isEqualTo(9450.0);
    }

}

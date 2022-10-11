package Factors;

/**
 * Hauptprogramm für die Berechnung aller Teiler einer angegebenen Zahl.
 */
public class FactorsMain {

    public static void main(String[] args) throws Exception {

        Long number = (long) 12;
        ComputeFactors factors = new ComputeFactors();
        factors.compute(number);

        System.out.println(factors);

        factors.compute((long) 1);
        System.out.println(factors);
    }
}

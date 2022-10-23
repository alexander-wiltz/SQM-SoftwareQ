package Factors;

/**
 * Hauptprogramm f�r die Berechnung aller Teiler einer angegebenen Zahl.
 */
public class FactorsMain {

    public static void main(String[] args) {

        Long number = (long) 13;
        ComputeFactors factors = new ComputeFactors(number);
        factors.compute();

        System.out.println(factors);
		System.out.println("Schleifendurchlaeufe: " + factors.getLoopCounter());

        // optimized version
        System.out.println("**************");
        ComputeFactors factorsOpt = new ComputeFactors(number);
        factorsOpt.optimizedCompute();

        System.out.println(factorsOpt);
        System.out.println("Schleifendurchlaeufe: " + factorsOpt.getLoopCounter());
    }
}

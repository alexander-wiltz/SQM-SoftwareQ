package Factors;

import java.util.ArrayList;

/**
 * Berechnung aller Teiler einer ganzen Zahl.
 * <p>
 * Aufgabenstellung
 */
public class ComputeFactors {

    private Long number;
    private ArrayList<Long> factors;

    public ComputeFactors() {
        this.factors = new ArrayList<Long>();
    }

    public void compute(Long number) throws Exception {
        // we have to start with 2, obviously because every number is dividable through 1 ;)
        Long helpDiv = (long) 2;

        // make sure, that given argument is bigger than 2
        if (number < 2) {
            throw new Exception("number argument has to be a minimum of 2");
        } else {
            this.number = number;
        }

        while (helpDiv <= this.number - 1) {
            if (this.number % helpDiv == 0) {
                // add if number is a factor
                this.factors.add(helpDiv);
            }
            helpDiv++;
        }
    }

    public ArrayList<Long> getFactors() {
        return factors;
    }

    @Override
    public String toString() {
        String text = "";
        text = "Die Teiler der Zahl " + this.number + ":\n";
        text += this.factors.toString();
        return text;
    }
}

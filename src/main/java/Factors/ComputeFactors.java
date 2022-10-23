package Factors;

import java.util.ArrayList;

/**
 * Berechnung aller Teiler einer ganzen Zahl.
 * <p>
 * Aufgabenstellung
 * <p>
 * edit:
 *
 * @author Alexander Wiltz
 * Code dahingehend angepasst, dass auch die Teiler 1 und die Zahl selbst berücksichtigt werden.
 * Aus Optimierungsgründen werden diese 'hart' angefügt, um die Schleifendurchläufe um 2 zu reduzieren
 *
 * Optimierte Methode optimizedCompute(), reduziert die Anzahl der Durchläufe um mind. die Hälfte.
 */
public class ComputeFactors {

    private final Long number;
    private final ArrayList<Long> factors;

    private int loopCounter = 0;

    public ComputeFactors() {
        this.number = (long) 1;
        this.factors = new ArrayList<>();
    }

    public ComputeFactors(Long number) {
        this.number = number;
        this.factors = new ArrayList<>();
    }

    public ComputeFactors(long number) {
        this.number = number;
        this.factors = new ArrayList<>();
    }

    public void compute() {
        Long helpDiv = (long) 2;

        this.factors.add((long) 1);
        while (helpDiv <= this.number - 1) {
            if (this.number % helpDiv == 0) {
                this.factors.add(helpDiv);
            }
            helpDiv++;
            this.loopCounter++;
        }
        this.factors.add(this.number);
    }

    public void optimizedCompute() {
        Long helpDiv = (long) 2;

        this.factors.add((long) 1);
        while (helpDiv <= (this.number / 2)) {
            if (this.number % helpDiv == 0) {
                this.factors.add(helpDiv);
            }
            helpDiv++;
            this.loopCounter++;
        }

        this.factors.add(this.number);
    }

    @Override
    public String toString() {
        String text = "Die Teiler der Zahl " + this.number + ":\n";
        text += this.factors.toString();
        return text;
    }

    public int getLoopCounter() {
        return loopCounter;
    }

    public ArrayList<Long> getFactors() {
        return factors;
    }
}

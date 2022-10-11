package DreamCarApp;

/**
 * Klasse f�r die Berechnung des Preises.
 * <p>
 * Der Quelltext wurde angepasst. Die Parameter im Quelltext
 * aus Spillner et. al. auf Seite 46 wurden als Daten in der Klasse
 * realisiert. Die Aufrufliste der Funktion ist jetzt leer.
 */

import java.util.Objects;

/**
 * Spezifikation:
 * Ausgegangen wird vom Grundpreis des Fahrzeugs (baseprice), abzüglich Händlerrabatt (discount).
 * Sondermodellaufschlag (specialprice) und Preis der weiteren Zusatzausstattung (extraprice) sind zu addieren.
 * Werden drei oder mehr Zusatzausstattungen (nicht im gewählten Sondermodell enthalten) ausgewählt (extras),
 * erfolgt nur auf diese Ausstattungsmerkmale eine Rabattierung von 10%. Bei fünf oder mehr Zusatzausstattungen
 * erhöht sich die Rabattierung auf 15%.
 * <p>
 * Der Händlerrabatt bezieht sich auf den Grundpreis. Der Zubehörrabatt ist nur auf den Preis der Zubehörteile anzurechnen.
 * Beide Rabatte können nicht zusammen angerechnet werden.
 */

public class DreamCar {
    private double basePrice;
    private double specialPrice;
    private double extraPrice;
    private int extras;
    private double discount;

    public DreamCar(double b, double s, double x, int e, double d) {
        this.basePrice = b;
        this.specialPrice = s;
        this.extraPrice = x;
        this.extras = e;
        this.discount = d;
    }

    public double calculatePrice() {
        double addonDiscount;

        // make sure that input values are valid
        // first: no values lower than zeros
        if (basePrice < 0 || specialPrice < 0 || extraPrice < 0 || extras < 0 || discount < 0) {
            return Double.NaN;
        }
        // next: no discount greater than 100
        if (discount > 100) {
            return Double.NaN;
        }
        // proof for valid maximum values => should be given from customer
        if (basePrice > 150000 || specialPrice > 10000 || extraPrice > 10000 || extras > 20) {
            return Double.MAX_VALUE + 0.01;
        }

        // proof dealer discount
        if (extras >= 3 && extras < 5) {
            addonDiscount = 10;
        } else if (extras >= 5) {
            addonDiscount = 15;
        } else {
            addonDiscount = 0;
        }

        if (discount > addonDiscount) {
            addonDiscount = 0;
        }

        return (basePrice / 100.0) * (100.0 - discount)
                + specialPrice
                + extraPrice / 100.0 * (100.0 - addonDiscount);
    }
}

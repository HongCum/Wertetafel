package de.hong;

public class Wertetafel {

    private double derStartwert;
    private double derEndwert;
    private double dieSchrittweite;

    public Wertetafel(String[] Liste) {
        derStartwert = Double.parseDouble(Liste[0]);
        derEndwert = Double.parseDouble(Liste[1]);
        dieSchrittweite = Double.parseDouble(Liste[2]);
    }

    public void ausgeben() {
        // i | (i * i - 2)
        // derStartwert - x += dieSchrittweite > derEndwert;
        for (double x = derStartwert; x <= derEndwert; x = x + dieSchrittweite) {
            double y = f(x);
            System.out.println(x + " | " + y);
        }
    }

    private double f(double x) {
        return x * x - 2;
    }

}

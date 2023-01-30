package de.hong;

public class Main {

    public static void main(String[] args) {
        String[] Liste = new String[3];
        Liste[0] = "0" ;
        Liste[1] =  "0,5"  ;
        Liste[2] = "1";

        Wertetafel wertetafel = new Wertetafel(args);
        wertetafel.ausgeben();
    }

}
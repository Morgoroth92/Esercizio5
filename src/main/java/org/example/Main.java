package org.example;
/*
    Scrivere una funzione che accetti in input un numeratore e un denominatore
    Controlli che il numeratore e il denominatore non siano null
    Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
 */

public class Main {
    public static void main(String[] args) {
        try {
            divisione(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            divisione(10, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void divisione(int numeratore, int denominatore) throws Exception {
        if (denominatore == 0 || numeratore == 0) {
            throw new Exception("Il denominatore o numeratore non possono essere 0");
        }
        System.out.println(numeratore / denominatore);
    }
}

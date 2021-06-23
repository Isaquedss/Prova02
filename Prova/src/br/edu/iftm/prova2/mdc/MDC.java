package br.edu.iftm.prova2.mdc;

public class MDC {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
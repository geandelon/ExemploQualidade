package delon.com.br.exemploqualidade;

public class Primo {

    public static boolean isPrimo(int numero) {
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            return true;
        }

        return false;
    }

}

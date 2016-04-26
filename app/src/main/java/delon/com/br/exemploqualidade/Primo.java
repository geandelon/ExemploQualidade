package delon.com.br.exemploqualidade;

/**
 *
 */
public final class Primo {

    private Primo() {

    }

    /**
     *
     * @param numero numero a ser verificado
     * @return se o numero em questão é primo ou não
     */
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

    /*
    public static void testeMaluco() {
        List<Integer> inteiros = null;

        Integer mAux = 1;
        for (Integer inteiro : inteiros) {
            mAux += inteiro;
        }
    }
    */

}

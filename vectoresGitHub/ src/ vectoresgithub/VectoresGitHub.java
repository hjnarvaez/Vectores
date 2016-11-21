package vectoresgithub;

public class VectoresGitHub {

    public static void main(String[] args) {
        //2222
        int termino = 0;
        int x = 0;
        double sumatoria = 0, t = 0;

        System.out.println("bienvenido a la Serie de taylor");

        System.out.println("Cuántos términos desea:");
        termino = entrada.nextInt();

        System.out.println("Ingrese el valor de X:");
        x = entrada.nextInt();
        int n;

        for (int i = 0; n >= 1; i++) {
            t = factorial(i) / Math.pow(x, i);
            s *= t;
        }

        System.out.printf("f( % d) =  % f\n”, x, s");

    }

public static double Factorial(int numero) {

        double resultado = 1;

        for (int i = 1; i <= numero; i++) {

            resultado *= i;

        }

        return (resultado);

    }

    private static double factorial(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

    }
    
}

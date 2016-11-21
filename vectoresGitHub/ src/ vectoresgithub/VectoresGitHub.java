package vectoresgithub;

public class VectoresGitHub {

    public static void main(String[] args) {
        //2222
         int A[];
        int B[];
        int pares = 0;
        int vecA[] = new int[pares];
        int impares = 0;
        int vecB[] = new int[pares];
        int suma = 0;
        for (int i = 0; i < vecA.length; i++) {
            vecA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número " + (i + 1) + " del vector"));

            System.out.print(vecA[i] + " ");
            suma += vecA[i];
        }
        System.out.println("\nLa suma es de: " + suma);

    }
}
    }
    
}

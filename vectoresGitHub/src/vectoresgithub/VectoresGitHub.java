package vectoresgithub;

public class VectoresGitHub {

    public static void main(String[] args) {
       public static void main(String[] args) {
        EjemploGitHub objeto=new EjemploGitHub();
        objeto.vector();
    }

    private void vector() {
        int A[],i;
        int []B={1,2,3,4};
        A=new int [5];
        B=new int[5];
        i=0;
        do {
            A[i]=i*2;
            i++;
        } while(i<5);
        imprimir(A);
    }
    
    public void imprimir(int[] A1) {
        int i=0;
        while(i<A1.length){
            System.out.print(A1[i]);
        }
    }
}


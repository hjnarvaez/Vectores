package vectoresgithub;

public class VectoresGitHub {

    public static void main(String[] args) {
        //2222
   
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        EJEMPLOcris objeto = new EJEMPLOcris();
        objeto.vector();
    }

    public void vector() {      
        int limite=10;
        int i=1;
        int s=2;
        int A[];
        int B[];
        int result[];
        A = new int [6];
        B = new int [6];
        
        i=0;
        do {
        A[i] = +(i/(i+1));
        B[s] = +(i/(i+1));
        i++;
                }while(i<=limite);
        imprimir(A)(B);  
     }  
       public void imprimir(int[] A1) {
        int i = 0;
        while (i < A1.length) {
            System.out.print(A1[i]);
            i++;
        }
    }
} 
       

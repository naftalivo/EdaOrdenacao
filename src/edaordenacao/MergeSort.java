
package edaordenacao;

public class MergeSort {
    
    static int [] vet = {10,5,9,5,6,4,5,14,45,65,0};
   
    
    public static void main(String[] args) {
        new MergeSort().mergeSort(0, vet.length-1);
        
        for(int i = 0;i<vet.length;i++)
        System.out.print(vet[i]+" | ");   
             
    }
    int cont=0;
    private void mergeSort(int inicio,int fim){
        int meio;
        
        if(inicio < fim){
            meio = (inicio + fim)/2;
    
            mergeSort(inicio, meio);
            mergeSort(meio+1, fim);
            ordenar(inicio,meio,fim);
           
            
        }
        
        
    }
    private void ordenar(int inicio,int meio,int fim){
       
        int auxiliar;
        
        for (int i = inicio;i<=meio;i++){ 
            for (int j=meio+1;j<=fim;j++){
                if (vet[j] <= vet[i] ){
                    auxiliar = vet[i];
                    vet[i] = vet[j];
                 
                    for(int k = j; k>=i+1;k--)
                        vet[k] = vet[k-1];
                    
                    vet[i+1] = auxiliar;
                  
                }
                    
            }
        }
        
    }
    
    
}

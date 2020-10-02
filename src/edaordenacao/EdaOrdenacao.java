
package edaordenacao;

/**
 *
 * @author User
 */
public class EdaOrdenacao {

    public static void main(String[] args) {
        new EdaOrdenacao().insertionSort();
       // new EdaOrdenacao().bubleSort();

    }
    
    private void insertionSort(){
        int [] vet = {10,5,9,5,6,4,5,14};
        int aux;
        int i;
        
        for (int j = 1; j<vet.length;j++){  
           i = j;
            while(i != 0){
               
                if(vet[i] < vet[i-1]){
                    aux = vet[i];
                    vet[i]= vet[i-1];
                    vet[i-1] = aux;
                    
                }else
                    break;
                
                 i--;
            }
            
        }
        for(int j = 0; j<vet.length;j++)
        System.out.print(vet[j]+" | ");
        
        
    }
    
    public void bubleSort(){
        int [] vet = {10,5,9,5,6,4,5,14};
        int aux;
        int cont = 0;
        
        
        for(int j = 0;j<vet.length;j++){
            
            for(int i=0;i<vet.length-1;i++){
                if(vet[i]>vet[i+1]){
                    aux = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = aux;
                }
                
            }
            cont++;
            
        }
//        while(cont != vet.length){
//            for(int i=0;i<vet.length-1;i++){
//                if(vet[i]>vet[i+1]){
//                    aux = vet[i];
//                    vet[i] = vet[i+1];
//                    vet[i+1] = aux;
//                }
//                
//            }
//            cont++;
//        }
        
        for(int j = 0; j<vet.length;j++)
        System.out.print(vet[j]+" | ");
        
    }
    
}

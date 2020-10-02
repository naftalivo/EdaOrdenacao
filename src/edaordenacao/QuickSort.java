/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edaordenacao;

/**
 *
 * @author Ivo
 */
public class QuickSort {
    static int [] vet = {10,5,9,5,6,4,5,14,45,1};
  
    
    public static void main(String[] args) {  
      new QuickSort().quickSort(0,vet.length-1);
      
      for(int i = 0;i<vet.length;i++)
        System.out.print(vet[i]+" | ");   
    }
    
    public void quickSort(int inicio,int fim){
        int pivo;
        
        if (fim>inicio){
            pivo = dividir(inicio,fim);    
            quickSort(inicio, pivo-1);
            quickSort(pivo+1, fim);
            
        }    
    } 
    
    public int dividir(int in,int fim){
       int aux;
        
       int esqerda  = in;
       int direita = fim;
       int  pivo = vet[in];
         
        while(esqerda < direita ){
            
            while(vet[esqerda] <= pivo ){
                if(esqerda != vet.length-1)
                    esqerda++;
                else
                    break;
                
            }
                
            
            while(vet[direita] > pivo)
                direita--;
            
            if(esqerda < direita){
                aux = vet[esqerda];
                vet[esqerda] = vet[direita];
                vet[direita] = aux;
            }
        } 
        vet[in] = vet[direita];
        vet[direita]= pivo;
    
        
        return direita;
    }
    
    
}

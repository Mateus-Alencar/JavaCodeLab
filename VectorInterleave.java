public class Main{
	public static void main(String[] args) {
		int[] vetor = {1,3,-7,12,-9,-3,4,1000};
		int[] vetor2 = {1,6,-9,12,-9,-3,34,-8};
		
		SegundoMaiorElemento segMaiEle = new SegundoMaiorElemento(vetor);
		segMaiEle.elemento();
		
		IntercalarNumerosVetor intercalar = new IntercalarNumerosVetor(vetor2);
        intercalar.organizarVetor();
	}
}

class IntercalarNumerosVetor{
    public int[] vetor2;
    public IntercalarNumerosVetor(int[] vetor2){
        this.vetor2 = vetor2;
    }
    
    public void organizarVetor(){
        
        int countPositivo = 0;
        int countNegativo = 0;
        
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] > 0) countPositivo++;
            if (vetor2[i] < 0) countNegativo++;
        }
        
        int[] vetorPositivo = new int[countPositivo];
        int[] vetorNegativo = new int[countNegativo];
        int p = 0;
        int n = 0;
        for(int x = 0; x < vetor2.length; x++){
            if(vetor2[x] >= 0){
                vetorPositivo[p] = vetor2[x] ;
                p++;
            }
            if(vetor2[x] < 0){
                vetorNegativo[n] = vetor2[x];
                n++;
            }
        }
        int[] vetorAux = new int[vetorPositivo.length + vetorNegativo.length];
        for (int x = 0, i = 0; i < vetorPositivo.length; i++) {
            vetorAux[x++] = vetorPositivo[i];
            if (i < vetorNegativo.length) {
                vetorAux[x++] = vetorNegativo[i];
            }
        }

        for(int z = 0; z < vetorAux.length; z ++){
            System.out.print(vetorAux[z] + " * ");   
        }
    }
}

class SegundoMaiorElemento{
    int[] vetor;
    public SegundoMaiorElemento(int []vetor){
        this.vetor = vetor;
    } 
    
    public void elemento(){
        int maior = vetor[0];
        int segundoMaior = vetor[0];
        for(int x = 1; x < vetor.length; x++){
            if(vetor[x] > maior){
                segundoMaior = maior;
                maior = vetor[x];
            }
        }
        System.out.println(segundoMaior);
    }
}

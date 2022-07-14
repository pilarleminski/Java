package arrays;
 /*
 Crie um vetor de 6 números e mostre-os na ordem inversa
  */
public class ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};
        int count = 0;
        while(count < vetor.length){
            System.out.println(vetor[count]);
            count++;
        }

        System.out.println("Vetor inverso: ");
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}

public class InverteString {
    public static void main(String[] args){
        //declarando a vaiavel string
        String str = "alasca";
        System.out.println(str);
        // criando um vetor pra armazenar a string converter o vetor em string
        char[] vet = str.toCharArray();

        int inicio = 0;
        int fim = vet.length-1;
        char aux;
        // lação de repetição para fazer a inversão
        while(fim>inicio){
            aux = vet[inicio];
            vet[inicio] = vet[fim];
            vet[fim] = aux;
            fim--;
            inicio++;
        }
        // convertendoem string e mostrando o resultado
        str = new String(vet);
        System.out.println(str);
    }

}



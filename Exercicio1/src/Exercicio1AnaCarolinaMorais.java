public class Exercicio1AnaCarolinaMorais {
    public static void main(String[] args) {

        String produtos = "Mesa:30;Cadeira:25;Faca:2;Copo:3;" +
                "Fogao:255;Jarro:4;Prato:3";  // É igual ao exemplo dado do exercicio; Retirei o acento à palavra "Fogão" para o print sair bem.

        String encomenda = "20@copo;5@faca;4@mesa;1@fogao";

        produtos  = allInMinusculo(produtos);
        encomenda = allInMinusculo(encomenda);

        String [] prod = produtos.split("[:;]+");//Faz split de dois delimitadores, neste caso é ":" e ";"
        String [] enc = encomenda.split("[@;]+");


        String[][] mProd = new String[prod.length/2][prod.length/2];
        String [][] mEnc = new String[enc.length/2][enc.length/2];

        int [] vetor  = new int[enc.length/2] ;

        colocaMatriz(prod, mProd); // Vai Colocar os produtos e os preços nas linhas e colunas certos, respetivamente
        colocaMatriz2(enc,mEnc); // Este método difere do acima, uma vez que coloquei todos os produtos da encomenda na coluna 0

        preencheVetor(mEnc, mProd, vetor);

        int TOTAL = soma(vetor);

        String [] s = new String[mEnc.length];//Criei uma nova string para conter os produtos da Encomenda com a Inicial maisucla, uma vez que as strings são imutáveis

        colocaInicialMaiuscula(mEnc, s);

        printResultados(mEnc,vetor,TOTAL,s);


    }


    private static String allInMinusculo(String s) {
        return s.toLowerCase();
    }

    private static void colocaMatriz(String[] prod, String[][] mProd) {
        for(int i = 0;i<prod.length/2;i++){
            mProd[i][0]= prod[2*i];
            mProd[i][1] = prod[2*i+1];
        }
    }
    private static void colocaMatriz2(String[] enc, String[][] mEnc) {
        for(int j = 0;j<enc.length/2;j++){
            mEnc[j][0]=enc[2*j+1];
            mEnc[j][1]=enc[2*j];
        }
    }

    private static void preencheVetor(String[][] mEnc, String[][] mProd, int[] vetor) {
        for(int i = 0;i<mEnc.length;i++){
            int pos = procura(mEnc[i][0],mProd);
            int x = convertNumero(mEnc[i][1]);
            int y = convertNumero(mProd[pos][1]);
            vetor[i] = x*y; // O resultado da multiplicação fica guardado no vetor
        }
    }
    private static int convertNumero(String s) {
        return Integer.parseInt(s);
    }


    private static int procura(String s, String[][] tabela) { // Este método permite percorrer a tabela dos produtos e ver se contem o produto da encomenda e retorna a posição na tabela dos produtos onde esta, de forma a conseguir encontrar o seu preço
        for(int i = 0;i< tabela.length;i++){
            if(tabela[i][0].equals(s)){
                return i;

            }
        }
        return 0;
    }

    private static int soma(int[] vetor) {
        int T = 0;
        for (int j : vetor) {
            T = T + j;
        }
        return T;
    }

    private static void colocaInicialMaiuscula(String[][] mEnc, String[] s) {
        for(int i = 0;i<mEnc.length;i++){
            s[i] = mEnc[i][0].substring(0,1).toUpperCase()+ mEnc[i][0].substring(1);
        }
    }

    private static void printResultados(String[][] mEnc, int[] vetor, int TOTAL, String[] s) {
        for(int i = 0;i< mEnc.length;i++){
            System.out.printf("%3s x %6s: %3d\n",mEnc[i][1],s[i],vetor[i]);
        }
        System.out.printf("\t   Total: %3d Euro(s)",TOTAL);


    }

}

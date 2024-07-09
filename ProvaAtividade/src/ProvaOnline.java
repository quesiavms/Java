import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProvaOnline{

public static int randomer(int x){
    Random rand = new Random();
    return rand.nextInt(10);
}

public static String pergunta(String[] vetor1){

    String[] vetorAux = new String [4];
    vetorAux[0] = vetor1[1];
    vetorAux[1] = vetor1[2];
    vetorAux[2] = vetor1[3];
    vetorAux[3] = vetor1[4];
    
    String selectedOption;     
    selectedOption = (String) JOptionPane.showInputDialog(null, vetor1[0], "Questão ", JOptionPane.QUESTION_MESSAGE, null, vetorAux, vetorAux[0]);
    return selectedOption;
}

public static void prova(String [][] matriz1){
    String[] vetor1 = new String[6];
    int index = 0;
    int aleatorio;
    int acertos = 0;

    for (int i=0; i <5; i++){
    //linha (pergunta aleatoria)
    aleatorio = randomer(index);
    vetor1[0] =matriz1[aleatorio][0];
    vetor1[1] =matriz1[aleatorio][1];
    vetor1[2] =matriz1[aleatorio][2];
    vetor1[3] =matriz1[aleatorio][3];
    vetor1[4] =matriz1[aleatorio][4];
    vetor1[5] =matriz1[aleatorio][5];

    String letraEscolhida;
    String resposta = pergunta(vetor1);
    letraEscolhida = String.valueOf(resposta.charAt(0));
    
    if(vetor1[5].equalsIgnoreCase(letraEscolhida)){
        acertos++;
    }
}
    int media = (acertos*100) /5 ;
    JOptionPane.showMessageDialog(null, "Você Acertou "+ acertos+ " questões. \nSua média foi: "+media+"%");

    if (media <70){
        int opcao = JOptionPane.showConfirmDialog(null, "Sua média foi abaixo de 70%. Deseja refazer a prova ?", "Refazer a prova", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION){
            prova(matriz1);
        }
        else {
            System.out.println("Aluno não deseja refazer prova" + "\nSua média é de: "+media);
        }
    }
}

public static void inicio(){
    String [][] matriz1 = new String [10][6];

    matriz1[0][0] = "QUANTO É 1 + 1 ?";
    matriz1[0][1] = "A) 2";
    matriz1[0][2] = "B) 3";
    matriz1[0][3] = "C) 4";
    matriz1[0][4] = "D) 5";
    matriz1[0][5] = "A";

    matriz1[1][0] = "QUANTO É 2 + 2 ?";
    matriz1[1][1] = "A) 2";
    matriz1[1][2] = "B) 3";
    matriz1[1][3] = "C) 4";
    matriz1[1][4] = "D) 5";
    matriz1[1][5] = "C";

    matriz1[2][0] = "QUANTO É 3 + 3 ?";
    matriz1[2][1] = "A) 2";
    matriz1[2][2] = "B) 3";
    matriz1[2][3] = "C) 6";
    matriz1[2][4] = "D) 5";
    matriz1[2][5] = "C";

    matriz1[3][0] = "QUANTO É 4 + 4 ?";
    matriz1[3][1] = "A) 6";
    matriz1[3][2] = "B) 8";
    matriz1[3][3] = "C) 7";
    matriz1[3][4] = "D) 11";
    matriz1[3][5] = "B";

    matriz1[4][0] = "QUANTO É 5 + 5 ?";
    matriz1[4][1] = "A) 4";
    matriz1[4][2] = "B) 9";
    matriz1[4][3] = "C) 10";
    matriz1[4][4] = "D) 5";
    matriz1[4][5] = "C";

    matriz1[5][0] = "QUANTO É 6 + 6 ?";
    matriz1[5][1] = "A) 12";
    matriz1[5][2] = "B) 13";
    matriz1[5][3] = "C) 14";
    matriz1[5][4] = "D) 15";
    matriz1[5][5] = "A";

    matriz1[6][0] = "QUANTO É 7 + 7 ?";
    matriz1[6][1] = "A) 12";
    matriz1[6][2] = "B) 13";
    matriz1[6][3] = "C) 14";
    matriz1[6][4] = "D) 15";
    matriz1[6][5] = "C";

    matriz1[7][0] = "QUANTO É 8 + 8 ?";
    matriz1[7][1] = "A) 12";
    matriz1[7][2] = "B) 16";
    matriz1[7][3] = "C) 14";
    matriz1[7][4] = "D) 15";
    matriz1[7][5] = "B";

    matriz1[8][0] = "QUANTO É 9 + 9 ?";
    matriz1[8][1] = "A) 20";
    matriz1[8][2] = "B) 13";
    matriz1[8][3] = "C) 18";
    matriz1[8][4] = "D) 15";
    matriz1[8][5] = "C";

    matriz1[9][0] = "QUANTO É 10 + 10 ?";
    matriz1[9][1] = "A) 20";
    matriz1[9][2] = "B) 30";
    matriz1[9][3] = "C) 40";
    matriz1[9][4] = "D) 50";
    matriz1[9][5] = "A";

    Scanner entrada = new Scanner(System.in);
    System.out.println("------------------------------------------------");
    System.out.println("\tBem vinda a Prova Digital");
    System.out.print("Insira seu nome: ");
    String nome = entrada.nextLine();
    System.out.println(nome+" deseja iniciar a prova agora? (Y/N) ");
    String resposta = entrada.nextLine();

    if(resposta.equalsIgnoreCase("y")){
        prova(matriz1);
    } else {
        System.out.println("Você escolheu não realizar a prova");
    }
}

    public static void main(String[] args) throws Exception {
        inicio();

    }
}

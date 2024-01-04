package L13.Q1.view;

import L13.Q1.model.Diretorio;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do diretório: ");
        String directorPath = sc.nextLine();

        try {
            Diretorio dir = new Diretorio(directorPath);

            long tamanho = dir.ObterTamanhoArquivos();

            System.out.println("Tamanho dos Arquivos(Byte): " + tamanho);
            System.out.println("Tamanho dos Arquivos(MegaByte): " + (tamanho / 1024.0 / 1024.0));

        } catch (Exception e) {

            System.err.println(e.getMessage());

        } finally {
            sc.close();
        }
    }

}

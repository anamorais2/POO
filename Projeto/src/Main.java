import javax.swing.*;

/**
 * Main do projeto
 * @author ferna
 * @version 1.0
 */
public class Main {
    /**
     * Construtor Vazio
     */
    public Main(){}
    /**
     * Main do projeto, onde se inicializa os ficheiros e se verifica a condição de existência, também se inicializa o GUI.
     * Criação da nossa lista de empresas
     * @param args Vazio
     */
    public static void main(String[] args){

        GerirEmpresas listaEmpresas = new GerirEmpresas();
        FicheiroTexto file = new FicheiroTexto();
        FicheiroObjetos fileObjectos = new FicheiroObjetos();

        if (fileObjectos.getFile().exists() && fileObjectos.getFile().isFile()){
            listaEmpresas = fileObjectos.ler();
        }else {
            listaEmpresas = file.leitura();
            fileObjectos.escrita(listaEmpresas);
        }

        System.out.println("\nLista de empresas\n");
        listaEmpresas.imprime();

        Interface inter = new Interface(listaEmpresas);
        inter.setTitle("Menu");
        inter.setSize(900,900);
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setVisible(true);
    }
}


import java.io.*;
import java.lang.*;
/**
 * Classe para gerir os dados de um Ficheiro de Objetos
 * @author ferna
 * @version 1.0
 */
public class FicheiroObjetos {
    /**
     * Ficheiro de Objetos
     */
    private File file;
    /**
     * Método Construtor, onde é inicializado o Ficheiro de Objetos
     */
    public FicheiroObjetos(){file = new File("starthive.dat");}

    /**
     * Método de acesso externo ao Ficheiro de Objetos
     * @return (File) Ficheiro de Objetos
     */
    public File getFile() {return file;}
    /**
     * Método Complementar de acesso externo ao Ficheiro de Objetos
     * @param file Ficheiro de Objetos
     */
    public void setFile(File file) {this.file = file;}

    /**
     * Método que escreve um Objeto do tipo GerirEmpresas no Ficheiro de Objetos
     * @param lista Objeto do Tipo GerirEmpresas
     */
    public void escrita(GerirEmpresas lista) {
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(lista);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Método que lê um Objeto do tipo GerirEmpresas do Ficheiro de Objetos
     * @return (GerirEmpresas) Lista das Empresas
     */
    public GerirEmpresas ler(){
        GerirEmpresas lista;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (GerirEmpresas) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}


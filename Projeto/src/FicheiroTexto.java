import java.io.*;
import java.util.ArrayList;
/**
 * Classe para gerir os dados de um Ficheiro de Texto
 * @author ferna
 * @version 1.0
 */
public class FicheiroTexto{
    /**
     * Ficheiro de Texto
     */
    private File file;

    /**
     * Método Construtor, onde é inicializado o Ficheiro de Texto
     */
    public FicheiroTexto(){file = new File("starthrive.txt");}

    /**
     * Método de acesso externo ao Ficheiro de Texto
     * @return (File) Ficheiro de Texto
     */
    public File getFile() {
        return file;
    }
    /**
     * Método Complementar de acesso externo ao Ficheiro de Texto
     * @param file Ficheiro de Texto
     */
    public void setFile(File file) {
        this.file = file;
    }
    /**
     * Método que lê um Ficheiro de Texto e insere os dados numa lista
     * @return (GerirEmpresas) Lista de Empresas
     */
    public GerirEmpresas leitura () {
        GerirEmpresas lista = new GerirEmpresas();
        VerificaDados vd = new VerificaDados();
        if (file.exists() && file.isFile()) {
            try {
                FileReader fR = new FileReader(file);
                BufferedReader bR = new BufferedReader(fR);
                String line;
                while ((line = bR.readLine()) != null) {
                    String[] dados = line.split("[:,]+");
                    switch (dados[0].toUpperCase()) {
                        case "CAFE" -> {
                            Cafe c = new Cafe(dados[1], dados[2], vd.verificaFloat(dados[3]), vd.verificaFloat(dados[4]), vd.verificaFloat(dados[5]), vd.verificaInt(dados[6]), vd.verificaFloat(dados[7]), vd.verificaFloat(dados[8]), vd.verificaFloat(dados[9]), vd.verificaFloat(dados[10]));


                            lista.insert(c);
                        }
                        case "FASTFOOD" -> {
                            FastFood ff = new FastFood(dados[1], dados[2], vd.verificaFloat(dados[3]), vd.verificaFloat(dados[4]), vd.verificaFloat(dados[5]), vd.verificaInt(dados[6]), vd.verificaFloat(dados[7]), vd.verificaFloat(dados[8]), vd.verificaInt(dados[9]), vd.verificaFloat(dados[10]), vd.verificaInt(dados[11]), vd.verificaFloat(dados[12]), vd.verificaFloat(dados[13]));
                            lista.insert(ff);
                        }
                        case "FRUTARIA" -> {
                            Frutaria fr = new Frutaria(dados[1], dados[2], vd.verificaFloat(dados[3]), vd.verificaFloat(dados[4]), vd.verificaFloat(dados[5]), vd.verificaInt(dados[6]), vd.verificaFloat(dados[7]));
                            lista.insert(fr);
                        }
                        case "MERCADO" -> {
                            Mercado m = new Mercado(dados[1], dados[2], vd.verificaFloat(dados[3]), vd.verificaFloat(dados[4]), vd.verificaFloat(dados[5]), dados[6], vd.verificaFloat(dados[7]), vd.verificaFloat(dados[8]));
                            lista.insert(m);
                        }
                        case "PASTELARIA" -> {
                            Pastelaria p = new Pastelaria(dados[1], dados[2], vd.verificaFloat(dados[3]), vd.verificaFloat(dados[4]), vd.verificaFloat(dados[5]), vd.verificaInt(dados[6]), vd.verificaFloat(dados[7]), vd.verificaFloat(dados[8]), vd.verificaInt(dados[9]), vd.verificaFloat(dados[10]));
                            lista.insert(p);
                        }
                        case "LOCAL" -> {
                            Local l = new Local(dados[1], dados[2], vd.verificaFloat(dados[3]), vd.verificaFloat(dados[4]), vd.verificaFloat(dados[5]), vd.verificaInt(dados[6]), vd.verificaFloat(dados[7]), vd.verificaFloat(dados[8]), vd.verificaInt(dados[9]), vd.verificaFloat(dados[10]), vd.verificaInt(dados[11]), vd.verificaInt(dados[12]), vd.verificaFloat(dados[13]));
                            lista.insert(l);
                        }
                    }
                }
                bR.close();
            } catch (IOException e) {
                throw new RuntimeException(e);

            }
        }
    return lista;
    }

}

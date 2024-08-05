import javax.swing.*;
import java.awt.*;
/**
 * Classe para gerir a Validade dos Dados Inseridos
 * @author ferna
 * @version 1.0
 */
public class VerificaDados {
    /**
     * Construtor Vazio
     */
    public VerificaDados() {}
    /**
     * Método que Verifica se é possivel Converter a String dada em Float
     * @param s String que irá ser Convertida em Float
     * @return (float) Número Convertido
     */
    public float verificaFloat(String s){
        float aux;
        try {
            aux = Float.parseFloat(s);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        return aux;
    }
    /**
     *Método que Verifica se é possível Conveter a String dada em Inteiro
     * @param s String que irá ser Convetida em Inteiro
     * @return (Int) Número Convertido
     */
    public int verificaInt(String s){
        int aux;
        try {
            aux = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        return aux;
    }
    /**
     * Método que Verifica se é possivel Converter a String dada na Interface em Float
     * @param s String a Converter
     * @param verifica String a Devolver como Instrução
     * @return (float) Número Válido e Convertido
     */
    public float verificaFloatGUI(String s,String verifica){
        float n1 = 0;
        boolean controlo = false;
        while(!controlo) {
            try {
                n1 = Float.parseFloat(s);
                controlo = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "INSIRA UM FLOAT", "ERRO", JOptionPane.ERROR_MESSAGE);
                s = JOptionPane.showInputDialog(null, verifica);
            }
        }
        return n1;
    }
    /**
     * Método que Verifica se é possivel Converter a String dada na Interface em Inteiro
     * @param s String a Converter
     * @param verifica String a Devolver como Instrução
     * @return (int) Número Válido e Convertido
     */
    public int verificaIntGUI(String s,String verifica){
        int n1 = 0;
        boolean controlo = false;
        while(!controlo) {
            try {
                n1 = Integer.parseInt(s);
                controlo = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "INSIRA UM INTEIRO", "ERRO", JOptionPane.ERROR_MESSAGE);
                s = JOptionPane.showInputDialog(null, verifica);
            }
        }
        return n1;
    }
    /**
     * Método que Verifica se uma String na Edição de uma Empresa do Tipo Mercado é Válida
     * @param s String a Verififar
     * @return (String) MIN,SUPER ou HIPER
     */
    public String verificaMercado(String s){
        boolean controlo = s.toUpperCase().equals("MIN") || s.toUpperCase().equals("HIPER") || s.toUpperCase().equals("SUPER");
        while (!controlo){
            JOptionPane.showMessageDialog(null, "INSIRA 'MIN','HIPER' OU 'SUPER'", "ERRO", JOptionPane.ERROR_MESSAGE);
            s = JOptionPane.showInputDialog(null, "INSIRA 'MIN','HIPER' OU 'SUPER'");
            if(s.toUpperCase().equals("MIN")||s.toUpperCase().equals("HIPER")||s.toUpperCase().equals("SUPER")) {
                controlo = true;
            }
        }
    return s;
    }
    /**
     * Método que Verifica se uma String na Criação de uma Empresa é NULL
     * @param s String a Verificar
     * @param verifica String a Devolver como Instrução
     * @return (String) String Válida
     */
    public String verificaStringGUI(String s,String verifica){
        boolean control = !s.equals("");
        while(!control) {
            JOptionPane.showMessageDialog(null,"Insira uma STRING!","ERRO!",JOptionPane.ERROR_MESSAGE);
            s = JOptionPane.showInputDialog(verifica);
            if(!(s.equals(""))){
                control = true;
            }
        }

        return s;
    }

}


import java.util.*;

/**
 * Classe para gerir uma Aula
 * @author Ana Carolina
 * @version 1.0
 */

public class Aula {
    /**
     * Professor da aula
     */
    private Professor p;

    /**
     * Horario da aula
     */
    private  Horario h;
    /**
     * Duraçao da aula em minutos, portanto é um inteiro
     */
    private int duracao;
    /**
     * Estado da aula (0->Cancelada,1-> Não cancelada
     */
    private int estado;

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome Nome do Professor
     * @param email email do Professor
     * @param horario Data e Hora da Aula
     * @param duracao Duração da Aula
     * @param estado Estado da Aula
     */
    public Aula(String nome, String email,GregorianCalendar horario, int duracao, int estado) {
        p = new Professor(nome,email);
        h = new Horario(horario);
        this.duracao = duracao;
        this.estado = estado;
    }

    /**
     * Método para escrever por extenso se a aula foi ou não cancelada
     * @return String "Cancelada" ou "Nao Cancelada"
     */
    public String estadoExtenso(){
        if(estado == 0){
            return "Cancelada";
        }
        else {
            return "Nao Cancelada";
        }
    }

    /**
     * Método de acesso externo ao Professor
     * @return Professor da aula
     */

    public Professor getP() {
        return p;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param p Novo Professor que pode-se atribuir
     */
    public void setP(Professor p){
        this.p=p;
    }

    /**
     * Método de acesso externo ao Horario
     * @return Data e horario da aula
     */

    public Horario getH() {
        return h;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param h Novo Horário que pode-se atribuir
     */
    public void setH(Horario h){
        this.h=h;
    }
    /**
     * Método de acesso externo à Duração
     * @return Duração da aula
     */

    public int getDuracao() {
        return duracao;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param duracao Nova Duração que pode-se atribuir
     */
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
    /**
     * Método de acesso externo ao Estado
     * @return Estado da aula
     */

    public int getEstado() {
        return estado;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param estado Novo Estado que pode-se atribuir
     */
    public void setEstado(int estado){
        this.estado=estado;
    }


    /**
     * Método que se usa para ocorrer o polimorfismo entre classe e subclasse
     */
    public void aulasSeletivas(){
        System.out.println("Estamos na classe Aula");

    }

    /**
     * Método para imprimir a informaçao de uma Aula
     * @return a informação de uma aula (String)
     */

    @Override
    public String toString(){
            return String.format("Professor: %s\nEmail: %s\nData: %d/%d/%d\nHora: %d:%d\nDuration: %d minutos \nEstado: %s\n", p.getNome(), p.getEmail(),h.getDia(),h.getMes(),h.getAno(),h.getHora(),h.getMinuto(), duracao, estadoExtenso());
        }

}


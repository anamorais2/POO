import java.util.*;

/**
 * Subclasse da Classe Aula, Aula Individual, gere as aulas individuais
 * @author  Ana Carolina
 * @version 1.0
 */
public class AulaIndividual extends Aula {
    /**
     * Preço por hora de uma Aula Individual
     */
    protected float price;


    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome Nome do Professor
     * @param email Email do Professor
     * @param horario Data e Hora da aula
     * @param duracao Duração (em min) da aula
     * @param estado Estado da aula
     * @param price Preço/Hora da aula
     */

    public AulaIndividual(String nome, String email, GregorianCalendar horario, int duracao, int estado,float price) {
        super(nome, email,horario, duracao, estado);
        this.price=price;
    }


    /**
     * Método de acesso externo ao preço por hora
     * @return Preço por hora
     */
    public float getPrice() {
        return price;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param price Novo preço por hora que pode-se atribuir
     */
    public void setPrice(float price){
        this.price=price;
    }
    /**
     * Método que verifica se uma dada aula individual tem um custo total ((duraçao * preço)/60) superior a 20 euros
     * Se o if for verdadeiro imprime a informação da aula indivual mais o custo total da aula .
     */
    public void aulasSeletivas(){
        float aux = (getDuracao() * price) / 60;
        if(aux>20){
            System.out.println("\n Aula Individual \n" + super.toString() + "Price/Hour:" + price+"Euro(s)"+ "\nCusto total:"+ aux + "Euro(s)"+"\n");
        }
    }

    /**
     * Método que imprime a informação de uma aula individual
     * @return Informação de uma aula Indivual
     */
    @Override
    public String toString() {
        return "\n Aula Individual \n" + super.toString() + "Price/Hour:" + price+"Euro(s)"+ "\n";
    }
}

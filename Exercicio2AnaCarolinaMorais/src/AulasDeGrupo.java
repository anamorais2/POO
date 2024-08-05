import java.util.*;

/**
 *Subclasse da Classe Aula, Aulas De Grupo, gere as aulas de grupo
 * @author Ana Carolina
 * @version 1.0
 */
public class AulasDeGrupo extends Aula{
    /**
     * Modalidade da Aula de Grupo
     */
    private String modalidade;
    /**
     * Numero Máximo de alunos numa Aula de Grupo
     */
    private int max;

    /**
     * Construtor da classe, recebe métodos para a inicialização dos atributos
     * @param nome Nome do Professor
     * @param email Email do Professor
     * @param horario Data e Hora da Aula de Grupo
     * @param duracao Duração (em min) da Aula de Grupo
     * @param estado Estado da Aula de Grupo
     * @param modalidade Modalidade da Aula de Grupo
     * @param max Maximo de pessoas na Aula de Grupo
     */

    public AulasDeGrupo(String nome, String email, GregorianCalendar horario, int duracao, int estado,String modalidade,int max) {
        super(nome, email,horario, duracao, estado);
        this.modalidade=modalidade;
        this.max=max;
    }

    /**
     * Método de acesso externo à Modalidade da Aula De Grupo
     * @return Modalidade da Aula De Grupo
     */

    public String getModalidade() {
        return modalidade;
    }

    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param modalidade Nova modalidade que iremos atribuir
     */
    public void setModalidade(String modalidade){
        this.modalidade=modalidade;
    }
    /**
     * Método de acesso externo ao Numero Maximo de Pessoas na Aula de Grupo
     * @return Numero Maximo de Pessoas
     */

    public int getMax() {
        return max;
    }

    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param max Novo número Maximo de pessoas que iremos atribuir
     */
    public void setMax(int max){
        this.max=max;
    }
    /**
     * Método que verifica se o Numero Máximo de pessoas que frequenta a Aula de Grupo é inferior a 10
     * Se a condição se verificar então imprime a modalidade e a Hora de inicio da aula de Grupo
     */
    public void aulasSeletivas(){
        if(max<10){
            System.out.printf("\nA modalidade: %s\nHora de inicio: %d:%d",modalidade,getH().getHora(),getH().getMinuto());
        }
    }
    /**
     * Método que imprime a informação de uma Aula de Grupo
     * @return informação de uma Aula de Grupo
     */
    @Override
    public String toString() {
        return "\n Aula De Grupo \n" + super.toString() + String.format("Modalidade: %s\nMaximo Pessoas: %d\n",modalidade,max);
    }
}

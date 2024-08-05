import java.util.*;

/** Classe para gerir o Horario de uma Aula
 * @author Ana Carolina
 * @version 1.0
 */
public class Horario {
    /**
     * Data da aula ( dia, mes, ano, hora, min)
     */
    private GregorianCalendar data;
    /**
     * Construtor da classe,recebe dados para a inicialização dos atributos
     * @param data Data da aula
     */
    public Horario(GregorianCalendar data) {
        this.data = data;
    }
    /**
     * Método de acesso externo ao ano da data
     * @return Ano
     */
    public int getAno() {
        return data.get(Calendar.YEAR);
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param data Nova Data que pode-se atribuir
     */
    public void setData(GregorianCalendar data){
        this.data=data;
    }

    /** Método de acesso externo ao més da data
     * @return Mes + 1 ( A biblioteca GregorianCalendar faz JANUARY = 0, logo soma-se 1 para devolver o mes certo
     */
    public int getMes() {
        return data.get(Calendar.MONTH) + 1;
    }

    /**
     * Método de acesso externo ao dia do més
     * @return Dia
     */
    public int getDia() {
        return data.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Método de acesso externo à hora de início da aula
     * @return Hora ( No formato 0-24h)
     */
    public int getHora() {
        return data.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Método de acesso externo ao minuto
     * @return Minuto
     */
    public int getMinuto() {
        return data.get(Calendar.MINUTE);
    }


}

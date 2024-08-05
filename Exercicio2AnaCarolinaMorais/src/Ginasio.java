import java.util.*;

/**
 * Classe para gerir as Aulas de um Ginásio
 * @author Ana Carolina
 * @version 1.0
 */
public class Ginasio {
    /**
     * Lista com as aulas do Ginásio
     */
    private final List<Aula> listaAulas = new ArrayList<>();

    /**
     * Método que insere uma aula na Lista de aulas
     * @param a Aula a inserir na lista ( Grupo ou Individual)
     */
    public void insere(Aula a){
        listaAulas.add(a);
    }

    /**
     * Método que imprime o contéudo da Lista de Aulas do Ginásio
     * @return Contéudo da Lista de Aulas
     */
    @Override
    public String toString() {
        return listaAulas.toString();
    }

    /**
     * Método que verifica se uma dada aulas foi cancelada ou não e imprime as aulas que foram canceladas
     */

    public void aulasCanceladas(){
        for(Aula a: listaAulas){
            if(a.getEstado()==0){
                System.out.println(a);
            }
        }

    }

    /**
     * Método que verifica se o numero de pessoas de uma aula de grupo é inferior a 10 e se as aulas individuais tem um custo superior a 20 euros
     * No final imprime o que verificar as condições
     */

    public void imprimirSeletivo(){
        for(Aula a: listaAulas){
            a.aulasSeletivas();
        }
    }



    public void ordena() {

        int numAula = listaAulas.size();
        for(int i = 0; i< numAula - 1; ++i){
            int indceMaior = localizaMaior(i);
            Aula A1 =  listaAulas.get(i);
            Aula A2 =  listaAulas.get(indceMaior);
            listaAulas.set(i,A2);
            listaAulas.set(indceMaior,A1);
        }

    }


    public int localizaMaior(int in){
        int posMaior = in;
        int durMaior = listaAulas.get(in).getDuracao();
        for(int i = in +1;i< listaAulas.size();i++ ){
            Aula aux = listaAulas.get(i);
            if(aux.getDuracao() < durMaior){
                posMaior = i;
                durMaior = aux.getDuracao();
            }
        }
        return posMaior;
    }

}

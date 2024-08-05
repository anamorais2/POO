import java.util.*;
/**
 * Classe Principal
 * @author Ana Carolina
 * @version 1.0
 */

public class Main {
    /**
     * Método principal onde são chamadas as alíneasdo exercicio 2
     * @param args vazio
     */
    public static void main(String[] args) {
        Ginasio listaGinasio = new Ginasio();
        //Criaçao das aulas individuais
        AulaIndividual aulaIndividual1 = new AulaIndividual("Ze","ze@gmail.com",new GregorianCalendar( 2022, Calendar.OCTOBER,26,18,37),45,0,15);
        AulaIndividual aulaIndividual2 = new AulaIndividual("Nanda","nanda@gmail.com",new GregorianCalendar(2022, Calendar.OCTOBER,27,18,37),30,0,30);
        AulaIndividual aulaIndividual3 = new AulaIndividual("Pedro","Pedro@gmail.com",new GregorianCalendar(2022, Calendar.NOVEMBER,5,13,45),60,1,50);
        AulaIndividual aulaIndividual4 = new AulaIndividual("Ines","ines@gmail.com",new GregorianCalendar(2022, Calendar.OCTOBER,8,15,15),20,0,10);
        AulaIndividual aulaIndividual5 = new AulaIndividual("Tiago","tiago@gmail.com",new GregorianCalendar(2022, Calendar.DECEMBER,16,16,0),45,1,45);
        // Criaçao das aulas de Grupo
        AulasDeGrupo aulasDeGrupo1 = new AulasDeGrupo("Carolina","santosmoraisanacarolina@gmail.com", new GregorianCalendar(2002,Calendar.MAY,17,13,45),45,1,"Natacao",15);
        AulasDeGrupo aulasDeGrupo2 = new AulasDeGrupo("Francisco","francisco@gmail.com", new GregorianCalendar(2023,Calendar.JANUARY,3,11,45),30,1,"Volleyball",12);
        AulasDeGrupo aulasDeGrupo3 = new AulasDeGrupo("Beatriz","beatriz@gmail.com", new GregorianCalendar(2022,Calendar.DECEMBER,13,9,30),60,1,"Atletismo",10);
        AulasDeGrupo aulasDeGrupo4 = new AulasDeGrupo("Manuel","manuel@gmail.com", new GregorianCalendar(2022,Calendar.MAY,17,11, 0),30,0,"Crossfit",5);
        AulasDeGrupo aulasDeGrupo5 = new AulasDeGrupo("Francisca","kika@gmail.com", new GregorianCalendar(2022,Calendar.NOVEMBER,1,14,15),120,1,"Danca",20);
        //Inserir as aulas individuis na lista do ginásio
        listaGinasio.insere(aulaIndividual1);
        listaGinasio.insere(aulaIndividual2);
        listaGinasio.insere(aulaIndividual3);
        listaGinasio.insere(aulaIndividual4);
        listaGinasio.insere(aulaIndividual5);
        //Inserir as aulas de grupo na lista do ginásio
        listaGinasio.insere(aulasDeGrupo1);
        listaGinasio.insere(aulasDeGrupo2);
        listaGinasio.insere(aulasDeGrupo3);
        listaGinasio.insere(aulasDeGrupo4);
        listaGinasio.insere(aulasDeGrupo5);


        System.out.println("\n-------------Lista de aulas do Ginasio---------\n");
        System.out.println(listaGinasio);

        System.out.println("\n-------------Aulas Canceladas----------\n");
        listaGinasio.aulasCanceladas();

        System.out.println("\n-------------Aulas com limite maximo 10 pessoas e custo total superior a 20 euros------------\n");
        listaGinasio.imprimirSeletivo();

        System.out.println("\n-------------Ordena Por Ordem Crescente de Duração------------\n");
        listaGinasio.ordena();
        System.out.println(listaGinasio);

    }
}

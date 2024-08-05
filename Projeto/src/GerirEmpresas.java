import java.io.Serializable;
import java.util.*;
import java.lang.*;
/**
 * Classe para gerir uma Lista de Empresas
 * @author ferna
 * @version 1.0
 */
public class GerirEmpresas implements Serializable{
    /**
     * Lista que irá conter todas as Empresas
     */
    private ArrayList<Empresa> listaEmpresas;
    /**
     * Método Construtor GerirEmpresas
     * @param listaEmpresas Lista das Empresas
     */
    public GerirEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
    /**
     * Construtor Vazio, onde é inicializada a Lista
     */
    public GerirEmpresas() {
        listaEmpresas = new ArrayList<>() ;
    }
    /**
     * Método de acesso externo á Lista das Empresas
     * @return (ArrayList) Lista das Empresas
     */
    public ArrayList<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }
    /**
     * Método Complementar de acesso externo á Lista de Empresa
     * @param listaEmpresas Lista de Empresas
     */
    public void setListaEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
    /**
     * Método para Inserir uma Empresa, caso ainda não esteja listada, na Lista de Empresas
     * @param e Empresa a Inserir
     */
    public void insert ( Empresa e){
        if(!pesquisaNome((e.getNome()))){
            listaEmpresas.add(e);
        }
    }
    /**
     * Método que Remove uma Empresa, caso ela exista, pelo Nome
     * @param e Empresa a Remover
     * @return Empresa Removida
     */
    public Empresa remove (Empresa e){
        Empresa aux = null;
        if(pesquisaNome((e.getNome()))){
            listaEmpresas.remove(e);
            aux = e;
        }
        return aux;
    }
    /**
     * Método que Pesquisa na Lista uma Empresa pelo Nome
     * @param nome Nome da Empresa a Pesquisar
     * @return (Boolean) true: se essa Empresa existir ou false: caso não exista
     */
    public boolean pesquisaNome(String nome){
        boolean aux = false;
        for(Empresa e: listaEmpresas){
            if (e.getNome().compareTo(nome) == 0) {
                aux = true;
                break;
            }
        }
        return aux;
    }
    /**
     * Método que Imprime a Lista de Empresas
     */
    public void imprime(){
        for(Empresa e: listaEmpresas){
            System.out.println(e);
        }
    }
    /**
     * Método que Retorna as Empresas de cada Tipo com Maior Receita Anual
     * @return Empresas de Cada Tipo com Maior Receita Anual
     */
    public String maiorReceita() {
        Cafe maiorCafe = new Cafe();
        FastFood maiorFastFood = new FastFood();
        Frutaria maiorFrutaria = new Frutaria();
        Local maiorLocal = new Local();
        Mercado maiorMercado = new Mercado();
        Pastelaria maiorPastelaria = new Pastelaria();
        for (Empresa empresa : listaEmpresas) {
            switch (empresa.tipo()) {
                case "CAFE" -> maiorCafe = (Cafe) empresa.maiorReceita(maiorCafe);
                case "FASTFOOD" -> maiorFastFood = (FastFood) empresa.maiorReceita(maiorFastFood);
                case "FRUTARIA" -> maiorFrutaria = (Frutaria) empresa.maiorReceita(maiorFrutaria);
                case "LOCAL" -> maiorLocal = (Local) empresa.maiorReceita(maiorLocal);
                case "MERCADO" -> maiorMercado = (Mercado) empresa.maiorReceita(maiorMercado);
                case "PASTELARIA" -> maiorPastelaria = (Pastelaria) empresa.maiorReceita(maiorPastelaria);
            }
        }
        return "\nMaior Receita Anual:\n Cafés: " + maiorCafe.nome +" "+ maiorCafe.receitaAnual() + "€\nFastFoods: " + maiorFastFood.nome +" "+ maiorFastFood.receitaAnual()+ "€\nFrutarias: " + maiorFrutaria.nome +" "+maiorFrutaria.receitaAnual()+ "€\nRestaurantes Locais: " + maiorLocal.nome +" "+ maiorLocal.receitaAnual()+"€\nMercados: " + maiorMercado.nome +" "+maiorMercado.receitaAnual() + "€\nPastelarias: " + maiorPastelaria.nome +" "+ maiorPastelaria.receitaAnual()+"€";
    }
    /**
     * Método que Retorna as Empresas de cada Tipo com Menor Despesa Anual
     * @return Empresas de Cada Tipo com Menor Despesa Anual
     */
    public String menorDespesa(){
        Cafe menorCafe = new Cafe();
        FastFood menorFastFood = new FastFood();
        Frutaria menorFrutaria = new Frutaria();
        Local menorLocal = new Local();
        Mercado menorMercado = new Mercado();
        Pastelaria menorPastelaria = new Pastelaria();
        for (Empresa empresa : listaEmpresas){
            switch (empresa.tipo()) {
                case "CAFE" -> menorCafe = (Cafe) empresa.maiorReceita(menorCafe);
                case "FASTFOOD" -> menorFastFood = (FastFood) empresa.maiorReceita(menorFastFood);
                case "FRUTARIA" -> menorFrutaria = (Frutaria) empresa.maiorReceita(menorFrutaria);
                case "LOCAL" -> menorLocal = (Local) empresa.maiorReceita(menorLocal);
                case "MERCADO" -> menorMercado = (Mercado) empresa.maiorReceita(menorMercado);
                case "PASTELARIA" -> menorPastelaria = (Pastelaria) empresa.maiorReceita(menorPastelaria);
            }
        }
        return "\nMenor Despesa Anual:\n Cafés: " + menorCafe.nome +" "+ menorCafe.receitaAnual() + "€\nFastFoods: " + menorFastFood.nome +" "+ menorFastFood.receitaAnual()+ "€\nFrutarias: " + menorFrutaria.nome +" "+menorFrutaria.receitaAnual()+ "€\nRestaurantes Locais: " + menorLocal.nome +" "+ menorLocal.receitaAnual()+"€\nMercados: " + menorMercado.nome +" "+menorMercado.receitaAnual() + "€\nPastelarias: " + menorPastelaria.nome +" "+ menorPastelaria.receitaAnual()+"€";
    }
    /**
     * Método que Retorna as Empresas de cada Tipo com Maior Lucro
     * @return Empresas de Cada Tipo com Maior Lucro
     */
    public String maiorLucro(){
        Cafe maiorCafe = new Cafe();
        FastFood maiorFastFood = new FastFood();
        Frutaria maiorFrutaria = new Frutaria();
        Local maiorLocal = new Local();
        Mercado maiorMercado = new Mercado();
        Pastelaria maiorPastelaria = new Pastelaria();
        for (Empresa empresa : listaEmpresas) {
            switch (empresa.tipo()) {
                case "CAFE" -> maiorCafe = (Cafe) empresa.maiorLucro(maiorCafe);
                case "FASTFOOD" -> maiorFastFood = (FastFood) empresa.maiorLucro(maiorFastFood);
                case "FRUTARIA" -> maiorFrutaria = (Frutaria) empresa.maiorLucro(maiorFrutaria);
                case "LOCAL" -> maiorLocal = (Local) empresa.maiorLucro(maiorLocal);
                case "MERCADO" -> maiorMercado = (Mercado) empresa.maiorLucro(maiorMercado);
                case "PASTELARIA" -> maiorPastelaria = (Pastelaria) empresa.maiorLucro(maiorPastelaria);
            }
        }
        return "\nMaior Lucro:\n Cafés: " + maiorCafe.nome +" "+ maiorCafe.lucro()+ "€\nFastFoods: " + maiorFastFood.nome +" "+ maiorFastFood.lucro()+ "€\nFrutarias: " + maiorFrutaria.nome +" "+maiorFrutaria.lucro()+ "€\nRestaurantes Locais: " + maiorLocal.nome +" "+ maiorLocal.lucro()+"€\nMercados: " + maiorMercado.nome +" "+maiorMercado.lucro() + "€\nPastelarias: " + maiorPastelaria.nome +" "+ maiorPastelaria.lucro()+"€";
    }
    //VER CASO O PRIMEIRO SEJA LOGO O MAIOR
    /**
     * Método que Retorna a Empresa (Dentro do Tipo Restauração) com Maior Capacidade de Mesas
     * @return Empresas com Maior Capacidade em Número de Mesas
     */
   public String maiorCapacidade(){
       int aux = 0;
       int aux2 = 0;
       String auxNome = "";
       String auxNome2 = "";
        for (Empresa empresa : listaEmpresas){
            int capacidade = empresa.capacidade();
            if(aux <= capacidade) {
                aux2 = aux;
                auxNome2 = auxNome;
                aux = capacidade;
                auxNome = empresa.nome;
            }
        }
        return "\nMaior Capacidade:\n" + auxNome +" "+ aux + " Mesas\n"+ auxNome2 + " " + aux2 + " Mesas";
    }
    /**
     * Método que Retorna os Dados da Lista de Empresa
     * @return Dados de todas as Empresas
     */
    @Override
    public String toString() {
        return "Lista de Empresas: " + listaEmpresas;
    }
}

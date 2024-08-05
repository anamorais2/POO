import java.io.*;
/**
 * Classe para gerir os dados de uma Empresa
 * @author ferna
 * @version 1.0
 */
public abstract class Empresa implements Serializable {
    /**
     * Nome da Empresa
     */
    protected String nome;
    /**
     * Distrito de Localização da Empresa
     */
    protected String distrito;
    /**
     * Localização da Empresa, sendo um Objeto do Tipo Gps
     */
    protected Gps localizacao ;
    /**
     * Construtor Vazio
     */
    public Empresa() {}
    /**
     * Método Construtor Empresa
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas(Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     */
    public Empresa(String nome, String distrito, float latitude,float longitude) {
        this.nome = nome;
        this.distrito = distrito;
        this.localizacao = new Gps(latitude, longitude);
    }
    /**
     * Método de acesso externo ao Nome da Empresa
     * @return (String) Nome da Empresa
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método Complementar de acesso externo ao Nome da Empresa
     * @param nome Nome da Empresa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Método de acesso externo ao Distrito de Localização da Empresa
     * @return (String) Distrito de Localização da Empresa
     */
    public String getDistrito() {
        return distrito;
    }
    /**
     * Método Complementar de acesso ao Distrito de Localização da Empresa
     * @param distrito Distrito de Localização da Empresa
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    /**
     * Método de acesso externo á Localização da Empresa
     * @return (Objeto do Tipo Gps) Localização da Empresa(Latitude.Longitude)
     */
    public Gps getLocalizacao() {
        return localizacao;
    }
    /**
     * Método Complementar de acesso externo á Localização da Empresa
     * @param localizacao Localização da Empresa
     */
    public void setLocalizacao(Gps localizacao) {
        this.localizacao = localizacao;
    }
    /**
     * Método Abstrato de Cálculo da Despesa Anual da Empresa
     * @return Método Abstrato
     */
    public abstract float despesaAnual();
    /**
     * Método Abstrato de Cálculo da Receita Anual da Empresa
     * @return Método Abstrato
     */
    public abstract float receitaAnual();
    /**
     *Método Abstrato de Cálculo do Lucro da Empresa
     * @return Método Abstrato
     */
    public abstract float lucro();
    /**
     * Método de Retorno da Capacidade em Número de mesas(Polimorfismo)
     * @return Capacidade De uma Empresa
     */
    public int capacidade() {return 0;}
    /**
     * Método de Comparação, Polimorfismo da Empresa com Maior Receita
     * @param e Empresa
     * @return Empresa
     */
    public Empresa maiorReceita(Empresa e) {return null;}
    /**
     * Método de Comparação, Polimorfismo da Empresa com Menor Despesa
     * @param e Empresa
     * @return Empresa
     */
    public Empresa menorDespesa(Empresa e){return null;}
    /**
     * Método de Comparação, Polimorfismo da Empresa com Maior Lucro
     * @param e Empresa
     * @return Empresa
     */
    public Empresa maiorLucro (Empresa e){return null;};
    /**
     * Método Abstrato de Polimorfimo do Tipo da Empresa
     * @return Abstrato
     */
    public abstract String tipo();
    /**
     * Método que Retorna os Dados de uma Empresa
     * @return Dados de uma Empresa
     */
    @Override
    public String toString() {
        return "\n----Empresa---- \n" +
                "Nome: " + nome + "\n" +
                "Distrito: " + distrito + "\n" +
                "Localização: " + localizacao + "\n";
    }
}


/**
 * Classe para gerir os dados de uma Empresa do Tipo Mercearia
 * @author ferna
 * @version 1.0
 */
public abstract class Mercearia extends Empresa {
    /**
     * Custo Anual da Limpeza da Empresa
     */
    protected float custoAnualLimpeza;
    /**
     * Método Construtor Mercearia
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas(Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoAnualLimpeza Custo Anual da Limpeza da Empresa
     */
    public Mercearia(String nome, String distrito, float latitude, float longitude,float custoAnualLimpeza) {
        super(nome, distrito, latitude, longitude);
        this.custoAnualLimpeza = custoAnualLimpeza;
    }
    /**
     * Construtor Vazio
     */
    public Mercearia() {}
    /**
     * Método de acesso externo ao Custo Anual da Limpeza da Empresa
     * @return (float) Custo Anual da Limpeza da Empresa
     */
    public float getCustoAnualLimpeza() {
        return custoAnualLimpeza;
    }
    /**
     * Método Complementar de acesso externo ao Custo Anual da Limpeza da Empresa
     * @param custoAnualLimpeza Custo Anual da Limpeza da Empresa
     */
    public void setCustoAnualLimpeza(float custoAnualLimpeza) {
        this.custoAnualLimpeza = custoAnualLimpeza;
    }
    /**
     *Método Abstrato de Cálculo da Despesa Anual da Empresa
     * @return Método Abstrato
     */
    public  abstract  float despesaAnual();
    /**
     *Método Abstrato de Cálculo da Receita Anual da Empresa
     * @return Método Abstrato
     */
    public abstract float receitaAnual();
    /**
     *Método Abstrato de Cálculo do Lucro da Empresa
     * @return Método Abstrato
     */
    public abstract float lucro();
    /**
     * Método Abstrato de Polimorfimo do Tipo da Empresa
     * @return Abstrato
     */
    public abstract String tipo();
    /**
     * Método Abstrato de Comparação, Polimorfismo da Empresa com Maior Receita
     * @param e Empresa
     * @return Abstrato
     */
    public abstract Empresa maiorReceita(Empresa e);
    /**
     * Método Abstrato de Comparação, Polimorfismo da Empresa com Menor Despesa
     * @param e Empresa
     * @return Abstrato
     */
    public abstract Empresa menorDespesa(Empresa e);
    /**
     * Método Abstrato de Comparação, Polimorfismo da Empresa com Maior Lucro
     * @param e Empresa
     * @return Abstrato
     */
    public abstract Empresa maiorLucro (Empresa e);
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Mercearia
     * @return Dados de uma Empresa do Tipo Mercearia
     */
    @Override
    public String toString() {
        return "Mercearia:\n" + super.toString() +
                "Custo Anual Limpeza: " + custoAnualLimpeza;
    }
}



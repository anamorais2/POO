/**
 * Classe para gerir os dados de uma Empresa do Tipo Mercado
 * @author ferna
 * @version 1.0
 */
public class Mercado extends Mercearia {
    /**
     * Tipo do Mercado (Min,Super,Hiper)
     */
    private String tipoMercado;
    /**
     * Área em Metros Quadrados do Total dos Corredores
     */
    private float areaCorredor;
    /**
     * Valor Médio de Faturação Anual por Metro Quadrado
     */
    private float valorMedFatAnualMetro;
    /**
     * Método Construtor Mercado
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas (Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoAnualLimpeza Custo Anual da Limpeza da Empresa
     * @param tipoMercado Tipo do Mercado (Min,Super,Hiper)
     * @param areaCorredor Área em Metros Quadrados do Total dos Corredores
     * @param valorMedFatAnualMetro Valor Médio de Faturação Anual por Metro Quadrado
     */
    public Mercado(String nome, String distrito, float latitude, float longitude, float custoAnualLimpeza, String tipoMercado, float areaCorredor, float valorMedFatAnualMetro) {
        super(nome, distrito, latitude, longitude, custoAnualLimpeza);
        this.tipoMercado = tipoMercado;
        this.areaCorredor = areaCorredor;
        this.valorMedFatAnualMetro = valorMedFatAnualMetro;
    }
    /**
     * Método Construtor Vazio
     */
    public Mercado(){
    }
    /**
     * Método de acesso externo ao Tipo do Mercado
     * @return (String) Tipo do Mercado (Min,Super,Hiper)
     */
    public String getTipoMercado() {
        return tipoMercado;
    }
    /**
     * Método Complementar de acesso externo ao Tipo do Mercado
     * @param tipoMercado Tipo do Mercado (Min,Super,Hiper)
     */
    public void setTipoMercado(String tipoMercado) {
        this.tipoMercado = tipoMercado;
    }
    /**
     * Método de acesso externo á Área dos Corredores
     * @return (float) Área dos Corredores em Metros Quadrados
     */
    public float getAreaCorredor() {
        return areaCorredor;
    }
    /**
     * Método Complementar de acesso externo á Área dos Corredores
     * @param areaCorredor Área dos Corredores em Metros Quadrados
     */
    public void setAreaCorredor(float areaCorredor) {
        this.areaCorredor = areaCorredor;
    }
    /**
     * Método de acesso externo ao Valor Médio de Faturação Anual por Metro Quadrado
     * @return (float) Valor Médio de Faturação Anual por Metro Quadrado
     */
    public float getValorMedFatAnualMetro() {
        return valorMedFatAnualMetro;
    }
    /**
     * Método Complementar de acesso externo ao Valor Médio de Faturação Anual por Metro Quadrado
     * @param valorMedFatAnualMetro Valor Médio de Faturação Anual por Metro Quadrado
     */
    public void setValorMedFatAnualMetro(float valorMedFatAnualMetro) {
        this.valorMedFatAnualMetro = valorMedFatAnualMetro;
    }

    /**
     * Método para o Cálculo da Despesa Anual da Empresa do Tipo Mercado
     * @return (float) Valor da Despesa Anual da Empresa do Tipo Mercado
     */
    public float despesaAnual(){
        float aux;
        aux = custoAnualLimpeza;

        return aux;
    }
    /**
     * Método para o Cálculo da Receita Anual da Empresa do Tipo Mercado
     * @return (float) Valor da Receita Anual da Empresa do Tipo Mercado
     */
    public float receitaAnual(){
        float aux;
        aux = areaCorredor* valorMedFatAnualMetro;
        return aux;
    }
    /**
     * Método para o Cálculo do Lucro da Empresa do Tipo Mercado
     * @return (float) Valor do Lucro da Empresa do Tipo Mercado
     */
    public float lucro (){
        float despesa = despesaAnual();
        float receita = receitaAnual();
        return receita-despesa;
    }
    /**
     * Método de Verificação da Existência de Lucro ou Não
     * @return (String) SIM : Se existir Lucro ou NÃO : Se não existir Lucro
     */
    public String verificaLucro(){
        if (lucro() > 0){
            return "SIM";
        }
        else {
            return "NÃO";
        }
    }
    /**
     * Polimorfismo de Auxílio, que devolve o Tipo da Empresa
     * @return (String) Tipo da Empresa, neste caso Mercado
     */
    public String tipo(){
        return "MERCADO";
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Mercado com Maior Receita Anual
     * @param e Empresa do Tipo Mercado
     * @return (Empresa) Empresa com Maior Receita Anual
     */
    public Empresa maiorReceita(Empresa e){
        float aux = e.receitaAnual();
        Mercado maiorMercado = (Mercado) e;
        if(receitaAnual()>aux){
            aux = receitaAnual();
            maiorMercado = this;
        }
        return maiorMercado;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Mercado com Menor Despesa Anual
     * @param e Empresa do Tipo Mercado
     * @return (Empresa) Empresa com Menor Despesa Anual
     */
    public Empresa menorDespesa(Empresa e){
        float aux = e.despesaAnual();
        Mercado menorMercado = (Mercado) e;
        if(receitaAnual()<aux){
            aux = despesaAnual();
            menorMercado = this;
        }
        return menorMercado;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Mercado com Maior Lucro
     * @param e Empresa do Tipo Mercado
     * @return (Empresa) Empresa com Maior Lucro
     */
    public Empresa maiorLucro (Empresa e){
        float aux = e.lucro();
        Mercado maiorMercado = (Mercado) e;
        if(lucro()>aux){
            aux = lucro();
            maiorMercado = this;
        }
        return maiorMercado;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Mercado
     * @return Dados de uma Empresa do Tipo Mercado
     */
    @Override
    public String toString() {
        return "\nNome da empresa: " + nome + "\nTipo de empresa: MERCADO"+ "\nDistrito: " + distrito + "\nDespesa Anual: " +despesaAnual() + "\nReceita Anual: " + receitaAnual() + "\nLucro: " + verificaLucro();

    }
}

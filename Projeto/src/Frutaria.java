/**
 * Classe para gerir os dados de uma Empresa do Tipo Frutaria
 * @author ferna
 * @version 1.0
 */
public class Frutaria extends Mercearia {
    /**
     * Número de Produtos existentes na Frutaria
     */
    private int numProd;
    /**
     * Valor Médio Anual em Faturação de Produtos
     */
    private float valorMedFatProdAnual;

    /**
     * Método Construtor Frutaria
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas(Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoAnualLimpeza Custo Anual da Limpeza da Empresa
     * @param numProd Número de Produtos existentes na Frutaria
     * @param valorMedFatProdAnual Valor Médio Anual em Faturação de Produtos
     */
    public Frutaria(String nome, String distrito, float latitude, float longitude, float custoAnualLimpeza, int numProd, float valorMedFatProdAnual) {
        super(nome, distrito, latitude, longitude, custoAnualLimpeza);
        this.numProd = numProd;
        this.valorMedFatProdAnual = valorMedFatProdAnual;
    }
    /**
     * Construtor Vazio
     */
    public Frutaria(){
    }
    /**
     * Método de acesso externo ao Número de Produtos existentes numa Frutaria
     * @return (int) Número de Produtos existentes numa Frutaria
     */
    public int getNumProd() {
        return numProd;
    }
    /**
     * Método Complementar de acesso externo ao Número de Produtos existentes numa Frutaria
     * @param numProd Número de Produtos
     */
    public void setNumProd(int numProd) {
        this.numProd = numProd;
    }
    /**
     * Método de acesso externo ao Valor Médio Anual de Faturação em Produtos
     * @return (float) Valor Médio Anual de Faturação em Produtos
     */
    public float getValorMedFatProdAnual() {
        return valorMedFatProdAnual;
    }
    /**
     * Método Complementar de acesso externo ao Valor Médio Anual de Faturação em Produtos
     * @param valorMedFatProdAnual Valor Médio Anual de Faturação em Produtos
     */
    public void setValorMedFatProdAnual(float valorMedFatProdAnual) {
        this.valorMedFatProdAnual = valorMedFatProdAnual;
    }
    /**
     * Método para o Cálculo da Despesa Anual da Empresa do Tipo Frutaria
     * @return (float) Valor da Despesa Anual da Empresa do Tipo Frutaria
     */
    public float despesaAnual(){
        float aux;
        aux = custoAnualLimpeza;
        return aux;
    }
    /**
     * Método para o Cálculo da Receita Anual da Empresa do Tipo Frutaria
     * @return (float) Valor da Receita Anual da Empresa do Tipo Frutaria
     */
    public float receitaAnual(){
        float aux;
        aux = numProd * valorMedFatProdAnual;
        return aux;
    }
    /**
     * Método para o Cálculo do Lucro da Empresa do Tipo Frutaria
     * @return (float) Valor do Lucro da Empresa do Tipo Frutaria
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
     * @return (String) Tipo da Empresa, neste caso Frutaria
     */
    public String tipo(){
        return "FRUTARIA";
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Frutaria com Maior Receita Anual
     * @param e Empresa do Tipo Frutaria
     * @return (Empresa) Empresa com Maior Receita Anual
     */
    public Empresa maiorReceita(Empresa e){
        float aux = e.receitaAnual();
        Frutaria maiorFrutaria = (Frutaria) e;
        if(receitaAnual()>aux){
            aux = receitaAnual();
            maiorFrutaria = this;
        }
        return maiorFrutaria;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Frutaria com Menor Despesa Anual
     * @param e Empresa do Tipo Frutaria
     * @return (Empresa) Empresa com Menor Despesa Anual
     */
    public Empresa menorDespesa(Empresa e){
        float aux = e.despesaAnual();
        Frutaria menorFrutaria = (Frutaria) e;
        if(receitaAnual()<aux){
            aux = despesaAnual();
            menorFrutaria = this;
        }
        return menorFrutaria;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Frutaria com Maior Lucro
     * @param e Empresa do Tipo Frutaria
     * @return (Empresa) Empresa com Maior Lucro
     */
    public Empresa maiorLucro (Empresa e){
        float aux = e.lucro();
        Frutaria maiorFrutaria = (Frutaria) e;
        if(lucro()>aux){
            aux = lucro();
            maiorFrutaria = this;
        }
        return maiorFrutaria;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Frutaria
     * @return Dados de uma Empresa do Tipo Frutaria
     */
    @Override
    public String toString() {
        return "\nNome da empresa: " + nome + "\nTipo de empresa: FRUTARIA"+ "\nDistrito: " + distrito + "\nDespesa Anual: " +despesaAnual() + "\nReceita Anual: " + receitaAnual() + "\nLucro: " + verificaLucro();
    }
}

import java.util.Collections;
/**
 * Classe para gerir os dados de uma Empresa do Tipo Café
 * @author ferna
 * @version 1.0
 */
public class Cafe extends Restauracao {
    /**
     * Número Médio de Cafés Vendidos Diariamente
     */
    private float numMedCafeDiario;
    /**
     * Valor Médio de Faturação por Cafés Diariamente
     */
    private float valorMedFatCafeDiario;
    /**
     * Construtor Vazio
     */
    public Cafe(){}
    /**
     * Método Construtor Café
     * @param nome Nome da Empresa
     * @param distrito Distrito da Empresa
     * @param latitude Coordenadas(Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoEmp Salário de um Empregado
     * @param numEmp Número de Empregados
     * @param custoSalMedAnual Média anual total do Custo dos Salários dos Empregados
     * @param numMedClientDiario Número Médio de Clientes Diário
     * @param numMedCafeDiario Número Médio de Cafés vendidos Diariamente
     * @param valorMedFatCafeDiario Valor Médio de Faturação em cafés Diariamente
     */
    public Cafe(String nome, String distrito, float latitude, float longitude, float custoEmp, int numEmp, float custoSalMedAnual, float numMedClientDiario, float numMedCafeDiario, float valorMedFatCafeDiario) {
        super(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario);
        this.numMedCafeDiario = numMedCafeDiario;
        this.valorMedFatCafeDiario = valorMedFatCafeDiario;
    }
    /**
     * Método de acesso externo ao Número de Cafés vendidos Diariamente
     * @return (float) Número Médio de Cafés vendidos Diariamente
     */
    public float getNumMedCafeDiario() {
        return numMedCafeDiario;
    }
    /**
     * Método Complementar de acesso externo ao Número de Cafés vendidos Diariamente
     * @param numMedCafeDiario Número Médio de Cafés vendidos Diariamente
     */
    public void setNumMedCafeDiario(float numMedCafeDiario) {
        this.numMedCafeDiario = numMedCafeDiario;
    }
    /**
     * Método de acesso externo ao Valor Médio de Faturação em Cafés Diariamente
     * @return (float) Valor Médio de Faturação em Cafés Diariamente
     */
    public float getValorMedFatCafeDiario() {
        return valorMedFatCafeDiario;
    }
    /**
     * Métode Complementar de acesso externo ao Valor Médio de Faturação em Cafés Diariamente
     * @param valorMedFatCafeDiario Valor Médio de Faturação em Cafés Diariamente
     */
    public void setValorMedFatCafeDiario(float valorMedFatCafeDiario) {
        this.valorMedFatCafeDiario = valorMedFatCafeDiario;
    }
    /**
     * Método para o Cálculo da Despesa Anual da Empresa do Tipo Café
     * @return (float) Valor da Despesa Anual da Empresa do Tipo Café
     */
    public float despesaAnual(){
        float aux;
        aux = numEmp * custoSalMedAnual;
        return aux;
    }
    /**
     * Método para o Cálculo da Receita Anual da Empresa do Tipo Café
     * @return (float) Valor da Receita Anual da Empresa do Tipo Café
     */
    public float receitaAnual(){
        float aux;
        aux = numMedCafeDiario * valorMedFatCafeDiario;
        return aux;
    }
    /**
     * Método para o Cálculo do Lucro da Empresa do Tipo Café
     * @return (float) Valor do Lucro da Empresa do Tipo Café
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
     * @return (String) Tipo da Empresa, neste caso Café
     */
    public String tipo(){
        return "CAFE";
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Café com Maior Receita Anual
     * @param e Empresa do Tipo Café
     * @return (Empresa) Empresa com Maior Receita Anual
     */
    public Empresa maiorReceita(Empresa e){
        float aux = e.receitaAnual();
        Cafe maiorCafe = (Cafe) e;
        if(receitaAnual()>aux){
            aux = receitaAnual();
            maiorCafe = this;
        }
        return maiorCafe;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Café com Menor Despesa Anual
     * @param e Empresa do Tipo Café
     * @return (Empresa) Empresa com Menor Despesa Anual
     */
    public Empresa menorDespesa(Empresa e){
        float aux = e.despesaAnual();
        Cafe menorCafe = (Cafe) e;
        if(receitaAnual()<aux){
            aux = despesaAnual();
            menorCafe = this;
        }
        return menorCafe;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Café com Maior Lucro
     * @param e Empresa do Tipo Café
     * @return (Empresa) Empresa com Maior Lucro
     */
    public Empresa maiorLucro (Empresa e){
        float aux = e.lucro();
        Cafe maiorCafe = (Cafe) e;
        if(lucro()>aux){
            aux = lucro();
            maiorCafe = this;
        }
        return maiorCafe;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Café
     * @return Dados de uma Empresa do Tipo Café
     */
    @Override
    public String toString() {
        return "\nNome da empresa: " + nome + "\nTipo de empresa:CAFE "+ "\nDistrito: " + distrito + "\nDespesa Anual: " +despesaAnual() + "\nReceita Anual: " + receitaAnual() + "\nLucro: " + verificaLucro();
    }
}

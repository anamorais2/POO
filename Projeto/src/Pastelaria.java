/**
 * Classe para gerir os dados de uma Empresa do Tipo Pastelaria
 * @author ferna
 * @version 1.0
 */
public class Pastelaria extends Restauracao {
    /**
     * Número de Bolos Vendido Diariamente
     */
    private int numBolosDiario;
    /**
     * Valor Médio Diario de Faturação em Bolos
     */
    private float valorMedFatBoloDiario;
    /**
     * Método Construtor Pastelaria
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas (Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoEmp Custo dos Empregados
     * @param numEmp Número de Empregados
     * @param custoSalMedAnual Custo Médio Anual do Salário dos Empregados
     * @param numMedClientDiario Número Médio de Clientes Diariamente
     * @param numBolosDiario Número de Bolos Vendido Diariamente
     * @param valorMedFatBoloDiario Valor Médio Diario de Faturação em Bolos
     */
    public Pastelaria(String nome, String distrito, float latitude, float longitude, float custoEmp, int numEmp, float custoSalMedAnual, float numMedClientDiario, int numBolosDiario, float valorMedFatBoloDiario) {
        super(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario);
        this.numBolosDiario = numBolosDiario;
        this.valorMedFatBoloDiario = valorMedFatBoloDiario;
    }
    /**
     * Método Construtor Vazio
     */
    public Pastelaria(){
    }
    /**
     * Método de acesso externo ao Número de Bolos Vendidos Diariamente
     * @return (int) Número de Bolos Vendido Diariamente
     */
    public int getNumBolosDiario() {
        return numBolosDiario;
    }
    /**
     * Método Complementar de acesso externo ao Número de Bolos Vendidos Diariamente
     * @param numBolosDiario Número de Bolos Vendidos Diariamente
     */
    public void setNumBolosDiario(int numBolosDiario) {
        this.numBolosDiario = numBolosDiario;
    }
    /**
     * Método de acesso externo ao Valor Médio Diario de Faturação em Bolos
     * @return (float) Valor Médio Diario de Faturação em Bolos
     */
    public float getValorMedFatBoloDiario() {
        return valorMedFatBoloDiario;
    }
    /**
     * Método Complementar de acesso externo ao Valor Médio Diario de Faturação em Bolos
     * @param valorMedFatBoloDiario Valor Médio Diario de Faturação em Bolos
     */
    public void setValorMedFatBoloDiario(float valorMedFatBoloDiario) {this.valorMedFatBoloDiario = valorMedFatBoloDiario;}
    /**
     * Método para o Cálculo da Despesa Anual da Empresa do Tipo Pastelaria
     * @return (float) Valor da Despesa Anual da Empresa do Tipo Pastelaria
     */
    public float despesaAnual(){
        float aux;
        aux = numEmp * custoSalMedAnual;
        return aux;
    }
    /**
     * Método para o Cálculo da Receita Anual da Empresa do Tipo Pastelaria
     * @return (float) Valor da Receita Anual da Empresa do Tipo Pastelaria
     */
    public float receitaAnual(){
        float aux;
        aux = valorMedFatBoloDiario * numBolosDiario;
        return aux;
    }
    /**
     * Método para o Cálculo do Lucro da Empresa do Tipo Pastelaria
     * @return (float) Valor do Lucro da Empresa do Tipo Pastelaria
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
     * @return (String) Tipo da Empresa, neste caso Pastelaria
     */
    public String tipo(){
        return "PASTELARIA";
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Pastelaria com Maior Receita Anual
     * @param e Empresa do Tipo Pastelaria
     * @return (Empresa) Empresa com Maior Receita Anual
     */
    public Empresa maiorReceita(Empresa e){
        float aux = e.receitaAnual();
        Pastelaria maiorPastelaria = (Pastelaria) e;
        if(receitaAnual()>aux){
            aux = receitaAnual();
            maiorPastelaria = this;
        }
        return maiorPastelaria;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Pastelaria com Menor Despesa
     * @param e Empresa do Tipo Pastelaria
     * @return (Empresa) Empresa com Menor Despesa
     */
    public Empresa menorDespesa(Empresa e){
        float aux = e.despesaAnual();
        Pastelaria menorPastelaria = (Pastelaria) e;
        if(receitaAnual()<aux){
            aux = despesaAnual();
            menorPastelaria = this;
        }
        return menorPastelaria;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Pastelaria com Maior Lucro
     * @param e Empresa do Tipo Pastelaria
     * @return (Empresa) Empresa com Maior Lucro
     */
    public Empresa maiorLucro (Empresa e){
        float aux = e.lucro();
        Pastelaria maiorPastelaria = (Pastelaria) e;
        if(lucro()>aux){
            aux = lucro();
            maiorPastelaria = this;
        }
        return maiorPastelaria;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Pastelaria
     * @return Dados de uma Empresa do Tipo Pastelaria
     */
    @Override
    public String toString() {
        return "\nNome da empresa: " + nome + "\nTipo de empresa: PASTELARIA"+ "\nDistrito: " + distrito + "\nDespesa Anual: " +despesaAnual() + "\nReceita Anual: " + receitaAnual() + "\nLucro: " + verificaLucro();
    }
}

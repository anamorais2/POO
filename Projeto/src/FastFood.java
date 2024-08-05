/**
 * Classe para gerir os dados de uma Empresa do Tipo FastFood
 * @author ferna
 * @version 1.0
 */
public class FastFood extends Restaurante {
    /**
     * Número Médio Diário de Clientes Drive
     */
    private float numMedClientDrive;
    /**
     * Valor Médio Diário de Faturação de Clientes Drive
     */
    private float valorMedDiarioFatClientDrive;
    /**
     * Método Construtor FastFood
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas(Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoEmp Custo dos Empregados
     * @param numEmp Número de empregados
     * @param custoSalMedAnual Custo Médio Anual do Salário dos Empregados
     * @param numMedClientDiario Número Médio de Clientes Diariamente
     * @param numMesaInterior Número de Mesas Interiores
     * @param valorMedFatMesaDiario Valor Médio Diário de Faturação das Mesas
     * @param numDiasFunAnual Número de Dias de Funcionamento por Ano
     * @param numMedClientDrive Número Médio Diário de Clientes Drive
     * @param valorMedDiarioFatClientDrive Valor Médio Diário de Faturação de Clientes Drive
     */
    public FastFood(String nome, String distrito, float latitude, float longitude, float custoEmp, int numEmp, float custoSalMedAnual, float numMedClientDiario, int numMesaInterior, float valorMedFatMesaDiario, int numDiasFunAnual, float numMedClientDrive, float valorMedDiarioFatClientDrive) {
        super(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario, numMesaInterior, valorMedFatMesaDiario, numDiasFunAnual);
        this.numMedClientDrive = numMedClientDrive;
        this.valorMedDiarioFatClientDrive = valorMedDiarioFatClientDrive;
    }
    /**
     * Método Construtor Vazio
     */
    public FastFood(){}
    /**
     * Método de acesso externo ao Número Médio Diário de Clientes Drive
     * @return (float) Número Médio Diário de Clientes Drive
     */
    public float getNumMedClientDrive() {
        return numMedClientDrive;
    }
    /**
     * Método Complementar de acesso externo ao Número Médio Diário de Clientes Drive
     * @param numMedClientDrive Número Médio Diário de Clientes Drive
     */
    public void setNumMedClientDrive(float numMedClientDrive) {
        this.numMedClientDrive = numMedClientDrive;
    }
    /**
     * Método de acesso externo ao Valor Médio Diário de Faturação de Clientes Drive
     * @return (float) Valor Médio Diário de Faturação de Clientes Drive
     */
    public float getValorMedDiarioFatClientDrive() {
        return valorMedDiarioFatClientDrive;
    }
    /**
     * Método Complementar de acesso externo ao Valor Médio Diário de Faturação de Clientes Drive
     * @param valorMedDiarioFatClientDrive Valor Médio Diário de Faturação de Clientes Drive
     */
    public void setValorMedDiarioFatClientDrive(float valorMedDiarioFatClientDrive) {this.valorMedDiarioFatClientDrive = valorMedDiarioFatClientDrive;
    }
    /**
     * Método para o Cálculo da Despesa Anual da Empresa do Tipo Restaurante FastFood
     * @return (float) Valor da Despesa Anual da Empresa do Tipo Restaurante FastFood
     */
    public float despesaAnual(){
        float aux;
        aux = numEmp * custoSalMedAnual;
        return aux;
    }
    /**
     * Método para o Cálculo da Receita Anual da Empresa do Tipo Restaurante FastFood
     * @return (float) Valor da Receita Anual da Empresa do Tipo Restaurante FastFood
     */
    public float receitaAnual(){
        float aux;
        aux = (numMesaInterior * valorMedFatMesaDiario + numMedClientDrive
                *valorMedDiarioFatClientDrive)*numDiasFunAnual;
        return aux;
    }
    /**
     * Método para o Cálculo do Lucro da Empresa do Tipo Restaurante FastFood
     * @return (float) Valor do Lucro da Empresa do Tipo Restaurante FastFood
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
     * Método de Retorno da Capacidade em Número de mesas
     * @return Capacidade de um Restaurante FastFood
     */
    public int capacidade (){
        return numMesaInterior;
    }
    /**
     * Polimorfismo de Auxílio, que devolve o Tipo da Empresa
     * @return (String) Tipo da Empresa, neste caso FastFood
     */
    public String tipo(){
        return "FASTFOOD";
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Restaurante FastFood com Maior Receita Anual
     * @param e Empresa do Tipo Restaurante FastFood
     * @return (Empresa) Empresa com Maior Receita Anual
     */
    public Empresa maiorReceita(Empresa e){
        float aux = e.receitaAnual();
        FastFood maiorFastFood = (FastFood) e;
        if(receitaAnual()>aux){
            aux = receitaAnual();
            maiorFastFood = this;
        }
        return maiorFastFood;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Restaurante FastFood com Menor Despesa Anual
     * @param e Empresa do Tipo Restaurante FastFood
     * @return (Empresa) Empresa com Menor Despesa Anual
     */
    public Empresa menorDespesa(Empresa e){
        float aux = e.despesaAnual();
        FastFood menorFastFood = (FastFood) e;
        if(receitaAnual()<aux){
            aux = despesaAnual();
            menorFastFood = this;
        }
        return menorFastFood;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Restaurante FastFood com Maior Lucro
     * @param e Empresa do Tipo Restaurante FastFood
     * @return (Empresa) Empresa com Maior Lucro
     */
    public Empresa maiorLucro (Empresa e){
        float aux = e.lucro();
        FastFood maiorFastFood = (FastFood) e;
        if(lucro()>aux){
            aux = lucro();
            maiorFastFood = this;
        }
        return maiorFastFood;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Restaurante FastFood
     * @return Dados de uma Empresa do Tipo Restaurante FastFood
     */
    @Override
    public String toString() {
        return "\nNome da empresa: " + nome + "\nTipo de empresa: FASTFOOD" + "\nDistrito: " + distrito + "\nDespesa Anual: " + despesaAnual() + "\nReceita Anual: " + receitaAnual() + "\nLucro: " + verificaLucro();
    }
}

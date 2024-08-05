/**
 * Classe para gerir os dados de uma Empresa do Tipo Restaurante
 * @author ferna
 * @version 1.0
 */
public class Local extends Restaurante {
    /**
     * Número de Mesas de Esplanada
     */
    private int numMesaEsplanada;
    /**
     * Custo da Lincença Anual das Mesas de Esplanada
     */
    private float custoLicenAnualMesaEspla;

    /**
     * Método Construtor Local
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
     * @param numMesaEsplanada Múmero de Mesas de Esplanada
     * @param custoLicenAnualMesaEspla Custo da Lincença Anual das Mesas de Esplanada
     */
    public Local(String nome, String distrito, float latitude, float longitude, float custoEmp, int numEmp, float custoSalMedAnual, float numMedClientDiario, int numMesaInterior, float valorMedFatMesaDiario, int numDiasFunAnual, int numMesaEsplanada, float custoLicenAnualMesaEspla) {
        super(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario, numMesaInterior, valorMedFatMesaDiario, numDiasFunAnual);
        this.numMesaEsplanada = numMesaEsplanada;
        this.custoLicenAnualMesaEspla = custoLicenAnualMesaEspla;
    }

    /**
     * Construtor Vazio
     */
    public Local(){}
    /**
     * Método de acesso externo ao Número de Mesas de Esplanada
     * @return (int) Número de Mesas de Esplanada
     */
    public int getNumMesaEsplanada() {
        return numMesaEsplanada;
    }
    /**
     * Método Complementar de acesso externo ao Número de Mesas de Esplanada
     * @param numMesaEsplanada Número de Mesas de Esplanada
     */
    public void setNumMesaEsplanada(int numMesaEsplanada) {
        this.numMesaEsplanada = numMesaEsplanada;
    }
    /**
     * Método de acesso externo ao Custo da Lincença Anual das Mesas de Esplanada
     * @return (float) Custo da Lincença Anual das Mesas de Esplanada
     */
    public float getCustoLicenAnualMesaEspla() {
        return custoLicenAnualMesaEspla;
    }
    /**
     * Método Complementar de acesso externo ao Custo da Lincença Anual das Mesas de Esplanada
     * @param custoLicenAnualMesaEspla Custo da Lincença Anual das Mesas de Esplanada
     */
    public void setCustoLicenAnualMesaEspla(float custoLicenAnualMesaEspla) {this.custoLicenAnualMesaEspla = custoLicenAnualMesaEspla;}
    /**
     * Método para o Cálculo da Despesa Anual da Empresa do Tipo Restaurante Local
     * @return (float) Valor da Despesa Anual da Empresa do Tipo Restaurante Local
     */
    public float despesaAnual(){
        float aux;
        aux = (numEmp * custoSalMedAnual) + (numMesaEsplanada * custoLicenAnualMesaEspla);
        return aux;
    }
    /**
     * Método para o Cálculo da Receita Anual da Empresa do Tipo Restaurante Local
     * @return (float) Valor da Receita Anual da Empresa do Tipo Restaurante Local
     */
    public float receitaAnual(){
        float aux;
        aux = (numMesaInterior + numMesaEsplanada)* valorMedFatMesaDiario * numDiasFunAnual;
        return aux;
    }
    /**
     * Método para o Cálculo do Lucro da Empresa do Tipo Restaurante Local
     * @return (float) Valor do Lucro da Empresa do Tipo Restaurante Local
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
     * @return (String) Tipo da Empresa, neste caso Local
     */
    public String tipo(){
        return "LOCAL";
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Restaurante Local com Maior Receita Anual
     * @param e Empresa do Tipo Restaurante Local
     * @return (Empresa) Empresa com Maior Receita Anual
     */
    public Empresa maiorReceita(Empresa e){
        float aux = e.receitaAnual();
        Local maiorLocal = (Local) e;
        if(receitaAnual()>aux){
            aux = receitaAnual();
            maiorLocal = this;
        }
        return maiorLocal;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Restaurante Local com Menor Despesa Anual
     * @param e Empresa do Tipo Restaurante Local
     * @return (Empresa) Empresa com Menor Despesa Anual
     */
    public Empresa menorDespesa(Empresa e){
        float aux = e.despesaAnual();
        Local menorLocal = (Local) e;
        if(receitaAnual()<aux){
            aux = despesaAnual();
            menorLocal = this;
        }
        return menorLocal;
    }
    /**
     * Método de Comparação, Enconcontra a Empresa do Tipo Restaurante Local com Maior Lucro
     * @param e Empresa do Tipo Restaurante Local
     * @return (Empresa) Empresa com Maior Lucro
     */
    public Empresa maiorLucro (Empresa e){
        float aux = e.lucro();
        Local maiorLocal = (Local) e;
        if(lucro()>aux){
            aux = lucro();
            maiorLocal = this;
        }
        return maiorLocal;
    }
    /**
     * Método de Retorno da Capacidade em Número de mesas
     * @return Capacidade de um Restaurante Local
     */
    public int capacidade (){
        return numMesaEsplanada + numMesaInterior;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Restaurante Local
     * @return Dados de uma Empresa do Tipo Restaurante Local
     */
    @Override
    public String toString() {
        return "\nNome da empresa: " + nome + "\nTipo de empresa: LOCAL"+ "\nDistrito: " + distrito + "\nDespesa Anual: " +despesaAnual() + "\nReceita Anual: " + receitaAnual() + "\nLucro: " + verificaLucro();

    }
}

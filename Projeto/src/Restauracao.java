/**
 * Classe para gerir os dados de uma Empresa do Tipo Restauração
 * @author ferna
 * @version 1.0
 */
public class Restauracao extends Empresa {
    /**
     * Custo dos Empregados
     */
    protected float custoEmp;
    /**
     * Número de Empregados
     */
    protected int numEmp;
    /**
     * Custo Médio Anual do Salário dos Empregados
     */
    protected float custoSalMedAnual;
    /**
     * Número Médio de Clientes Diariamente
     */
    protected float numMedClientDiario;
    /**
     * Método Construtor Restauracao
     * @param nome Nome da Empresa
     * @param distrito Distrito de Localização da Empresa
     * @param latitude Coordenadas(Latitude) de Localização da Empresa
     * @param longitude Coordenadas(Longitude) de Localização da Empresa
     * @param custoEmp Custo dos Empregados
     * @param numEmp Número de empregados
     * @param custoSalMedAnual Custo Médio Anual do Salário dos Empregados
     * @param numMedClientDiario Número Médio de Clientes Diariamente
     */
    public Restauracao(String nome, String distrito, float latitude, float longitude, float custoEmp, int numEmp, float custoSalMedAnual, float numMedClientDiario) {
        super(nome, distrito, latitude, longitude);
        this.custoEmp = custoEmp;
        this.numEmp = numEmp;
        this.custoSalMedAnual = custoSalMedAnual;
        this.numMedClientDiario = numMedClientDiario;
    }
    /**
     * Método Construtor Vazio
     */
    public Restauracao() {}
    /**
     * Método de acesso externo ao Custo dos Empregados
     * @return (float) Custo dos Empregados
     */
    public float getCustoEmp() {
        return custoEmp;
    }
    /**
     * Método Complementar de acesso externo ao Custo dos Empregados
     * @param custoEmp Custo dos Empregados
     */
    public void setCustoEmp(float custoEmp) {
        this.custoEmp = custoEmp;
    }
    /**
     * Método de acesso externo ao Número de Empregados
     * @return (int) Número de Empregados
     */
    public int getNumEmp() {
        return numEmp;
    }
    /**
     * Método Complementar de acesso externo ao Número de Empregados
     * @param numEmp Número de Empregados
     */
    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
    /**
     * Método de acesso externo ao Custo Médio Anual do Salário dos Empregados
     * @return (float) Custo Médio Anual do Salário dos Empregados
     */
    public float getCustoSalMedAnual() {
        return custoSalMedAnual;
    }
    /**
     * Método Complementar de acesso externo ao Custo Médio Anual do Salário dos Empregados
     * @param custoSalMedAnual Custo Médio Anual do Salário dos Empregados
     */
    public void setCustoSalMedAnual(float custoSalMedAnual) {
        this.custoSalMedAnual = custoSalMedAnual;
    }
    /**
     * Método de acesso externo ao Número Médio de Clientes Diariamente
     * @return (float) Número Médio de Clientes Diariamente
     */
    public float getNumMedClientDiario() {
        return numMedClientDiario;
    }
    /**
     * Método Complementar de acesso externo ao Número Médio de Clientes Diariamente
     * @param numMedClientDiario Número Médio de Clientes Diariamente
     */
    public void setNumMedClientDiario(float numMedClientDiario) {
        this.numMedClientDiario = numMedClientDiario;
    }
    /**
     * Método de Polimorfismo para o Cálculo da Despesa Anual da Empresa do Tipo Restauracao
     * @return 0
     */
    public float despesaAnual() {return 0;}
    /**
     * Método de Polimorfismo para o Cálculo da Receita Anual da Empresa do Tipo Restauracao
     * @return 0
     */
    public float receitaAnual() {return 0;}
    /**
     * Método de Polimorfismo para o Cálculo do Lucro da Empresa do Tipo Restaurante Local
     * @return 0
     */
    public float lucro() {return 0;}
    public String tipo() {return null;}
    /**
     * Método de Polimorfismo, que Retorna a Empresa com Maior Receita Anual
     * @param e Empresa
     * @return Null, irá para uma classe Descendente
     */
    public Empresa maiorReceita(Empresa e) {return null;}
    /**
     * Método de Polimorfismo, que Retorna a Empresa com Menor Despesa Anual
     * @param e Empresa
     * @return Null, irá para uma classe Descendente
     */
    public Empresa menorDespesa(Empresa e) {return null;}
    /**
     * Método de Polimorfismo, que Retorna a Empresa com Maior Lucro
     * @param e Empresa
     * @return Null, irá para uma classe Descendente
     */
    public Empresa maiorLucro(Empresa e) {return null;}
    /**
     * Método Polimorfismo de Retorno da Capacidade em Número de mesas
     * @return Capacidade de uma Empresa do Tipo Restauracao
     */
    public int capacidade (){
        return 0;
    }
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Restauracao
     * @return Dados de uma Empresa do Tipo Restauracao
     */
    @Override
    public String toString() {
        return "Restauração: " + super.toString() +
                "\nCusto empregados de mesa: " + custoEmp +
                "\nNumero empregados de mesa: " + numEmp +
                "\nCusto medio salario anual: " + custoSalMedAnual;

    }
}


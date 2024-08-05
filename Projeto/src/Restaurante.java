/**
 * Classe para gerir os dados de uma Empresa do Tipo Restaurante
 * @author ferna
 * @version 1.0
 */
public abstract class Restaurante extends Restauracao {
    /**
     * Número de Mesas Interiores
     */
    protected int numMesaInterior;
    /**
     * Valor Médio Diário de Faturação das Mesas
     */
    protected float valorMedFatMesaDiario;
    /**
     * Número de Dias de Funcionamento por Ano
     */
    protected int numDiasFunAnual;
    /**
     * Método Construtor Restaurante
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
     */
    public Restaurante(String nome, String distrito, float latitude, float longitude, float custoEmp, int numEmp, float custoSalMedAnual, float numMedClientDiario, int numMesaInterior, float valorMedFatMesaDiario, int numDiasFunAnual) {
        super(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario);
        this.numMesaInterior = numMesaInterior;
        this.valorMedFatMesaDiario = valorMedFatMesaDiario;
        this.numDiasFunAnual = numDiasFunAnual;
    }
    /**
     * Método Construtor Vazio
     */
    public Restaurante(){}
    /**
     * Método de acesso externo ao Número de Dias de Funcionamento por Ano
     * @return (int) Número de Dias de Funcionamento por Ano
     */
    public int getNumDiasFunAnual() {
        return numDiasFunAnual;
    }
    /**
     * Método Complementar de acesso externo ao Número de Dias de Funcionamento por Ano
     * @param numDiasFunAnual Número de Dias de Funcionamento por Ano
     */
    public void setNumDiasFunAnual(int numDiasFunAnual) {
        this.numDiasFunAnual = numDiasFunAnual;
    }
    /**
     * Método de acesso externo ao Número de Mesas Interiores
     * @return (int) Número de Mesas Interiores
     */
    public int getNumMesaInterior() {
        return numMesaInterior;
    }
    /**
     * Método Complementar de acesso externo ao Número de Mesas Interiores
     * @param numMesaInterior Número de Mesas Interiores
     */
    public void setNumMesaInterior(int numMesaInterior) {
        this.numMesaInterior = numMesaInterior;
    }
    /**
     * Método de acesso externo ao Valor Médio Diário de Faturação das Mesas
     * @return (float) Valor Médio Diário de Faturação das Mesas
     */
    public float getValorMedFatMesaDiario() {
        return valorMedFatMesaDiario;
    }
    /**
     * Método Complementar de acesso externo ao Valor Médio Diário de Faturação das Mesas
     * @param valorMedFatMesaDiario Valor Médio Diário de Faturação das Mesas
     */
    public void setValorMedFatMesaDiario(float valorMedFatMesaDiario) {
        this.valorMedFatMesaDiario = valorMedFatMesaDiario;
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
     * Método Abstrato de Cálculo do Lucro da Empresa
     * @return Método Abstrato
     */
    public abstract float lucro();
    /**
     * Polimorfismo de Auxílio, que devolve o Tipo da Empresa
     * @return (String) Tipo da Empresa, neste caso Restautrante
     */
    public String tipo(){return "RESTAURANTE";}
    /**
     * Método Abstrato, que Encontra a Empresa com Maior Receita Anual
     * @param e Empresa
     * @return Abstrato
     */
    public abstract Empresa maiorReceita(Empresa e);
    /**
     * Método Abstrato, que Encontra a Empresa com Menor Despesa Anual
     * @param e Empresa
     * @return Abstrato
     */
    public abstract Empresa menorDespesa(Empresa e);
    /**
     * Método Abstrato, que Encontra a Empresa com Maior Lucro
     * @param e Empresa
     * @return Abstrato
     */
    public abstract Empresa maiorLucro (Empresa e);
    /**
     * Método Abstrato de Retorno da Capacidade em Número de mesas
     * @return Abstrato
     */
    public abstract int capacidade ();
    /**
     * Método que Retorna os Dados de uma Empresa do Tipo Restaurante
     * @return Dados de uma Empresa do Tipo Restaurante
     */
    @Override
    public String toString() {
        return  "\nRestaurante: " + super.toString()+
                "\nNumero Medio de Clientes Diario: " + numMedClientDiario +
                "\nNumero de Dias Funcionamento Anual: " + numDiasFunAnual;
    }
}

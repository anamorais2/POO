/**
 * Classe para gerir os atributos do Professor
 * @author Ana Carolina
 * @version 1.0
 */
public class Professor  {
    /**
     * Nome do Professor
     */
    private String nome;
    /**
     * Email do Professor
     */
    private String email;

    /**
     * Construtor da classe, recebe dados para a inicialização dos atributos
     * @param nome Nome do Professor
     * @param email Email do Professor
     */
    public Professor(String nome, String email){
        this.nome=nome;
        this.email=email;
    }

    /**
     * Método de acesso externo ao nome do Professor
     * @return Nome do Professor
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param nome Novo nome que pode-se atribuir ao Professor
     */
    public void setNome(String nome){
        this.nome=nome;
    }

    /**
     * Método de acesso externo ao email do Professor
     * @return Email do Professor
     */
    public String getEmail() {
        return email;
    }
    /**
     * Método que serve para atualizar um dado (subsitui-lo)
     * @param email Novo email que pode-se atribuir ao Professor
     */
    public void setEmail(String email){
        this.email=email;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
/**
 * Classe para gerir a Interface
 * @author ferna
 * @version 1.0
 */
public class Interface extends JFrame {
    /**
     * Painel Principal
     */
    private JPanel panel;
    /**
     * Lista de Empresas
     */
    private GerirEmpresas gerirEmpresas;
    /**
     * Label "Operações sobre Empresas" e "Operações sobre Categorias"
     */
    private JLabel label1,label2;
    /**
     * Botões: Empresa,Categorias,Sair
     */
    private JButton buttonOperarEmpresas, buttonOperarCategorias,buttonExit;
    /**
     * Método de acesso externo ao Painel Principal
     * @return (JPanel) Painel Principal
     */
    public JPanel getPanel() {
        return panel;
    }
    /**
     * Método Complementar de acesso externo ao Painel Principal
     * @param panel Painel Principal
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    /**
     * Método de acesso externo à Lista de Empresas
     * @return (GerirEmpresas) Lista de Empresas
     */
    public GerirEmpresas getGerirEmpresas() {
        return gerirEmpresas;
    }
    /**
     * Método Complementar de acesso externo à Lista de Empresas
     * @param gerirEmpresas Lista de Empresas
     */
    public void setGerirEmpresas(GerirEmpresas gerirEmpresas) {
        this.gerirEmpresas = gerirEmpresas;
    }
    /**
     * Método de acesso externo á Label "Operações sobre Empresas"
     * @return (JLabel) "Operações sobre Empresas"
     */
    public JLabel getLabel1() {
        return label1;
    }
    /**
     * Método Complementar de acesso externo à Label "Operações sobre Empresas"
     * @param label1 "Operações sobre Empresas"
     */
    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }
    /**
     * Método de acesso externo à Label "Operações sobre Categorias"
     * @return (JLabel) "Operações sobre Categorias"
     */
    public JLabel getLabel2() {
        return label2;
    }
    /**
     * Método Complementar de acesso externo á Label "Operações sobre Categorias"
     * @param label2 "Operações sobre Categorias"
     */
    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }
    /**
     * Método de acesso externo ao Botão Empresas
     * @return (JButton) Botão Empresa
     */
    public JButton getButtonOperarEmpresas() {
        return buttonOperarEmpresas;
    }
    /**
     * Método Complementar de acesso externo ao Botão Empresas
     * @param buttonOperarEmpresas Botão Emmpresas
     */
    public void setButtonOperarEmpresas(JButton buttonOperarEmpresas) {
        this.buttonOperarEmpresas = buttonOperarEmpresas;
    }
    /**
     * Método de acesso externo ao Botão Categorias
     * @return (JButton) Botão Categorias
     */
    public JButton getButtonOperarCategorias() {
        return buttonOperarCategorias;
    }
    /**
     * Método Complementar de acesso externo ao Botão Categorias
     * @param buttonOperarCategorias Botão Categorias
     */
    public void setButtonOperarCategorias(JButton buttonOperarCategorias) {
        this.buttonOperarCategorias = buttonOperarCategorias;
    }
    /**
     * Método de acesso externo ao Botão Sair
     * @return (JButton) Botão Sair
     */
    public JButton getButtonExit() {
        return buttonExit;
    }
    /**
     * Método Complementar de acesso externo ao Botão Sair
     * @param buttonExit Botão Sair
     */
    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }
    /**
     * Método Construtor Interface, que Inicializa e adiciona ao Painel Principal os Atributos
     * @param gerirEmpresas Lista de Empresas
     */
    public Interface(GerirEmpresas gerirEmpresas){
        super();
        this.gerirEmpresas = gerirEmpresas;
        setTitle("Menu");
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        label1 = new JLabel("Operações sobre Empresas");
        label2 = new JLabel("Operações sobre Categorias");

        buttonOperarCategorias = new JButton("Categorias");
        buttonOperarCategorias.setBounds(100,85,100,25);
        buttonOperarEmpresas = new JButton("Empresas");
        buttonOperarEmpresas.setBounds(50,85,100,25);
        buttonExit = new JButton("Sair");

        //Panel

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label1);
        panel.add(buttonOperarEmpresas);
        panel.add(label2);
        panel.add(buttonOperarCategorias);
        panel.add(buttonExit);


        //Listeners
        ButtonListener buttonListener = new ButtonListener(this);
        buttonExit.addActionListener(buttonListener);
        buttonOperarEmpresas.addActionListener(buttonListener);
        buttonOperarCategorias.addActionListener(buttonListener);

        this.add(panel);

    }
    /**
     * Método Privado, onde são implementados os ActionListener dos Botões
     */
    private class ButtonListener implements ActionListener {
        /**
         * Janela Principal
         */
        private Interface inter;
        /**
         * Método Construtor ButtonListener que Inicializa a Janela Principal
         * @param i Janela Principal
         */
        public ButtonListener(Interface i) {
            this.inter=i;
        }
        /**
         * Método de acesso de externo á Janela Principal
         * @return (Interface) Janela Principal
         */
        public Interface getInter() {
            return inter;
        }
        /**
         * Método Complementar de acesso de externo á Janela Principal
         * @param inter Janela Principal
         */
        public void setInter(Interface inter) {
            this.inter = inter;
        }
        /**
         * Método em que são Implementadas as Ações dos Botões
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == buttonExit){
                if(JOptionPane.showConfirmDialog(null,"Tem a certeza que pretende sair?","Sair",JOptionPane.YES_NO_OPTION)==0){
                    System.exit(0);
                }
            }
            else if(e.getSource() == buttonOperarEmpresas){
                JanelaEmpresa janelaEmpresa = new JanelaEmpresa(gerirEmpresas);
                janelaEmpresa.setTitle("Menu Empresa");
                janelaEmpresa.setSize(900,900);
                janelaEmpresa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                try {
                    inter.setVisible(false);
                } catch (Exception ex) {
                    System.out.println("ERRO! PONTEIRO NULL");
                }
                janelaEmpresa.setVisible(true);

            }else if(e.getSource() == buttonOperarCategorias){
                JanelaCategoria janelaCategorias = new JanelaCategoria(gerirEmpresas);
                janelaCategorias.setTitle("Menu Categorias");
                janelaCategorias.setSize(900,900);
                janelaCategorias.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                try {
                    inter.setVisible(false);
                } catch (Exception ex) {
                    System.out.println("ERRO! PONTEIRO NULL");
                }
                janelaCategorias.setVisible(true);

            }
        }
    }

}

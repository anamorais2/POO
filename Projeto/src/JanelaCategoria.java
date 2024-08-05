import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Classe para gerir na Interface a Janela Categoria
 * @author ferna
 * @version 1.0
 */
public class JanelaCategoria extends JFrame {
    /**
     * Painel Principal e SubPainel Categorias
     */
    private JPanel panel, panelCategorias;
    /**
     * Botões relativos às Categorias, ao Voltar e ao Sair
     */
    private JButton buttonMaiorReceita, buttonMenorDespesa, buttonMaiorLucro, buttonMaiorCapacidade, buttonExit, buttonBack, buttonBackCategorias;
    /**
     * Janelas da Categorias
     */
    private JFrame frame1,frame2,frame3,frame4;
    /**
     * Lista das Empresas
     */
    private GerirEmpresas listaCategorias;

    /**
     * Método Construtor JanelaCategoria que Inicializa e adiciona ao SubPainel Categorias os Atributos
     * @param listaCategorias Lista Ategorias
     */
    public JanelaCategoria(GerirEmpresas listaCategorias){
        super();
        this.listaCategorias = listaCategorias;

        buttonMaiorReceita = new JButton("Empresas com Maior Receita");
        buttonMenorDespesa = new JButton("Empresas com Menor Despesa");
        buttonMaiorLucro = new JButton("Empresas com Maior Lucro");
        buttonMaiorCapacidade = new JButton("Empresas com Maior Capacidade");
        buttonExit = new JButton("Sair");
        buttonBack = new JButton("Voltar");
        buttonBackCategorias = new JButton("Voltar");

        panel = new JPanel();
        panel.add(buttonMaiorReceita);
        panel.add(buttonMenorDespesa);
        panel.add(buttonMaiorLucro);
        panel.add(buttonMaiorCapacidade);
        panel.add(buttonBack);
        panel.add(buttonExit);

        frame1 = new JFrame();
        frame2 = new JFrame();
        frame3 = new JFrame();
        frame4 = new JFrame();

        //Listeners

        ButtonListener buttonListener = new ButtonListener(this);
        buttonMaiorReceita.addActionListener(buttonListener);
        buttonMenorDespesa.addActionListener(buttonListener);
        buttonMaiorLucro.addActionListener(buttonListener);
        buttonMaiorCapacidade.addActionListener(buttonListener);
        buttonBack.addActionListener(buttonListener);
        buttonBackCategorias.addActionListener(buttonListener);
        buttonExit.addActionListener(buttonListener);

        this.add(panel);
    }
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
     * Método de acesso externo ao Botão da Maior Receita
     * @return (JButton) Botão da Maior Receita
     */
    public JButton getButtonMaiorReceita() {
        return buttonMaiorReceita;
    }
    /**
     * Método Complementar de acesso externo ao Botão Maior Receita
     * @param buttonMaiorReceita Botão Maior Receita
     */
    public void setButtonMaiorReceita(JButton buttonMaiorReceita) {
        this.buttonMaiorReceita = buttonMaiorReceita;
    }
    /**
     * Método de acesso externo ao Botão Menor Despesa
     * @return (JButton) Botão Menor Despesa
     */
    public JButton getButtonMenorDespesa() {
        return buttonMenorDespesa;
    }
    /**
     * Método Complementar de acesso externo ao Botão Menor Despesa
     * @param buttonMenorDespesa Botão Menor Despesa
     */
    public void setButtonMenorDespesa(JButton buttonMenorDespesa) {
        this.buttonMenorDespesa = buttonMenorDespesa;
    }
    /**
     * Método Complementar de acesso externo ao Botão Maior Lucro
     * @return (JButton) Botão Maior Lucro
     */
    public JButton getButtonMaiorLucro() {
        return buttonMaiorLucro;
    }
    /**
     * Método Complementar de acesso externo ao Botão Maior Lucro
     * @param buttonMaiorLucro Botão Maior Lucro
     */
    public void setButtonMaiorLucro(JButton buttonMaiorLucro) {
        this.buttonMaiorLucro = buttonMaiorLucro;
    }
    /**
     * Método de acesso externo ao Botão Maior Capacidade
     * @return (JButton) Botão Maior Capacidade
     */
    public JButton getButtonMaiorCapacidade() {
        return buttonMaiorCapacidade;
    }
    /**
     * Método Complementar de acesso externo ao Botão Maior Capacidade
     * @param buttonMaiorCapacidade Botão Maior Capacidade
     */
    public void setButtonMaiorCapacidade(JButton buttonMaiorCapacidade) {
        this.buttonMaiorCapacidade = buttonMaiorCapacidade;
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
     * Método de acesso externo ao Botão Voltar
     * @return (JButton) Botão Voltar
     */
    public JButton getButtonBack() {
        return buttonBack;
    }
    /**
     * Método Complementar de acesso externo ao Botão Voltar
     * @param buttonBack Botão Voltar
     */
    public void setButtonBack(JButton buttonBack) {
        this.buttonBack = buttonBack;
    }
    /**
     * Método de acesso externo ao SubPainel Categorias
     * @return (JPanel) SubPainel Categorias
     */
    public JPanel getPanelCategorias() {
        return panelCategorias;
    }
    /**
     * Método Complementar de acesso externo ao SubPainel
     * @param panelCategorias SubPainel Categorias
     */
    public void setPanelCategorias(JPanel panelCategorias) {
        this.panelCategorias = panelCategorias;
    }
    /**
     * Método de acesso externo ao Botão Voltar Categorias
     * @return  (JButton) Botão Voltar SubPainel Categorias
     */
    public JButton getButtonBackCategorias() {
        return buttonBackCategorias;
    }
    /**
     * Método Complementar de acesso externo ao Botão Voltar Categorias
     * @param buttonBackCategorias Botão Voltar SubPainel Categorias
     */
    public void setButtonBackCategorias(JButton buttonBackCategorias) {
        this.buttonBackCategorias = buttonBackCategorias;
    }
    /**
     * Método de acesso externo à Lista de Empresas
     * @return (GerirEmpresas) Lista de Empresa
     */
    public GerirEmpresas getListaCategorias() {
        return listaCategorias;
    }
    /**
     * Método Complementar de acesso externo à Lista de Empresas
     * @param listaCategorias Lista de Empresas
     */
    public void setListaCategorias(GerirEmpresas listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    /**
     * Método de acesso externo à Janela Maior Receita
     * @return (JFrame) Janela Maior Receita
     */
    public JFrame getFrame1() {
        return frame1;
    }
    /**
     * Método Complementar de acesso externo à Janela Maior Receita
     * @param frame1 Janel Maior Receita
     */
    public void setFrame1(JFrame frame1) {
        this.frame1 = frame1;
    }
    /**
     * Método de acesso externo à Janela Menor Despesa
     * @return (JFrame) Janela Menor Despesa
     */
    public JFrame getFrame2() {
        return frame2;
    }
    /**
     * Método Complementar de acesso externo à Janela Menor Despesa
     * @param frame2 Janela Menor Despesa
     */
    public void setFrame2(JFrame frame2) {
        this.frame2 = frame2;
    }
    /**
     * Método de acesso externo à Janela Maior Lucro
     * @return (JFrame) Janela Maior Lucro
     */
    public JFrame getFrame3() {
        return frame3;
    }
    /**
     * Método Complementar de acesso externo à Janela Maior Lucro
     * @param frame3 Janela Maior Lucro
     */
    public void setFrame3(JFrame frame3) {
        this.frame3 = frame3;
    }
    /**
     * Método de acesso externo à Janela Maior Capacidade
     * @return (JFrame) Janela Maior Capacidade
     */
    public JFrame getFrame4() {
        return frame4;
    }
    /**
     * Método Complementar de acesso externo à Janela Maior Capacidade
     * @param frame4 Janela Maior Capacidade
     */
    public void setFrame4(JFrame frame4) {
        this.frame4 = frame4;
    }
    /**
     * Método Privado, onde são implementados os ActionListener dos Botões
     */
    private class ButtonListener implements ActionListener {
        /**
         * Janela Categorias
         */
        private JanelaCategoria janelaCategorias;
        /**
         * Método de acesso externo à Janela Categorias
         * @return (JanelaCategoria) Janela Categorias
         */
        public JanelaCategoria getJanelaCategorias() {
            return janelaCategorias;
        }
        /**
         * Método Complementar de acesso externo à Janela Categorias
         * @param janelaCategorias Janela Categorias
         */
        public void setJanelaCategorias(JanelaCategoria janelaCategorias) {
            this.janelaCategorias = janelaCategorias;
        }
        /**
         * Método Construtor ButtonListener, que Inicializa a Janela Categorias
         * @param janelaCategorias Janela Categorias
         */
        public ButtonListener(JanelaCategoria janelaCategorias){
            this.janelaCategorias = janelaCategorias;
        }
        /**
         * Método em que são Implementadas as Ações dos Botões
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel maiorReceita = new JPanel();
            JPanel menorDespesa = new JPanel();
            JPanel maiorLucro = new JPanel();
            JPanel maiorCapacidade = new JPanel();

            if(e.getSource() == buttonExit){
                if(JOptionPane.showConfirmDialog(null,"Deseja sair?","Sair",JOptionPane.YES_NO_OPTION)==0){
                    System.exit(0);
                }
            }else if(e.getSource() == buttonMaiorReceita){

                JList list;

                frame1.setTitle("Maior Receita");
                frame1.setSize(900, 900);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Maior Receita");
                label.setBounds(50, 10, 300, 25);

                DefaultListModel listEmpresas = new DefaultListModel();

                listEmpresas.addElement(listaCategorias.maiorReceita());

                list = new JList(listEmpresas);
                JScrollPane listScroller = new JScrollPane(list);
                listScroller.setBounds(100, 100, 600, 100);

                System.out.println(listaCategorias.maiorReceita());

                maiorReceita.setLayout(null);
                maiorReceita.add(label);
                maiorReceita.add(listScroller);
                buttonBackCategorias.setBounds(50,220,80,40);
                maiorReceita.add(buttonBackCategorias);
                frame1.add(maiorReceita);
                frame1.setVisible(true);
            } else if (e.getSource() == buttonMenorDespesa) {
                JList list;

                frame2.setTitle("Menor Despesa");
                frame2.setSize(900, 900);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Menor Despesa");
                label.setBounds(50, 10, 300, 25);

                DefaultListModel listEmpresas = new DefaultListModel();

                listEmpresas.addElement(listaCategorias.menorDespesa());

                list = new JList(listEmpresas);
                JScrollPane listScroller = new JScrollPane(list);
                listScroller.setBounds(100, 100, 600, 100);

                System.out.println(listaCategorias.menorDespesa());

                menorDespesa.setLayout(null);
                menorDespesa.add(label);
                menorDespesa.add(listScroller);
                buttonBackCategorias.setBounds(50,220,80,40);
                menorDespesa.add(buttonBackCategorias);
                frame2.add(menorDespesa);
                frame2.setVisible(true);
            }else if (e.getSource() == buttonMaiorLucro){
                JList list;

                frame3.setTitle("Maior Lucro");
                frame3.setSize(900, 900);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Maior Lucro");
                label.setBounds(50, 10, 300, 25);

                DefaultListModel listEmpresas = new DefaultListModel();

                listEmpresas.addElement(listaCategorias.maiorLucro());

                list = new JList(listEmpresas);
                JScrollPane listScroller = new JScrollPane(list);
                listScroller.setBounds(100, 100, 600, 100);

                System.out.println(listaCategorias.maiorLucro());

                maiorLucro.setLayout(null);
                maiorLucro.add(label);
                maiorLucro.add(listScroller);
                buttonBackCategorias.setBounds(50,220,80,40);
                maiorLucro.add(buttonBackCategorias);
                frame3.add(maiorLucro);
                frame3.setVisible(true);
            }else if (e.getSource() == buttonMaiorCapacidade){
                JList list;

                frame4.setTitle("Maior Capacidade");
                frame4.setSize(900, 900);
                frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Maior Capacidade");
                label.setBounds(50, 10, 300, 25);

                DefaultListModel listEmpresas = new DefaultListModel();

                listEmpresas.addElement(listaCategorias.maiorCapacidade());

                list = new JList(listEmpresas);
                JScrollPane listScroller = new JScrollPane(list);
                listScroller.setBounds(100, 100, 600, 100);

                System.out.println(listaCategorias.maiorCapacidade());

                maiorCapacidade.setLayout(null);
                maiorCapacidade.add(label);
                maiorCapacidade.add(listScroller);
                buttonBackCategorias.setBounds(50,220,80,40);
                maiorCapacidade.add(buttonBackCategorias);
                frame4.add(maiorCapacidade);
                frame4.setVisible(true);
            } else if (e.getSource() == buttonBackCategorias) {
                frame1.setVisible(false);
                frame2.setVisible(false);
                frame3.setVisible(false);
                frame4.setVisible(false);
                setVisible(true);
            }else if (e.getSource() == buttonBack) {
                janelaCategorias.setVisible(false);
                new Interface(listaCategorias).setVisible(true);
            }

        }
    }

}

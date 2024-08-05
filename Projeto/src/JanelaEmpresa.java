import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Classe para gerir na Interface a Janela Empresa
 * @author ferna
 * @version 1.0
 */
public class JanelaEmpresa extends JFrame {
    /**
     *Painel Principal
     */
    private JPanel panel;
    /**
     * Janela Principal
     */
    private JFrame frame;
    /**
     * Janela da Remoção de uma Empresa
     */
    private JFrame frameRemover;
    /**
     * Janela da Criação de uma Empresa
     */
    private JFrame frameCriar;
    /**
     * Janela para Editar uma Empresa
     */
    private JFrame frameEditar;
    /**
     * Botão para Voltar ao Painel Principal
     */
    private JButton buttonBack;
    /**
     * Botão para Listar a Empresa
     */
    private JButton buttonListar;
    /**
     * Botão Criar uma Empresa
     */
    private JButton buttonCriar;
    /**
     * Botão Apgar uma Empresa
     */
    private JButton buttonApagar;
    /**
     * Botão Editar uma Empresa
     */
    private JButton buttonEditar;
    /**
     * Botão Voltar ao Setor Empresas
     */
    private JButton buttonBackEmpresas;
    /**
     * Botão Auxiliar Apagar Empresa
     */
    private JButton buttonApagarEmpresa;
    /**
     * Botão Auxiliar Editar Empresa
     */
    private JButton buttonEditarEmpresa;
    /**
     * Lista Empresas
     */
    private GerirEmpresas lista;
    /**
     * Objeto que Verifica a qualicade de Dados Inserir
     */
    private VerificaDados verificaDados;
    /**
     * Listas em Scoll
     */
    private JList<Empresa> list, listEditar,listRemover;
    /**
     * Ficheiro de Objetos
     */
    private FicheiroObjetos file;
    /**
     * Método Construtor JanelaEmpresa, onde são incializados os Atributos e adicionados ao Painel
     * @param lista Lista de Empresas
     */
    public JanelaEmpresa(GerirEmpresas lista) {
        super();
        this.lista = lista;
        verificaDados = new VerificaDados();
        file = new FicheiroObjetos();

        list = new JList<>();
        listEditar = new JList<>();
        listRemover = new JList<>();

        buttonListar = new JButton("Lista de Empresas:");
        buttonApagar = new JButton("Apagar uma Empresa:");
        buttonEditar = new JButton("Editar uma Empresa:");
        buttonCriar = new JButton("Criar uma Empresa:");
        buttonBack = new JButton("Voltar");
        buttonBackEmpresas = new JButton("Voltar");
        buttonApagarEmpresa = new JButton("Remover");
        buttonEditarEmpresa = new JButton("Editar");
        String[] types = {" ", "Café", "Frutaria", "Fast-Food", "Local", "Mercado", "Pastelaria"};

        frame = new JFrame();
        frameRemover = new JFrame();
        frameEditar = new JFrame();
        frameCriar = new JFrame();

        //Panel
        panel = new JPanel();

        panel.add(buttonListar);
        panel.add(buttonApagar);
        panel.add(buttonCriar);
        panel.add(buttonEditar);
        panel.add(buttonBack);

        //Listeners
        ButtonListener buttonListener = new ButtonListener(this);
        buttonListar.addActionListener(buttonListener);
        buttonCriar.addActionListener(buttonListener);
        buttonApagar.addActionListener(buttonListener);
        buttonBack.addActionListener(buttonListener);
        buttonEditar.addActionListener(buttonListener);
        buttonBackEmpresas.addActionListener(buttonListener);
        buttonApagarEmpresa.addActionListener(buttonListener);
        buttonEditarEmpresa.addActionListener(buttonListener);


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
     * Método Complementar de acesso externo ao Paineal Principal
     * @param panel Painel Principal
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
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
     * Método de acesso externo ao Botão Listar
     * @return (JButton) Botão Listar
     */
    public JButton getButtonListar() {
        return buttonListar;
    }
    /**
     * Método Complementar de acesso externo ao Botão Listar
     * @param buttonListar Botão Listar
     */
    public void setButtonListar(JButton buttonListar) {
        this.buttonListar = buttonListar;
    }
    /**
     * Método de acesso externo ao Botão Criar
     * @return (JButton) Botão Criar
     */
    public JButton getButtonCriar() {
        return buttonCriar;
    }
    /**
     * Método Complementar de acesso externo ao Botão Criar
     * @param buttonCriar Botão Criar
     */
    public void setButtonCriar(JButton buttonCriar) {
        this.buttonCriar = buttonCriar;
    }
    /**
     * Método de acesso externo ao Botão Apagar
     * @return (JButton) Botão Apagar
     */
    public JButton getButtonApagar() {
        return buttonApagar;
    }
    /**
     * Método Complementar de acesso externo ao Botão Apagar
     * @param buttonApagar Botão Apagar
     */
    public void setButtonApagar(JButton buttonApagar) {
        this.buttonApagar = buttonApagar;
    }
    /**
     * Método de acesso externo ao Botão Editar
     * @return (JButton) Botão Editar
     */
    public JButton getButtonEditar() {
        return buttonEditar;
    }
    /**
     * Método Complementar de acesso externo ao Botão Editar
     * @param buttonEditar Botão Editar
     */
    public void setButtonEditar(JButton buttonEditar) {
        this.buttonEditar = buttonEditar;
    }
    /**
     * Método de acesso externo ao Botão Voltar Empresas
     * @return (JButton) Botão Voltar Empresas
     */
    public JButton getButtonBackEmpresas() {
        return buttonBackEmpresas;
    }
    /**
     * Método de acesso externo Botão Voltar Empresas
     * @param buttonBackEmpresas Botão Voltar Empresas
     */
    public void setButtonBackEmpresas(JButton buttonBackEmpresas) {
        this.buttonBackEmpresas = buttonBackEmpresas;
    }
    /**
     * Método de acesso externo ao Botão Auxiliar de Edição
     * @return (JButton) Botão Auxiliar de Edição
     */
    public JButton getButtonEditarEmpresa() {
        return buttonEditarEmpresa;
    }
    /**
     * Método Complementar de acesso externo ao Botão Auxiliar de Edição
     * @param buttonEditarEmpresa Botão Auxiliar de Edição
     */
    public void setButtonEditarEmpresa(JButton buttonEditarEmpresa) {
        this.buttonEditarEmpresa = buttonEditarEmpresa;
    }
    /**
     * Método de acesso externo à Janela Principal
     * @return (JFrame) Janela Principal
     */
    public JFrame getFrame() {
        return frame;
    }
    /**
     * Método Complementar de acesso externo à Janela Principal
     * @param frame Janela Principal
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    /**
     * Método de acesso externo ao Botão Auxiliar Apagar Empresas
     * @return (JButton) Botão Auxiliar Apagar Empresas
     */
    public JButton getButtonApagarEmpresa() {
        return buttonApagarEmpresa;
    }
    /**
     * Método Complementar de acesso externo ao Botão Auxiliar Apagar Empresas
     * @param buttonApagarEmpresa Botão Auxiliar Apagar Empresas
     */
    public void setButtonApagarEmpresa(JButton buttonApagarEmpresa) {
        this.buttonApagarEmpresa = buttonApagarEmpresa;
    }
    /**
     * Método de acesso externo à Janela Remover
     * @return (JFrame) Janela Remover
     */
    public JFrame getFrameRemover() {
        return frameRemover;
    }
    /**
     * Método Complementar de acesso externo à Janela Remover
     * @param frameRemover Janela Remover
     */
    public void setFrameRemover(JFrame frameRemover) {
        this.frameRemover = frameRemover;
    }
    /**
     * Método de acesso externo à Janela Editar
     * @return (JFrame) Janela Editar
     */
    public JFrame getFrameEditar() {
        return frameEditar;
    }
    /**
     * Método de acesso externo à Janela Editar
     * @param frameEditar Janela Editar
     */
    public void setFrameEditar(JFrame frameEditar) {
        this.frameEditar = frameEditar;
    }
    /**
     * Método de acesso externo ao Objeto que Verifica os Dados Inseridos
     * @return (VerificaDados) Verifica os Dados Inseridos
     */
    public VerificaDados getVerificaDados() {
        return verificaDados;
    }
    /**
     * Método Complementar de acesso externo ao Objeto que Verifica os Dados Inseridos
     * @param verificaDados Objeto que Verifica os Dados Inseridos
     */
    public void setVerificaDados(VerificaDados verificaDados) {
        this.verificaDados = verificaDados;
    }
    /**
     * Método de acesso externo à JList de Listagem
     * @return (JList) JList de Listagem
     */
    public JList<Empresa> getList() {
        return list;
    }
    /**
     * Método Complementar de acesso externo à JList de Listagem
     * @param list JList de Listagem
     */
    public void setList(JList<Empresa> list) {
        this.list = list;
    }
    /**
     * Método de acesso externo à JList de Listagem de Edição
     * @return (JList) JList de Listagem de Edição
     */
    public JList<Empresa> getListEditar() {
        return listEditar;
    }
    /**
     * Método Complementar de acesso externo à JList de Listagem de Edição
     * @param listEditar JList de Listagem de Edição
     */
    public void setListEditar(JList<Empresa> listEditar) {
        this.listEditar = listEditar;
    }
    /**
     * Método de acesso externo à JList de Listagem de Remoção
     * @return (JList) JList de Listagem de Remoção
     */
    public JList<Empresa> getListRemover() {
        return listRemover;
    }
    /**
     * Método Complementar de acesso externo à JList de Listagem de Remoção
     * @param listRemover JList de Listagem de Remoção
     */
    public void setListRemover(JList<Empresa> listRemover) {
        this.listRemover = listRemover;
    }
    /**
     * Método de acesso externo à Lista de Empresas
     * @return (GerirEmpresas) Lista de Empresas
     */
    public GerirEmpresas getLista() {
        return lista;
    }
    /**
     * Método Complementar de acesso externo à Lista de Empresas
     * @param lista Lista de Empresas
     */
    public void setLista(GerirEmpresas lista) {
        this.lista = lista;
    }
    /**
     * Método de acesso externo ao Ficheiro de Objetos
     * @return (FicheiroObjetos) Ficheiro de Objetos
     */
    public FicheiroObjetos getFile() {
        return file;
    }
    /**
     * Método Complementar de acesso externo ao Ficheiro de Objetos
     * @param file Ficheiro de Objetos
     */
    public void setFile(FicheiroObjetos file) {
        this.file = file;
    }
    /**
     * Método de acesso externo à Janela Criar
     * @return (JFrame) Janela Criar
     */
    public JFrame getFrameCriar() {
        return frameCriar;
    }
    /**
     * Método Complementar de acesso externo à Janela Criar
     * @param frameCriar Janela Criar
     */
    public void setFrameCriar(JFrame frameCriar) {
        this.frameCriar = frameCriar;
    }
    /**
     * Método de Criação de um JList
     * @return JList
     */
    public JList<Empresa> criaJlist() {

        frame.setTitle("Lista de Empresas");
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel listEmpresas = new DefaultListModel();

        for (Empresa empresa : lista.getListaEmpresas()) {
            listEmpresas.addElement(empresa);
        }

        list = new JList(listEmpresas);

        return list;
    }
    /**
     * Método Auxiliar de Criação de uma JList
     * @param s Frase presente na JList
     * @param list JList
     * @return (JPanel) Painel da JList
     */
    public JPanel auxCriaJList(String s,JList list){
        JPanel panelLista = new JPanel();

        JLabel label = new JLabel(s);
        label.setBounds(50, 10, 300, 25);

        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setBounds(100, 100, 600, 400);

        panelLista.setLayout(null);
        panelLista.add(label);
        panelLista.add(listScroller);
        buttonBackEmpresas.setBounds(50, 50, 80, 40);
        panelLista.add(buttonBackEmpresas);
        return panelLista;
    }
    /**
     * Método Privado, onde são implementados os ActionListener dos Botões
     */
    private class ButtonListener implements ActionListener {
        /**
         * Janela Empresa
         */
        private JanelaEmpresa janelaEmpresa;
        /**
         * Método Construtor ButtonListener, que Inicializa a Janela Empresa
         * @param janelaEmpresa Janela Empresa
         */
        public ButtonListener(JanelaEmpresa janelaEmpresa) {
            this.janelaEmpresa = janelaEmpresa;
        }
        /**
         * Método de acesso externo à Janela Empresa
         * @return (JanelaEmpresa) Janela Empresa
         */
        public JanelaEmpresa getJanelaEmpresa() {
            return janelaEmpresa;
        }
        /**
         * Método Complementar de acesso externo à Janela Empresa
         * @param janelaEmpresa Janela Empresa
         */
        public void setJanelaEmpresa(JanelaEmpresa janelaEmpresa) {
            this.janelaEmpresa = janelaEmpresa;
        }
        /**
         * Método em que são Implementadas as Ações dos Botões
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonListar) {
                list = janelaEmpresa.criaJlist();
                JPanel panelList = janelaEmpresa.auxCriaJList("Lista Empresa",list);
                frame.add(panelList);
                frame.setVisible(true);
            } else if (e.getSource() == buttonApagar) {
                listRemover = janelaEmpresa.criaJlist();
                JPanel panelRemover = janelaEmpresa.auxCriaJList("Selecione a Empresa a Remover",listRemover);

                buttonApagarEmpresa.setBounds(150, 50, 100, 40);
                panelRemover.add(buttonApagarEmpresa);
                frameRemover.setSize(900, 900);
                frameRemover.add(panelRemover);
                frameRemover.setVisible(true);
            } else if (e.getSource() == buttonApagarEmpresa) {
                frameRemover.dispose();
                System.out.println(listRemover.getSelectedValue());
                Empresa empresa = listRemover.getSelectedValue();
                lista.remove(lista.remove(empresa));
                System.out.println(lista);
                file.escrita(lista);
            } else if (e.getSource() == buttonBack) {
                frame.setVisible(false);
                janelaEmpresa.setVisible(false);
                new Interface(lista).setVisible(true);
            } else if (e.getSource() == buttonBackEmpresas) {
                frame.setVisible(false);
                setVisible(true);
            } else if (e.getSource() == buttonEditar) {
                listEditar = janelaEmpresa.criaJlist();
                JPanel panelEditar = janelaEmpresa.auxCriaJList("Selecione a Empresa a Editar", listEditar);

                buttonEditarEmpresa.setBounds(150, 50, 100, 40);
                panelEditar.add(buttonEditarEmpresa);
                frameEditar.setSize(900, 900);
                frameEditar.add(panelEditar);
                frameEditar.setVisible(true);
            } else if (e.getSource() == buttonEditarEmpresa) {
                frameEditar.dispose();
                Empresa empresa = listEditar.getSelectedValue();
                String[] listaIguais = {"Nome","Distrito","Latitude","Longitude"};
                for(int i = 0; i<listaIguais.length; i++){
                    String parametro = JOptionPane.showInputDialog(null,listaIguais[i]);
                    if(parametro!=null) {
                        switch (i) {
                            case 0 -> empresa.setNome(parametro);
                            case 1 -> empresa.setDistrito(parametro);
                            case 2 -> empresa.getLocalizacao().setLatitude(verificaDados.verificaFloatGUI(parametro,listaIguais[i]));
                            case 3 -> empresa.getLocalizacao().setLongitude(verificaDados.verificaFloatGUI(parametro,listaIguais[i]));
                        }
                    }
                }
                switch (empresa.tipo()) {
                    case "CAFE" -> {
                        Cafe c = (Cafe) empresa;
                        String[] listaDeValores = {"Custo dos Empregados", "Número de Empregados", "Custo Salário Médio Anual", "Número Médio Clientes Diário", "Número Médio Cáfes Diários", "Valor Médio Faturação Diário"};
                        for (int i = 0; i < listaDeValores.length; i++) {
                            String parametro = JOptionPane.showInputDialog(null, listaDeValores[i]);
                            if (parametro != null) {
                                switch (i) {
                                    case 0 -> c.setCustoEmp(verificaDados.verificaFloatGUI(parametro,listaDeValores[i]));
                                    case 1 -> c.setNumEmp(verificaDados.verificaIntGUI(parametro,listaDeValores[i]));
                                    case 2 -> c.setCustoSalMedAnual(verificaDados.verificaFloatGUI(parametro,listaDeValores[i]));
                                    case 3 -> c.setNumMedClientDiario(verificaDados.verificaFloatGUI(parametro,listaDeValores[i]));
                                    case 4 -> c.setNumMedCafeDiario(verificaDados.verificaFloatGUI(parametro,listaDeValores[i]));
                                    case 5 -> c.setValorMedFatCafeDiario(verificaDados.verificaFloatGUI(parametro,listaDeValores[i]));
                                }
                            }
                        }
                    }
                    case "FASTFOOD" -> {
                        FastFood f = (FastFood) empresa;
                        String[] listaDeValores1 = {"Custo dos Empregados", "Número de Empregados", "Custo Médio dos Salário Anuais", "Número Médio de Clientes Diário", "Número de Mesas Interiores", "Valor Médio Diário de Faturação em Mesas", "Número de Dias de Funcionamento", "Número Médio Diário de Clientes Drive", "Valor Médio Diário de Faturação em Clientes Drive"};
                        for (int i = 0; i < listaDeValores1.length; i++) {
                            String parametro = JOptionPane.showInputDialog(null, listaDeValores1[i]);
                            if (parametro != null) {
                                switch (i) {
                                    case 0 -> f.setCustoEmp(verificaDados.verificaFloatGUI(parametro,listaDeValores1[i]));
                                    case 1 -> f.setNumEmp(verificaDados.verificaIntGUI(parametro,listaDeValores1[i]));
                                    case 2 -> f.setCustoSalMedAnual(verificaDados.verificaFloatGUI(parametro,listaDeValores1[i]));
                                    case 3 -> f.setNumMedClientDiario(verificaDados.verificaFloatGUI(parametro,listaDeValores1[i]));
                                    case 4 -> f.setNumMesaInterior(verificaDados.verificaIntGUI(parametro,listaDeValores1[i]));
                                    case 5 -> f.setValorMedFatMesaDiario(verificaDados.verificaFloatGUI(parametro,listaDeValores1[i]));
                                    case 6 -> f.setNumDiasFunAnual(verificaDados.verificaIntGUI(parametro,listaDeValores1[i]));
                                    case 7 -> f.setNumMedClientDrive(verificaDados.verificaFloatGUI(parametro,listaDeValores1[i]));
                                    case 8 -> f.setValorMedDiarioFatClientDrive(verificaDados.verificaFloatGUI(parametro,listaDeValores1[i]));
                                }
                            }
                        }
                    }
                    case "FRUTARIA" -> {
                        Frutaria frut = (Frutaria) empresa;
                        String[] listaDeValores2 = {"Custo Anual da Limpeza", "Número de Produtos", "Valor Médio de Faturação Anual"};
                        for (int i = 0; i < listaDeValores2.length; i++) {
                            String parametro = JOptionPane.showInputDialog(null, listaDeValores2[i]);
                            if (parametro != null) {
                                switch (i) {
                                    case 0 -> frut.setCustoAnualLimpeza(verificaDados.verificaFloatGUI(parametro,listaDeValores2[i]));
                                    case 1 -> frut.setNumProd(verificaDados.verificaIntGUI(parametro,listaDeValores2[i]));
                                    case 2 -> frut.setValorMedFatProdAnual(verificaDados.verificaFloatGUI(parametro,listaDeValores2[i]));
                                }
                            }
                        }
                    }
                    case "LOCAL" -> {
                        Local l = (Local) empresa;
                        String[] listaValores3 = {"Custo dos Empregados", "Número de Empregados", "Custo Médio do Salário Anual", "Número Médio Diário de Clientes", "Número de Mesas Interiores", "Valor Médio Diário de Faturação das Mesas", "Número de Dias de Funcionamento Anual", "Número de Mesas de Esplanada", "Custo da Licença Anual das Mesas de Esplanada"};
                        for (int i = 0; i < listaValores3.length; i++) {
                            String parametro = JOptionPane.showInputDialog(null, listaValores3[i]);
                            if (parametro != null) {
                                switch (i) {
                                    case 0 -> l.setCustoEmp(verificaDados.verificaFloatGUI(parametro,listaValores3[i]));
                                    case 1 -> l.setNumEmp(verificaDados.verificaIntGUI(parametro,listaValores3[i]));
                                    case 2 -> l.setCustoSalMedAnual(verificaDados.verificaFloatGUI(parametro,listaValores3[i]));
                                    case 3 -> l.setNumMedClientDiario(verificaDados.verificaFloatGUI(parametro,listaValores3[i]));
                                    case 4 -> l.setNumMesaInterior(verificaDados.verificaIntGUI(parametro,listaValores3[i]));
                                    case 5 -> l.setValorMedFatMesaDiario(verificaDados.verificaFloatGUI(parametro,listaValores3[i]));
                                    case 6 -> l.setNumDiasFunAnual(verificaDados.verificaIntGUI(parametro,listaValores3[i]));
                                    case 7 -> l.setNumMesaEsplanada(verificaDados.verificaIntGUI(parametro,listaValores3[i]));
                                    case 8 -> l.setCustoLicenAnualMesaEspla(verificaDados.verificaFloatGUI(parametro,listaValores3[i]));
                                }
                            }
                        }
                    }
                    case "MERCADO" -> {
                        Mercado m = (Mercado) empresa;
                        String[] listaValores4 = {"Custo Anual Limpeza", "Tipo Mercado", "Área dos Corredores", "Valor Médio de Faturacão Anual por Metro Quadrado"};
                        for (int i = 0; i < listaValores4.length; i++) {
                            String parametro = JOptionPane.showInputDialog(null, listaValores4[i]);
                            if (parametro != null) {
                                switch (i) {
                                    case 0 -> m.setCustoAnualLimpeza(verificaDados.verificaFloatGUI(parametro,listaValores4[i]));
                                    case 1 -> m.setTipoMercado(verificaDados.verificaMercado(parametro));
                                    case 2 -> m.setAreaCorredor(verificaDados.verificaIntGUI(parametro,listaValores4[i]));
                                    case 3 -> m.setValorMedFatAnualMetro(verificaDados.verificaFloatGUI(parametro,listaValores4[i]));
                                }
                            }
                        }
                    }
                    case "PASTELARIA" -> {
                        Pastelaria p = (Pastelaria) empresa;
                        String[] listaValores5 = {"Custo dos Empregados", "Número de Empregados", "Custo dos Salários Médios Anuais", "Número Médio Diário de Clientes", "Número de Bolos Vendidos Diariamente", "Valor Médio Diário de Faturação em Bolos"};
                        for (int i = 0; i < listaValores5.length; i++) {
                            String parametro = JOptionPane.showInputDialog(null, listaValores5[i]);
                            if (parametro != null) {
                                switch (i) {
                                    case 0 -> p.setCustoEmp(verificaDados.verificaFloatGUI(parametro,listaValores5[i]));
                                    case 1 -> p.setNumEmp(verificaDados.verificaIntGUI(parametro,listaValores5[i]));
                                    case 2 -> p.setCustoSalMedAnual(verificaDados.verificaFloatGUI(parametro,listaValores5[i]));
                                    case 3 -> p.setNumMedClientDiario(verificaDados.verificaFloatGUI(parametro,listaValores5[i]));
                                    case 4 -> p.setNumBolosDiario(verificaDados.verificaIntGUI(parametro,listaValores5[i]));
                                    case 5 -> p.setValorMedFatBoloDiario(verificaDados.verificaFloatGUI(parametro,listaValores5[i]));
                                }
                            }
                        }
                    }
                }
                file.escrita(lista);
            }else if (e.getSource() == buttonCriar){
                String[] categorias = {"Cafe","FastFood","Frutaria","Local","Mercado","Pastelaria"};

                String tipo = (String) JOptionPane.showInputDialog(null, "Categoria", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, categorias, categorias[0]);

                String nome = JOptionPane.showInputDialog("Nome da empresa:");
                nome = verificaDados.verificaStringGUI(nome,"Nome da Empresa:");

                String distrito = JOptionPane.showInputDialog("Distrito:");
                distrito = verificaDados.verificaStringGUI(distrito,"Distrito:");

                String latitudeString = JOptionPane.showInputDialog("Latitude:");
                float latitude = verificaDados.verificaFloatGUI(latitudeString,"Latitude:");

                String longitudeString = JOptionPane.showInputDialog("Longitude:");
                float longitude = verificaDados.verificaFloatGUI(longitudeString,"Longitude:");

                switch (tipo.toUpperCase()) {
                    case "CAFE" -> {
                        String custoEmpString = JOptionPane.showInputDialog("Custo Empregado:");
                        float custoEmp = verificaDados.verificaFloatGUI(custoEmpString,"Custo Empregado:");

                        String numEmpString = JOptionPane.showInputDialog("Numero de Empregados:");
                        int numEmp = verificaDados.verificaIntGUI(numEmpString,"Numero de Empregados:");

                        String custoSalMedAnualString = JOptionPane.showInputDialog("Custo Salário Médio Anual:");
                        float custoSalMedAnual = verificaDados.verificaFloatGUI(custoSalMedAnualString,"Custo Salário Médio Anual:");

                        String numMedClientDiarioString = JOptionPane.showInputDialog("Numero Medio Cliente Diario:");
                        float numMedClientDiario = verificaDados.verificaFloatGUI(numMedClientDiarioString,"Numero Medio Cliente Diário:");

                        String numMedCafeDiarioString = JOptionPane.showInputDialog("Numero Medio Cafe Diario:");
                        float numMedCafeDiario = verificaDados.verificaFloatGUI(numMedCafeDiarioString,"Numero Medio Cafe Diario:");

                        String valorMedFatCafeDiarioString = JOptionPane.showInputDialog("Valor Medio Faturação Café Diário:");
                        float valorMedFatCafeDiario = verificaDados.verificaFloatGUI(valorMedFatCafeDiarioString,"Valor Medio Faturação Café Diário:");

                        Cafe c = new Cafe(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario, numMedCafeDiario, valorMedFatCafeDiario);
                        lista.insert(c);
                        file.escrita(lista);
                        lista.imprime();

                    }case "FASTFOOD" -> {

                        String custoEmpString = JOptionPane.showInputDialog("Custo Empregado:");
                        float custoEmp = verificaDados.verificaFloatGUI(custoEmpString,"Custo Empregado:");

                        String numEmpString = JOptionPane.showInputDialog("Numero de Empregados:");
                        int numEmp = verificaDados.verificaIntGUI(numEmpString,"Numero de Empregados");

                        String custoSalMedAnualString = JOptionPane.showInputDialog("Custo Salário Médio Anual:");
                        float custoSalMedAnual = verificaDados.verificaFloatGUI(custoSalMedAnualString,"Custo Salário Médio Anual:");

                        String numMedClientDiarioString = JOptionPane.showInputDialog("Numero Medio Cliente Diario:");
                        float numMedClientDiario = verificaDados.verificaFloatGUI(numMedClientDiarioString,"Numero Medio Cliente Diario:");

                        String numMesaInteriorString = JOptionPane.showInputDialog("Numero de Mesas Interior:");
                        int numMesaInterior = verificaDados.verificaIntGUI(numMesaInteriorString,"Numero de Mesas Interior:");

                        String valorMedFatMesaDiarioString = JOptionPane.showInputDialog("Valor Medio Faturação Mesas Diário:");
                        float valorMedFatMesaDiario = verificaDados.verificaFloatGUI(valorMedFatMesaDiarioString,"Valor Medio Faturação Mesas Diário:");

                        String numDiasFunAnualString = JOptionPane.showInputDialog("Numero de Dias Funcionamento Anual:");
                        int numDiasFunAnual = verificaDados.verificaIntGUI(numDiasFunAnualString,"Numero de Dias Funcionamento Anual:");

                        String numMedClientDriveString = JOptionPane.showInputDialog("Numero Medio Cliente Drive:");
                        float numMedClientDrive = verificaDados.verificaFloatGUI(numMedClientDriveString,"Numero Medio Cliente Drive:");

                        String valorMedFatClientDriveString = JOptionPane.showInputDialog("Valor Médio Diário Faturação Cliente Drive:");
                        float valorMedFatClientDrive = verificaDados.verificaFloatGUI(valorMedFatClientDriveString,"Valor Médio Diário Faturação Cliente Drive:");

                        FastFood f = new FastFood(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario, numMesaInterior, valorMedFatMesaDiario, numDiasFunAnual, numMedClientDrive, valorMedFatClientDrive);
                        lista.insert(f);
                        file.escrita(lista);
                        lista.imprime();
                    }
                    case "FRUTARIA" -> {

                        String custoAnualLimpezaString = JOptionPane.showInputDialog("Custo Anual de Limpeza:");
                        float custoAnualLimpeza = verificaDados.verificaFloatGUI(custoAnualLimpezaString,"Custo Anual de Limpeza:");

                        String numProdString = JOptionPane.showInputDialog("Numero de Produtos:");
                        int numProd = verificaDados.verificaIntGUI(numProdString,"Numero de Produtos:");

                        String valorMedFatProdAnualString = JOptionPane.showInputDialog("Valor Médio Faturação Produto Anual:");
                        float valorMedFatProdAnual = verificaDados.verificaFloatGUI(valorMedFatProdAnualString,"Valor Médio Faturação Produto Anual:");

                        Frutaria fr = new Frutaria(nome, distrito, latitude, longitude, custoAnualLimpeza, numProd, valorMedFatProdAnual);
                        lista.insert(fr);
                        file.escrita(lista);
                        lista.imprime();

                    }case "LOCAL" -> {

                        String custoEmpString = JOptionPane.showInputDialog("Custo Empregado:");
                        float custoEmp = verificaDados.verificaFloatGUI(custoEmpString,"Custo Empregado:");

                        String numEmpString = JOptionPane.showInputDialog("Numero de Empregados:");
                        int numEmp = verificaDados.verificaIntGUI(numEmpString,"Numero de Empregados:");

                        String custoSalMedAnualString = JOptionPane.showInputDialog("Custo Salário Médio Anual:");
                        float custoSalMedAnual = verificaDados.verificaFloatGUI(custoSalMedAnualString,"Custo Salário Médio Anual:");

                        String numMedClientDiarioString = JOptionPane.showInputDialog("Numero Medio Cliente Diario:");
                        float numMedClientDiario = verificaDados.verificaFloatGUI(numMedClientDiarioString,"Numero Medio Cliente Diario:");

                        String numMesaInteriorString = JOptionPane.showInputDialog("Numero de Mesas Interior:");
                        int numMesaInterior = verificaDados.verificaIntGUI(numMesaInteriorString,"Numero de Mesas Interior:");

                        String valorMedFatMesaDiarioString = JOptionPane.showInputDialog("Valor Medio Faturação Mesas Diário:");
                        float valorMedFatMesaDiario = verificaDados.verificaFloatGUI(valorMedFatMesaDiarioString,"Valor Medio Faturação Mesas Diario:");

                        String numDiasFunAnualString = JOptionPane.showInputDialog("Numero de Dias Funcionamento Anual:");
                        int numDiasFunAnual = verificaDados.verificaIntGUI(numDiasFunAnualString,"Numero de Dias Funcionamento Anual:");

                        String numMesaEsplanadaString = JOptionPane.showInputDialog("Numero Medio Cliente Drive:");
                        int numMesaEsplanada = verificaDados.verificaIntGUI(numMesaEsplanadaString,"Numero Medio Cliente Drive:");

                        String custoLicenAnualMesaEsplaString = JOptionPane.showInputDialog("Valor Médio Diário Faturação Cliente Drive:");
                        float custoLicenAnualMesaEspla = verificaDados.verificaFloatGUI(custoLicenAnualMesaEsplaString,"Valor Médio Diário Faturação Cliente Drive:");

                        Local l = new Local(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario, numMesaInterior, valorMedFatMesaDiario, numDiasFunAnual,numMesaEsplanada,custoLicenAnualMesaEspla);
                        lista.insert(l);
                        file.escrita(lista);
                        lista.imprime();
                    }case "MERCADO" -> {
                        String custoAnualLimpezaString = JOptionPane.showInputDialog("Custo Anual de Limpeza:");
                        float custoAnualLimpeza = verificaDados.verificaFloatGUI(custoAnualLimpezaString,"Custo Anual de Limpeza:");

                        String[] tipoMercado = {"Min","Super","Hiper"};
                        String mercadoTipo = (String) JOptionPane.showInputDialog(null,"Escolha o tipo de Mercado","Mercado TIPO",JOptionPane.PLAIN_MESSAGE,null,tipoMercado,tipoMercado[0]);

                        String areaCorredorString = JOptionPane.showInputDialog("Area dos Corredores:");
                        float areaCorredor = verificaDados.verificaFloatGUI(areaCorredorString,"Area dos Corredores:");

                        String valorMedFatAnualMetroString = JOptionPane.showInputDialog("Valor Médio Faturação Anual por Metro Quadrado:");
                        float valorMedFatAnualMetro = verificaDados.verificaFloatGUI(valorMedFatAnualMetroString,"Valor Médio Faturação Anual por Metro Quadrado:");

                        Mercado m = new Mercado(nome, distrito, latitude, longitude, custoAnualLimpeza,mercadoTipo,areaCorredor,valorMedFatAnualMetro);
                        lista.insert(m);
                        file.escrita(lista);
                        lista.imprime();

                    }case "PASTELARIA" -> {

                        String custoEmpString = JOptionPane.showInputDialog("Custo Empregado:");
                        float custoEmp = verificaDados.verificaFloatGUI(custoEmpString,"Custo Empregado:");

                        String numEmpString = JOptionPane.showInputDialog("Numero de Empregados:");
                        int numEmp = verificaDados.verificaIntGUI(numEmpString,"Numero de Empregados:");

                        String custoSalMedAnualString = JOptionPane.showInputDialog("Custo Salário Médio Anual:");
                        float custoSalMedAnual = verificaDados.verificaFloatGUI(custoSalMedAnualString,"Custo Salário Médio Anual:");

                        String numMedClientDiarioString = JOptionPane.showInputDialog("Numero Medio Cliente Diario:");
                        float numMedClientDiario = verificaDados.verificaFloatGUI(numMedClientDiarioString,"Numero Medio Cliente Diario:");

                        String numBolosDiarioString = JOptionPane.showInputDialog("Numero de Bolos Diario:");
                        int numBolosDiario = verificaDados.verificaIntGUI(numBolosDiarioString,"Numero de Bolos Diario:");

                        String valorMedFatBoloDiarioString = JOptionPane.showInputDialog("Valor Medio Faturação Bolo Diário:");
                        float valorMedFatBoloDiario = verificaDados.verificaFloatGUI(valorMedFatBoloDiarioString,"Valor Medio Faturação Bolo Diário:");

                        Pastelaria p = new Pastelaria(nome, distrito, latitude, longitude, custoEmp, numEmp, custoSalMedAnual, numMedClientDiario,numBolosDiario,valorMedFatBoloDiario);
                        lista.insert(p);
                        file.escrita(lista);
                        lista.imprime();
                    }
                }
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

* Autores: Matheus Pedroza & André Labanca
 */
package AnalisadorLexico;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileWriter;
import javax.swing.JFrame;

/**
 *
 * @author Math Pedroza
 */
public class FrmAnaliseLexica extends javax.swing.JFrame {

    public JTextField jText;
    private int coluna = 0; // contador das colunas
    private int linha = 1; // contador das linhas

    public void executar() throws Exception {
        // método executar

        // Analise léxica
        File arquivo = new File("arquivo.txt"); // abre um arquivo de código no formato "txt"
        PrintWriter escrever; // printa na tela o caminho do arquivo
        try {
            escrever = new PrintWriter(arquivo);
            escrever.print(Flex.getText()); // pega a expresão digitada pelo usuário
            escrever.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnaliseLexica.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader leitor = new BufferedReader(new FileReader("arquivo.txt"));
            Lexer lexer = new Lexer(leitor); // cria objeto lexer que é da classe "Lexer.java"

            String resultado = ""; // resultado da análise léxica
            while (true) {
                Token token = lexer.yylex();
                if (token == null) { // se o token é vazio, retorna FIM do código

                    resultado += "FIM";
                    Lista.setText(resultado);
                    return;
                }
                // switch case para todos os tokens criados
                switch (token) {

                    case ERROR:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + " Erro: Token não definido\n";
                        break;

                    case letra:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <letra>" + lexer.lexeme + "\n";
                        break;

                    case numero:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <numero>" + lexer.lexeme + "\n";
                        break;

                    case relacional:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <relacional>" + lexer.lexeme + "\n";
                        break;

                    case oparitmetico:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <oparitmetico>" + lexer.lexeme + "\n";
                        break;

                    case tipos:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <tipos>" + lexer.lexeme + "\n";
                        break;

                    case final_linha:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <final_linha>" + lexer.lexeme + "\n";
                        break;

                    case comentario:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <comentario>" + lexer.lexeme + "\n";
                        break;

                    case criar_classe:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <criar_classe>" + lexer.lexeme + "\n";
                        break;

                    case final_linha_classe:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <final_linha_classe>" + lexer.lexeme + "\n";
                        break;

                    case relacionamento:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <relacionamento>" + lexer.lexeme + "\n";
                        break;

                    case parametros:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <parametros>" + lexer.lexeme + "\n";
                        break;

                    case retorno:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <retorno>" + lexer.lexeme + "\n";
                        break;

                    case atributos_visibilidade:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <atributos_visibilidade>" + lexer.lexeme + "\n";
                        break;

                    case associacoes_atributos:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <atributos_visibilidade>" + lexer.lexeme + "\n";
                        break;

                    case propriedades_operacoes:
                        coluna++;
                        resultado = resultado + "propriedades_operacoes: " + coluna + "<propriedades_operacoes>" + lexer.lexeme + "\n";
                        break;

                    case relacionamentos_classes:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <relacionamentos_classe>" + lexer.lexeme + "\n";
                        break;

                    case criar_chaves_fk:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <criar_chaves_fk>" + lexer.lexeme + "\n";
                        break;

                    case opcoes_fk:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <opcoes_fk>" + lexer.lexeme + "\n";
                        break;

                    case multiplicidade:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <multiplicidade>" + lexer.lexeme + "\n";
                        break;

                    case navegabilidade:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <navegabilidade>" + lexer.lexeme + "\n";
                        break;

                    case criar_relacao:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <criar_relacao>" + lexer.lexeme + "\n";
                        break;

                    case criar_op:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <criar_op>" + lexer.lexeme + "\n";
                        break;

                    case shape:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <shape>" + lexer.lexeme + "\n";
                        break;

                    case relationship:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <relationship>" + lexer.lexeme + "\n";
                        break;

                    case delete:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <delete>" + lexer.lexeme + "\n";
                        break;

                    case para:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <para>" + lexer.lexeme + "\n";
                        break;

                    case enquanto:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <enquanto>" + lexer.lexeme + "\n";
                        break;

                    case enquanto_for:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <enquanto_for>" + lexer.lexeme + "\n";
                        break;

                    case abre_colchete:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <abre_colchete>" + lexer.lexeme + "\n";
                        break;

                    case fecha_colchete:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <fecha_colchete>" + lexer.lexeme + "\n";
                        break;

                    case abre_parenteses:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <abre_parenteses>" + lexer.lexeme + "\n";
                        break;

                    case fecha_parenteses:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <fecha_parenteses>" + lexer.lexeme + "\n";
                        break;

                    case abre_chave:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <abre_chave>" + lexer.lexeme + "\n";
                        break;

                    case fecha_chave:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <fecha_chave>" + lexer.lexeme + "\n";
                        break;

                    case on_delete:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <on_delete>" + lexer.lexeme + "\n";
                        break;

                    case on_update:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <on_update>" + lexer.lexeme + "\n";
                        break;

                    case format:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <format>" + lexer.lexeme + "\n";
                        break;

                    case classe:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <classe>" + lexer.lexeme + "\n";
                        break;

                    case concurrent:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <concurrent>" + lexer.lexeme + "\n";
                        break;

                    case update:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <update>" + lexer.lexeme + "\n";
                        break;

                    case virgula:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <virgula>" + lexer.lexeme + "\n";
                        break;

                    case func:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <func>" + lexer.lexeme + "\n";
                        break;

                    case define_const:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <define_const>" + lexer.lexeme + "\n";
                        break;

                    case number_relationship:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <number_relationship>" + lexer.lexeme + "\n";
                        break;

                    case atribuicao_classe:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <atribuicao_classe>" + lexer.lexeme + "\n";
                        break;

                    case atribuicao_func:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <atribuicao_func>" + lexer.lexeme + "\n";
                        break;

                    case inicio_funcao:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <inicio_funcao>" + lexer.lexeme + "\n";
                        break;

                    case criacao_de_classe:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <criacao_de_classe>" + lexer.lexeme + "\n";
                        break;

                    case atributos_da_classe:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <atributos_da_classe>" + lexer.lexeme + "\n";
                        break;

                    case retorno_metodo:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <retorno_metodo>" + lexer.lexeme + "\n";
                        break;

                    case tipo_atributo:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <tipo_atributo>" + lexer.lexeme + "\n";
                        break;

                    case criar_metodo:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <criar_metodo>" + lexer.lexeme + "\n";
                        break;

                    case ler_metodo:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <ler_metodo>" + lexer.lexeme + "\n";
                        break;

                    case alterar_metodo:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <alterar_metodo>" + lexer.lexeme + "\n";
                        break;

                    case excluir_metodo:
                        coluna++;
                        resultado = resultado + "Linha: " + linha + ", Coluna: " + coluna + ", Token reconhecido <excluir_metodo>" + lexer.lexeme + "\n";
                        break;

                    case espaco:
                        //coluna++;
                        break;
                    case quebra_linha:
                        //coluna ++;
                        //resultado = resultado + "quebra_linha: " + coluna + "<quebra_linha>" + lexer.lexeme +"\n";
                        linha++;
                        coluna = 0;
                        break;

                }

                // Chamada do método executar
                try {
                    Gravar(String.valueOf(Flex.getText()));
                } catch (Exception e) {
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnaliseLexica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnaliseLexica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Gravar(String flex) {
        FileWriter arq = null;
        try {
            arq = new FileWriter("d:\\CodigoTeste.txt");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnaliseLexica.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(flex);

        try {
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnaliseLexica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     *
     */
    public FrmAnaliseLexica() {
        initComponents();
        this.setLocationRelativeTo(this);
        //Look.definelokk(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The colunaent of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btn_analizar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Arquivo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Flex = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        menu_abrir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Analisador Léxico - Menu Principal");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 255));
        setExtendedState(6);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Arquivo de Entrada:");

        btn_analizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_analizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/music-player-button-play-png.png"))); // NOI18N
        btn_analizar.setText("Analise Léxica");
        btn_analizar.setMaximumSize(new java.awt.Dimension(123, 49));
        btn_analizar.setMinimumSize(new java.awt.Dimension(123, 49));
        btn_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizarActionPerformed(evt);
            }
        });

        btn_limpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.setMaximumSize(new java.awt.Dimension(123, 49));
        btn_limpar.setMinimumSize(new java.awt.Dimension(123, 49));
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        Abrir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arquivo-png-4.png"))); // NOI18N
        Abrir.setText("ARQUIVO");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Análise dos Tokens");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Arquivo Flex:");

        Arquivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Flex.setColumns(20);
        Flex.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Flex.setRows(5);
        jScrollPane1.setViewportView(Flex);

        Lista.setColumns(20);
        Lista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Lista.setRows(5);
        jScrollPane2.setViewportView(Lista);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Analisador Léxico");

        MenuArquivo.setText("Arquivo");
        MenuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoActionPerformed(evt);
            }
        });

        menu_abrir.setText("Abrir Código");
        menu_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_abrirActionPerformed(evt);
            }
        });
        MenuArquivo.add(menu_abrir);

        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuArquivo.add(jMenuItem1);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        MenuArquivo.add(Sair);

        MenuPrincipal.add(MenuArquivo);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(415, 415, 415)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Abrir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 720, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Arquivo)
                    .addComponent(Abrir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btn_analizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(541, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizarActionPerformed
        // Chamada do método executar

        try {
            executar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_analizarActionPerformed

    @SuppressWarnings("empty-stetaments")

    private void menu_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_abrirActionPerformed
        //Opção para abrir um código pronto no computador

        try {
            JFileChooser Abrir = new JFileChooser();
            FileNameExtensionFilter Filtro = new FileNameExtensionFilter(".txt", "txt");
            Abrir.setAcceptAllFileFilterUsed(false);
            Abrir.setFileFilter(Filtro);
            Abrir.showOpenDialog(this);
            Arquivo.setText(Abrir.getSelectedFile().getAbsolutePath());
            File AbreArquivo = new File(Arquivo.getText());

            String flex = new String(Files.readAllBytes(AbreArquivo.toPath()));
            Flex.setText(flex);

        } catch (IOException ex) {
        }


    }//GEN-LAST:event_menu_abrirActionPerformed

    @SuppressWarnings("empty-statement")
    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // Botão limpar

        coluna = 0;
        linha = 1;
        Flex.setText("");
        //Lista.removeAll();;
        Arquivo.setText("");
        Lista.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // Abrir arquivo

        try {
            JFileChooser Abrir = new JFileChooser();
            FileNameExtensionFilter Filtro = new FileNameExtensionFilter(".txt", "txt");
            Abrir.setAcceptAllFileFilterUsed(false);
            Abrir.setFileFilter(Filtro);
            Abrir.showOpenDialog(this);
            Arquivo.setText(Abrir.getSelectedFile().getAbsolutePath());
            File AbreArquivo = new File(Arquivo.getText());

            String flex = new String(Files.readAllBytes(AbreArquivo.toPath()));
            Flex.setText(flex);

        } catch (IOException ex) {
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void MenuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoActionPerformed

    }//GEN-LAST:event_MenuArquivoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // Botão sair

        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            // TODO add your handling code here:
            
            new FrmTelaPrincipal().show(); //nome seria a classe principal que vc quer voltar
        } catch (IOException ex) {
            Logger.getLogger(FrmAnaliseLexica.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose(); //dispose fecha o atual
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
        } catch (UnsupportedLookAndFeelException ulfe) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FrmAnaliseLexica().setVisible(true);
        });

        JFrame Interface = new JFrame();
        Interface.setExtendedState(Interface.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        Interface.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JTextField Arquivo;
    private javax.swing.JTextArea Flex;
    private javax.swing.JTextArea Lista;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JButton btn_analizar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menu_abrir;
    // End of variables declaration//GEN-END:variables

}

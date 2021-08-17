/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipacontroleadotantes.gui.animais;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import uipacontroleadotantes.banco.adotantes.AdotantesBean;
import uipacontroleadotantes.banco.adotantes.AdotantesDAO;
import uipacontroleadotantes.banco.animais.AnimaisBean;
import uipacontroleadotantes.banco.animais.AnimaisDAO;
import uipacontroleadotantes.gui.renderers.DefaultCellRenderer;
import uipacontroleadotantes.uteis.FormataData;

/**
 *
 * @author Aguinaldo/Kaue
 */
public class AnimaisCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdotantesCadastro
     */
    AnimaisTableModel model = new AnimaisTableModel();

    public AnimaisCadastro() {
        initComponents();
        limparCampos();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/uipacontroleadotantes/assets/cao-24x24.png")));
        tblAnimais.setModel(model);
        preencherTable();
        preencherCbAdotantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        cbPorte = new javax.swing.JComboBox<>();
        cbCastrado = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbAdotante = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtDataAdocao = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimais = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Cadastro de Animais");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Nome:");

        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtNome.setName(""); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        jLabel5.setText("Porte:");

        jLabel10.setText("Sexo:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "M - Masculino", "F - Feminino" }));
        cbSexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cbSexo.setName("cbSexo"); // NOI18N

        cbPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "P - Pequeno", "M - Médio", "G - Grande" }));
        cbPorte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cbPorte.setName(""); // NOI18N

        cbCastrado.setText("Castrado");

        jLabel3.setText("Espécie:");

        txtEspecie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtEspecie.setName(""); // NOI18N
        txtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });
        txtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEspecieKeyReleased(evt);
            }
        });

        jLabel2.setText("Data Nasc:");

        jLabel11.setText("Adotante:");

        cbAdotante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        cbAdotante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cbAdotante.setName("cbSexo"); // NOI18N

        jLabel12.setText("Data Adoção:");

        txtDataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });
        txtDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataNascimentoKeyReleased(evt);
            }
        });

        txtDataAdocao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtDataAdocao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDataAdocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAdocaoActionPerformed(evt);
            }
        });
        txtDataAdocao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataAdocaoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbAdotante, 0, 170, Short.MAX_VALUE)
                        .addComponent(txtDataNascimento)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEspecie)
                            .addComponent(cbPorte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataAdocao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCastrado))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(cbPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCastrado)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbAdotante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDataAdocao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnCadastrar.setBackground(new java.awt.Color(255, 51, 102));
        btnCadastrar.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnCadastrar.setNextFocusableComponent(btnLimpar);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 51, 102));
        btnLimpar.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(255, 51, 102));
        btnAtualizar.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnAtualizar.setEnabled(false);
        btnAtualizar.setNextFocusableComponent(btnLimpar);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 51, 102));
        btnPesquisar.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnPesquisar.setNextFocusableComponent(btnLimpar);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 51));
        btnExcluir.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnExcluir.setEnabled(false);
        btnExcluir.setNextFocusableComponent(btnLimpar);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tblAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnimaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnimais);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        preencherTable();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (verificarCamposObrigatorios()) {
            AnimaisBean animaisBean = new AnimaisBean();
            animaisBean.setNome(txtNome.getText());
            animaisBean.setEspecie(txtEspecie.getText());
            if (cbSexo.getSelectedIndex() > 0) {
                char[] sexo = cbSexo.getSelectedItem().toString().split(" - ")[0].toCharArray();
                animaisBean.setSexo(sexo);
            }
            animaisBean.setDataNasc(LocalDate.parse(FormataData.BRtoUS(txtDataNascimento.getText())));
            animaisBean.setPorte(cbPorte.getSelectedItem().toString().split(" - ")[0].toCharArray());
            char[] castrado = new char[1];
            if (cbCastrado.isSelected()) {
                castrado[0] = 'S';
            } else {
                castrado[0] = 'N';
            }
            animaisBean.setCastrado(castrado);
            if (cbAdotante.getSelectedIndex() > 0) {
                int codAdotante = Integer.parseInt(cbAdotante.getSelectedItem().toString().split(" - ")[0]);
                animaisBean.setCodAdotante(codAdotante);
            }
            animaisBean.setDataAdocao(LocalDate.parse(FormataData.BRtoUS(txtDataAdocao.getText())));

            AnimaisDAO animaisDAO = new AnimaisDAO();

            try {
                int codAnimal = animaisDAO.inserir(animaisBean);
                animaisBean.setCodAnimal(codAnimal);
            } catch (SQLException ex) {
                Logger.getLogger(AnimaisCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            limparCampos();
            model.addRow(animaisBean);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        preencherTable();
    }//GEN-LAST:event_formComponentShown

    private void tblAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnimaisMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tblAnimais.getSelectedRow();
            limparCampos();
            txtNome.setText(tblAnimais.getValueAt(linha, 1).toString());
            txtEspecie.setText(tblAnimais.getValueAt(linha, 2).toString());
            if (tblAnimais.getValueAt(linha, 3) != null) {
                for (int i = 0; i < cbSexo.getItemCount(); i++) {
                    if (cbSexo.getItemAt(i).split(" - ")[0].equals(tblAnimais.getValueAt(linha, 3).toString())) {
                        cbSexo.setSelectedIndex(i);
                    }
                }
            }
            txtDataNascimento.setText(FormataData.UStoBR(tblAnimais.getValueAt(linha, 4).toString()));
            if (tblAnimais.getValueAt(linha, 5) != null) {
                for (int i = 0; i < cbPorte.getItemCount(); i++) {
                    if (cbPorte.getItemAt(i).split(" - ")[0].equals(tblAnimais.getValueAt(linha, 5).toString())) {
                        cbPorte.setSelectedIndex(i);
                    }
                }
            }
            if (tblAnimais.getValueAt(linha, 6).toString().equals("S")) {
                cbCastrado.setSelected(true);
            } else {
                cbCastrado.setSelected(false);
            }
            if (tblAnimais.getValueAt(linha, 7) != null) {
                for (int i = 0; i < cbAdotante.getItemCount(); i++) {
                    if (cbAdotante.getItemAt(i).split(" - ")[0].equals(tblAnimais.getValueAt(linha, 7).toString())) {
                        cbAdotante.setSelectedIndex(i);
                    }
                }
            }
            txtDataAdocao.setText(FormataData.UStoBR(tblAnimais.getValueAt(linha, 8).toString()));
            txtNome.requestFocus();
            btnAtualizar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_tblAnimaisMouseClicked

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        txtNome.setText(txtNome.getText().toUpperCase());
    }//GEN-LAST:event_txtNomeKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (verificarCamposObrigatorios()) {
            AnimaisBean animaisBean = new AnimaisBean();
            int linha = tblAnimais.getSelectedRow();
            if (linha < 0) {
                return;
            }
            int codAnimal = Integer.parseInt(tblAnimais.getValueAt(linha, 0).toString());
            animaisBean.setCodAnimal(codAnimal);
            animaisBean.setNome(txtNome.getText());
            animaisBean.setEspecie(txtEspecie.getText());
            char[] sexo = new char[1];
            if (cbSexo.getSelectedIndex() > 0) {
                sexo = cbSexo.getSelectedItem().toString().split(" - ")[0].toCharArray();
                animaisBean.setSexo(sexo);
            }
//            LocalDate data = LocalDate.parse((String) FormataData.BRtoUS(txtData.getText()));
            animaisBean.setDataNasc(LocalDate.parse((String) FormataData.BRtoUS(txtDataNascimento.getText())));
            char[] porte = cbPorte.getSelectedItem().toString().split(" - ")[0].toCharArray();
            animaisBean.setPorte(porte);
            char[] castrado = new char[1];
            if (cbCastrado.isSelected()) {
                castrado[0] = 'S';
            } else {
                castrado[0] = 'N';
            }
            animaisBean.setCastrado(castrado);
            int codAdotante = 0;
            if (cbAdotante.getSelectedIndex() > 0) {
                codAdotante = Integer.parseInt(cbAdotante.getSelectedItem().toString().split(" - ")[0]);
                animaisBean.setCodAdotante(codAdotante);
            }
            animaisBean.setDataAdocao(LocalDate.parse(FormataData.BRtoUS(txtDataAdocao.getText())));

            AnimaisDAO animaisDAO = new AnimaisDAO();

            try {
                animaisDAO.alterar(animaisBean);
            } catch (SQLException ex) {
                Logger.getLogger(AnimaisCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }

            model.setValueAt(String.valueOf(codAnimal), linha, 0);
            model.setValueAt(txtNome.getText(), linha, 1);
            model.setValueAt(txtEspecie.getText(), linha, 2);
            model.setValueAt(String.copyValueOf(sexo), linha, 3);
            model.setValueAt(FormataData.BRtoUS(txtDataNascimento.getText()), linha, 4);
            model.setValueAt(String.copyValueOf(porte), linha, 5);
            model.setValueAt(String.copyValueOf(castrado), linha, 6);
            model.setValueAt(String.valueOf(codAdotante), linha, 7);
            model.setValueAt(FormataData.BRtoUS(txtDataAdocao.getText()), linha, 8);

            limparCampos();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        AnimaisDAO animaisDAO = new AnimaisDAO();
        limparModel();
        if (!txtNome.getText().equals("")) {
            animaisDAO.pesquisarPorNome(txtNome.getText()).forEach((animal) -> {
                model.addRow(animal);
            });
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblAnimais.getSelectedRow();
        int codAnimal = Integer.parseInt(tblAnimais.getValueAt(linha, 0).toString());
        String nome = tblAnimais.getValueAt(linha, 1).toString();
        if (codAnimal > 0) {
            int permissao = JOptionPane.showConfirmDialog(null, "TEM CERTEZA QUE DESEJA EXCLUIR O ANIMAL " + nome + "?", "EXCLUIR?", JOptionPane.YES_NO_OPTION);
            if (permissao == 0) {
                AnimaisDAO animaisDao = new AnimaisDAO();
                try {
                    animaisDao.excluir(codAnimal);
                    model.removeRow(linha);
                } catch (SQLException ex) {
                    Logger.getLogger(AnimaisCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecieKeyReleased
        txtEspecie.setText(txtEspecie.getText().toUpperCase());
    }//GEN-LAST:event_txtEspecieKeyReleased

    private void txtDataNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataNascimentoKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            txtDataNascimento.setText(FormataData.validaData(txtDataNascimento.getText()));
        }
    }//GEN-LAST:event_txtDataNascimentoKeyReleased

    private void txtDataAdocaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataAdocaoKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            txtDataAdocao.setText(FormataData.validaData(txtDataAdocao.getText()));
        }
    }//GEN-LAST:event_txtDataAdocaoKeyReleased

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void txtDataAdocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAdocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAdocaoActionPerformed

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecieActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbAdotante;
    private javax.swing.JCheckBox cbCastrado;
    private javax.swing.JComboBox<String> cbPorte;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnimais;
    private javax.swing.JFormattedTextField txtDataAdocao;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        Component[] cmps = jPanel1.getComponents();
        for (Component c : cmps) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
            if (c instanceof JFormattedTextField) {
                ((JFormattedTextField) c).setText(null);
            }
            if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            }
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
            }
        }
        txtDataAdocao.setText(FormataData.UStoBR(LocalDate.now().toString()));
        btnCadastrar.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }

    private boolean verificarCamposObrigatorios() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "CAMPO NOME VAZIO.");
            txtNome.requestFocus();
            return false;
        }
        return true;
    }

    private void preencherTable() {
        AnimaisDAO animaisDAO = new AnimaisDAO();
        limparModel();
        try {
            for (AnimaisBean animal : animaisDAO.listarTodos()) {
                model.addRow(animal);
            }
            tblAnimais.getColumnModel().getColumn(4).setCellRenderer(new DefaultCellRenderer());
            tblAnimais.getColumnModel().getColumn(8).setCellRenderer(new DefaultCellRenderer());
        } catch (SQLException ex) {
            Logger.getLogger(AnimaisCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limparModel() {
        for (int i = model.getRowCount() - 1; i > -1; i--) {
            model.removeRow(i);
        }
        preencherCbAdotantes();
    }

    private void preencherCbAdotantes() {
        try {
            AdotantesDAO adotantesDAO = new AdotantesDAO();
            String primeiroItem = cbAdotante.getItemAt(0);
            cbAdotante.removeAllItems();
            cbAdotante.addItem(primeiroItem);
            for (AdotantesBean adotante : adotantesDAO.listarTodos()) {
                cbAdotante.addItem(adotante.getCodAdotante() + " - " + adotante.getNome());
            }
            cbAdotante.setSelectedIndex(0);
        } catch (SQLException ex) {
            Logger.getLogger(AnimaisCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

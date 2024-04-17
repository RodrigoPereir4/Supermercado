/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import com.mycompany.supermercado.models.Produto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirmar = new JCustoms.ButtonCustom();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbCategoriaProduto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNomeProduto = new JCustoms.TextFiledCustom();
        txtMarcaProduto = new JCustoms.TextFiledCustom();
        txtValorProduto = new JCustoms.TextFiledCustom();
        jPanel5 = new javax.swing.JPanel();
        txtCodBarras = new JCustoms.FormatterCodBarras();
        txtDataValidade = new JCustoms.MyFormatterDate();
        jLabel15 = new javax.swing.JLabel();
        btnCancelarProduto = new JCustoms.ButtonCustom();
        btnConfirmarProduto = new JCustoms.ButtonCustom();
        txtQuantidadeProduto = new JCustoms.TextFiledCustom();

        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorderColor(java.awt.Color.blue);
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setColorClick(new java.awt.Color(101, 101, 252));
        btnConfirmar.setColorOver(new java.awt.Color(101, 101, 252));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConfirmar.setRadius(15);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(134, 83, 83));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Novo Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Códigio de Barras");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nome do Produto");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Marca");

        cbCategoriaProduto.setBackground(new java.awt.Color(255, 255, 255));
        cbCategoriaProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Açougue", "Padaria", "Horti-Fruti", "Higiente Pessoal", "Produtos de Limpeza", "Bebidas", "Pet  Shop" }));
        cbCategoriaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbCategoriaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbCategoriaProdutoFocusLost(evt);
            }
        });
        cbCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaProdutoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Categoria");

        lbValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbValor.setForeground(new java.awt.Color(0, 0, 0));
        lbValor.setText("Valor");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Quantidade");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Data de Validade");

        jPanel5.setLayout(new java.awt.GridBagLayout());

        txtCodBarras.setBackground(new java.awt.Color(255, 255, 255));
        txtCodBarras.setForeground(new java.awt.Color(0, 0, 0));

        txtDataValidade.setBackground(new java.awt.Color(255, 255, 255));
        txtDataValidade.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Status");

        btnCancelarProduto.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.setBorderColor(java.awt.Color.red);
        btnCancelarProduto.setBorderPainted(false);
        btnCancelarProduto.setColorClick(new java.awt.Color(255, 100, 100));
        btnCancelarProduto.setColorOver(new java.awt.Color(255, 80, 80));
        btnCancelarProduto.setFocusPainted(false);
        btnCancelarProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarProduto.setRadius(15);
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        btnConfirmarProduto.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmarProduto.setText("Confirmar");
        btnConfirmarProduto.setBorderColor(java.awt.Color.blue);
        btnConfirmarProduto.setBorderPainted(false);
        btnConfirmarProduto.setColorClick(new java.awt.Color(101, 101, 252));
        btnConfirmarProduto.setColorOver(new java.awt.Color(101, 101, 252));
        btnConfirmarProduto.setFocusPainted(false);
        btnConfirmarProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConfirmarProduto.setRadius(15);
        btnConfirmarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103))
                                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnConfirmarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(cbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtValorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel14))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void buttonCustom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom2ActionPerformed
       dispose();
    }//GEN-LAST:event_buttonCustom2ActionPerformed

    private void cbCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaProdutoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnConfirmarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarProdutoActionPerformed
       
        //Validar Código de Barras
        long codBarras = 0;
        if(txtCodBarras.getCPF().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite o Código de Barras!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
             codBarras = Long.parseLong(txtCodBarras.getCPF());
        }
        
        //Validar Nome
        String nome = "";
        if(txtNomeProduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite o Nome do Produto!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }else {
             nome = txtNomeProduto.getText();
        }
        
        //Marca
        String marca = txtMarcaProduto.getText();
        
        //Validar Categoria
        String categoria = "";
        if(cbCategoriaProduto.getSelectedIndex() == 0) {
             JOptionPane.showMessageDialog(rootPane, "Selecione a Categoria!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
            categoria = cbCategoriaProduto.getSelectedItem().toString();
        }
        
        //Validar Valor
        double valor = 0.0;
        String aux = "";
        if(txtValorProduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite o valor do Produto!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }else {
            try {
                aux = txtValorProduto.getText().replace(",", ".");
                valor = Double.parseDouble(aux);
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Digite o valor corretamente!", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        //Validade
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("ddMMuuuu");
        LocalDate validade = null;
        if(txtDataValidade.getCPF().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite a validade do Produto!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
            try{
                validade = LocalDate.parse(txtDataValidade.getCPF(), fm2);
            }catch(DateTimeParseException e){
                JOptionPane.showMessageDialog(rootPane, "Digite uma data válida!", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        }

        //Quantidade
        int quantidade = 0;
        if(txtQuantidadeProduto.getText().equals("")){
            quantidade = 0;
        }else {
            try {
                quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Digite a quantidade corretamente!", "Erro!", JOptionPane.WARNING_MESSAGE);
                quantidade = -1;
            }
            
        }
        
        //Status
        boolean status = true;
        
        
        //Lista de Produtos
        List<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto(codBarras, nome, marca, categoria, valor, validade, quantidade, status));

        //Tabela
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String codigoS = "", valorS = "", validadeS = "", quantidadeS = "";

        for(Produto p : produtos) {
            codigoS = Long.toString(p.getCodigo());
            
            if(!codigoS.equals("0") && !p.getNome().equals("") && !p.getCategoria().equals("") && p.getValor() != 0.0 && p.getValidade() != null && p.getQuantidade() != -1 && p.getQuantidade() >= 0){
                
                //Conversão de valores do Produto para String
                valorS = (String.format("%.2f", p.getValor())); 
                validadeS = p.getValidade().format(fm1); 
                quantidadeS = Integer.toString(p.getQuantidade());
 
                //Adicionar Linha
                TelaPrincipal.AddLinha(new Object[]{
                     codigoS,
                     p.getNome(),
                     p.getMarca(),
                     p.getCategoria(),
                     valorS,
                     validadeS,
                     quantidadeS,
                     status
                 });
                dispose();
            }

        }
       
    }//GEN-LAST:event_btnConfirmarProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void cbCategoriaProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbCategoriaProdutoFocusLost

        String categoria = cbCategoriaProduto.getSelectedItem().toString();
        
        if(categoria.equals("Açougue") || categoria.equals("Padaria") || categoria.equals("Horti-Fruti")){
            lbValor.setText("Valor por KG:");
        } else {
            lbValor.setText("Valor por Unidade:");
        }
    }//GEN-LAST:event_cbCategoriaProdutoFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCustoms.ButtonCustom btnCancelarProduto;
    private JCustoms.ButtonCustom btnConfirmar;
    private JCustoms.ButtonCustom btnConfirmarProduto;
    private javax.swing.JComboBox<String> cbCategoriaProduto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbValor;
    private JCustoms.FormatterCodBarras txtCodBarras;
    private JCustoms.MyFormatterDate txtDataValidade;
    private JCustoms.TextFiledCustom txtMarcaProduto;
    private JCustoms.TextFiledCustom txtNomeProduto;
    private JCustoms.TextFiledCustom txtQuantidadeProduto;
    private JCustoms.TextFiledCustom txtValorProduto;
    // End of variables declaration//GEN-END:variables
}

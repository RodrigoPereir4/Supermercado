/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.views;

import com.mycompany.supermercado.dao.ClienteDAO;
import javax.swing.JOptionPane;
import com.mycompany.supermercado.utils.ValidarEmail;
import com.mycompany.supermercado.models.Cliente;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author digol
 */
public class Clientes extends javax.swing.JFrame {

    Cliente clienteAlterar = null;
    /**
     * Creates new form Cliente
     */
    public Clientes() {
        initComponents();
    }
    
    public Clientes(Cliente obj){
        
        initComponents();
        clienteAlterar = obj;
        txtTituloCliente.setText("Editar Cliente");
        
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("ddMMuuuu");
        
        txtNomeCliente.setText(clienteAlterar.getNome());
        txtCpfCliente.setCPF(String.valueOf(clienteAlterar.getCpf()));
        txtTelefone.setTelefone(String.valueOf(clienteAlterar.getTelefone()));
        txtEmailCliente.setText(clienteAlterar.getEmail());
        cbEstadoCivil.getModel().setSelectedItem(clienteAlterar.getEstadoCivil());
        cbSexo.getModel().setSelectedItem(clienteAlterar.getSexo());
        txtRua.setText(clienteAlterar.getRua());
        cbEstado.getModel().setSelectedItem(clienteAlterar.getEstado());
        txtBairro.setText(clienteAlterar.getBairro());
        txtDataNascimento.setDate(fm2.format(clienteAlterar.getDataNascimento()));
        
    }
    
    public Clientes(Cliente obj, boolean t) {
        initComponents();
        clienteAlterar = obj;
        txtTituloCliente.setText("Visualizar Cliente");
        
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("ddMMuuuu");
        
        txtNomeCliente.setText(clienteAlterar.getNome());
        txtCpfCliente.setCPF(String.valueOf(clienteAlterar.getCpf()));
        txtTelefone.setTelefone(String.valueOf(clienteAlterar.getTelefone()));
        txtEmailCliente.setText(clienteAlterar.getEmail());
        cbEstadoCivil.getModel().setSelectedItem(clienteAlterar.getEstadoCivil());
        cbSexo.getModel().setSelectedItem(clienteAlterar.getSexo());
        txtRua.setText(clienteAlterar.getRua());
        cbEstado.getModel().setSelectedItem(clienteAlterar.getEstado());
        txtBairro.setText(clienteAlterar.getBairro());
        txtDataNascimento.setDate(fm2.format(clienteAlterar.getDataNascimento()));

        
        btnConfirmarCliente.setVisible(!t);
        btnCancelarCliente.setText("Voltar");
        btnCancelarCliente.setFont(new Font("Arial", 0, 16));
        btnCancelarCliente.setBackground(new Color(255,80,80));
        btnCancelarCliente.setColor(new Color(255,80,80));
        
        txtNomeCliente.setEditable(!t);
        txtCpfCliente.setEditableCPF(!t);
        txtTelefone.setEditableTelefone(!t);
        txtEmailCliente.setEditable(!t);
        cbEstadoCivil.setEnabled(!t);
        cbSexo.setEnabled(!t);
        txtRua.setEditable(!t);
        cbEstado.setEnabled(!t);
        txtBairro.setEditable(!t);
        txtDataNascimento.setEditableDate(!t);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        Cabecalho = new javax.swing.JPanel();
        txtTituloCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new com.mycompany.supermercado.JCustoms.TextFiledCustom();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmailCliente = new com.mycompany.supermercado.JCustoms.TextFiledCustom();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtRua = new com.mycompany.supermercado.JCustoms.TextFiledCustom();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new com.mycompany.supermercado.JCustoms.TextFiledCustom();
        btnCancelarCliente = new com.mycompany.supermercado.JCustoms.ButtonCustom();
        btnConfirmarCliente = new com.mycompany.supermercado.JCustoms.ButtonCustom();
        jLabel11 = new javax.swing.JLabel();
        txtCpfCliente = new com.mycompany.supermercado.JCustoms.MyFormatter();
        cbEstado = new javax.swing.JComboBox<>();
        txtTelefone = new com.mycompany.supermercado.JCustoms.MyFormatterTelefone();
        txtDataNascimento = new com.mycompany.supermercado.JCustoms.MyFormatterDate();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpFundo.setBackground(new java.awt.Color(255, 255, 255));

        Cabecalho.setBackground(new java.awt.Color(134, 83, 83));

        txtTituloCliente.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtTituloCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloCliente.setText(" Novo Cliente");

        javax.swing.GroupLayout CabecalhoLayout = new javax.swing.GroupLayout(Cabecalho);
        Cabecalho.setLayout(CabecalhoLayout);
        CabecalhoLayout.setHorizontalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CabecalhoLayout.setVerticalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome Completo");

        txtNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");

        txtEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailCliente.setForeground(new java.awt.Color(0, 0, 0));

        cbEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        cbEstadoCivil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)" }));
        cbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoCivilActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estado Cívil");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sexo");

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Masculino", "Feminino", "Prefiro não informar" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Rua");

        txtRua.setBackground(new java.awt.Color(255, 255, 255));
        txtRua.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estado");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Bairro");

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));

        btnCancelarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.setAlignmentY(30.0F);
        btnCancelarCliente.setBorderColor(java.awt.Color.red);
        btnCancelarCliente.setBorderPainted(false);
        btnCancelarCliente.setColorClick(new java.awt.Color(255, 100, 100));
        btnCancelarCliente.setColorOver(new java.awt.Color(255, 80, 80));
        btnCancelarCliente.setFocusPainted(false);
        btnCancelarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarCliente.setRadius(15);
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnConfirmarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmarCliente.setText("Confirmar");
        btnConfirmarCliente.setBorderColor(java.awt.Color.blue);
        btnConfirmarCliente.setBorderPainted(false);
        btnConfirmarCliente.setColorClick(new java.awt.Color(101, 101, 252));
        btnConfirmarCliente.setColorOver(new java.awt.Color(101, 101, 252));
        btnConfirmarCliente.setFocusPainted(false);
        btnConfirmarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConfirmarCliente.setRadius(15);
        btnConfirmarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarClienteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Data de Nascimento");

        txtCpfCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCpfCliente.setForeground(new java.awt.Color(0, 0, 0));

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbEstado.setForeground(new java.awt.Color(0, 0, 0));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));

        txtDataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNascimento.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpFundoLayout.createSequentialGroup()
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpFundoLayout.createSequentialGroup()
                                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140)))
                        .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFundoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFundoLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(241, 241, 241))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFundoLayout.createSequentialGroup()
                                        .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24))))
                            .addGroup(jpFundoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpFundoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFundoLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(194, 194, 194))
                                    .addGroup(jpFundoLayout.createSequentialGroup()
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jpFundoLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel9)
                                .addGap(118, 118, 118)
                                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpFundoLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(24, 24, 24))))))
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoCivilActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnConfirmarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarClienteActionPerformed
        
        if(clienteAlterar == null){
            //Validar nome
            String nome = "";
            if (txtNomeCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Digite um nome!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                nome = txtNomeCliente.getText();
            }

            //Validar CPF
            long Cpf = 0;
            if (txtCpfCliente.getCPF().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Digite um CPF válido!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                Cpf = Long.parseLong(txtCpfCliente.getCPF());
            }

            //Validar Telefone
            long telefone = 0;
            if (txtTelefone.getTelefone().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Digite um Telefone válido!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                telefone = Long.parseLong(txtTelefone.getTelefone());
            }

            //validar Endereço
            String bairro = "";
            String rua = "";
            if (txtRua.getText().equals("") || txtBairro.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Digite um endereço válido!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                rua = txtRua.getText();
                bairro = txtBairro.getText();
            }

            //Validar combo-box
            String estado = "";
            if (cbEstado.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione um estado!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                estado = cbEstado.getSelectedItem().toString();
            }

            String estCivil = "";
            if (cbEstadoCivil.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione um estado civil!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                estCivil = cbEstadoCivil.getSelectedItem().toString();
            }

            String sexo = "";
            if (cbSexo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione um Sexo!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                sexo = cbSexo.getSelectedItem().toString();
            }

            //Validar email
            boolean emailTest = ValidarEmail.validar(txtEmailCliente.getText());
            String email = "";
            if (!emailTest) {
                JOptionPane.showMessageDialog(rootPane, "Digite um email válido!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                email = txtEmailCliente.getText();
            }

            //Data de Nascimento
            DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("ddMMuuuu");
            LocalDate dataNascimento = null;
            if(txtDataNascimento.getDate().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Digite a sua data de nascimento!", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                try{
                    dataNascimento = LocalDate.parse(txtDataNascimento.getDate(), fm2);
                }catch(DateTimeParseException e){
                    JOptionPane.showMessageDialog(rootPane, "Digite uma data válida!", "Erro!", JOptionPane.WARNING_MESSAGE);
                }
            }

            //Lista de Clientes
            List<Cliente> clientes = new ArrayList<>();

            clientes.add(new Cliente(nome, Cpf, telefone, email, estCivil, sexo, rua, estado, bairro, dataNascimento));

            //Banco e Tabela
            for(Cliente c : clientes) {

                if(!String.valueOf(Cpf).equals("0") && !c.getNome().equals("") && c.getTelefone() != 0 && emailTest == true && !c.getEstadoCivil().equals("") && !c.getSexo().equals("") && 
                   !c.getRua().equals("") && !c.getEstado().equals("")&& !c.getBairro().equals("") && c.getDataNascimento() != null){

                    //Adicionar ao Banco de Dados
                    boolean retorno = ClienteDAO.salvar(c);

                    if(retorno) {
                        JOptionPane.showMessageDialog(rootPane, "Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro!");
                    }

                    //Adicionar a Tabela
                    TelaPrincipal.atualizarTabelaClientes();
                    this.dispose();
               }
            }
        } 
        
        else { //Modo de Alteração
            DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("ddMMuuuu");

            String nome = txtNomeCliente.getText();
            long cpf = Long.parseLong(txtCpfCliente.getCPF());
            long telefone = Long.parseLong(txtTelefone.getTelefone());
            String email = txtEmailCliente.getText();
            String estadoCivil = cbEstadoCivil.getSelectedItem().toString();
            String sexo = cbSexo.getSelectedItem().toString();
            String rua = txtRua.getText();
            String estado = cbEstado.getSelectedItem().toString();
            String bairro = txtBairro.getText();
            LocalDate dataNascimento = LocalDate.parse(txtDataNascimento.getDate(), fm2);
            
            clienteAlterar.setNome(nome);
            clienteAlterar.setCpf(cpf);
            clienteAlterar.setTelefone(telefone);
            clienteAlterar.setEmail(email);
            clienteAlterar.setEstadoCivil(estadoCivil);
            clienteAlterar.setSexo(sexo);
            clienteAlterar.setRua(rua);
            clienteAlterar.setEstado(estado);
            clienteAlterar.setBairro(bairro);
            clienteAlterar.setDataNascimento(dataNascimento);
            
            boolean retorno = ClienteDAO.alterar(clienteAlterar);
            
            if(retorno) {
                JOptionPane.showMessageDialog(rootPane, "Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                TelaPrincipal.atualizarTabelaClientes();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro!", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        }

        
        //Alterar
 
    }//GEN-LAST:event_btnConfirmarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecalho;
    private com.mycompany.supermercado.JCustoms.ButtonCustom btnCancelarCliente;
    private com.mycompany.supermercado.JCustoms.ButtonCustom btnConfirmarCliente;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpFundo;
    private com.mycompany.supermercado.JCustoms.TextFiledCustom txtBairro;
    private com.mycompany.supermercado.JCustoms.MyFormatter txtCpfCliente;
    private com.mycompany.supermercado.JCustoms.MyFormatterDate txtDataNascimento;
    private com.mycompany.supermercado.JCustoms.TextFiledCustom txtEmailCliente;
    private com.mycompany.supermercado.JCustoms.TextFiledCustom txtNomeCliente;
    private com.mycompany.supermercado.JCustoms.TextFiledCustom txtRua;
    private com.mycompany.supermercado.JCustoms.MyFormatterTelefone txtTelefone;
    private javax.swing.JLabel txtTituloCliente;
    // End of variables declaration//GEN-END:variables
}

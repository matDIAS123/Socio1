/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sociotorcedor;

import com.mycompany.sociotorcedor.FormaPgto;
import com.mycompany.sociotorcedor.Produto;
import com.mycompany.sociotorcedor.TelaAdmin;
import com.mycompany.sociotorcedor.Venda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */

public class Uniformes extends javax.swing.JFrame {
    ArrayList<Produto> ListaProd;
    List<Produto> prods;
    List<FormaPgto> formas;
    /**
     * Creates new form Uniformes
     */
    public Uniformes() {
        initComponents();
        setLocationRelativeTo(null);
        ListaProd = new ArrayList();
    }
    public void CarregaProduto(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"id","imagem","descr","preco"},0);
            
        for(int i=0;i<ListaProd.size();i++){
           
            Object linha[] = new Object[]{ListaProd.get(i).getId(),ListaProd.get(i).getImagem(),
                                        ListaProd.get(i).getDescr(),ListaProd.get(i).getPreco()};
            modelo.addRow(linha);
        } 
        tblProd.setModel(modelo);
        tblProd.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProd.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        edtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        btnComprar2 = new javax.swing.JButton();
        btnAdmin2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\projetos\\logoSP.jpg")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTabbedPane1.setBackground(new java.awt.Color(172, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTabbedPane1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N

        tblProd.setBackground(new java.awt.Color(204, 204, 204));
        tblProd.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        tblProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Imagem", "Modelo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProd);
        if (tblProd.getColumnModel().getColumnCount() > 0) {
            tblProd.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblProd.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Uniformes", jPanel1);

        jPanel5.setBackground(new java.awt.Color(172, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });
        edtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCodigoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Digite o codigo");

        lblCodigo.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("lblCod");

        btnComprar2.setBackground(new java.awt.Color(51, 51, 51));
        btnComprar2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnComprar2.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar2.setText("Confirmar compra");
        btnComprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar2ActionPerformed(evt);
            }
        });

        btnAdmin2.setBackground(new java.awt.Color(102, 0, 0));
        btnAdmin2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnAdmin2.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin2.setText("Gerenciar");
        btnAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor");

        lblPreco.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("lblPreco");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPreco)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComprar2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdmin2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar2)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(btnAdmin2)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Uniformes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCodigoActionPerformed

    private void edtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyReleased
        String cod = edtCodigo.getText();
        String setor = "";
        String assento = "";
        Double preco = 0.0 ;

        if (cod.length() > 0) {
            Integer codProd = Integer.parseInt(cod);

            for (Produto p : prods) {
                if (p.getId() == codProd) {
                    setor = p.getDescr();
                    assento = p.getAssento();
                    preco = p.getPreco();
                }
            }
        }
        lblCodigo.setText(setor);
        lblPreco.setText(String.valueOf(preco));
    }//GEN-LAST:event_edtCodigoKeyReleased

    private void edtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyTyped
        char key = evt.getKeyChar();

        if(key < 48 || key > 57){
            evt.consume();
        }
    }//GEN-LAST:event_edtCodigoKeyTyped

    private void btnComprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar2ActionPerformed
        String codProd = edtCodigo.getText();
        Integer cod = -1;
        Object sel;
        Produto prod = null;
        FormaPgto forma = null;

        if (codProd.length() > 0) {
            cod = Integer.parseInt(codProd);
        } else {
            JOptionPane.showMessageDialog(this, "Você deve informar um Produto");
            return;
        }

        for (Produto p : prods) {
            if (p.getId() == cod) {
                prod = p;
            }
        }

        if (prod == null) {
            JOptionPane.showMessageDialog(this, "Produto inválido!");
            return;
        }

        try {
            formas = FormaPgto.buscaFormasPgto();
            Object[] opcoes = formas.stream().map(f -> f.getDescr())
            .collect(Collectors.toList()).toArray();
            sel = JOptionPane.showInputDialog(this,
                "Selecione a Forma de Pagamento...", "Formas de Pagamento",
                JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        for (FormaPgto f : formas) {
            if (f.getDescr().equals(sel)) {
                forma = f;
            }
        }

        if (forma != null) {
            Venda reg = new Venda(prod, forma);
            try {
                reg.salvar();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,
                    ex.getMessage());
                return;
            }

            JOptionPane.showMessageDialog(this,
                "Venda confirmada! Retire seu produto.");
        }
        else {
            JOptionPane.showMessageDialog(this,
                "Você deve informar uma Forma de Pagamento!");
        }
    }//GEN-LAST:event_btnComprar2ActionPerformed

    private void btnAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin2ActionPerformed
        TelaAdmin adm = new TelaAdmin();
        adm.setVisible(true);
    }//GEN-LAST:event_btnAdmin2ActionPerformed

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
            java.util.logging.Logger.getLogger(Uniformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uniformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uniformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uniformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uniformes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin2;
    private javax.swing.JButton btnComprar2;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tblProd;
    // End of variables declaration//GEN-END:variables
}

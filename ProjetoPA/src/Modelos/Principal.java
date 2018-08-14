/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author robsom.mathei
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setResizable(false);
        buttonGroup.add(rbtnClasse1);
        buttonGroup.add(rbtnClasse2);
        buttonGroup.add(rbtnClasse3);
        rbtnClasse1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lblSelPersonagem = new javax.swing.JLabel();
        btnAvançar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        rbtnClasse1 = new javax.swing.JRadioButton();
        rbtnClasse2 = new javax.swing.JRadioButton();
        rbtnClasse3 = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblOdaAtaque = new javax.swing.JLabel();
        lblOdaVida = new javax.swing.JLabel();
        lblMakoAtaque = new javax.swing.JLabel();
        lblMakoVida = new javax.swing.JLabel();
        lblTritanAtaque = new javax.swing.JLabel();
        lblTritanVida = new javax.swing.JLabel();

        lblSelPersonagem.setText("Selecione o personagem:");

        btnAvançar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sign-check.png"))); // NOI18N
        btnAvançar.setText("Avançar");
        btnAvançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvançarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sign-error.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        rbtnClasse1.setText("OPAL");

        rbtnClasse2.setText("KATARA");
        rbtnClasse2.setToolTipText("");

        rbtnClasse3.setText("MAKO");
        rbtnClasse3.setActionCommand("");

        lblNome.setText("Digite o nome do personagem:");

        lblOdaAtaque.setText("Ataque: 50");

        lblOdaVida.setText("Vida: 100");

        lblMakoAtaque.setText("Ataque: 70");

        lblMakoVida.setText("Vida: 80");

        lblTritanAtaque.setText("Ataque: 80");

        lblTritanVida.setText("Vida: 70");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnClasse2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnSair)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAvançar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSelPersonagem)
                                .addComponent(rbtnClasse1))
                            .addGap(104, 104, 104)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOdaAtaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOdaVida))
                    .addComponent(rbtnClasse3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMakoAtaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMakoVida))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTritanAtaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTritanVida)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelPersonagem)
                    .addComponent(lblNome))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbtnClasse1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOdaAtaque)
                    .addComponent(lblOdaVida))
                .addGap(9, 9, 9)
                .addComponent(rbtnClasse2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMakoAtaque)
                    .addComponent(lblMakoVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnClasse3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTritanAtaque)
                    .addComponent(lblTritanVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnAvançar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAvançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvançarActionPerformed
        // TODO add your handling code here:
   
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(this, "Preencha o nome do personagem!");
        } else {
        Personagem personagemClasse = escolherPersonagem();
        DetalhesPersonagem tela = new DetalhesPersonagem(personagemClasse,Principal.this);
        tela.setModal(true);
        tela.setVisible(true);
        }   
        
    }//GEN-LAST:event_btnAvançarActionPerformed

    
    public boolean validarCampos() {
        if (txtNome.getText().trim().length() < 3) {
            return false;
        } else {
            return true;
        }  
    }
    
    private Personagem escolherPersonagem() {
       try {
           Personagem personagem = new Personagem();
           personagem.setNome(txtNome.getText().trim());
           if (rbtnClasse1.isSelected()) {
            personagem.setClasse("OPAL");
            personagem.setNivel(1);
            personagem.setAtaque(50);
            personagem.setVida(100);
        } 
        if (rbtnClasse2.isSelected()) {
            personagem.setClasse("KATARA");
            personagem.setNivel(1);
            personagem.setAtaque(70);
            personagem.setVida(80);
            } 
        
        if (rbtnClasse3.isSelected()) {
            personagem.setClasse("MAKO");
            personagem.setNivel(1);
            personagem.setAtaque(80);
            personagem.setVida(70);
        }
        return personagem;
       } catch (Exception e) {
        return null;
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvançar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel lblMakoAtaque;
    private javax.swing.JLabel lblMakoVida;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOdaAtaque;
    private javax.swing.JLabel lblOdaVida;
    private javax.swing.JLabel lblSelPersonagem;
    private javax.swing.JLabel lblTritanAtaque;
    private javax.swing.JLabel lblTritanVida;
    private javax.swing.JRadioButton rbtnClasse1;
    private javax.swing.JRadioButton rbtnClasse2;
    private javax.swing.JRadioButton rbtnClasse3;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveis;
import Modelos.*;
import Modelos.CaixaDeDialogo;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Nivel1 extends javax.swing.JFrame {
Personagem personagem;
int ataca;
int ataque;
int vidaOriginal;
int vidaInimigo;
Inimigo nivel1 = new Inimigo();
Random gerador = new Random();
    /**
     * Creates new form Nivel1
     */
    public Nivel1(Personagem personagem) {
        initComponents();
        this.personagem=personagem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomePersonagem = new javax.swing.JTextField();
        txtAtaqueInimigo = new javax.swing.JTextField();
        txtVidaInimigo = new javax.swing.JTextField();
        lblAtaqueInimigo = new javax.swing.JLabel();
        lblVidaInimigo = new javax.swing.JLabel();
        txtNomeInimigo = new javax.swing.JTextField();
        txtAtaquePersonagem = new javax.swing.JTextField();
        txtVidaPersonagem = new javax.swing.JTextField();
        lblAtaqueInimigo1 = new javax.swing.JLabel();
        lblVidaInimigo1 = new javax.swing.JLabel();
        btnQuemAtaca = new javax.swing.JButton();
        barVidaInimigo = new javax.swing.JProgressBar();
        barVidaPersonagem = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtNomePersonagem.setEditable(false);

        txtAtaqueInimigo.setEditable(false);

        txtVidaInimigo.setEditable(false);

        lblAtaqueInimigo.setText("Ataque:");

        lblVidaInimigo.setText("Vida:");

        txtNomeInimigo.setEditable(false);

        txtAtaquePersonagem.setEditable(false);

        txtVidaPersonagem.setEditable(false);

        lblAtaqueInimigo1.setText("Ataque:");

        lblVidaInimigo1.setText("Vida:");

        btnQuemAtaca.setText("Quem ataca?");
        btnQuemAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuemAtacaActionPerformed(evt);
            }
        });

        barVidaInimigo.setForeground(new java.awt.Color(0, 204, 51));
        barVidaInimigo.setStringPainted(true);

        barVidaPersonagem.setForeground(new java.awt.Color(0, 204, 0));
        barVidaPersonagem.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuemAtaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addGap(98, 98, 98)
                                .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(lblAtaqueInimigo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblVidaInimigo)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAtaqueInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtVidaInimigo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblAtaqueInimigo1))
                                    .addComponent(lblVidaInimigo1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAtaquePersonagem)
                                    .addComponent(txtVidaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(barVidaPersonagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAtaqueInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtaqueInimigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVidaInimigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAtaquePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtaqueInimigo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVidaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVidaInimigo1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barVidaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnQuemAtaca)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        mostrarInimigo();
        mostrarPersonagem();
    }//GEN-LAST:event_formWindowOpened

    private void btnQuemAtacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuemAtacaActionPerformed
        // TODO add your handling code here:
        ataca = gerador.nextInt(2);
        try{
            if (ataca==0) {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Você ataca!", "Ataque!", 'i');
                    ataquePersonagem();
            } else {
               CaixaDeDialogo.obterinstancia().exibirMensagem("O inimigo ataca!", "Ataque!", 'i');;
                  ataqueInimigo();
            }
        } catch(HeadlessException ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage().toString(),"ERRO",'e');
        }
    }//GEN-LAST:event_btnQuemAtacaActionPerformed

   
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
private void mostrarInimigo() {
    nivel1.setNome("Inimigo Nível 1");
    nivel1.setNivel(1);
    vidaInimigo=100;
    nivel1.setVida(vidaInimigo);
    nivel1.setAtaque(gerador.nextInt(50)+1);
    txtNomeInimigo.setText(nivel1.getNome());
    txtAtaqueInimigo.setText(String.valueOf(nivel1.getAtaque()));
    txtVidaInimigo.setText(String.valueOf(nivel1.getVida()));
    barVidaInimigo.setMaximum(vidaInimigo);
    barVidaInimigo.setMinimum(0);
    barVidaInimigo.setValue(vidaInimigo);
    barVidaInimigo.setString(String.valueOf(vidaInimigo));
}
private void mostrarPersonagem(){
    txtNomePersonagem.setText(personagem.getNome());
    txtAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
    txtVidaPersonagem.setText(String.valueOf(personagem.getVida())); 
    vidaOriginal=personagem.getVida();
    barVidaPersonagem.setMaximum(vidaOriginal);
    barVidaPersonagem.setMinimum(0);
    barVidaPersonagem.setValue(vidaOriginal);
    barVidaPersonagem.setString(String.valueOf(vidaOriginal));
}
private void resetPersonagemGanhou() {
        txtVidaPersonagem.setText(String.valueOf(vidaOriginal));
        txtAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
        barVidaPersonagem.setMaximum(vidaOriginal);
        barVidaPersonagem.setMinimum(0);
        barVidaPersonagem.setValue(vidaOriginal);
        barVidaPersonagem.setForeground(Color.green);
        barVidaPersonagem.setString(String.valueOf(vidaOriginal));
}

private void resetPersonagemPerdeu() {
     personagem.setVida(vidaOriginal);
     txtVidaPersonagem.setText(String.valueOf(personagem.getVida()));
     barVidaPersonagem.setMaximum(vidaOriginal);
     barVidaPersonagem.setMinimum(0);
     barVidaPersonagem.setValue(vidaOriginal);
     barVidaPersonagem.setForeground(Color.green);
     barVidaPersonagem.setString(String.valueOf(vidaOriginal));
}
public void resetInimigo() {
    nivel1.setVida(vidaInimigo);
    txtVidaInimigo.setText(String.valueOf(vidaInimigo));
    barVidaInimigo.setMaximum(vidaInimigo);
    barVidaInimigo.setMinimum(0);
    barVidaInimigo.setForeground(Color.green);
    barVidaInimigo.setString(String.valueOf(vidaInimigo));
    barVidaInimigo.setValue(vidaInimigo);
}

private void ataquePersonagem() {
   int ataque = gerador.nextInt(20)+1;
    if (ataque >12){
      int ataca = personagem.getAtaque()/2;
      nivel1.setVida(nivel1.getVida()-ataca);
      CaixaDeDialogo.obterinstancia().exibirMensagem("O inimigo perdeu " + ataca + " de vida!", "ATAQUE CRÍTICO", 'i');
        if (nivel1.getVida() >0) {
           txtVidaInimigo.setText(String.valueOf(nivel1.getVida()));
           barVidaInimigo.setValue(nivel1.getVida());
           barVidaInimigo.setString(String.valueOf(nivel1.getVida()));
            if (barVidaInimigo.getValue() < vidaInimigo/2 ) {
                barVidaInimigo.setForeground(Color.YELLOW);
            }
            if (barVidaInimigo.getValue() < vidaInimigo/3 ) {
                barVidaInimigo.setForeground(Color.RED);
            }
        } else {
            voceGanhou();
        }
      }else {
        int ataca = personagem.getAtaque()/3;
        nivel1.setVida(nivel1.getVida()-ataca);
        CaixaDeDialogo.obterinstancia().exibirMensagem("O inimigo perdeu " + ataca + " de vida!", "ATAQUE FRACO", 'i');
        if (nivel1.getVida() > 0) {
        txtVidaInimigo.setText(String.valueOf(nivel1.getVida()));
        barVidaInimigo.setValue(nivel1.getVida());
        barVidaInimigo.setString(String.valueOf(nivel1.getVida()));
          if (barVidaInimigo.getValue() < vidaInimigo/2 ) {
                barVidaInimigo.setForeground(Color.YELLOW);
            }
            if (barVidaInimigo.getValue() < vidaInimigo/3 ) {
                barVidaInimigo.setForeground(Color.RED);
            }
        } else {
        voceGanhou();
        }
    }
}
private void ataqueInimigo() {
   int ataque = gerador.nextInt(20)+1;
    int vida = personagem.getVida();
        if (ataque >12){
          int ataca = nivel1.getAtaque()/2;
          personagem.setVida(personagem.getVida()-ataca);
          CaixaDeDialogo.obterinstancia().exibirMensagem("Você perdeu " + ataca + " de vida!", "ATAQUE CRÍTICO", 'i');
          if (personagem.getVida() > 0) {
            txtVidaPersonagem.setText(String.valueOf(personagem.getVida()));
            barVidaPersonagem.setValue(personagem.getVida());
            barVidaPersonagem.setString(String.valueOf(personagem.getVida()));
            if (barVidaPersonagem.getValue() < vida/2 ) {
                barVidaPersonagem.setForeground(Color.YELLOW);
            }
            if (barVidaPersonagem.getValue() < vida/3 ) {
                barVidaPersonagem.setForeground(Color.RED);
            }
        } else {
            vocePerdeu();
          }
        } else {
            int ataca = nivel1.getAtaque()/3;
            personagem.setVida(personagem.getVida()-ataca);
            CaixaDeDialogo.obterinstancia().exibirMensagem("Você perdeu " + ataca + " de vida!", "ATAQUE FRACO", 'i');
            if (personagem.getVida() > 0) {
            txtVidaPersonagem.setText(String.valueOf(personagem.getVida()));
            barVidaPersonagem.setValue(personagem.getVida());
            barVidaPersonagem.setString(String.valueOf(personagem.getVida()));
            if (barVidaPersonagem.getValue() < vida/2 ) {
                barVidaPersonagem.setForeground(Color.YELLOW);
            }
            if (barVidaPersonagem.getValue() < vida/3 ) {
                barVidaPersonagem.setForeground(Color.RED);
            }
        }else {
                vocePerdeu();
    }
  }
}

public void vocePerdeu() {
  txtVidaPersonagem.setText(String.valueOf(0)); 
  barVidaPersonagem.setValue(0);
  barVidaPersonagem.setString(String.valueOf(0));
  boolean escolha = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Deseja tentar novamente?", "VOCÊ PERDEU!", 'i');
  if (escolha == true) {
     resetPersonagemPerdeu();
     resetInimigo();
  } else {
      System.exit(0);
  }  
}

public void voceGanhou() {
    txtVidaInimigo.setText(String.valueOf(0));
    barVidaInimigo.setValue(0);
    barVidaInimigo.setString(String.valueOf(0));
    nextNivel();
    boolean escolha = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Deseja tentar o próximo nível?", "PARABÉNS VOCÊ GANHOU", 'i');
    if(escolha == true){
        Nivel2 tela = new Nivel2(personagem);
        tela.setVisible(true);
        this.dispose();   
    } else {
        resetPersonagemGanhou();
        resetInimigo();
    }
}

public void nextNivel(){
  personagem.setNivel(2);
  boolean escolha = CaixaDeDialogo.obterinstancia().escolherAumento("Deseja aumentar 10 XP de Vida ou de Atauqe?", "PARABÉNS VOCÊ PASSOU PARA O NÍVEL 2", 'i');  
  if (escolha ==true) {
      updateVida();
  } else {
      updateAtaque();
  }
}
public void updateVida() {
    vidaOriginal = vidaOriginal +10;
    personagem.setVida(vidaOriginal); 
}

public void updateAtaque() {
    personagem.setAtaque(personagem.getAtaque()+10);  
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barVidaInimigo;
    private javax.swing.JProgressBar barVidaPersonagem;
    private javax.swing.JButton btnQuemAtaca;
    private javax.swing.JLabel lblAtaqueInimigo;
    private javax.swing.JLabel lblAtaqueInimigo1;
    private javax.swing.JLabel lblVidaInimigo;
    private javax.swing.JLabel lblVidaInimigo1;
    private javax.swing.JTextField txtAtaqueInimigo;
    private javax.swing.JTextField txtAtaquePersonagem;
    private javax.swing.JTextField txtNomeInimigo;
    private javax.swing.JTextField txtNomePersonagem;
    private javax.swing.JTextField txtVidaInimigo;
    private javax.swing.JTextField txtVidaPersonagem;
    // End of variables declaration//GEN-END:variables
}

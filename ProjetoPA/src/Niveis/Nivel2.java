/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveis;
import Modelos.*;
import Modelos.CaixaDeDialogo;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author robsom.mathei
 */
public class Nivel2 extends javax.swing.JFrame {
Personagem personagem;
int ataca;
int ataque;
int vidaOriginal;
Inimigo nivel2 = new Inimigo();
Random gerador = new Random();    

    /**
     * Creates new form Nivel2
     */
    public Nivel2(Personagem personagem) {
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

        txtNomeInimigo = new javax.swing.JTextField();
        txtNomePersonagem = new javax.swing.JTextField();
        lblAtaqueInimigo = new javax.swing.JLabel();
        lblVidaInimigo = new javax.swing.JLabel();
        lblAtaqueInimigo2 = new javax.swing.JLabel();
        lblVidaInimigo2 = new javax.swing.JLabel();
        txtAtaqueInimigo = new javax.swing.JTextField();
        txtVidaInimigo = new javax.swing.JTextField();
        txtAtaquePersonagem = new javax.swing.JTextField();
        txtVidaPersonagem = new javax.swing.JTextField();
        btnQuemAtaca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtNomeInimigo.setEditable(false);

        txtNomePersonagem.setEditable(false);

        lblAtaqueInimigo.setText("Ataque:");

        lblVidaInimigo.setText("Vida:");

        lblAtaqueInimigo2.setText("Ataque:");

        lblVidaInimigo2.setText("Vida:");

        txtAtaqueInimigo.setEditable(false);

        txtVidaInimigo.setEditable(false);

        txtAtaquePersonagem.setEditable(false);

        txtVidaPersonagem.setEditable(false);

        btnQuemAtaca.setText("Quem ataca?");
        btnQuemAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuemAtacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnQuemAtaca, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtaqueInimigo)
                            .addComponent(lblVidaInimigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVidaInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(txtAtaqueInimigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtaqueInimigo2)
                            .addComponent(lblVidaInimigo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAtaquePersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txtVidaPersonagem))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAtaquePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblVidaInimigo2)
                                .addComponent(txtVidaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAtaqueInimigo)
                                    .addComponent(txtAtaqueInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAtaqueInimigo2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVidaInimigo)
                                    .addComponent(txtVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(66, 66, 66)
                .addComponent(btnQuemAtaca)
                .addContainerGap(129, Short.MAX_VALUE))
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
    nivel2.setNome("Inimigo Nível 2");
    nivel2.setNivel(2);
    nivel2.setVida(100);
    nivel2.setAtaque(gerador.nextInt(60)+1);
    txtNomeInimigo.setText(nivel2.getNome());
    txtAtaqueInimigo.setText(String.valueOf(nivel2.getAtaque()));
    txtVidaInimigo.setText(String.valueOf(nivel2.getVida()));
}

private void mostrarPersonagem(){
    txtNomePersonagem.setText(personagem.getNome());
    txtAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
    txtVidaPersonagem.setText(String.valueOf(personagem.getVida())); 
    vidaOriginal=personagem.getVida();
}

private void resetPersonagemGanhou() {
        txtVidaPersonagem.setText(String.valueOf(vidaOriginal));
        txtAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
}

private void resetPersonagemPerdeu() {
     personagem.setVida(vidaOriginal);
     txtVidaPersonagem.setText(String.valueOf(personagem.getVida()));
}

public void resetInimigo() {
    nivel2.setVida(100);
    txtVidaInimigo.setText(String.valueOf(nivel2.getVida()));
}

private void ataquePersonagem() {
   int ataque = gerador.nextInt(20)+1;
    if (ataque >12){
      int ataca = personagem.getAtaque()/2;
      nivel2.setVida(nivel2.getVida()-ataca);
      CaixaDeDialogo.obterinstancia().exibirMensagem("O inimigo perdeu " + ataca + " de vida!", "ATAQUE CRÍTICO", 'i');
        if (nivel2.getVida() >0) {
           txtVidaInimigo.setText(String.valueOf(nivel2.getVida())); 
        } else {
            voceGanhou();
        }
      }else {
        int ataca = personagem.getAtaque()/3;
        nivel2.setVida(nivel2.getVida()-ataca);
        CaixaDeDialogo.obterinstancia().exibirMensagem("O inimigo perdeu " + ataca + " de vida!", "ATAQUE FRACO", 'i');
        if (nivel2.getVida() > 0) {
        txtVidaInimigo.setText(String.valueOf(nivel2.getVida()));   
        } else {
        voceGanhou();
        }
    }
}

private void ataqueInimigo() {
   int ataque = gerador.nextInt(20)+1;
    int vida = personagem.getVida();
        if (ataque >12){
          int ataca = nivel2.getAtaque()/2;
          personagem.setVida(personagem.getVida()-ataca);
          CaixaDeDialogo.obterinstancia().exibirMensagem("Você perdeu " + ataca + " de vida!", "ATAQUE CRÍTICO", 'i');
          if (personagem.getVida() > 0) {
            txtVidaPersonagem.setText(String.valueOf(personagem.getVida()));
        } else {
            vocePerdeu();
          }
        } else {
            int ataca = nivel2.getAtaque()/3;
            personagem.setVida(personagem.getVida()-ataca);
            CaixaDeDialogo.obterinstancia().exibirMensagem("Você perdeu " + ataca + " de vida!", "ATAQUE FRACO", 'i');
            if (personagem.getVida() > 0) {
            txtVidaPersonagem.setText(String.valueOf(personagem.getVida()));   
        }else {
                vocePerdeu();
    }
  }
}

public void vocePerdeu() {
  txtVidaPersonagem.setText(String.valueOf(0)); 
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
    nextNivel();
    boolean escolha = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Deseja tentar o próximo nível?", "PARABÉNS VOCÊ GANHOU", 'i');
    if(escolha == true){
        Nivel2 tela = new Nivel2(personagem);
        tela.setVisible(true);
        this.dispose();   
    } else {
        resetPersonagemGanhou();
        mostrarInimigo();
    }
}

public void nextNivel(){
  personagem.setNivel(3);
  boolean escolha = CaixaDeDialogo.obterinstancia().escolherAumento("Deseja aumentar 10 XP de Vida ou de Atauqe?", "PARABÉNS VOCÊ PASSOU PARA O NÍVEL 3", 'i');  
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
    private javax.swing.JButton btnQuemAtaca;
    private javax.swing.JLabel lblAtaqueInimigo;
    private javax.swing.JLabel lblAtaqueInimigo2;
    private javax.swing.JLabel lblVidaInimigo;
    private javax.swing.JLabel lblVidaInimigo2;
    private javax.swing.JTextField txtAtaqueInimigo;
    private javax.swing.JTextField txtAtaquePersonagem;
    private javax.swing.JTextField txtNomeInimigo;
    private javax.swing.JTextField txtNomePersonagem;
    private javax.swing.JTextField txtVidaInimigo;
    private javax.swing.JTextField txtVidaPersonagem;
    // End of variables declaration//GEN-END:variables
}

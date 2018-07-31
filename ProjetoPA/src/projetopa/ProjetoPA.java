/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopa;

import Modelos.Conta;
import java.util.HashSet;

/**
 *
 * @author nmpetry
 */
public class ProjetoPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta nmp = new Conta();
        nmp.setName("Natállia");
        nmp.setConta(1000);
        nmp.setSaldo(2500.00);
        nmp.setLimite(3800.00);
        System.out.println(nmp.toString());
        
        Conta rp = new Conta();
        rp.setName("Rodrigo");
        rp.setConta(2000);
        rp.setSaldo(5000.00);
        rp.setLimite(5500.00);
        System.out.println("Conta RP" + rp.toString());
        
        System.out.println("Transferência R$1000 de RP para NMP: ");
        transferencia(1000d, rp, nmp);
    }

    private static void transferencia(double valor, Conta origem, Conta destino) {
        try{
            if ((origem.getSaldo() - valor) <=0 || 
                    (destino.getSaldo() + valor) > destino.getLimite()) {
            System.out.println("Não é possível realizar a transferência");    
            } else {
            origem.debito(valor);
            destino.credito(valor);
            System.out.println(destino.toString());
            System.out.println(origem.toString());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

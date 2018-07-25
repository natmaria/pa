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
        nmp.setSaldo(1500.00);
        System.out.println(nmp.toString());
        
        Conta rp = new Conta();
        rp.setName("Rodrigo");
        rp.setConta(2000);
        rp.setSaldo(5000.00);
        System.out.println(rp.toString());
        
        System.out.println("Transferência R$1000 de RP para NMP: ");
        transferencia(1000d, rp, nmp);
        System.out.println(nmp.toString());
        System.out.println(rp.toString());
    }

    private static void transferencia(double valor, Conta origem, Conta destino) {
        try{
            origem.debito(valor);
            destino.credito(valor);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
    
}

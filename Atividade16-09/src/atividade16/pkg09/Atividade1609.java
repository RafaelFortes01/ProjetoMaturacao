
package atividade16.pkg09;

import javax.swing.JOptionPane;

public class Atividade1609 {

   
    public static void main(String[] args) {
        String usuario, novoUsuario, email, novoEmail;
        int telefone, novoTelefone;
        
        usuario = "Pedro Nascimento";
        email = "pedro.nascimento@gmail.com";
        telefone = 1140028922;
        
        novoUsuario = JOptionPane.showInputDialog("Digite seu nome: ");
        
        if(novoUsuario.equals(usuario)){
            JOptionPane.showMessageDialog(null, "Esse nome já se encontra em uso.");
            
        }else{     
            JOptionPane.showMessageDialog(null, "Nome cadastrado!");
            
            novoEmail = JOptionPane.showInputDialog("Digite seu e-mail: ");
            
            if(novoEmail.equals(email)){
                JOptionPane.showMessageDialog(null, "Esse e-mail já se encontra em uso.");
            }else{
                JOptionPane.showMessageDialog(null, "E-mail cadastrado!");
                
                novoTelefone = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone: "));
                
                if(novoTelefone == telefone){
                    JOptionPane.showMessageDialog(null, "Esse telefone já se encontra em uso.");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Telefone cadastrado!");
                }
            }
        }        

    }
    
}

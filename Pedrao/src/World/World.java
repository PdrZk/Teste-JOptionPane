/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class World {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstNumber =
                JOptionPane.showInputDialog("Digite o primeiro múmero da soma");
        String secondNumber =
                JOptionPane.showInputDialog("Digite o segundo múmero da soma");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int soma= number1 + number2;
        
        JOptionPane.showMessageDialog( null, "A soma é:"+ soma,"Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}

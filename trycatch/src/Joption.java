import javax.swing.*;

public class Joption {


    

    public static void main(String[] args) {
        
        int escolha=0;
        while (escolha != JOptionPane.CANCEL_OPTION ) {
            
        try {
            
            int numero1 =0;
            int numero2 = 0;
            
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número")); 
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número"));


            String[] opcoes = { "Somar", "Subtrair", "Dividir", "Multiplicar" };
             escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha qual operação você deseja",
            "Qual operação você deseja realizar ?",
            JOptionPane.DEFAULT_OPTION,
            
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
            
        
        double total;
        switch (escolha) {
            case 0:
                total = numero1 + numero2; 
                JOptionPane.showMessageDialog(null, "O resultado da soma entre " +numero1+ " + " +numero2+ " é igual a " +total, "Resultado" , 1);

                
                String[] opcoes1 = { "Sim", "Não" };
                int continuar = JOptionPane.showOptionDialog(
                null,
                "Continuar",
                "Deseja continuar ?",
                JOptionPane.DEFAULT_OPTION,
            
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes1,
                opcoes1[0]);

                if (continuar == 1) {
                    escolha = JOptionPane.CANCEL_OPTION;
                }
                
                break;
            case 1:
                total = numero1 - numero2; 
                JOptionPane.showMessageDialog(null, "O resultado da sutração entre " +numero1+ " - " +numero2+ " é igual a " +total, "Resultado" , 1);
                
                break;
            case 2:
                try {
                    total = numero1 / numero2; 
                    JOptionPane.showMessageDialog(null, "O resultado da divisão entre " +numero1+ " / " +numero2+ " é igual a " +total, "Resultado" , 1);
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"undefined");
                    break;
                }
            case 3:
                total = numero1 * numero2; 
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação entre " +numero1+ " * " +numero2+ " é igual a " +total, "Resultado" , 1);
                break;
            default:
                break;
        }        
        
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Campo vazio! Informe um valor e tente novamente.", "Campo vazio", 2);
            break;
        }
    }
  }
}

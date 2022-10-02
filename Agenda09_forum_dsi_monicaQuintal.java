package agenda09_forum_dsi_monicaquintal;

import javax.swing.JOptionPane;
        
public class Agenda09_forum_dsi_monicaQuintal {

    public static void main(String[] args) {
                // declaração de variáveis
        String temperatura; // variável para posteriormente imprimir as tempetaruras diárias
        int temperaturaDiaria[] = new int[7]; // vetor para registro e processamento
        int media = 0; 
        int soma = 0;
        int i;
        temperatura = "As temperaturas mínimas registradas foram: \n";
        
        // entrada de dados
        for (i=0; i<7; i++) { // laço de repetição para ler cada uma das temperaturas
            temperaturaDiaria[i]=Integer.parseInt(JOptionPane.showInputDialog("A temperatura mínima registrada no dia " + (i+1) + " foi:"));
        }
        
        for (i=0; i<7; i++) { // laço de repetição para processamento dos dados armazenados
            temperatura = temperatura + String.valueOf(temperaturaDiaria[i]) + " °C\n";
            soma = (soma + temperaturaDiaria[i]);
            media = soma/7;
            }
        
        //saída de dados
        JOptionPane.showMessageDialog(null, temperatura + "E a temperatura mínima média da semana foi de: " + media + "°C.");
        
    } // fim main
    
} // fim class


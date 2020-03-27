package pilhainterface;

import javax.swing.JOptionPane;

public class PilhaInterface {
    public static void main(String[] args) {
        int opcao = 0, tamanhoDaPilha;
        String placa, marca, modelo;
        int anoDeFabricacao;
        boolean estado = false;
                
        try {
            tamanhoDaPilha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho da PILHA: ", "TAMANHO DA PILHA", JOptionPane.INFORMATION_MESSAGE));
            Pilha p = new Pilha(tamanhoDaPilha);
            do{
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Adicionar um elemento na PILHA\n" + 
                        "2. Tirar um elemento da PILHA\n" + 
                        "3. A PILHA está vázia?\n" +
                        "4. A PILHA está cheia?\n" +
                        "5. Qual elemento está no topo da PILHA?\n" +
                        "6. Tamanho da PILHA?\n" +
                        "7. Sair\n" +
                        "O que deseja fazer?",
                        "MENU DE OPÇÕES", JOptionPane.INFORMATION_MESSAGE));            
            switch(opcao){
                case 1:
                    placa = JOptionPane.showInputDialog(null, "Digite a placa: ", "PLACA", JOptionPane.INFORMATION_MESSAGE);
                    marca = JOptionPane.showInputDialog(null, "Digite a marca: ", "MARCA", JOptionPane.INFORMATION_MESSAGE);
                    modelo = JOptionPane.showInputDialog(null, "Digite o modelo: ", "MODELO", JOptionPane.INFORMATION_MESSAGE);
                    anoDeFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricação: ", "ANO DE FABRICAÇÃO", JOptionPane.INFORMATION_MESSAGE));
                     
                    if(!p.EstaCheio()){
                        p.AdicionarDado(new Veiculo(placa, marca, modelo, anoDeFabricacao));
                    }else JOptionPane.showMessageDialog(null, "A PILHA está cheia, este ultimo elemento não foi adicionado a PILHA!", "PILHA CHEIA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    if(!p.EstaVazio()){
                        JOptionPane.showMessageDialog(null, "O elemento a ser retirado é: " + p.ExcluiUltimoItem(), "DADOS DA PILHA", JOptionPane.INFORMATION_MESSAGE);
                    }else JOptionPane.showMessageDialog(null, "A PILHA está vazia!", "PILHA VAZIA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    if(p.EstaVazio()){
                        JOptionPane.showMessageDialog(null, "A PILHA está vazia!", "PILHA VAZIA", JOptionPane.INFORMATION_MESSAGE);                
                    }else JOptionPane.showMessageDialog(null, "A PILHA não está vazia", "PILHA TEM DADOS", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    if(p.EstaCheio()){
                        JOptionPane.showMessageDialog(null, "A PILHA está cheia!", "PILHA CHEIA", JOptionPane.INFORMATION_MESSAGE);
                    }else JOptionPane.showMessageDialog(null, "A PILHA não está cheia", "VOCÊ PODE ADICIONAR DADOS NA PILHA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    if(!p.EstaVazio()){
                        JOptionPane.showMessageDialog(null, "O elemento que está no topo da PILHA é: " + p.MostrarUltimoItem(), "ULTIMO ITEM DA PILHA", JOptionPane.INFORMATION_MESSAGE);
                    }else JOptionPane.showMessageDialog(null, "A PILHA está vazia!", "PILHA VAZIA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "O tamanho da PILHA é: " + tamanhoDaPilha, "TAMANHO DA PILHA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Aplicação finalizada!", "Fechando a aplicação", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta", "OPÇÃO INCORRETA", JOptionPane.INFORMATION_MESSAGE);
            }
            }while(opcao != 7);
        
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }
    
}

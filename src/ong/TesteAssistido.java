package ong;

/*
*  @author JairRaya
*/

import javax.swing.JOptionPane;
   
public class TesteAssistido {
    
    static Assistido arrayvol[] = new Assistido[10];
    
    public static void ordenaSelectionSort(int tamarray) {
        
        int posmenor, i, j;

        String nome, nomeposmenor;

        Assistido volposmenor = new Assistido();
        Assistido vol = new Assistido();
        Assistido aux = new Assistido();

        for (i = 0; i < tamarray - 1; i++) {
            posmenor = i;
            volposmenor = arrayvol[i];
            nomeposmenor = volposmenor.getNome();
            
            for (j = i + 1; j < tamarray; j++) {
                vol = arrayvol[j];
                nome = vol.getNome();
                
                if (nome.compareTo(nomeposmenor) < 0) {
                    posmenor = j;
                    nomeposmenor = vol.getNome();
                }
                
            }
            
            aux = arrayvol[posmenor];
            arrayvol[posmenor] = arrayvol[i];
            arrayvol[i] = aux;
        }
        
    } //ordenaSelectionSort
    
    public static void ordenaSelectionSortfx(int tamarray) {
        
        int posmenor, i, j;

        String nome, nomeposmenor;

        Assistido volposmenor = new Assistido();
        Assistido vol = new Assistido();
        Assistido aux = new Assistido();

        for (i = 0; i < tamarray - 1; i++) {
            posmenor = i;
            volposmenor = arrayvol[i];
            nomeposmenor = volposmenor.getFaixaet();
            
            for (j = i + 1; j < tamarray; j++) {
                vol = arrayvol[j];
                nome = vol.getFaixaet();
                
                if (nome.compareTo(nomeposmenor) < 0) {
                    posmenor = j;
                    nomeposmenor = vol.getFaixaet();
                }
                
            }
            
            aux = arrayvol[posmenor];
            arrayvol[posmenor] = arrayvol[i];
            arrayvol[i] = aux;
        }
        
    } //ordenaSelectionSort
    
    public static void mostraAssistidos(int tamarray){
        
        int k;        
        Assistido vol;       
        StringBuilder mensagem;

        mensagem = new StringBuilder();
        
        for (k = 0; k < tamarray; k++){
            vol = arrayvol[k];
            
            // mostra os dados usando uma mensagem da classe StringBuilder
            mensagem.append("Nome do(a) voluntário(a): " + vol.getNome() +"\n");
            mensagem.append("Idade: " + vol.getIdade() + "\n");
            mensagem.append("Codigo faixa etária: " + vol.getCodfaixaet() + "\n");
            mensagem.append("Faixa etária: " + vol.getFaixaet() + "\n\n");
        }
        
        JOptionPane.showMessageDialog(null,mensagem, "Voluntários sem ordenação:", JOptionPane.INFORMATION_MESSAGE);
        
    }
      
    
    public static void main (String[] args){
            
        Assistido vol;
        int k, nrovol;
        String s, saida;
        StringBuilder mensagem;
        int idadevol;
        
        for (;;){
            s = JOptionPane.showInputDialog("Quantos voluntários serão cadastrados na ONG (1 a " + arrayvol.length + ")? ");
            try {
                nrovol = Integer.parseInt(s);

                if (nrovol < 1 || nrovol > arrayvol.length){
                    JOptionPane.showMessageDialog(null,"Valor inválido. Digíte um número entre 1 e " + arrayvol.length + ". ", 
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                
                else
                    break;
                
            }
            
            catch (NumberFormatException erro) {
                saida = "Não é possível converter a string " + s + " para o tipo int.\n";
                JOptionPane.showMessageDialog(null,saida,"Exceção",JOptionPane.ERROR_MESSAGE);
                continue;
                
            }
            
        }//for;;
        
        System.out.println(" Qauntidade de Voluntários: " + s);
        
        for (k = 0; k < nrovol; k++){
            vol = new Assistido();
            
            //pede e lê os dados de um funcionario
            vol.setNome(JOptionPane.showInputDialog("Qual é o nome do voluntário(a) " + (k + 1) + "?"));
            
            
            for (;;){
                //validar idade com try catch
                s = JOptionPane.showInputDialog("Qual é a idade do voluntário(a) " + ( k + 1) + "?");
            
                try{
                    idadevol=Integer.parseInt(s);

                    if  (idadevol <= 0 || idadevol >= 121 ){
                            JOptionPane.showMessageDialog(null,"Valor inválido. Digíte um número entre 1 e 120  ", 
                                    "Erro", JOptionPane.ERROR_MESSAGE);
                            continue;
                    }

                    else
                        break;

                }

                catch (NumberFormatException erro) {
                    saida = "Não é possível converter a string " + s + " para o tipo int.\n";
                    JOptionPane.showMessageDialog(null,saida,"Exceção",JOptionPane.ERROR_MESSAGE);
                    continue;

                }
            
            }
        
        vol.setIdade(idadevol);
        vol.indicarCodfaixaet(idadevol);
        vol.indicarFaixaet(idadevol);
            
        //armazena os dados lidos no vetor de objetos arrayfunc
        arrayvol[k] = vol;
        
        }
        
        vol = new Assistido();
        
        mostraAssistidos(nrovol);
        
        ordenaSelectionSort(nrovol);
        
        
        mensagem = new StringBuilder();
        
        for (k = 0; k < nrovol; k++){
            vol = arrayvol[k];
       
            
            // mostra os dados usando uma mensagem da classe StringBuilder
            mensagem.append("Nome do(a) voluntário(a): " + vol.getNome() +"\n");
            mensagem.append("Idade: " + vol.getIdade() + "\n");
            mensagem.append("Codigo faixa etária: " + vol.getCodfaixaet() + "\n");
            mensagem.append("Faixa etária: " + vol.getFaixaet() + "\n\n");
        }
        
        JOptionPane.showMessageDialog(null,mensagem, "Voluntários ordendos alfabeticamente por nome:", JOptionPane.INFORMATION_MESSAGE);
        
        ordenaSelectionSortfx(nrovol);
        
        mensagem = new StringBuilder();
        
        for (k = 0; k < nrovol; k++){
            vol = arrayvol[k];
       
            
            // mostra os dados usando uma mensagem da classe StringBuilder
            mensagem.append("Nome do(a) voluntário(a): " + vol.getNome() +"\n");
            mensagem.append("Idade: " + vol.getIdade() + "\n");
            mensagem.append("Codigo faixa etária: " + vol.getCodfaixaet() + "\n");
            mensagem.append("Faixa etária: " + vol.getFaixaet() + "\n\n");
        }
        
        JOptionPane.showMessageDialog(null,mensagem, "Voluntários ordendos alfabeticamente por Faixa etaria:", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//main
    
}//TesteAssistido
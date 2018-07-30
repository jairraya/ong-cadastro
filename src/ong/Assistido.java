package ong;

/**
 *
 * @author JairRaya
 */

public class Assistido {
    
    // atributos ou variáveis privadas da classe. Somente podem ser usadas na classe.    
    private String nome;
    private int idade;
    private int codfaixaet;
    private String faixaet;
        
    public Assistido(){
    }
      
    public void setNome(String nome){
        this.nome = nome;    
    }
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;         
    }
    public int getIdade (){
        return idade;   
    }
    
    public void setCodfaixaet(int codfaixaet){
        this.codfaixaet = codfaixaet;       
    }  
    public int getCodfaixaet(){
        return codfaixaet;     
    }
      
    public String getFaixaet(){
        return faixaet;
    }
  
    //private String faixaet;
          
    public void indicarFaixaet(int idade ){
          
        if (idade >= 1 && idade <= 12){
            this.faixaet="Criança";
        }        
          
        else if (idade >= 13 && idade <= 18){
            this.faixaet="Adolescente";
        }
        
        else if (idade >= 19 && idade <= 30){
            this.faixaet="Jovem";        
        }
        
        else if (idade >= 31 && idade <= 70){
            this.faixaet="Maduro";         
        }
        
        else if (idade >= 71 && idade <= 120){
            this.faixaet= "Idoso";
        }       
                  
    }
    
    public void indicarCodfaixaet(int idade ){
          
        if (idade >= 1 && idade <= 12){
            this.codfaixaet = 1;        
        }  
        
        else if (idade >= 13 && idade <= 18){
            this.codfaixaet = 2;
        }
        
        else if (idade >= 19 && idade <= 30){
            this.codfaixaet = 3;        
        } 
        
        else if (idade >= 31 && idade <= 70){
            this.codfaixaet = 4;               
        }
        
        else if (idade >= 71 && idade <= 120){
            this.codfaixaet = 5;          
        }        
                  
    }
          
}
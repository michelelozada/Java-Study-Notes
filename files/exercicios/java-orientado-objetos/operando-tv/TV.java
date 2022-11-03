package github.repositorio.estudo.java;

public class TV {
	
	// Setando as configurações default da TV
    public boolean ligada = false;
    public int canal = 12;
    public int volume = 20;
    
    
	// Criação dos demais métodos para operar a TV
    public void ligarTV() {
        ligada = true;
    }
    
    public void desligarTV() {
        ligada = false;
    }
    
    public void aumentarVolume() {
        volume += 2;
    }

    public void diminuirVolume() {
        volume -= 2;
    }  
    
    public void aumentarCanal() {
        canal ++;     
    }

    public void dimimuirCanal() {
        canal --;   
    }    

    public void escolherCanal(int canal) {
        this.canal = canal;
    }
}
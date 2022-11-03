package github.repositorio.estudo.java;

/* (Do Bootcamp Java Beginners da DIO) Crie uma classe chamada TV e vá apresentando seus estados, à medida que vai determinando diferentes comportamentos para ela */


public class Principal{
	public static void main(String[] args) {
		TV tv1 = new TV();
		
		System.out.println(" - Status inicial da TV -");
		String statusTV = (tv1.ligada == true) ? "Sim" : "Não";
		System.out.println("Está ligada? " + statusTV + "\n");
				
		tv1.ligarTV();
		System.out.println("Minha ação: liguei a TV" + "\n");
	  
		System.out.println("- Status da TV agora -");
		statusTV = (tv1.ligada == true) ? "Sim" : "Não";
		System.out.println("Está ligada? " + statusTV);
		System.out.println("Canal atual: " + tv1.canal); 
		System.out.println("Volume: " + tv1.volume + "\n");
	   
		tv1.diminuirVolume();
		tv1.diminuirVolume();
		tv1.escolherCanal(3);
		System.out.println("Minhas ações: é tarde, então diminui o volume e mudei para o canal 2" + "\n");
						
		System.out.println("- Status da TV agora -");
		System.out.println("Canal atual: " + tv1.canal); 
		System.out.println("Volume: " + tv1.volume + "\n");
						
		tv1.dimimuirCanal();
		System.out.println("Minhas ações: oops, digitei o canal errado e precisei diminuir um canal apenas"+ "\n");
										
		System.out.println("- Status da TV agora -");
		System.out.println("Canal atual: " + tv1.canal + "\n"); 
		
		tv1.desligarTV();
		System.out.println("Minha ação: lembrei que tenho que acordar cedo ... então, tchau!\n");
					
		System.out.println("- Status da TV agora -");
		statusTV = (tv1.ligada == true) ? "Sim" : "Não";
		System.out.println("Está ligada? " + statusTV);        
	}
}

/*
+--------------------------------------------------------------------------------+
| - Status inicial da TV -                                                       |
| Está ligada? Não                                                               |
+--------------------------------------------------------------------------------+
| Minha ação: liguei a TV                                                        |
| - Status da TV agora -                                                         |
| Está ligada? Sim                                                               |
| Canal atual: 12                                                                |
| Volume: 20                                                                     |
+--------------------------------------------------------------------------------+
| Minhas ações: é tarde, então diminuí o volume e mudei para o canal 2           |
| - Status da TV agora -                                                         |
| Canal atual: 3                                                                 |
| Volume: 16                                                                     |
+--------------------------------------------------------------------------------+
| Minhas ações: oops, digitei o canal errado e precisei diminuir um canal apenas |
| - Status da TV agora -                                                         |
| Canal atual: 2                                                                 |
+--------------------------------------------------------------------------------+
| Minha ação: lembrei que tenho que acordar cedo ... então, tchau!               |
| - Status da TV agora -                                                         |
| Está ligada? Não                                                               |
+--------------------------------------------------------------------------------+
*/
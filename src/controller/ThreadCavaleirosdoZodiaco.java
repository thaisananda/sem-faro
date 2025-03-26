package controller;

public class ThreadCavaleirosdoZodiaco extends Thread {
	
	private int idCavaleiro;
	private static int posTocha; //Chegada na tocha
	private static int posPedra;
	private static int posPorta;
	private static int posChegada;
	
	public ThreadCavaleirosdoZodiaco(int idCavaleiro) {
		this.idCavaleiro = idCavaleiro;

	}
	
	
	@Override
	public void run() {
		cavaleiroAndando();
		cavaleiroTocha();
		cavaleiroPedra();
		cavaleiroPorta();
		
	}

	private void cavaleiroAndando() {
		int deslocamento = (int)((Math.random() * 3) + 2);
		int distanciaPercorrida = 0;
		int distanciaTotal = 2000;
		int distanciaTocha = 500;
		int distanciaPedra = 1500;
		int tempo = 50;
		
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("#"+idCavaleiro+" já andou " + distanciaPercorrida);
		}
		posChegada++;
		if (posChegada == 1) {
			System.out.println("#"+idCavaleiro + "foi o que pegou a tocha");
		}
	}

	private void cavaleiroPorta() {
		// TODO Auto-generated method stub
		
	}


	private void cavaleiroPedra() {
		// TODO Auto-generated method stub
		
	}


	private void cavaleiroTocha() {
		System.out.println("#"+idCavaleiro+" pegou a tocha");
		//int tempo = (int)(Math.random() * )
		
	}


}

package com.zoo.us;

class Murcielago extends Mamifero {
	protected int niveldeenergia=300;
	
	public void volar() {
		System.out.println("cri cri cri");
		niveldeenergia = niveldeenergia - 50;
	}
	public void comerhumanos() {
		System.out.println("Esperen ese un murciela... ooh no por favor no");
		niveldeenergia = niveldeenergia + 25;
		
	}
	
	public void atacarpueblo() {
		System.out.println("Auxiliooo, es bat pero no man");
		niveldeenergia = niveldeenergia - 100;		

	}
	
	public int Mostrarenergia() {
		return niveldeenergia;
	}

	

}

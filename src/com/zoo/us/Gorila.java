package com.zoo.us;

class Gorila extends Mamifero {
	
	public void lanzaralgo() {
		System.out.println("El gorila acaba de lanzar un barril ¡Cuidado!");
		niveldeenergia = niveldeenergia - 5;
	}
	public void comerbananas() {
		System.out.println("El gorila acaba de comer una banana, esta feliz y con energia");
		niveldeenergia = niveldeenergia + 10;
		
	}
	
	public void escalar() {
		System.out.println("El gorila acaba de escalar el arbol, esta feliz y agotado");
		niveldeenergia = niveldeenergia - 10;
		
	}
	

}

//

package edu.elsmancs.domain.kata_dni;

class Asignador {
	
	private int dni = 0;
	private int key = 0;
	
	Asignador (int dni){
		this.dni = dni;
	}
	
	void set_key() {
		this.key = this.dni % 23;
	}
	
	int get_key() {
		return this.key;
	}
}

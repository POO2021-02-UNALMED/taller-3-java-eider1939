package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTv;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		canal=1;
		volumen=1;
		precio=500;
        numTv++;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca mar) {
		marca=mar;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int can) {
		if (can >= 1 && can <= 120 && estado == true) {
			canal = can;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int pre) {
		canal=pre;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		if (vol >= 0 && vol <= 7 && estado == true) {
			volumen=vol;
		}
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control cont) {
		control=cont;		
	}
	public int getNumTV() {
		return numTv;
	}
	public void setNumTV(int num) {
		numTv=num;
	}
	public void turnOn(){
		estado = true;
	}
	public void turnOff(){
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (canal <= 120 && estado == true) {
			canal ++;
		}
	}
	public void canalDown() {
		if (canal >= 1 && estado == true) {
			canal --;
		}
	}
	public void volumenUp() {
		if (volumen <= 7 && estado == true) {
			volumen ++;
		}
	}
	public void volumenDown() {
		if (volumen >= 0 && estado == true) {
			volumen --;
		}
	}
}

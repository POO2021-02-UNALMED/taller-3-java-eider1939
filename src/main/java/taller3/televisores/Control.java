package tallere3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.setTv(tv);
		tv.setControl(this);
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() { 
		tv.volumenDown();
	}
	public void setCanal(int cana) {
		tv.setCanal(cana);
	}
	public TV getTv() {
		return tv;
	}
	public void setTv(TV ttv) {
		tv=ttv;
        this.enlazar(tvv);
	}
}


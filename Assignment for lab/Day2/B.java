package Day2;

public class B extends A
{
	int s;
	int t;
	int u;
	public B(int p, int q, int r, int s, int t, int u) {
		super(p, q, r);
		this.s = s;
		this.t = t;
		this.u = u;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public int getU() {
		return u;
	}
	public void setU(int u) {
		this.u = u;
	}
	
}

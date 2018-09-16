package firstproject;

import java.util.Date;
import java.util.Vector;

public class First {

	private int a ;
	private Vector<Integer> b ;
	private String c ;
	private Date d ;
	private StringBuffer e ;
	
	public First(int a, Vector<Integer> b, String c, Date d, StringBuffer e) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Vector<Integer> getB() {
		return b;
	}

	public void setB(Vector<Integer> b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public StringBuffer getE() {
		return e;
	}

	public void setE(StringBuffer e) {
		this.e = e;
	}

	public static void main(String[] args) {
	}

}

package differential;

public class differential {

	public static void main(String[] args) {
		
		
		
		
		double t = 0;
		double dt = 1;
		double k = 0.1;
		double xn = 0.01;
		double dx = 0;
		
		
		do {
			t = t + dt;
			dx = k * xn * ( 1 - xn ) * dt;
			xn = xn + dx;
			
			System.out.println( t + "\t" + xn);//kein Plan wie ich das auf eine x- u. y-achse packen soll, daher in Tabellenform
		
			}
			while(t < 100);
	}

}


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseStatic ts1 = 
				new ClasseStatic();  
		ClasseStatic ts2 = 
				new ClasseStatic();
		// 47 26
		System.out.println(ts1.i + " " + ts1.j);
		// 47 26
		System.out.println(ts2.i + " " + ts2.j);
		System.out.println("************************");
		ts1.i++;
		ts1.j++;
		// 48 27
		System.out.println(ts1.i + " " + ts1.j);
		// 48 26
		System.out.println(ts2.i + " " + ts2.j);
		/*ClasseStatic.i = 100;
		System.out.println(ts1.i); // 100
		System.out.println(ts2.i); // 100*/

		double valor = Math.pow(4, 2);
		
		
	}

}

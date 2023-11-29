public class Zoo {
	//Dimensione del vettore
	private final static int DIM=9;
	public static void main(String[] args) {
		// Questo è il metodo principale dello zoo.
		Animale[] zoo=new Animale[DIM];
		popolaZoo(zoo);
		//Facciamo parlare gli animali
		for (int i=0; i<DIM; i++) {
			//TODO: Completa metodo presentati e testa il programma
			System.out.println(zoo[i].presentati());
		}
	}
	private static void popolaZoo(Animale[] zoo) {
		//Assegno al vettore di animali le caratteristiche
		zoo[0]=new Mucca("Lola", 4, 800.00f, 135);
		zoo[1]=new Zebra("Roberto", 4, 350.00f, 110);
		zoo[2]=new Pettirosso("Gilberto", 2, 0.30f, 10);
		zoo[3]=new Gufo("Angela", 2, 3.00f, 80);
		zoo[4]=new Salmone("Emanuela", 10.00f, 73);
		zoo[5]=new Acciuga("Lilla", 0.40f, 12);
		zoo[6]=new Polpo("Fernando", 8, 8.00f, 12);
		zoo[7]=new Lumaca("Pungente", 0.05f, 8);
		zoo[8]=new Formica("Lillo", 6, 0.01f, 1);
	}
}
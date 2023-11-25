package zoo;
public class Zoo {
	private final static int DIM = 2;
	public static void main(String[] args) {
		// Questo è il metodo principale dello zoo.
		Animale[] zoo = new Animale[DIM];
		popolaZoo(zoo);
		//Facciamo parlare gli animali
		for (int i=0; i<DIM; i++) {
			zoo[i].presentati();
		}
	}
	private static void popolaZoo(Animale[] zoo) {

		zoo[0] = new Mucca("Lola");
		//zoo[1] = new Zebra("Zeb");
	}
}
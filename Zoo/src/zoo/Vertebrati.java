package zoo;

public class Vertebrati extends Animale{
	//R=rettili U=Uccelli P=Pesci M=mammiferi
	public char specie;
	public Vertebrati(String nome, boolean ossa,char specie) {
		super(nome, ossa=true);
		this.specie=specie;
	}

}

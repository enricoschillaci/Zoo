package zoo;

public class Animale {
	public String nome;
	public boolean ossa;
	
	public Animale(String nome, boolean ossa, char tipoVert, char tipoInvert) {
		this.nome = nome;
		this.ossa = ossa;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isOssa() {
		return ossa;
	}
	public void setOssa(boolean ossa) {
		this.ossa = ossa;
	}


	public void presentati() {
		System.out.println("Ciao!\nIo sono"+this.nome);
	}
}

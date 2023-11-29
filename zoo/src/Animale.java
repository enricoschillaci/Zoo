public class Animale {
    //Attributi
    protected String nome;
    protected int nZampe;
    protected float peso;
    protected int altezza;
    protected String alimentazione;    //Carnivoro, erbivoro, onnivoro
    protected boolean isDiurno;        //Animale che svolge le azioni quotidiane di giorno
    protected String habitat;
    protected String specie;
    protected boolean isOssa;
    protected boolean isAllatta;
    protected boolean isPartorisce;
    protected boolean isOviperi;

    //Metodi
    public String presentati() {
		//Stringa di presentazione
		String s="";
         
		//Stringhe di appoggio
		String sDiurno="notturno.";
        String sOssa=" e: non ho le ossa, ";
        String sAllatta="non allatto, ";
        String sPartorisce="non partorisco e ";
		String sOviperi="non faccio le uova.";
          
        //Controllo se reinizializzare o meno le stringhe di appoggio
        if(isOssa==true) {
			sOssa=" e: ho le ossa, ";
        }
        if(isAllatta==true) {
			sAllatta="allatto, ";
        }
        if(isPartorisce==true) {
			sPartorisce="partorisco e ";
		}
        if(isOviperi==true) {
			sOviperi="faccio le uova.";
		}
        if(isDiurno==true) {
     			sDiurno="diurno.";
     		}
	
	    //Compongo la stringa di presentazione dell'animale
        if(nZampe>0) {
            s=s+"Mi chiamo "+nome+", ho "+nZampe+" zampe e peso "+peso+" kg. Sono alto "+altezza
            +" cm e la mia alimentazione e' "+alimentazione+sOssa+sAllatta+sPartorisce+sOviperi
            +"\nsono un/a "+specie+" ed il mio habitat e': "+habitat+". Sono principalmente un animale "+sDiurno+"\n";
        } else if(nZampe==0) {
            s=s+"Mi chiamo "+nome+", peso "+peso+" kg. Sono alto "+altezza
            +" cm e la mia alimentazione e' "+alimentazione+sOssa+sAllatta+sPartorisce+sOviperi
            +"\nsono un/a "+specie+" ed il mio habitat e': "+habitat+". Sono principalmente un animale "+sDiurno+"\n";
        }

		//Ritorno la stringa di presentazione
		return s;
    }
}
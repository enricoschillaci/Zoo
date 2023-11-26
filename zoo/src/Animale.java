public class Animale {
     //Attributi
     protected String nome;
     protected int nZampe;
     protected float peso;
     protected int altezza;
     protected String alimentazione;    //Carnivoro, erbivoro, onnivoro
     protected boolean isDiurno;        //Animale che svolge le azioni quotidiane di giorno
     protected String abitat;
     protected boolean isOssa;
     protected boolean isAllatta;
     protected boolean isPartorisce;
     protected boolean isOviperi;

     //Metodi
     /*public String presentati() {
          //Stringa di presentazione
          String s="";
          
          //Stringhe di appoggio
          String sOssa=" e: non ho le ossa, ";
          String sAllatta=" non allatto e ";
          String sPartorisce=" non partorisco.";
          
          //Controllo se reinizializzare o meno le stringhe di appoggio
          if((isOssa==true) && (isAllatta==true) && (isPartorisce==true)) {
               sOssa=" e: ho le ossa, ";
               sAllatta=" allatto e ";
               sPartorisce=" partorisco.";
          }

          //Compongo la stringa di presentazione dell'animale
          s=s+"Mi chiamo "+nome+", ho "+nZampe+" zampe e peso "+peso+" kg. Sono alto "+altezza
          +" cm e la mia alimentazione e' "+alimentazione+sOssa+sAllatta+sPartorisce;

          //Ritorno la stringa di presentazione
          return s;
     }*/
}
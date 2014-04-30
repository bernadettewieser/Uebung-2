
package u2_1310653379_Aufgabe_4und5;


public class Fahrzeug {
    
    private short Reifen;
    private short PS;
    private short Tueren;
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl;
    
    
    public Fahrzeug(short reifen,short ps, short tueren){
        Reifen=reifen; 
        PS=ps;
        Tueren=tueren;
        this.Gestartet=false;
        this.Geschwindigkeit=0;
        
    }
    void starten(){
        Gestartet = true;
    }
    void stoppen(){
        Gestartet = false;   
    }
    
    void beschleunigen(short erhöhteGeschwindigkeit){
        if(Gestartet&&Geschwindigkeit+erhöhteGeschwindigkeit<250)
        Geschwindigkeit+= erhöhteGeschwindigkeit;
         else if (Gestartet && erhöhteGeschwindigkeit + Geschwindigkeit > 250) {
            Geschwindigkeit = 250;
        }
        else {
            System.out.println("Fahrzeug muss gestartet sein");
    }
    }
            
    void bremsen(short neueGeschwindigkeit){
        if (Gestartet && Geschwindigkeit - neueGeschwindigkeit > 0) {
            Geschwindigkeit -= neueGeschwindigkeit; 
        }
        else if (Gestartet && Geschwindigkeit - neueGeschwindigkeit< 0) {
            Geschwindigkeit = 0;
        }
        else {
            System.out.println("Fahrzeug muss gestartet sein");
        } 
     }
    
  
    public short getReifen() {
        return Reifen;
    }

    public void setReifen(short Reifen) {
        this.Reifen = Reifen;
    }


    public short getPS() {
        return PS;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public short getTueren() {
        return Tueren;
    }

    public void setTueren(short Tueren) {
        this.Tueren = Tueren;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet) {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public static void setAnzahl(int Anzahl) {
        Fahrzeug.Anzahl = Anzahl;
    }
    
}
    


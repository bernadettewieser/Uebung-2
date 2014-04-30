

package u2_1310653379_Aufgabe_4und5;


public class Auto extends Fahrzeug implements Comparable<Auto> {
    private boolean Klimaanlage;
    private short Airbags;
    private color farbe;
    
    public enum color{
        silver,red, black, blue,white
    }
    
    
    public Auto(short reifen, short ps, short tueren,short airbags, color farbe) {
        super(reifen, ps, tueren);
        this.Klimaanlage = false;
        this.farbe = farbe;
        Airbags = airbags;
        
    }

    public Auto(color farbe, short reifen, short ps, short tueren) {
        super(reifen, ps, tueren);
        this.farbe = color.white;
    }

    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }
        
    @Override
    public int compareTo(Auto a){
        if(this.getPS() < a.getPS())
        {
            return -1;
        }
        else if(this.getPS()>a.getPS())
        {
            return 1;
        }
        else
        {
             return 0;
        }
    }


    void klimaanlageAn() {
        if(Klimaanlage){
            setKlimaanlage(true);
        }else{
            System.out.println("Die Klimaanlage läuft bereits");
        }
    }
    void klimaanlageAus(){
        if(!Klimaanlage){
            setKlimaanlage(true);
        }
    }

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }
    //@Override
      //public String toString() {
      //return "Mein Auto hat "+ this.getPS() + " PS und fährt mit "+ this.getGeschwindigkeit() + " km/h";
    //}

   }
   



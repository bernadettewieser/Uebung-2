
package u2_1310653379_Aufgabe_3;

public class Mensch {
    String Vorname;
    String Nachname;
    int Alter;

    public Mensch(String _Vorname, String _Nachname, int _Alter) {
        Vorname = _Vorname;
        Nachname = _Nachname;
        Alter = _Alter;
    }
   public void Status(){
       System.out.println("Es handelt sich um einen Menschen namens "+Vorname+" "+Nachname+", der "+Alter+" Jahre alt ist.");
   } 
    
}

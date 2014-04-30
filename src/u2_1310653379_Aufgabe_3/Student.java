

package u2_1310653379_Aufgabe_3;


public class Student extends Mensch {
    String Matrikelnummer;
    String Studiengang;

    public Student(String _Vorname, String _Nachname, int _Alter, String _Matrikelnummer, String _Studiengang) {
        super(_Vorname, _Nachname, _Alter);
        Matrikelnummer = _Matrikelnummer;
        Studiengang = _Studiengang;
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um einen Studenten namens "+Vorname+" "+Nachname+", der "+Alter+" Jahre alt ist, die Matrikelnummer "+Matrikelnummer+" hat und "+Studiengang+" studiert.");
    }
    
}

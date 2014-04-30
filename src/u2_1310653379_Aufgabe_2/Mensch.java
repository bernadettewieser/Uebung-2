

package u2_1310653379_Aufgabe_2;


public class Mensch extends Säugetier {

    public Mensch(String _Name, int _Alter, String _Geschlecht) {
        super(_Name, _Alter, _Geschlecht);
    }

    @Override
    public String printAll() {
        return Name+"#"+Alter+"#"+Geschlecht;
        }

    }
    


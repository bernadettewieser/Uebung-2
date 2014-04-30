
package u2_1310653379_Aufgabe_4und5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u2_1310653379_Aufgabe_4und5.Auto.color;


public class Aufruf {
public static void main(String[] args) {
       
       
        Auto citroen = new Auto ((short)4, (short)100, (short)5, (short)4, color.black);
        Auto mini = new Auto ((short)4, (short)90, (short)5, (short)8, color.blue);
        Auto vw = new Auto ((short)4, (short)150, (short)5, (short)4, color.red);
        Auto audi = new Auto ((short)4,(short)180, (short)5, (short)8,color.silver);
        Auto suzuki = new Auto ((short)4, (short)110, (short)5, (short)8, color.white);
        
        List<Auto> autos = new ArrayList<>();
        autos.add(citroen);
        autos.add(mini);
        autos.add(vw);
        autos.add(audi);
        autos.add(suzuki);
        
        Collections.sort(autos);
        for(Auto x:autos){
            System.out.println(x.getPS());
        }
        
    
}
}

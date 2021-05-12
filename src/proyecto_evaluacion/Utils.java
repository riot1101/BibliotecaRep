package proyecto_evaluacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

    public static String readString() {
        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);

            return br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "";

    }

    public static int readUnsignedInt() {

        int dato = 0;
        try {
            dato = Integer.parseInt(readString());
            dato = Math.abs(dato); //abs calcula el valor absoluto en un valor entero

        } catch (Exception ex) {

            dato = -1;

        }
        return dato;

    }

}

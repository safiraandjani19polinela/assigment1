import com.enigma.model.Robot;
import com.enigma.model.Directions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    //BARIS 9-14 : UNTUK MENGINPUTKAN TITIK KOORDINAT,14 UNTUK MEMBUAT TITIK DAN ARAH//
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input koordinat (x,y) : ");
        String koordinat = dataIn.readLine();
        String[] xy = koordinat.split(",");
        Robot ultraman = new Robot(Integer.parseInt(xy[0]),Integer.parseInt(xy[1]), Directions.valueOf(xy[2]));
        // BARIS 16-19 UNTUK PERINTAH ARAH//
        System.out.print("Input Perintah :");
        String commands = dataIn.readLine();
        ultraman.commands(commands);
        ultraman.run();
        System.out.println(ultraman.print());

    }
}
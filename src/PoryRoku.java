/**
 * Created by caeruleum on 10.05.2017.
*/
import javax.swing.*;

public class PoryRoku {
enum Pora {ZIMA, WIOSNA, LATO, JESIEN};


public static String opisz (Pora p){
    int nr= p.ordinal() +1;
    String txt = p + " (ma numer" +nr +" )";
    if (p == Pora.ZIMA) return txt + " - pada snieg.";
    if (p == Pora.WIOSNA) return txt + " - kwitnie bez.";
    if (p == Pora.LATO) return txt + " - jest cieplo.";
    if (p == Pora.JESIEN) return txt + " - pada deszcz.";
    else
    return "To niemozliwe";
}

public static void main(String[] args){


    String nazwa = JOptionPane.showInputDialog("Podaj pore roku:");
    Pora p =Pora.valueOf(nazwa);
    JOptionPane.showMessageDialog(null, opisz(p));

}
}

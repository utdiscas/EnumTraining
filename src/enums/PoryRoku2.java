package enums;
import javax.swing.*;

import static enums.PoraRoku.*;
/**
 * Created by caeruleum on 10.05.2017.
 */
public class PoryRoku2 {

    public static void main(String[] args){
        String nazwa= JOptionPane.showInputDialog("Podaj pore roku");
    PoraRoku p = valueOf(nazwa);
    //System.out.println
        JOptionPane.showMessageDialog(null, p + "trwa miesiecy" + p.getLiczbaMies() + " " + p.getOpis());
        JOptionPane.showMessageDialog(null,"fsfsfs haha");
    }

}

package enums;

/**
 * Created by caeruleum on 10.05.2017.
 */
public enum PoraRoku {
ZIMA("uhuha uhuha nasza zima zla", 6),WIOSNA("wiosna wiosna wiosna ah to Ty",2);

private String opis;
private int liczbaMies;

private PoraRoku(String opis, int liczbaMies){
this.opis=opis;
this.liczbaMies=liczbaMies;
}

public String getOpis() {
    return opis;
}

public int getLiczbaMies()
{
    return liczbaMies;
}

}

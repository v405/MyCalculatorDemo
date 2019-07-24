package hbcu.stay.ready.ttime;
import hbcu.stay.ready.ttime.ScientificCalculator;

public class Display {

    //Scientific Display Functions

    String[] displayModeList = {"binary", "octal", "decimal", "hexadecimal"};
    String displayMode = "binary";
    String unitsMode = "Degrees";

    int i = 0;
    public void switchDisplayMode(){
        i ++;
        if (i == 4){
            i = 0;
        }
        displayMode = displayModeList[i];
    }

    public void switchDisplayMode(String mode){
        displayMode = mode;
    }

    public void switchUnitsMode(){
        if (unitsMode == "Degrees"){
            unitsMode = "Radians";
        }
        else{
            unitsMode = "Degrees";
        }

    }

}

package pckg_arr_2;

import pckg_arr_1.AUX_CLS;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrPomocna {

    public static Float[] getUserDefinedTemp(Scanner scanner, int numElements){
        Float[] temps=new Float[numElements];
        for(int k=0; k<numElements;k++){
            System.out.println("Unesite temperaturu:\t");
            temps[k]=scanner.nextFloat();
        }
        return temps;
    }

    public static Float[] genRandomTemp(int numTemps){
        Float MAXI=39f;
        Float MINI=-10f;
        Float[] temps=new Float[numTemps];
        for(int k=0; k<numTemps;k++){
            temps[k]= ThreadLocalRandom.current().nextFloat(MINI,MAXI);
        }
        return temps;
    }

    public static float avgTemp(Float[] temps){
        float acumSum=0;
        for(Float el:temps){
            acumSum+=el;
        }
        return acumSum/temps.length;
    }

    public static void aboveBelow(Float[] temps){
        int above=0;
        int below=0;
        int eq=0;

        float avg=avgTemp(temps);
        for (float el:temps) {
            if (el>avg){
                above ++;
            } else if (el<avg){
                below++;
            } else {
                eq++;
            }
            AUX_CLS.printElementsFromArr(temps);
            System.out.println("Above avg temp: "+above);
            System.out.println("Below avg temp: "+below);
            System.out.println("Equal to avg temp: "+eq);
        }
    }


}

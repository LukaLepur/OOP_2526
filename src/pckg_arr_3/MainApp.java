package pckg_arr_3;

import pckg_arr_1.AUX_CLS;

public class MainApp {
    public static void main(String[] args) {
        float[][] vals=new float[2][2];
        Float[][] dvals={{20f,10f}, {50f,40f}, {340f,240f}, {120f,100f}};
        int fst=dvals[0].length;
        int all=dvals.length;
        System.out.println(all);
        System.out.println(fst);
        //POM_ARR.print2DArrFloat(dvals);
        Float[] profs=POM_ARR.calcProfit(dvals);
        AUX_CLS.printElementsFromArr(profs);
        System.out.println(POM_ARR.avgProfit(profs));

    }
}

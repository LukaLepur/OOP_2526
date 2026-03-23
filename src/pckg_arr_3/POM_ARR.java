package pckg_arr_3;

public class POM_ARR {
    public static void print2DArrFloat(float[][] fArr){
        for(int row=0;row<fArr.length;row++){
            for (int col=0; col<fArr[0].length;col++){
                System.out.println(fArr[row][col]);
            }
            System.out.println();
        }
    }

    public static Float[] calcProfit(Float[][] priRash){
        Float[] profit=new Float[priRash.length];
        for (int k=0;k<profit.length;k++){
            profit[k]=priRash[k][0]-priRash[k][1];
        }
        return profit;
    }

    public static float avgProfit(Float[] profits){
        float acuSum=0;

        for (Float el:profits){
            acuSum+=el;
        }
        return acuSum/profits.length;
    }

}

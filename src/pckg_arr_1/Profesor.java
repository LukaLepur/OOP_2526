package pckg_arr_1;

public class Profesor {
    private String name;
    private int id;
    private static int cntID=200;
    public Profesor(String name){
        this.name=name;
        this.id=++cntID++;
    }

    public static Profesor[] genStudentFromName(String[] names){
        Profesor[] profs=new Profesor[names.length];
        for(int k=0;k<names.length;k++){
            profs[k]=new Profesor(names[k]);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

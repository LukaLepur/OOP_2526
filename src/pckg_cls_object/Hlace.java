package pckg_cls_object;

public class Hlace {
    private String model;
    public boolean ciste;

    public Hlace(String model){
        this.model=model;
        this.ciste=true;
    }

    public boolean getCiste(){
        return ciste;
    }

    public void setCiste(boolean setValue){
        this.ciste=setValue;
    }

    public void koristeneHlace(){
        this.ciste=false;
    }

    public Hlace Hlace(Student student){
        return student.operiMe(this);
    }

    public Hlace nekakoOciscene(Student s1) {
        return s1.operiMe(this);
    }
}

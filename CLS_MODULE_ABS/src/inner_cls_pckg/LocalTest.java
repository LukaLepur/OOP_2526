package inner_cls_pckg;

public class LocalTest {
    public static void main(String[] args) {
        String[] stringData={
                "Srđan; Marko; Matej",
                "Dino; Luka; Martin",
                "Helena; Nika",
                null,
                "Perica; Santini; Petar"
        };

        CLSWithLocal classWithLocal=new CLSWithLocal();
        classWithLocal.processStringData(stringData);

    }
}

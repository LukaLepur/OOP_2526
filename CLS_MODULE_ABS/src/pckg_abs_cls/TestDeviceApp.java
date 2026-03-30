package pckg_abs_cls;

public class TestDeviceApp {
    public static void main(String[] args) {
        MobilePhone mobilePhone=new MobilePhone("Samsung", "Galaxy A55");
        mobilePhone.operate();
        mobilePhone.getMainInfo();
        Camera camera=new Camera("Polaroid", "1231");
        camera.getMainInfo();
        camera.operate();
    }
}

package improve;

public class TestExtends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明";
        pupil.age=10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.printf("\n");
        Graduate graduate = new Graduate();
        graduate.name="银角大王~";
        graduate.age=23;
        graduate.testing();
        graduate.setScore(50);
        graduate.showInfo();

    }
}

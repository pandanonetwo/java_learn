public class extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明";
        pupil.age=10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.printf("\n");
        Gradual gradual = new Gradual();
        gradual.name="金角大王";
        gradual.age=22;
        gradual.testing();
        gradual.setScore(100);
        gradual.showInfo();


    }
}

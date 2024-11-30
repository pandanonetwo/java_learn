public class Pupil {
    public String name;
    public int age;
    private double score;
    public void setScore(double score){
        this.score=score;
    }
    public void testing(){
        System.out.printf("小学生 " + name + " 正在考小学数学\n");
    }
    public void showInfo(){
        System.out.printf("小学生名 "+ name + " 年龄 "+age +" 成绩 "+score );

    }


}

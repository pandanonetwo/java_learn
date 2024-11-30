public class Gradual {
    //大学生->模拟大学生考试的情况。
    public String name;
    public int age;
    private double score;
    public void setScore(double score){
        this.score=score;
    }
    public void testing(){
        System.out.printf("大学生 " + name + " 正在考大学数学\n");
    }
    public void showInfo(){
        System.out.printf("大学生名 "+ name + " 年龄 "+age +" 成绩 "+score );

    }

}

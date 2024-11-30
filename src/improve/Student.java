package improve;

public class Student {
    //父类，是Pupil和Graduate的父类
    public String name;
    public int age;
    private double score;
    //共有方法
    public void setScore(double score){
        this.score=score;
    }

    public void showInfo(){
        System.out.printf("学生名 "+ name + " 年龄 "+age +" 成绩 "+score );

    }

}

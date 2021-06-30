//@naman_d0shi

//varible === data-member / member
//function === method


class student{
    private int rollno;
    private String name;
    private float fee;
    student(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }

}


public class ten {
    public static void main(String arg[]){
        student s=new student(11,"shail",50000f);
        student s1=new student(13,"jay",30000f);
        s.display();
        s1.display();
    }
}

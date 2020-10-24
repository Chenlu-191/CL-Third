package Xuanke;
import java.util.Scanner;     //主要功能是简化文本扫描、获取控制台输入

public class Test {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Courses a = null ;      //对a进行初始化赋值
       Student w = new Student(2019310189, "张三", '男');
       System.out.println("学生信息");
       System.out.println(w);
       Teacher b = new Teacher(1, "张", '男', "高数");
       Teacher c = new Teacher(2, "王", '女', "C语");
       Teacher d = new Teacher(3, "陈", '女', "英语");
       System.out.println("教师信息");
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       Courses e = new Courses("高数", 06, "110", 2, 3);
       Courses f = new Courses("C语",03 , "432", 1, 1);
       Courses g = new Courses("英语", 29, "203", 3, 2);
       System.out.println("课程信息");
       System.out.println(e);
       System.out.println(f);
       System.out.println(g);
       System.out.println("请输入1,2,3进行选课: ");
       int x = in.nextInt();        // Scanner 类来获取用户的输入
       if (x == 1) {
           a = e;
           System.out.println("已选课: " + e);
           System.out.println(b);
       } else if (x == 2) {
           a = f;
           System.out.println("已选课: " + f);
           System.out.println(c);
       } else if (x == 3) {
           a = g;
           System.out.println("已选课: " + g);
           System.out.println(d);
       } else {
           System.out.println("未查到课程");
       }

       System.out.println(w);
       System.out.println("已选课程  "+a);


       System.out.println("请输入1,2,3进行退课: ");
       int y = in.nextInt();

       while (x == 1)       // 确保只能退已选课程
           if (y == 1) {
               a = e;
               System.out.println("已退课: " + e);
               System.out.println(b);
               break;
           } else {
               System.out.println("未查到课程");
               break;
           }

       while (x == 2)
           if (y == 2) {
               a = f;
               System.out.println("已退课: " + f);
               System.out.println(c);
               break;
           } else {
               System.out.println("未查到课程");
               break;
           }

       while (x == 3)
           if (y == 3) {
               a = g;
               System.out.println("已退课: " + g);
               System.out.println(d);
               break;
           } else {
               System.out.println("未查到课程");
               break;
           }

   }
}

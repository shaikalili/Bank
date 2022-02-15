
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentAcount student1=new StudentAcount(new Costumer("shai","kalili","123","email@email"),
                4154.32,true,3);
        StudentAcount student2=new StudentAcount(new Costumer("sharon","aylon","456","mymail@email"),
                56565.23,false,5);
        PrivateAcount privateAcount=new PrivateAcount(new Costumer("adon","private","000","adon@adon"),
                1000045,false);
        System.out.println(privateAcount.getBalance());
        privateAcount.deposite(200);
        System.out.println(privateAcount.getBalance());
        System.out.println(student1.getBalance());
        student1.withdraw(200);
        System.out.println(student1.getBalance());
        System.out.println(student2.getBalance());
        student2.deposite(200);
        System.out.println(student2.getBalance());
    }



}


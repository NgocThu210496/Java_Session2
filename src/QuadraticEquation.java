import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b=scanner.nextDouble();
        System.out.println("Nhập vào số c: ");
        double c=scanner.nextDouble();

        double resutl= (b*b)-(4*a*c);
        if(resutl>0){
            //pt cos 2 nghiem
            double r1=(-b+Math.sqrt(resutl))/(2*a);
            double r2=(-b-Math.sqrt(resutl))/(2*a);
            System.out.println("Nghiệm 1 = "+ r1);
            System.out.println ("Nghiệm 2 = "+r2);

        }else if (resutl==0) {
            // Có một nghiệm kép
            double r3=-b/(2*a);
            System.out.println("nghiệm kép =" +r3);
        }else {
            System.out.println("Phương trình không có nghiệm");
        }

    }
}

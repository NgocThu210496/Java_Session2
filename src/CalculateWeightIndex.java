import java.util.Scanner;

public class CalculateWeightIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn  nhập vào số chiều cao:");
        double height = scanner.nextDouble();
        System.out.println("Mời bạn nhập vào số cân nặng");
        double weight = scanner.nextDouble();

        double bmi = Math.round(weight / Math.pow(height, 2));  //lam tron  ham tinh mu

        if (bmi < 18) {
            System.out.println(" Ti so  bmi cua ban la " + bmi + " underweight"); //thieu can
        } else if (bmi < 25.0) {
            System.out.println(" Ti so  bmi cua ban la  " + bmi + " nomal");//binh thuong
        } else if (bmi < 30.0) {
            System.out.println(" Ti so  bmi cua ban la  " + bmi + " overweight");//thua can
        } else {
            System.out.println(" Ti so  bmi cua ban la  " + bmi + " obese");//beo
        }
    }
}

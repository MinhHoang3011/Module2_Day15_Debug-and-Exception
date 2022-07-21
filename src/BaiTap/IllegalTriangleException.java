package BaiTap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        creatTriangle(scanner);
    }

    public static void creatTriangle(Scanner scanner) {
        System.out.println("Tao 1 tam giac ");
        System.out.println("Nhap vao canh dau tien ");

        double canh1 = scanner.nextDouble();
        System.out.println("Nhap vao canh thu 2");
        double canh2 = scanner.nextDouble();
        System.out.println("Nhap vao canh thu 3");
        double canh3 = scanner.nextDouble();
        try {
            checkCondition(canh1,canh2,canh3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void checkCondition(double a, double b, double c) throws Exception{
        if (a<0 || b<0 || c<0) {
            throw new Exception("Loi canh tam giac khog the la so am");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new Exception("Loi tong 2 canh trong tam giac phai lon hon canh con lai ");
        }

    }
}

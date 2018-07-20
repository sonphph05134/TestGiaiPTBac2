package vn.poly.sof304.sonphph05134;

import java.util.Scanner;

public class giaiptbac2 {
    /**
     * Giải phương trình bậc 2
     *
     * @author viettuts.vn
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * main
     *
     * @param args
     */
//        public static void main(String[] args) {
////            System.out.print("Nhập hệ số bậc 2, a = ");
////            float a = giaiptbac2.scanner.nextFloat();
////            System.out.print("Nhập hệ số bậc 1, b = ");
////            float b = giaiptbac2.scanner.nextFloat();
////            System.out.print("Nhập hằng số tự do, c = ");
////            float c = scanner.nextFloat();
////            giaiptbac2.giaiPTBac2(a, b, c);
//            giaiptbac2 gpt = new giaiptbac2();
//        }

    /**
     * Giải phương trình bậc 2: ax2 + bx + c = 0
     *
     * @param a: hệ số bậc 2
     * @param b: hệ số bậc 1
     * @param c: số hạng tự do
     */
    public static String giaiPTBac2(int a, int b, int c) {

        double x1;
        double x2;

        // kiểm tra các hệ số
        if (a == 0) {
            if (b != 0) {
                return "Phương trình có 1 nghiệm" + " x = " + (-c / b);
            } else {
                if (c != 0) {
                    return "Phương trình vô nghiệm";
                } else {
                    return "Phương trình có vô số nghiệm";
                }
            }
        } else {
            // tính delta
            double delta = b * b - 4 * a * c;
            // tính nghiệm
            if (delta > 0) {
                x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                return "Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2;
//                System.out.println("Phương trình có 2 nghiệm là: "
//                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                return "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;

//                System.out.println("Phương trình có nghiệm kép: "
//                        + "x1 = x2 = " + x1);
            } else {
                return "Phương trình vô nghiệm";
//                System.out.println("Phương trình vô nghiệm!");
            }
        }

    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用简单计算器!");
        System.out.print("请输入第一个数字: ");
        double num1 = scanner.nextDouble();

        System.out.print("请输入第二个数字: ");
        double num2 = scanner.nextDouble();
        System.out.println("12302318342890740140143");
        System.out.println("请选择操作: ");
        System.out.println("1: 加法 (+)");
        System.out.println("2: 减法 (-)");
        System.out.println("3: 乘法 (*)");
        System.out.println("4: 除法 (/)");
        System.out.println("5.kaifang()");
        System.out.println("sdfafsdf");
        System.out.println(("asdjklkljdakjdjskld"));
        System.out.println("ajkdjksdjkahrhvqklheerakljhcklar");
        System.out.print("输入你的选择 (1/2/3/4): ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("结果: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("结果: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("结果: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("结果: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("错误: 除数不能为零!");
                }
                break;
            default:
                System.out.println("无效的选择!");
        }

        scanner.close();
    }
}

public class O1_HCF {

    // public static void main(String[] args) {
    // int num1 = 25, num2 = 50;

    // while (num1 != num2) {
    // if (num1 > num2) {
    // num1 -= num2;
    // } else {
    // num2 -= num1;
    // }
    // }
    // System.out.println("HCF is: " + num1);
    // }

    public static void main(String[] args) {
        int num1 = 25, num2 = 50, hcf = 0;

        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }
        System.out.println("The HCF: " + hcf);

    }

}

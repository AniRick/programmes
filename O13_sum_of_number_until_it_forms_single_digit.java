// Input : 1234
// Output : 1
// Explanation : The sum of 1+2+3+4 = 10, 
//               digSum(x) == 10
//               Hence ans will be 1+0 = 1

// Input : 5674
// Output : 4 

public class O13_sum_of_number_until_it_forms_single_digit {

    static int digSum(int n) {
        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9) { //extra line
            if (n == 0) { // extra line
                n = sum;
                sum = 0;
            }
            int lastDigit = n %10;
            sum += lastDigit;
            n = n/10;
        }
        return sum;
    }

    // Driver code
    public static void main(String argc[]) {
        int n = 4852759;
        System.out.println(digSum(n));
    }

}

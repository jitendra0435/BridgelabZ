package basics;
public class Prime1{
public static void main(String[] args) {
    long result = 0;
    int number = 2;
    int count = 0;
    while (count < 1000) {
        if (checkPrime(number) == true) {
            result = result + number;
            count++;
        }
        number++;
    }
    System.out.println("The sum of first 1000 prime numbers is " + result);
}

public static boolean checkPrime(int number) {
    for (int i = 2; i < number/2; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}
}
public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        
        System.out.println("Prime numbers up to " + num + ":");

        boolean[] isPrime = new boolean[num + 1];
        int count = 0;

        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int p = 2;
        while (p < num) {
            if (isPrime[p]) {
                for (int i = p+1; i < isPrime.length; i++) {
                    if (i % p == 0) {
                        isPrime[i] = false;
                    } 
                }
            }
            p++;
        }
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
                System.out.println(i);
            }
        }
        double x = count / (double)(num);
        int precent = (int)(x * 100);

        System.out.println("There are " + count + " primes between 2 and " + num + " (" + precent + "% are primes)");

    }
}
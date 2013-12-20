public class Primes {

  private volatile  static int prime_count;
  private volatile static int primes[] = new int [25000];

  public static int getPrimeCount() { return prime_count; }
  public static int getPrime(int i) { return primes[i]; }
  public void addPrime(int i) { primes[prime_count++] = i; }

  boolean isDivisibe(int i, int by) { return (i % by) == 0; }

  boolean isPrimeDivisible(int candidate) {
    for (int i = 1; i < prime_count; ++i) {
      if (isDivisibe(candidate, primes[i])) return true;
    }
    return false;
  }

//--- tester ----
public static void  main( String[] argv) {
  Primes p = new Primes();
  int c = 1;
  while (p.getPrimeCount() < 25000) {
    if (!p.isPrimeDivisible(c)) {
      p.addPrime(c);
    }
    c++;
  }
  System.out.println( p.getPrime(p.getPrimeCount()-1));
}


}



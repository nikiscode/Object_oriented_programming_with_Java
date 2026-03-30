##Prime Numbers from 1 to N
import java.util.*;
public class PrimeRange {
public static void main(String[] args) {
int n = 20;
System.out.println("Prime numbers up to " + n + ":");
for (int i = 2; i <= n; i++) {
int count = 0;
for (int j = 1; j <= i; j++) {
if (i % j == 0)
count++;
}
if (count == 2)
System.out.print(i + " ");
}
}
}

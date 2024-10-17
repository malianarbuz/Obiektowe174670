import java.util.Objects;

public class Zestaw3 {
    static void trojkiPitagorejskie(int n) {
        for (int i = 1; i < n + 1; i++) {
            double a = java.lang.Math.pow(i, 2);
            for (int j = 1; j < n + 1; j++) {
                double b = java.lang.Math.pow(j, 2);
                for (int k = 1; k < n + 1; k++) {
                    double c = java.lang.Math.pow(k, 2);
                    if (a + b == c & a <= b) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    static void funKwaRozwiazania(int n) {
        for (int a = -n; a < n + 1; a++) {
            for (int b = -n; b < n + 1; b++) {
                for (int c = -n; c < n + 1; c++) {
                    double delta = Math.pow(b, 2) - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println(a + " " + b + " " + c + " ");
                    }
                }
            }
        }

    }

    static void funKwaDelta(int n) {
        for (int a = -n; a < n + 1; a++) {
            for (int b = -n; b < n + 1; b++) {
                for (int c = -n; c < n + 1; c++) {
                    double delta = Math.pow(b, 2) - 4 * a * c;
                    if (Math.sqrt(Math.sqrt(delta)) % 1.0 == 0) {
                        System.out.println(a + " " + b + " " + c + " " + delta);
                    }
                }
            }
        }

    }

    static void liczbyPierwsze(int n) {
        boolean pierwsza = true;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    pierwsza = false;
                    break;
                }

            }
            if (pierwsza) {
                System.out.println(i);
            }
            pierwsza = true;
        }
    }

    static void liczbyPodzielne(int m, int n) {
        for (int i = (int) Math.pow(10, m - 1); i < Math.pow(10, m); i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

    static void piramida(int n, String variant) {
        if (Objects.equals(variant, "jednostronna")) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (Objects.equals(variant, "dwustronna")) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 2 * n; j++) {
                    if (j <= n - i || j >= n + i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
            }
        }
    }

    static int silnia(int n) {
        int silnia = 1;
        for (int i = 2; i <= n; i++) {
            silnia *= i;
        }
        return silnia;
    }

    static int silniaPodwojna(int n) {
        int silnia = 1;
        for (int i = n; i > 1; i -= 2) {
            silnia *= i;
        }
        return silnia;
    }

    static int silnia(int m, int n) {
        int silnia = 1;
        for (int i = n; i > 1; i -= m) {
            silnia *= i;
        }
        return silnia;
    }

    static int dwumianNewtona(int n, int k) {
        return silnia(n) / (silnia(k) * (silnia(n - k)));
    }

    static void ciagFibonacciego(int n) {
        int a = 1, b = 1, c;
        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            } else {
                System.out.print(1 + " ");
            }
        }

    }

    static int sumaNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    static int sumaParzystych(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    static int sumaNieParzystych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    static int sumaKwaNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    static int sumaSzeNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i * i;
        }
        return suma;
    }

    static double sumaOdwNaturalnych(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += (double) 1 / i;
        }
        return suma;
    }

    static boolean czyPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static void trojkatPascala(int n) {
        int dwumian;
        System.out.println(" 1 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dwumian = dwumianNewtona(i, j);
                if (dwumian != 0) {
                    System.out.print(" " + dwumianNewtona(i, j) + " ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
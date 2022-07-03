package id.college;

public class Main {

    public static void main(String[] args) {
        // squareEmptySpaceInCenterPattern(8);
        // xPattern(10);
        alphaRightTriangle(6);
    }

    public static void squareEmptySpaceInCenterPattern(int n) {
        /*------------------------------------------------------------------------------------------------------------
         * squarePattern()
         * -----------------------------------------------------------------------------------------------------------
         * I → n, jumlah polah n x n yang ingin dibentuk
         * O →
         * Ket → Fungsi ini digunakan membuat pola angka persegi dengan ukuran n x n seperti berikut
         *       1   2   3   4   5
         *       1               5
         *       1               5
         *       1               5
         *       1   2   3   4   5
         * -----------------------------------------------------------------------------------------------------------*/

        for(int i = 1; i <= n; i++) {
            if(i == 1 || i == n) {
                for(int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for(int j = 1; j <= n; j++) {
                    if(j == 1 || j == n) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void xPattern(int n) {
        /*------------------------------------------------------------------------------------------------------------
         * xPattern(n)
         * -----------------------------------------------------------------------------------------------------------
         * I → n, jumlah pola n yang ingin dibentuk
         * O →
         * Ket → Fungsi ini digunakan membuat pola angka persegi dengan ukuran n seperti berikut
         *       namun kode ini tidak bersifat reusable karena apabila nilai n yang diberikan
         *       bukan 7 tidak akan membentuk pola X lagi
         *       1               1
         *          2         2
         *             3   3
         *               4
         *             3    3
         *          2         2
         *       1               1
         * -----------------------------------------------------------------------------------------------------------*/
        for(int i = 1; i <= n-3; i++) {
            int k = 0;
            for(int j = 1; j <= n; j++) {
                if(j == i || (j == n - i + 1)) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print("   ");
                }
                k++;
            }
            System.out.println();
        }
        for(int i = n-4; i >= 1; i--) {
            int k = 0;
            for(int j = n; j >= 1; j--) {
                if((j == n - i + 1) || j == i) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print("   ");
                }
                k++;
            }
            System.out.println();
        }
    }

    public static void alphaRightTriangle(int n) {
        /*------------------------------------------------------------------------------------------------------------
         * alphaRightTriangle(n)
         * -----------------------------------------------------------------------------------------------------------
         * I → n, jumlah pola n yang ingin dibentuk
         * O →
         * Ket → Fungsi ini digunakan membuat pola alphabet rata kanan
         *                      A
         *                   A  B
         *                A  B  C
         *             A  B  C  D
         *          A  B  C  D  E
         * -----------------------------------------------------------------------------------------------------------*/
        int alpha = 65;
        for(int i = 1; i <= n; i++) {
            int k = 0;
            for(int j = 0; j < n; j++) {
                if(j >= n - i) {
                    System.out.print((char)(alpha+k) + "  ");
                    k++;
                }
                else  {
                    System.out.print(" " + "  ");
                }
            }
            System.out.println();
        }
    }

}

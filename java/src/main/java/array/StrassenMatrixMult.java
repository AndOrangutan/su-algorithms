package array;

public class StrassenMatrixMult {
    public static float[][] add(float[][] m1,float[][] m2) {
        final int size = m1.length;
        float[][] sub = new float[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                sub[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sub;
    }

    public static float[][] sub(float[][] m1,float[][] m2) {
        final int size = m1.length;
        float[][] add = new float[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                add[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return add;
    }


    public static String toString(float[][] m1, int  size) {
        String str = "";

        String pad = "    ";

        str += "[\n";
        for(int i = 0; i < size; i++) {

            str += pad + "[";
            for(int j = 0; j < size-1; j++) {
                str += String.valueOf(m1[i][j]) + ", ";
            }
            str += String.valueOf(m1[i][size-1]) + "],\n";
        }
        str += "]\n";

        return str;
    }

    public static void split(float[][] matrix, float[][] submatrix, int iStart, int jStart) {
        for(int i1 = 0, i2 = iStart; i1 < submatrix.length; i1++, i2++)
            for(int j1 = 0, j2 = jStart; j1 < submatrix.length; j1++, j2++)
                submatrix[i1][j1] = matrix[i2][j2];
    }


    public static void join(float[][] submatrix, float[][] matrix, int iStart, int jStart) {
        for(int i1 = 0, i2 = iStart; i1 < submatrix.length; i1++, i2++)
            for(int j1 = 0, j2 = jStart; j1 < submatrix.length; j1++, j2++)
                matrix[i2][j2] = submatrix[i1][j1];
    }

    public static float[][] mult(float[][] X,float[][] Y) {
        final int size = X.length;
        final int splitpnt = size/2;
        float[][] mult = new float[size][size];
        // Base case
        if (size == 1) {
            mult[0][0] = X[0][0] * Y[0][0];
        } else {
            float[][] A = new float[splitpnt][splitpnt];
            float[][] B = new float[splitpnt][splitpnt];
            float[][] C = new float[splitpnt][splitpnt];
            float[][] D = new float[splitpnt][splitpnt];
            float[][] E = new float[splitpnt][splitpnt];
            float[][] F = new float[splitpnt][splitpnt];
            float[][] G = new float[splitpnt][splitpnt];
            float[][] H = new float[splitpnt][splitpnt];

            // O(n^2)
            split(X, A, 0, 0);
            split(X, B, 0, splitpnt);
            split(X, C, splitpnt, 0);
            split(X, D, splitpnt, splitpnt);

            // O(n^2)
            split(Y, E, 0, 0);
            split(Y, F, 0, splitpnt);
            split(Y, G, splitpnt, 0);
            split(Y, H, splitpnt, splitpnt);

            float[][] P1 = mult(A, sub(F,H));
            float[][] P2 = mult(add(A,B), H);
            float[][] P3 = mult(add(C,D), E);
            float[][] P4 = mult(D, sub(G,E));
            float[][] P5 = mult(add(A,D),add(E,H));
            float[][] P6 = mult(sub(B,D), add(G,H));
            float[][] P7 = mult(sub(A,C), add(E,F));

            float[][] C1 = add(P5, add(P4, sub(P6, P2)));
            float[][] C2 = add(P1, P2);
            float[][] C3 = add(P3, P4);
            float[][] C4 = add(sub(P1, P3), sub(P5, P7));

            join(C1, mult, 0, 0);
            join(C2, mult, 0, splitpnt);
            join(C3, mult, splitpnt, 0);
            join(C4, mult, splitpnt, splitpnt);

            return mult;
        }

        return mult;
    }
}

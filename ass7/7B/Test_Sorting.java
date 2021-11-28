import Ascending.A_sort;
import Descending.D_sort;

import java.io.Serializable;
import java.util.Scanner;

public class Test_Sorting implements A_sort, D_sort, Serializable {
    int ar1[];
    int ar2[];
    int n1;
    int n2;

    Test_Sorting() {
    }

    Test_Sorting(int n1, int ar1[], int n2, int ar2[]) {
        this.n1 = n1;
        this.ar1 = new int[this.n1];
        for (int i = 0; i < n1; i++) {
            this.ar1[i] = ar1[i];
        }
        this.n2 = n2;
        this.ar2 = new int[this.n2];
        for (int i = 0; i < n2; i++) {
            this.ar2[i] = ar2[i];
        }
    }

    @Override
    public void ascending() {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1 - i - 1; j++) {
                if (ar1[j] > ar1[j + 1]) {
                    int temp = ar1[j];
                    ar1[j] = ar1[j + 1];
                    ar1[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void descending() {
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2 - i - 1; j++) {
                if (ar2[j] < ar2[j + 1]) {
                    int temp = ar2[j];
                    ar2[j] = ar2[j + 1];
                    ar2[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test_Sorting obj = new Test_Sorting();
        obj.ascending();
        obj.descending();
    }
}
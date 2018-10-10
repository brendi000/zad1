public class Array {

    /*

Exercise 3:
Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

Example:
int[] array = {3,2,14,1,2,3,6};
should print true
     */
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 8, 15, 32, 64, 128};
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 1) {
                if (tablica[i+1] == 2) {
                    if (tablica[i+2] == 3)

                        System.out.print("true");


                }
            }
        }
    }
}
public class Suma {

    /*
    Exercise 2:
Given 3 int values, a b c, print to console their sum. However, if one of the values is 13 then
it does not count towards the sum and values to its right do not count. So for example,
if b is 13, then both b and c do not count.

Example:
int a = 1;
int b = 13;
int c = 2;

should print 1


    */


    public static void main(String[] args)
    {
        int liczba1= 10;
        int liczba2= 1;
        int liczba3= 15;

        int suma;

        if(liczba1==13)
        {
            suma =0;
        }
        else if(liczba2==13)
            suma=liczba1;
        else if(liczba3==13)
            suma= liczba1+liczba2;
        else suma = liczba1+liczba2+liczba3;

        System.out.print(suma);
    }




}

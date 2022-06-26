package arraymethoddemo;
import java.util.Arrays;
import java.util.Scanner;
class MyClass{
    public float[][] returnArray(int k, int l)
            {
                System.out.println("Введите значения элементов массива ");
                float[][] a = new float[k][l];
                for (int i = 0; i < k; i++)
                {
                    for (int j = 0; j < l; j++)
                    {
                        Scanner input = new Scanner(System.in);
                        a[i][j] = input.nextFloat();
                        System.out.println(i + " " + j + " " + a[i][j]);
                    }
                }
                return a;
            }
    public void showArray(float[][] arr, int m, int n)
    {
        System.out.println();
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(/*"Элемент [" + i + "][" + j + "] " + */arr[i][j] + "  ");
            }
            System.out.println();
        }
        // return a;
    }
}
public class ArrayMethodDemo {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива (два натуральных числа, завершая клавишей \"Enter\"");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();
        System.out.println("Массив " + rows + " " + columns);
        MyClass amd = new MyClass();
        float[][] myArray1 = amd.returnArray(2, 3);
        float[][] myArray2 = amd.returnArray(2, 3);
        amd.showArray(myArray1, 2,3);
        amd.showArray(myArray2, 2,3);
    }
}
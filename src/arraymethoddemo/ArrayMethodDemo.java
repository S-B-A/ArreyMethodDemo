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
        for (int i = 0; i < m; i++) //
        {
            for (int j = 0; j < n; j++) //
            {
                System.out.print(/*"Элемент [" + i + "][" + j + "] " + */arr[i][j] + "  ");
            }
            System.out.println();
        }
        // return a;
    }
    public float[][] summArray(float[][] arr1, float[][] arr2, int ccc, int ddd)
    {
        System.out.println("Сумма массивов: ");
        float[][] summSumm = new float[ccc][ddd];
        for (int i = 0; i < ccc; i++)
        {
            for (int j = 0; j < ddd; j++)
            {
                summSumm[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(/*"Элемент [" + i + "][" + j + "] " + */summSumm[i][j] + "  ");
            }
            System.out.println();
        }
        return summSumm;
    }
    public float[][] multArray(float[][] arr1, int cc, int dd, int someMult)
    {
        System.out.println("Произведение массива на число: ");
        float[][] multArr = new float[cc][dd];
        for (int i = 0; i < cc; i++)
        {
            for (int j = 0; j < dd; j++)
            {
                multArr[i][j] = arr1[i][j] * someMult;
                System.out.print(/*"Элемент [" + i + "][" + j + "] " + */multArr[i][j] + "  ");
            }
            System.out.println();
        }
        return multArr;
    }

}
public class ArrayMethodDemo {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива \n(два натуральных числа, завершая клавишей \"Enter\"):");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();
        System.out.println("Введите множитель массива:");
        int mult = input.nextInt();
        System.out.println("Массив строк: " + rows + " колонок: " + columns + "\nМножитель: " + mult);
        MyClass amd = new MyClass();
        float[][] myArray1 = amd.returnArray(rows, columns);
        float[][] myArray2 = amd.returnArray(rows, columns);
        amd.showArray(myArray1, rows,columns);
        amd.showArray(myArray2, rows,columns);

        System.out.println("Сумма массивов: ");
        amd.summArray(myArray1, myArray2, rows, columns);
        System.out.println("Умножение первого массива на число (на множитель): ");
        amd.multArray(myArray1, rows, columns, mult);
        System.out.println("\nПроизведение массивов...\n(o-_-o)\nбудет реализовано позже...\n¯\\_(ツ)_/¯ ");

    }
}
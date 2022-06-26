package arraymethoddemo;
import java.util.Arrays;
import java.util.Scanner;

class MyClass{
    /* public void printFirstElement(float[] a)
{
System.out.println("The first element is " + a[0]);
}

     */
    public int[] returnArray(int k)
            {
                int[] a = new int[k];
                for (int i = 0; i < a.length; i++)
                {
                    Scanner input = new Scanner(System.in);
                    a[i] = input.nextInt();
                }
                return a;
            }
}
public class ArrayMethodDemo {
    public static void main(String[] args) {
        MyClass amd = new MyClass();
        //float[] myArray = {1.5F, 2F, 3.75F, 4.15F, 5.24F};
        // amd.printFirstElement(myArray);
        int[] myArray2 = amd.returnArray(5);
        System.out.println(Arrays.toString(myArray2));
    }
}
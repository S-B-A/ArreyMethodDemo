package arraymethoddemo;

import java.util.Arrays;

class MyClass{

public void printFirstElement(int[] a)
{
System.out.println("The first element is " + a[0]);
}

public int[] returnArray()
{
int[] a = new int[3];
for (int i = 0; i < a.length; i++)
{
a[i] = i*2;
}
return a;
}

}

public class ArrayMethodDemo {
public static void main(String[] args) {

MyClass amd = new MyClass();

int[] myArray = {1, 2, 3, 4, 5};
amd.printFirstElement(myArray);

int[] myArray2 = amd.returnArray();
System.out.println(Arrays.toString(myArray2));

}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {

        int len;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length of an array");
        Hello hello=new Hello();
        len=sc.nextInt();
        System.out.println(len);
        int[] arr = new int[len];
        String [] arr2=new String[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
//        for(int i=0;i<len;i++){
//            arr2[i]=sc.nextLine();
//        }
//        for(int j = 0; j < len; j++)
//        {
//            System.out.print(arr[j]+",");
//        }
        for(int j = 0; j < len; j++)
        {
            System.out.print(arr[j]+",");
        }
    }
}


//import java.util.Scanner;
//class Insert_Array
//{
//    public static void main(String[] args)
//    {
//        int n, pos, x;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter no. of elements you want in array:");
//        n = s.nextInt();
//        int a[] = new int[n+1];
//        System.out.println("Enter all the elements:");
//        for(int i = 0; i < n; i++)
//        {
//            a[i] = s.nextInt();
//        }
//        System.out.print("Enter the position where you want to insert element:");
//        pos = s.nextInt();
//        System.out.print("Enter the element you want to insert:");
//        x = s.nextInt();
//        for(int i = (n-1); i >= (pos-1); i--)
//        {
//            a[i+1] = a[i];
//        }
//        a[pos-1] = x;
//        System.out.print("After inserting:");
//        for(int i = 0; i < n; i++)
//        {
//            System.out.print(a[i]+",");
//        }
//        System.out.print(a[n]);
//    }
//}
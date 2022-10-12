import java.util.Scanner;

public class ArrayInReverseOrder {
    public static int size(){
        Scanner s=new Scanner(System.in);
        System.out.println("Emter size of array");
        int a=s.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int a=size();
        int arr[]=new int[a];
        Scanner r=new Scanner(System.in);
        System.out.println("\n Enter the element of array");
        for (int i =0;i<a;i++){
            arr[i]=r.nextInt();
        }
        for (int i=0; i< a;i++){
            System.out.print(arr[i]+",");
        }System.out.println("\n___________________");
        System.out.println("revers array :");
        for (int i=a-1;i>=0;i--){
            System.out.print(arr[i]+",");
        }
    }
}

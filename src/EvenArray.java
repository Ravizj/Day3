public class EvenArray {
    public static void array(){
        int[] arr={12,11,10,4,5,6,7,8,9,56,85,34};
        System.out.println("array list Even element");
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        array();

    }
}

public class FrequncyOfArray {
    static int frequncy(){
        int[] arr = {10,30,10,23,45,10,20,30,23,20,10,20,30,10};
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i< arr.length;i++){
            int count = 1;
            if(visited[i]){
                continue;
            }
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "=> " +count);
        }return 0;
    }
    public static void main(String[] args) {
        frequncy();
    }
}

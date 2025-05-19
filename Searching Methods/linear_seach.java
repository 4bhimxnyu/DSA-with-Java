

class Main {
    public static void main(String[] args) {
        int arr[] ={1,3,4,6,8};
        int target = 6;
        for(int i = 0 ; i <= arr.length;i++){
            if(arr[i]==target){
                System.out.println("element found at the index: "+ i);
                break;
            }
        }
        System.out.println("Linear Search Algorithm has taken place");
    }
}
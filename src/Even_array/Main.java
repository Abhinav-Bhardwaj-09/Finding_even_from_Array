package Even_array;

class Main {
    public static void main(String[] args) {
        int arr [] = { 1, 10, 2, 0, 5, 6, 7, 7, 8, 9, 12, 24, 0, 2 };
        EvenArray obj = new EvenArray();
        int[] Arr=obj.even(arr);
        System.out.print(Arr[0]);
        for (int i = 1;i<Arr.length;i++){
            if (Arr[i] != 0) {
                System.out.print(", " + Arr[i]);
            }
        }
    }
}

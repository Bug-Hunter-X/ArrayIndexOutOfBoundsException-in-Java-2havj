public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        //Added this line to print the complete array
        for (int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }

    }
}
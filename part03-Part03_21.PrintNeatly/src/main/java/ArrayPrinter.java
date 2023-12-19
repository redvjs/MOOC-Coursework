
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            if (array.length == 1) {
                System.out.print(number);
                break;
            }
            if (index == 0) {
                System.out.print(number + ", ");
            } else if( index == array.length - 1) {
                System.out.print(number);
           
            } else if (index > 0) {
                System.out.print(number + ", ");
            }
            
            index ++;
        }
    }
}

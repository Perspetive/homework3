
import java.util.Scanner;
class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input_number = in.nextInt();
        int digit = in.nextInt();
        System.out.println(Removed_digit(input_number, digit));
    }
    public static int Removed_digit(int input, int digit){
        int result = 0;
        int buf = 1;
        while (input != 0){
            if(input % 10 != digit){
                result += (input % 10) * buf;
                buf *= 10;
            }
            input /=10;
        }
        return result;
    }
}
class task_2{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = reverse(number);
        System.out.println(result);
    }
    static int reverse(int num) {
        int buf, temp = 0;
        while (num != 0) {
            buf = num % 10;
            temp = (temp * 10) + buf;
            num = num / 10;
        }
        return temp;
    }
}
class task_3_string_input{
//    На ввод подаётся строка
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input_str = in.nextLine();
        String[] numbers = input_str.split(" ");
        int[] int_numbers = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            int_numbers[i] = Integer.parseInt(numbers[i]);
        }
        int min_value = int_numbers[0];
        for( int j : int_numbers){
            if(j < min_value){
                min_value = j;
            }
        }
        System.out.println(min_value);
    }
}
class task_3_array_input{
    // На ввод подается массив
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_length = in.nextInt();
        String[] input_str = new String[array_length];
        for(int i = 0; i < array_length; i++){
            input_str[i] = in.next();
        }
        int[] numbers = new int[array_length];
        for( int g = 0; g < array_length; g++){
            numbers[g] = Integer.parseInt(input_str[g]);
        }
        int min_value = numbers[0];
        for ( int j : numbers){
            if(j < min_value){
                min_value = j;
            }
        }
        System.out.println(min_value);
    }
}
class task_4_int_input {
//    На ввод подается строка
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();
        String[] parse_array = numbers.split(" ");
        int[] processed_numbers = new int[parse_array.length];
        for (int i = 0; i < parse_array.length; i++) {
            processed_numbers[i] = Integer.parseInt(parse_array[i]);
        }
        for (int digit : processed_numbers) {
            if (processed_numbers[digit] > processed_numbers[digit - 1]) {
                System.out.println(processed_numbers[digit] + " ");
            }
        }
    }
}

class task_4_array_input {
    // На ввод подается массив
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_length = in.nextInt();
        String[] input_str = new String[array_length];
        int[] numbers = new int[array_length];
        for (int i = 0; i < numbers.length; i++) {
            input_str[i] = in.next();
        }
        for(int j = 0; j < array_length; j++){
            numbers[j] = Integer.parseInt(input_str[j]);
        }
        for (int digit : numbers) {
            if (numbers[digit] > numbers[digit - 1]) {
                System.out.print(numbers[digit] + " ");
            }
        }
    }
}
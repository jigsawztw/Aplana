import java.util.Scanner;
import java.io.IOException;

/**
 * @author Osipov Ivan, student
 */
public class MySecondTask {
    public static int task_number;       //номер задачи
    public static float a,b,result;     //Первое число, второе число, результат.
    public static String operation;     // Название операции.
    public static int count;                   // число элементов в массиве строк
    public static Scanner scanner = new Scanner(System.in);    // объект сканнера
    public static String mass[];                           //массив строк

    /***
     * Method, which throw an exception if operation is incorrect.
     */
    public static void checkOp() throws IOException {
        if(!operation.equals("div")&&!operation.equals("summ")&&!operation.equals("multiply")&&!operation.equals("minus")){ //проверяем, если введенная операция не соответствует
            throw new IOException("Такой операции не существует..");
        }
    }
    /***
     * Method, which calculate result depending of value of  operation.
     * @return result of calculating.
     */
    public static float сalculate() {

        if(operation.equals("summ")){
            result = a+b;
        }
        else if(operation.equals("minus")){
            result = a-b;
        }
        else if(operation.equals("div")){
            result = a/b;
        }
        else if(operation.equals("multiply")){
            result = a*b;
        }
        return result;
    }
    /***
     * Method, which searching the longest word in  the array
     * @return value of longest String element
     */
    public static String mostLongestStr(){
        String longest="";
        for(int i=0;i<mass.length;i++){
            if(mass[i].length()>longest.length()){
                longest = mass[i];
            }
        }
        return longest;
    }
    /***
     * Method, which writing elements to array of Strings
     */
    public static void writeElemInMass() throws IOException {
        if (count > 0) {
            System.out.println("Введите " + count + " элементов для размещения в массиве..");
            for (int i = 0; i < count; i++) {
                mass[i] = scanner.next();               //заполняем массив считанными с консоли строками
            }
        } else {
            throw new IOException("Количество элементов должно быть больше 0..");
        }
    }

    /***
     * main method
     */
    public static void main(String[] args) throws IOException{
        System.out.println("Введите номер задачи: ");
        task_number = scanner.nextInt();    //cчитываем номер задачи с консоли
        if(task_number==1){
            System.out.println("Введите операцию, которую вы хотели бы выполнить (summ/div/minus/multiply): ");
            operation  = scanner.next();                //читаем строку
            checkOp();       //проверяем введенную операцию
            System.out.println("Введите первое число: ");
            a  = scanner.nextFloat();                   //читаем число
            System.out.println("Введите второе число: ");
            b  = scanner.nextFloat();                //читаем число
            scanner.close();                        //закрываем поток чтения
            сalculate();                            //выполняем калькуляцию
            System.out.printf("Результат : %.4f",result);

        }
        else if(task_number==2) {
            System.out.println("Введите количество элементов: ");
            count = scanner.nextInt();
            mass = new String[count];
            writeElemInMass();
            scanner.close();
            System.out.println("Самый длинный элемент: "+mostLongestStr());
        }
        else{
            scanner.close();
            System.out.println("Неверно выбрана задача..");
        }
    }
}

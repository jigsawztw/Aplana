import java.util.Scanner;
import java.io.IOException;

    /**
     * @author Osipov Ivan, student
     */
    public class MyFirstTask {
        public static float a,b,result;     //Первое число, второе число, результат.
        public static String operation;     // Название операции.
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
         * Method, which throw an exception if operation is incorrect.
         */
        public static void checkOp() throws IOException{
            if(!operation.equals("div")&&!operation.equals("summ")&&!operation.equals("multiply")&&!operation.equals("minus")){ //проверяем, если введенная операция не соответствует
                throw new IOException("Такой операции не существует..");
            }
        }
        /***
         * main method
         */
        public static void main(String[] args) throws IOException{
            System.out.println("Введите операцию, которую вы хотели бы выполнить (summ/div/minus/multiply): ");
            Scanner scanner = new Scanner(System.in);   //создаем объект сканнер
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
    }

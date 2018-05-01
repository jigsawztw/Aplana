import  java.util.*;
import java.io.*;

/**
 * @author Osipov Ivan, student
 */
public class FileReadTask6{
    /**
     * main method
     */
    public static void main(String[] args) throws FileNotFoundException{
        //читаем слова из файла
        System.out.println("Введите путь к файлу: ");
        Scanner sc = new Scanner(new File(new Scanner(System.in).nextLine()));
        Map<String,Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            String word = sc.useDelimiter("\\s+").next();
            Integer count = map.get(word);
            if(count==null){
                count=1;
                map.put(word,count);
            }
            else{
                count++;
                map.put(word,count);
            }
        }
        sc.close(); //закрыли поток чтения

        //итерируем по сортированной по ключу коллекции и выводим слова и их количество.
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Слово: " + entry.getKey() + ";  Количество: " + entry.getValue());
        }
        //создаем коллекцию значений, которую отсортируем и получим последнее - самое большое значение.
        ArrayList<Integer> list = new java.util.ArrayList<>();
        list.addAll(map.values()); //добавил в коллекцию все значения из map
        Collections.sort(list); //отсортировал в порядке возрастания

        Set<Map.Entry<String,Integer>> entrySet=map.entrySet(); // получаем множество пар ключ - значение. Если слов с максимальным значением несколько - выводим все.
        Integer x = list.get(list.size()-1);        //искомое значение
        for (Map.Entry<String,Integer> pair : entrySet) {
            if (x.equals(pair.getValue())) {
                System.out.println("Слово с максимальным количеством повторений: "+ pair.getKey() + "; Количество повторений: "+pair.getValue());            }
        }


    }



}


/**
 * @author Osipov Ivan, student
 */
public class Task4 {
    static int count;
    static int max_otr=-30;
    static int min_polozh=30;
    static int index_otr,index_polozh; //индексы максимального отрицательного и минимального положительного.
    static int mass[] = new int[20]; //массив

    /**
     * A method that going trough array and print every element
     */
     static void forEach(){
         for(int i:mass){
             System.out.print(i+" ");
         }
    }
    /**
     * A method what exchanging 2 elements in array  max(-) and min(+)
     */
    static void exchange(){
        int temp = mass[index_polozh];
        mass[index_polozh] = mass[index_otr];
        mass[index_otr] = temp;
    }
    /**
     * main method
     */
    public static void main(String[] args) {
        while(count<20){
            int k =((int)(Math.random()*21)-10);
            mass[count]=k;
            count++;
        }

       forEach(); //пробегаем и печатаем

        //ищем индексы максимального отрицательного и минимального положительного.
        for(int i=0;i<mass.length;i++){
            if(mass[i]>0){      //если элемент меньше 0 то проверяем, если минимальный положительный больше текущего, то устанавливаем новый мин. положительный, записываем индекс.
                if(min_polozh>mass[i]){
                min_polozh = mass[i];
                index_polozh=i;}
            }
            else if(mass[i]<0){ //если элемент больше 0 то проверяем,если максимальный отрицательный меньше текущего, то устанавливаем новый макс. отрицательный, записываем индекс.
                if(max_otr<mass[i]){
                    max_otr = mass[i];
                    index_otr=i;}
            }
            else if(mass[i]==0){ //если текущий равен 0, прерываем текущую итерацию.
                continue;
            }
        }
        System.out.println("- До обмена. Минимальный положительный: "+ mass[index_polozh]+ " Его индекс: "+index_polozh+"; Максимальный отрицательный: "+ mass[index_otr]+" Его индекс: "+index_otr);

       exchange();
        forEach();System.out.println("- После обмена");
    }
}

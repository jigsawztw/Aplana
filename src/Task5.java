import java.util.ArrayList;
import  java.util.Random;

/**
 * @author Osipov Ivan, student
 */
public class Task5 {
    public static class Gift {
        ArrayList<PartOfGift> listOfCandys = new ArrayList<>();//список сладостей в подарке
        public float weightOfGift; //общий вес
        public double costOfGift; //общая стоимость

        public Gift(){

        }
       public void addToGift(PartOfGift x){
           listOfCandys.add(x);
           this.weightOfGift = weightOfGift + x.weight;
           this.costOfGift = costOfGift + x.cost$;
       }
        /**
         * Method, which return weight of the gift.
         * @return weightOfGift;
         */
        public String getWeightOfGift() {
            return "Общий вес подарка составляет: "+ this.weightOfGift+" грамм";
        }

        /**
         * Method, which return costing of the gift.
         * @return costOfGift;
         */
        public  String getCostOfGift() {
            return "Общая стоимость подарка составляет: "+ this.costOfGift+"$";
        }
    }



    /***
     * Часть подарка/сладость.
     */
    public static class PartOfGift {
            public float weight;    //вес сладости
            public double cost$;    //стоимость сладости
            public String specialProp;  //особое свойство сладости

            public PartOfGift(){ //конструктор по умолчанию
            }

            public PartOfGift(float weight,double cost$, String specialProp){   //конструктор с параметрами
                this.weight = weight;
                this.cost$=cost$;
                this.specialProp=specialProp;
            }

        /**
         * Method, which return string value of part of gift(specialproperty,weight,costing)
         * @return String value;
         */
        @Override
        public String toString() {
            return "В подарок входит сладость: "+this.specialProp+"\n"+"Ее вес(грамм): "+this.weight+"\n"+"Цена: "+this.cost$+"\n";
        }
    }
    /***
     * Мармелад
     */
    public static class Jelly extends PartOfGift{
        public Jelly(){ } //конструктор по умолчанию
        public Jelly(float weight, double cost$, String specialProp){ //конструктор с параметрами
            super(weight,cost$,specialProp);

        }
    }
    /***
     * Конфеты
     */
    public static class Candy extends PartOfGift{
        public Candy(){ }   //конструктор по умолчанию
        public Candy(float weight, double cost$, String specialProp){   //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }
    /***
     * Леденец
     */
    public static class Lollipop extends PartOfGift{
        public Lollipop(){ }    //конструктор по умолчанию
        public Lollipop(float weight, double cost$, String specialProp){    //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }
    /***
     * Жвачка
     */
    public static class Gum extends PartOfGift{
        public Gum(){ } //конструктор по умолчанию
        public Gum(float weight, double cost$, String specialProp){ //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }
    /***
     * Шоколадка
     */
    public static class Chocolate extends PartOfGift{
        public Chocolate(){ }   //конструктор по умолчанию
        public Chocolate(float weight, double cost$, String specialProp){   //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }

    /***
     * main method
     */
    public static void main(String[] args) {
        //1 вариант: Заполняем подарок в ручную

        Gift firstGift = new Gift();
        firstGift.addToGift(new Jelly(100,2,"Вкусный малиновый мармелад"));
        firstGift.addToGift(new Gum(40,1,"Тянущаяся фруктовая жвачка"));
        firstGift.addToGift(new Candy(120,1.8,"Конфеты в глазури с карамельной начинкой"));
        firstGift.addToGift(new Lollipop(25,0.5,"Вредный для зубов леденец"));
        firstGift.addToGift(new Chocolate(220,5,"Плитка белого бельгийского щоколада с орехами"));


        //пробегаем по каждой сладости в подарке и выводим информацию о каждой конкретной
        for(PartOfGift x: firstGift.listOfCandys){
            System.out.println(x);
        }
        //выводим общую стоимость и вес подарка
        System.out.println(firstGift.getWeightOfGift());
        System.out.println(firstGift.getCostOfGift());


    }
}
